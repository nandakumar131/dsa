# Day 2: Arrays & Memory Layout
**Goal:** Understand the physical reality of data in RAM, CPU Cache Lines, and how "Memory Locality" dramatically impacts high-performance systems.

---

## 1. The Hardware Reality: RAM is not O(1)

We are taught that array access is $O(1)$. In theory, it is. In practice, it depends on **Caching**.

### Contiguous Allocation
An array is a contiguous block of memory.
* **Formula:** `Address(index) = Base_Address + (index * Element_Size)`
* This simple arithmetic is why lookup is instant ($O(1)$). There is no traversal like a Linked List.

### The CPU Cache Hierarchy (L1, L2, L3)
CPUs do not read single bytes from RAM; they read **Cache Lines** (typically 64 bytes).
* When you read `arr[i]`, the CPU fetches `arr[i]` *and* its neighbors (`arr[i+1]`, `arr[i+2]`, etc.) into the L1 Cache.
* **Spatial Locality:** If your algorithm processes data sequentially (e.g., `for i in 0..N`), the next value is likely already in the L1 Cache. Access takes **~1-4 CPU cycles**.
* **Cache Miss:** If your algorithm jumps around randomly (e.g., `arr[random_index]`), the data is not in cache. The CPU must fetch from main RAM. Access takes **~100-300 CPU cycles**.

**Conclusion:** Random access is orders of magnitude slower than sequential access, despite both being theoretically $O(1)$.

### Staff-Level Visualization: Row-Major vs. Column-Major
Consider a 2D Matrix (Matrix $N \times N$).

**Code A (Row-Major Traversal):**
```java
// Fast
for (int r = 0; r < N; r++) {
    for (int c = 0; c < N; c++) {
        sum += matrix[r][c]; 
    }
}
```

**Code B (Column-Major Traversal):**
```java
// Slow (Strided Access)
for (int c = 0; c < N; c++) {
    for (int r = 0; r < N; r++) {
        sum += matrix[r][c];
    }
}
```

**Why Code A is faster:** In languages like C++, Java, and Python (NumPy), matrices are stored row-by-row. Reading (0,0) pulls (0,1), (0,2) into the cache. The next loop iteration hits the cache.
**Why Code B is slower:** Reading (0,0) pulls (0,1) into the cache, but the code immediately asks for (1,0) (which is $N$ spots away in memory). This causes a Cache Miss on almost every read.

---

## 2. Fixed vs. Dynamic Arrays

### Fixed Arrays (int[])
* **Allocation:** Static size. Allocated on the Stack (if small/local) or Heap.
* **Pros:** Zero overhead. Extremely cache-friendly.
* **Cons:** Cannot resize.

### Dynamic Arrays (ArrayList, std::vector, Python list)
* **Implementation:** A wrapper class containing:
  * A pointer to a fixed array.
  * size: Current number of elements.
  * capacity: Actual size of the underlying fixed array.

* **Resizing:** As discussed in Day 1, when size == capacity, create a new array (2x capacity) and copy elements.

### The Memory Overhead Trap (Java Specific)
A naive choice of data structure can blow up your RAM usage.

* `int[] arr = new int[1000];` -> Uses 4 KB (4 bytes per int).
* `ArrayList<Integer> list = new ArrayList<>();` -> Uses ~20-32 KB.
  * **Why?** Integer is an Object. It has an Object Header (12-16 bytes). The ArrayList stores references (pointers) to these objects, not the values themselves. This breaks Cache Locality (pointer chasing).

**Takeaway:** In high-performance Java/C# applications, prefer primitive arrays (`int[]`) or specialized libraries (like Eclipse Collections or Trove) over `ArrayList<Integer>` to save memory and improve cache locality.

---

## 3. Coding Task: Implement a Vector

### Requirements:
* **Generic:** Support any type T.
* **Auto-Resize:** Double capacity when full.
* **Methods:** push(val), get(index), pop(), size(), capacity().

#### Critical Implementation Detail (Pseudocode):
```java
class Vector<T> {
    T[] data;
    int size = 0;
    int capacity = 10;

    void push(T val) {
        if (size == capacity) {
            resize();
        }
        data[size] = val; // O(1)
        size++;
    }

    void resize() {
        capacity *= 2;
        T[] newData = new T[capacity];
        // COPY: O(N)
        for (int i=0; i < size; i++) newData[i] = data[i];
        data = newData;
    }
}
```

**Implement a working code in any language of your choice.**

---

## 4. Problem Deep Dive

### Problem 1: Move Zeroes (LeetCode Easy)
Given an array, move all 0's to the end while maintaining the relative order of non-zero elements. Do it in-place.

**Two Pointer Solution:** Use a pointer insertPos to track where the next non-zero should go.

```java
public void moveZeroes(int[] nums) {
    int insertPos = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
            nums[insertPos] = nums[i];
            insertPos++;
        }
    }
    // Fill the rest with zeros
    while (insertPos < nums.length) {
        nums[insertPos++] = 0;
    }
}
```
**Optimization:** The above code writes to the array twice (once to move, once to fill zero). Can we do it with fewer writes?

### Problem 2: Product of Array Except Self (LeetCode Medium)
Return an array where output[i] is the product of all elements of nums except nums[i]. Constraint: $O(N)$ time, $O(1)$ extra space (output array doesn't count), No Division.

**The "Division" Trap:** Calculate total product of all numbers, then `result[i] = Total / nums[i]`.

* Why it fails: What if `nums[i]` is `0`? Division by zero crash.

**The "Prefix/Suffix" Pattern:** This is a standard pattern for array problems.
* Left Pass: `result[i]` stores the product of all numbers to the left of `i`.
* Right Pass: Multiply `result[i]` by the product of all numbers to the right of `i`.

```java
public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] res = new int[n];
    
    // Pass 1: Prefix Products
    res[0] = 1;
    for (int i = 1; i < n; i++) {
        res[i] = res[i - 1] * nums[i - 1];
    }
    
    // Pass 2: Suffix Products (on the fly)
    int rightProduct = 1;
    for (int i = n - 1; i >= 0; i--) {
        res[i] = res[i] * rightProduct;
        rightProduct *= nums[i];
    }
    
    return res;
}
```

---

# Day 2 Checklist
- [ ] Why `matrix[r][c]` is faster than `matrix[c][r]`.
- [ ] Implement a dynamic array from scratch.
- [ ] Why `ArrayList<Integer>` is memory-heavy compared to `int[]`.

---

# Practice Problems
### Rotate Image (LeetCode #48)
* **Concept:** 2D Matrix manipulation, In-place modification.
* **Problem:** Given an $n \times n$ 2D matrix representing an image, rotate the image by 90 degrees (clockwise). You must do this in-place without allocating a second matrix.
  * This tests your understanding of memory layout. You must perform coordinate mapping $(row, col) -> (col, n-1-row)$ without overwriting data you haven't read yet.
* **Hint:** Transpose the matrix first (swap $[i][j]$ with $[j][i]$), then reverse each row.

### First Missing Positive (LeetCode #41)
* **Concept:** Cyclic Sort / Index as a Hash Key.
* **Problem:** Find the smallest missing positive integer in an unsorted array. Constraint: $O(N)$ time and $O(1)$ space.
  * This is the ultimate array mastery problem. You cannot use a HashSet (space violation) or Sort (time violation).
* **Key Insight:** You must use the array itself as the hash map. Iterate through and swap numbers to their correct index (put value $5$ at index $4$). Then scan again to find the first index $i$ where $nums[i] != i+1$.
