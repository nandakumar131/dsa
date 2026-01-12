# Day 1: Big O & Amortized Analysis
**Goal:** Move beyond identifying simple loops. Master the ability to mathematically prove average-case performance and discuss system-level implications of algorithm choices (e.g., latency spikes).

---

## The Theoretical Foundation (Quick Refresher)

At a Senior level, you must be precise. "Big O" is often used colloquially to mean "Average Case," but mathematically it describes the **Upper Bound**.

### The Three Greek Letters
* **$O(g(n))$ (Big O):** The **Upper Bound**. The algorithm grows *at most* as fast as $g(n)$.
    * *Interview usage:* Worst-case scenario. "In the worst case, this sort takes $O(N^2)$."
* **$\Omega(g(n))$ (Big Omega):** The **Lower Bound**. The algorithm grows *at least* as fast as $g(n)$.
    * *Interview usage:* Best-case scenario. "If the array is already sorted, bubble sort is $\Omega(N)$."
* **$\Theta(g(n))$ (Big Theta):** The **Tight Bound**. The algorithm grows *exactly* as fast as $g(n)$.
    * *Interview usage:* When best and worst case are the same (e.g., Merge Sort is $\Theta(N \log N)$).



[Image of Big O complexity chart]


---

## Common Complexity Classes & Senior "Gotchas"

### $O(\log N)$ - Logarithmic
* **Identification:** The input size is divided by a factor (usually 2) at each step.
* **Example:** Binary Search, Balanced BST lookup.
* **Senior Note:** $\log N$ is extremely slow-growing. $\log_2(10^{18}) \approx 60$. For all practical system purposes, it is nearly instantaneous, but *not* constant.

### $O(N \log N)$ - Linearithmic
* **Identification:** Divide and Conquer algorithms.
* **Example:** Merge Sort, Heap Sort, Quick Sort (Average).
* **Senior Note:** This is the theoretical lower bound for comparison-based sorting. You cannot sort faster than this without using non-comparison methods (like Radix Sort/Bucket Sort).

### $O(N^2)$ vs $O(N)$ - The Trap
* **Nested Loops:** Usually $O(N^2)$.
* **The "Two Pointers" Optimization:** Often converts a naive $O(N^2)$ solution into $O(N)$ by ensuring each element is visited at most twice.

### $O(2^N)$ vs $O(N!)$ - Exponential vs Factorial
* **$O(2^N)$:** Generates all subsets of a set (Power Set). Recursion with 2 branches.
* **$O(N!)$:** Generates all permutations of a string/array. Recursion with $N$ branches.
* **Scale:** $O(2^N)$ becomes unusable around $N=20-25$. $O(N!)$ becomes unusable around $N=10-12$.

---

## Space Complexity: Input vs. Auxiliary

Many candidates fail by claiming a solution is $O(1)$ space when it is not.

* **Input Space:** Space taken by the arguments passed to the function. (Usually doesn't count towards your complexity).
* **Auxiliary Space:** The extra space you allocate.
* **Recursion Stack:**
    * **Crucial:** Recursive algorithms use $O(H)$ space, where $H$ is the max depth of the recursion tree.
    * *Example:* Quicksort takes $O(\log N)$ space on average for stack frames, even if it sorts in-place.

---

## Deep Dive: Amortized Analysis

This is the most important concept for Day 1. It explains why we can say an operation is $O(1)$ even if it occasionally takes $O(N)$.

**Definition:** Amortized analysis calculates the average time per operation over a **worst-case sequence** of operations. It guarantees the average performance, unlike "Average Case Analysis" which relies on probabilistic input.

### Case Study: Dynamic Array (ArrayList / Vector)
**The Problem:** An array has a fixed capacity. When full, we must allocate a new, larger array and copy all elements.
**The Strategy:** When the array (size $K$) is full, create a new array of size $2K$.

#### The Analysis (The Aggregate Method)
Let's look at the cost of inserting $N$ elements, where $N$ is a power of 2.

1.  **Insert 1:** Size 1. No resize. Cost: 1.
2.  **Insert 2:** Size 1 is full. Resize to 2. Copy 1 element. Insert new. Cost: 1 (copy) + 1 (insert) = 2.
3.  **Insert 3:** Size 2 is full. Resize to 4. Copy 2 elements. Insert new. Cost: 2 (copy) + 1 (insert) = 3.
4.  **Insert 4:** Size 4 (fits). Cost: 1.
5.  **Insert 5:** Size 4 is full. Resize to 8. Copy 4 elements. Insert new. Cost: 4 (copy) + 1 (insert) = 5.

**Total Copying Cost for $N$ elements:**
The resize happens at $1, 2, 4, 8, 16, \dots, N$.
Total Copies = $1 + 2 + 4 + 8 + \dots + N/2 + N$.

This is a **Geometric Series**.
Sum $\approx 2N$.

**Total Time:**
Total Time = (Total Inserts) + (Total Copies)
Total Time = $N + 2N = 3N$.

**Amortized Time:**
$\frac{\text{Total Time}}{\text{Num Operations}} = \frac{3N}{N} = 3$.
Therefore, `ArrayList.add()` is **Amortized $O(1)$**.



### Staff Level Discussion: Latency Spikes
While Amortized Analysis says $O(1)$, the **Worst Case** for a single operation is still $O(N)$.
* **System Design Implication:** If you are building a Low-Latency Trading System or a Real-Time Game Engine, `ArrayList` might be dangerous because that one resize operation causes a massive stutter.
* **Solution:** Pre-allocate memory (`new ArrayList(10000)`) to avoid resizing during critical paths.

---

## Identifying "Hidden" Complexity

In higher-level languages (Python/Java), easy syntax often hides heavy operations.

### String Concatenation
```java
// Java
String s = "";
for (int i = 0; i < N; i++) {
    s = s + "a"; // BAD
}
```

Complexity: `O(N^2)`. <br>
Why: Strings are immutable. `s + "a"` creates a new string, copying the old characters.<br>
Fix: Use StringBuilder (Java) or list.append then join (Python). <br>

### Array Slicing
```python
# Python
def process(arr):
    if not arr: return
    process(arr[1:]) # BAD
```

Complexity: `O(N^2)`. <br>
Why: `arr[1:]` creates a copy of the array. Doing this in a recursive loop makes it quadratic. <br>
Fix: Pass an index instead: `process(arr, index + 1)`.

## Practice Problems
-- To be added

