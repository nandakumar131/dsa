# Data Structures & Algorithms
**Duration:** 12 Weeks <br>
**Target Audience:** Senior & Staff Engineers <br>
**Goal:** Master algorithmic problem solving with a focus on code quality, trade-offs, concurrency, and system design intersections. <br>

---

## 🧠 The Senior/Staff Mindset Shift

At the Senior/Staff level, the interview signal is different. You are not just being tested on *getting the code to run*. You are being evaluated on:

1.  **Ambiguity Resolution:** Can you take a vague prompt and clarify constraints?
2.  **Trade-off Analysis:** Can you explain *why* you chose a specific data structure over another? (Time vs. Space, Read complexity vs. Write complexity).
3.  **Code Quality:** Is your code modular, readable, and extensible? Do you use meaningful variable names?
4.  **Verification:** Do you proactively test for edge cases and bugs without being prompted?


---

# Index 
### **Phase 1: Foundations & Internals (Weeks 1-2)** 
- #### **Week 1: Complexity, Arrays, and Strings**
	* [Day 1: Big O & Amortized Analysis](#day-1) 
	* [Day 2: Arrays & Memory Layout](#day-2) 
	* [Day 3: The "Two Pointers" Pattern](#day-3) 
	* [Day 4: The "Sliding Window" Pattern](#day-4) 
	* [Day 5: Strings & Memory Management](#day-5) 
	* [Day 6: Bit Manipulation](#day-6) 
	* [Day 7: Weekly Review & Retro](#day-7) 
- #### **Week 2: Linked Lists & Hash Tables** 
	* [Day 8: Linked Lists Internals](#day-8) 
	* [Day 9: Advanced Pointer Manipulation](#day-9)
	* [Day 10: Merging & Intersection](#day-10)
	* [Day 11: Hash Table Internals](#day-11) 
	* [Day 12: Design a Hash Map](#day-12) 
	* Day 13: Hash Map Applications
	* Day 14: Phase 1 Assessment
### **Phase 2: Linear Structures & Recursion (Weeks 3-4)** 
- #### **Week 3: Stacks, Queues & Monotonic Patterns** 
	* [Day 15: Stacks & Queues Internals](#day-15) 
	* Day 16: String Parsing & Expression Evaluation
	* [Day 17: The "Monotonic Stack"](#day-17) 
	* Day 18: Queues & Sliding Window Optimization
	* Day 19: Interval Problems (Sorting + Greedy)
	* [Day 20: Binary Search](#day-20) 
	* Day 21: Weekly Review & Retro
- ##### **Week 4: Recursion, Backtracking & Sorting** 
	* [Day 22: Recursion Fundamentals](#day-22) 
	* [Day 23: Sorting Algorithms Internals](#day-23) 
	* [Day 24: Backtracking I - Permutations](#day-24) 
	* Day 25: Backtracking II - Grid Pruning
	* Day 26: Advanced Divide & Conquer
	* Day 27: Greedy Algorithms
	* Day 28: Phase 2 Assessment
### **Phase 3: Trees, Graphs & Heaps (Weeks 5-7)** 
- ##### **Week 5: Trees (BST & Binary Trees)** 
	* [Day 29: Tree Traversals](#day-29) 
	* Day 30: Binary Search Trees
	* Day 31: Advanced Tree Logic 
	* Day 32: Tree Construction & Serializationo
	* [Day 33: Tries (Prefix Trees)](#day-33) 
	* [Day 34: Heaps Internals](#day-34) 
	* Day 35: Weekly Review & Retro
- ##### **Week 6: Graphs (Basics & Traversals)** 
	* [Day 36: Graph Representation](#day-36) 
	* [Day 37: Graph BFS](#day-37) 
	* Day 38: Graph DFS (Connectivity & Cycles)
	* [Day 39: Topological Sort](#day-39) 
	* [Day 40: Union-Find](#day-40) 
	* Day 41: Advanced Graph Applications
	* Day 42: Weekly Review & Retro
- ##### **Week 7: Advanced Heaps & Shortest Paths** 
	* [Day 43: Dijkstra’s Algorithm](#day-43) 
	* Day 44: Heap Patterns 
	* Day 45: Merge K Sorted Lists
	* [Day 46: Prim’s & Kruskal’s (MST)](#day-46) 
	* Day 49: Phase 3 Assessment
### **Phase 4: Optimization, DP & Advanced Graphs (Weeks 8-10)** 
- ##### **Week 8: Dynamic Programming I (1D & Grid)** 
	* [Day 50: The DP Framework](#day-50) 
	* Day 51: 1D Dynamic Programming
	* [Day 53: 2D String DP](#day-53) 
	* Day 54: Unbounded Knapsack 
	* Day 55: Decision Making
	* Day 56: Weekly Review & Retro
- ##### **Week 9: Advanced DP & Intervals** 
	* [Day 57: 0/1 Knapsack Pattern](#day-57) 
	* Day 58: Palindromic DP
	* Day 59: Greedy vs. DP 
	* Day 60: Parentheses & Catalan Numbers
	* [Day 61: Matrix Chain Multiplication](#day-61) 
	* Day 62: DP on Trees 
	* Day 63: Weekly Review & Retro
	* Day 64: Union-Find Advanced
- ##### **Week 10: Advanced Graphs & Systems Intersections** 
	* [Day 65: Shortest Path Variations](#day-65) 
	* [Day 66: Eulerian Circuits](#day-66) 
	* Day 67: Strongly Connected Components
	* Day 68: Trie + X 
	* Day 69: Segment Trees (Concept Only)
	* Day 70: Phase 4 Assessment
### **Phase 5: The "Staff" Differentiators (Weeks 11-12)** 
- ##### **Week 11: Concurrency & Distributed Primitives** 
	* [Day 71: Concurrency Fundamentals](#day-71) 
	* Day 72: Thread Safety Primitives & Atomics
	* [Day 73: The Producer-Consumer Problem](#day-73) 
	* Day 74: Advanced Concurrency Patterns
	* Day 75: Distributed Systems Primitives 
	* [Day 76: Rate Limiting Algorithms](#day-76) 
	* Day 77: Weekly Review & Retro
- ##### **Week 12: Real-World Applications & Mock Interviews** 
	* [Day 78: Cache Design (LRU/LFU)](#day-78) 
	* Day 79: Spatial Data Structures
	* Day 80: Search & Autocomplete
	* [Day 81: Handling Large Data](#day-81) 
	* Day 82: The "Staff" Behavioral Interview
	* [Day 83: Full Mock Interview](#day-83)
	* Day 84: Final Assessment & Rest
	
	
---

# Phase 1: Foundations & Internals
**Goal:** Deep understanding of memory management, complexity analysis, and mastering core optimization patterns.

---

## 📅 Week 1: Complexity, Arrays, and Strings

<a name="day-1"></a>
### [Day 1: Big O & Amortized Analysis](theory/day-1)
* **Theory Focus:**
    * **Time Complexity:** Big O (Worst case), Big Omega (Best case), Big Theta (Average).
    * **Space Complexity:** Differentiate *Auxiliary Space* (extra space used) vs. *Input Space*.
    * **Amortized Analysis:** Why dynamic array resizing is $O(1)$ amortized but $O(N)$ worst-case.
* **Staff-Level Check:** Explain why we double array size (2x) rather than adding a fixed amount. (Concept: Geometric series convergence).
* **Practice:**
    * **Fibonacci Number:** Compare Recursive $O(2^n)$ vs. Iterative/DP $O(n)$.

<a name="day-2"></a>
### Day 2: Arrays & Memory Layout
* **Theory Focus:**
    * **RAM & Caching:** Contiguous memory storage.
    * **Cache Locality:** Why iterating a matrix by row is faster than by column (in row-major languages).
    * **Fixed vs. Dynamic:** `int[]` vs `ArrayList`/`vector`.
* **Coding Task:**
    * Implement a **Dynamic Array (Vector)** from scratch.
    * *Methods:* `get(i)`, `add(val)`, `remove(i)`, `resize()`.
* **Problems:**
    * [Easy] **Move Zeroes** (In-place optimization).
    * [Medium] **Product of Array Except Self** (No division, $O(1)$ space).

<a name="day-3"></a>
### Day 3: The "Two Pointers" Pattern
* **Theory Focus:**
    * Converging pointers (Start/End) vs. Parallel pointers.
    * Trade-off: When to sort the array first ($O(N \log N)$ cost).
* **Problems:**
    * [Easy] **Valid Palindrome** (Handle non-alphanumeric chars).
    * [Medium] **Container With Most Water** (Greedy proof logic).
    * [Medium] **3Sum** (Handling duplicates is the key challenge).

<a name="day-4"></a>
### Day 4: The "Sliding Window" Pattern
* **Theory Focus:**
    * Fixed size window vs. Dynamic size window.
    * Tracking state (via Hash Map or Array) within the window.
* **Problems:**
    * [Easy] **Maximum Average Subarray I**.
    * [Medium] **Longest Substring Without Repeating Characters** (Essential Senior screen).
    * [Hard] **Minimum Window Substring** (Edge case management).

<a name="day-5"></a>
### Day 5: Strings & Memory Management
* **Theory Focus:**
    * **Immutability:** Why strings are immutable in Java/Python (Security, String Pool).
    * **Performance:** Avoiding $O(N^2)$ concatenation loops (Use `StringBuilder`).
    * **Encodings:** ASCII vs. UTF-8/16.
* **Problems:**
    * [Medium] **Group Anagrams** (Hashing design: Sort key vs. Count key).
    * [Medium] **Longest Palindromic Substring** (Expand around center).

<a name="day-6"></a>
### Day 6: Bit Manipulation (Optimization Toolkit)
* **Theory Focus:**
    * Operators: AND `&`, OR `|`, XOR `^`, Shifts `<<` `>>`.
    * **Twos Complement:** Negative number storage.
    * **Masking:** Setting/clearing specific bits.
* **Staff-Level Application:** Compacting booleans into integers; permissions systems.
* **Problems:**
    * [Easy] **Single Number** (XOR trick).
    * [Easy] **Number of 1 Bits** (Hamming Weight).
    * [Medium] **Sum of Two Integers** (Add without `+`).

<a name="day-7"></a>
### Day 7: Weekly Review & Retro
* **Action:** Re-do the hardest problem of the week *without* solution/IDE.
* **Mock:** Verbalize the "Sliding Window" concept as if teaching a junior.

---

## 📅 Week 2: Linked Lists & Hash Tables

<a name="day-8"></a>
### Day 8: Linked Lists Internals
* **Theory Focus:**
    * Memory layout: Non-contiguous, cache misses.
    * **Overhead:** Data + Pointer memory usage.
    * **Doubly Linked List:** Usage in LRU Caches.
* **Coding Task:**
    * Implement **Singly Linked List** (`add`, `delete`, `reverse`).
* **Problems:**
    * [Easy] **Reverse Linked List** (Iterative & Recursive).

<a name="day-9"></a>
### Day 9: Advanced Pointer Manipulation
* **Theory Focus:**
    * **Sentinel Nodes (Dummy Heads):** Simplifying edge cases.
    * **Tortoise & Hare:** Cycle detection algorithms.
* **Problems:**
    * [Medium] **Remove Nth Node From End of List** (One pass).
    * [Medium] **Linked List Cycle II** (Find cycle start - Math proof).
    * [Medium] **Reorder List**.

<a name="day-10"></a>
### Day 10: Merging & Intersection
* **Theory Focus:**
    * Managing multiple pointers.
    * Handling uneven lengths.
* **Problems:**
    * [Easy] **Merge Two Sorted Lists**.
    * [Easy] **Intersection of Two Linked Lists** (Length difference trick).
    * [Hard] **Merge k Sorted Lists** (Heap vs. Divide & Conquer).

### Day 11: Hash Table Internals
* **Theory Focus:**
    * **Hash Function:** Uniform distribution requirements.
    * **Collision Resolution:** Separate Chaining (Linked Lists) vs. Open Addressing (Probing).
    * **Load Factor:** When to resize (0.75 standard).
* **Staff-Level Discussion:** Impact of poor hash functions (DoS attacks, $O(N)$ degradation).

### Day 12: Design a Hash Map
* **Coding Task:**
    * **Design HashMap:** Implement `put`, `get`, `remove` without built-in libraries.
    * *Focus:* Resize logic (rehashing) and key updates.

### Day 13: Hash Map Applications
* **Theory Focus:**
    * Using Maps for $O(1)$ lookups to kill $O(N^2)$ loops.
    * **Prefix Sums + Hashing:** Subarray problem patterns.
* **Problems:**
    * [Easy] **Two Sum**.
    * [Medium] **Subarray Sum Equals K** (Prefix Sum pattern).
    * [Medium] **Longest Consecutive Sequence** (Set usage).

### Day 14: Phase 1 Assessment
* **Challenge:** Solve 3 problems in 45 mins (1 Easy, 2 Mediums).
* **Checklist:**
    * [ ] Handled edge cases (null, empty)?
    * [ ] Used descriptive variable names?
    * [ ] Correctly identified Space Complexity?
---

# Phase 2: Linear Structures, Recursion & Sorting
**Goal:** Master Stack/Queue patterns, Monotonic logic, and recursive Divide & Conquer strategies.

---

## 📅 Week 3: Stacks, Queues & Monotonic Patterns

### Day 15: Stacks & Queues Internals
* **Theory Focus:**
    * **Stack (LIFO):** Implementation using Dynamic Array vs. Linked List. Memory locality trade-offs.
    * **Queue (FIFO):** Implementation using Linked List (Head/Tail pointers).
    * **Circular Buffer:** Implementing a Queue using a fixed-size array to avoid shifting elements.
* **Staff-Level Discussion:** Blocking Queues (Producer-Consumer) and Thread-safety intro.
* **Coding Task:**
    * Implement a **Queue using Stacks** (Amortized $O(1)$ enqueue/dequeue).
* **Problems:**
    * [Easy] **Valid Parentheses**.
    * [Medium] **Min Stack** (Design constraint: $O(1)$ retrieval of minimum element).

### Day 16: String Parsing & Expression Evaluation
* **Theory Focus:**
    * Handling operator precedence.
    * Infix, Prefix, and Postfix (Reverse Polish Notation) expressions.
* **Problems:**
    * [Medium] **Evaluate Reverse Polish Notation**.
    * [Medium] **Decode String** (Nested encoding requires Stack).
    * [Hard] **Basic Calculator** (Handling parentheses and signs).

### Day 17: The "Monotonic Stack" (Staff Differentiator)
* **Concept:** Maintaining a stack of indices such that the values are always increasing (or decreasing). Used to find "Next Greater Element" or "Previous Smaller Element" in $O(N)$.
* **Problems:**
    * [Medium] **Daily Temperatures** (Standard Next Greater Element pattern).
    * [Medium] **Next Greater Element II** (Circular array handling).
    * [Hard] **Largest Rectangle in Histogram** (Critical pattern for finding max areas).

### Day 18: Queues & Sliding Window Optimization
* **Theory Focus:**
    * **Deque (Double-Ended Queue):** Insert/Delete from both ends in $O(1)$.
    * **Monotonic Queue:** Optimization for "Sliding Window Maximum".
* **Problems:**
    * [Medium] **Design Circular Queue**.
    * [Hard] **Sliding Window Maximum** (Reduce $O(N \cdot K)$ to $O(N)$ using Deque).

### Day 19: Interval Problems (Sorting + Greedy)
* **Theory Focus:**
    * Sorting as a preprocessing step.
    * Merging and overlapping logic.
* **Problems:**
    * [Medium] **Merge Intervals**.
    * [Medium] **Insert Interval**.
    * [Medium] **Non-overlapping Intervals** (Greedy removal).

### Day 20: Binary Search (Search Space Reduction)
* **Theory Focus:**
    * Beyond `arr[mid] == target`.
    * **Template:** `left < right` vs `left <= right`. Handling infinite loops.
    * **Search Space:** Searching on "Answer" (e.g., Min Capacity, Min Speed).
* **Problems:**
    * [Medium] **Search in Rotated Sorted Array** (Handling pivot).
    * [Medium] **Find First and Last Position of Element in Sorted Array**.
    * [Medium] **Koko Eating Bananas** (Binary Search on Answer).

### Day 21: Weekly Review & Retro
* **Activity:** Re-derive the Monotonic Stack logic for "Largest Rectangle in Histogram" on a whiteboard.
* **Critique:** Did you struggle with off-by-one errors in Binary Search? (Review boundary conditions).

---

## 📅 Week 4: Recursion, Backtracking & Sorting

### Day 22: Recursion Fundamentals
* **Theory Focus:**
    * **Call Stack:** Anatomy of a stack frame (return address, local vars).
    * **Stack Overflow:** Risks in production.
    * **Tail Call Optimization (TCO):** What is it? Does your language support it? (Java: No, C++/Scala: Yes).
* **Staff-Level Discussion:** Iterative vs. Recursive approaches for Deep Trees.
* **Problems:**
    * [Medium] **Pow(x, n)** (Binary Exponentiation).
    * [Medium] **K-th Symbol in Grammar**.

### Day 23: Sorting Algorithms (Internals)
* **Theory Focus:**
    * **Merge Sort:** Divide & Conquer. Stable. Good for Linked Lists and External Sorting. $O(N \log N)$.
    * **Quick Sort:** Partitioning logic. Unstable. Worst case $O(N^2)$ (mitigated by random pivot). In-place (mostly).
    * **Heap Sort:** In-place, $O(N \log N)$, but poor cache locality compared to QuickSort.
* **Coding Task:**
    * Implement **QuickSelect** (Find Kth largest element in $O(N)$ average).
* **Problems:**
    * [Medium] **Sort Colors** (Dutch National Flag problem - One pass $O(N)$).
    * [Medium] **Kth Largest Element in an Array** (Use QuickSelect).

### Day 24: Backtracking I - Permutations & Subsets
* **Theory Focus:**
    * State-space tree visualization.
    * **Backtracking Template:** `Choose` -> `Explore` -> `Unchoose`.
    * Time Complexity: $O(N!)$ or $O(2^N)$.
* **Problems:**
    * [Medium] **Permutations**.
    * [Medium] **Subsets** (Handle duplicates: Sort first, skip adjacent).
    * [Medium] **Combination Sum**.

### Day 25: Backtracking II - Grid Pruning
* **Theory Focus:**
    * Pruning: Cutting off branches early to save time.
    * `visited` arrays vs. modifying the input grid in-place (and reverting).
* **Problems:**
    * [Medium] **Word Search** (DFS on Grid).
    * [Hard] **N-Queens** (Optimizing diagonal checks using sets/arrays).

### Day 26: Advanced Divide & Conquer
* **Theory Focus:**
    * Solving sub-problems and combining results.
    * Master Theorem basics (rough intuition).
* **Problems:**
    * [Hard] **Median of Two Sorted Arrays** (The ultimate Binary Search/D&C interview question).
    * [Medium] **Construct Quad Tree** (Spatial indexing).

### Day 27: Greedy Algorithms
* **Theory Focus:**
    * Local optimum -> Global optimum.
    * **Proof:** How do you know Greedy works? (Usually requires "Exchange Argument" proof, but intuition suffices for most interviews).
* **Problems:**
    * [Medium] **Jump Game I / II**.
    * [Medium] **Gas Station** (Mathematical observation).
    * [Medium] **Task Scheduler**.

### Day 28: Phase 2 Assessment
* **Challenge:** Solve 3 problems in 60 mins.
    1.  **Monotonic Stack:** Daily Temperatures.
    2.  **Backtracking:** Generate Parentheses.
    3.  **Binary Search:** Search in Rotated Sorted Array.
* **Self-Correction:**
    * Did you use recursion for a problem where `N=100,000`? (Risk of Stack Overflow).
    * Did you handle duplicates correctly in Backtracking?
---

# Phase 3: Trees, Graphs & Heaps
**Goal:** Master hierarchical data structures, priority queues, and graph traversals.

---

## 📅 Week 5: Trees (BST & Binary Trees)

### Day 29: Tree Traversals (The Foundation)
* **Theory Focus:**
    * **DFS:** Pre-order, In-order, Post-order.
    * **BFS:** Level-order traversal (using Queue).
    * **Space Complexity:** Recursive ($O(H)$) vs. Iterative. Worst case $H=N$ (skewed tree).
* **Coding Task:**
    * Implement Iterative In-order traversal using a Stack.
* **Problems:**
    * [Easy] **Binary Tree Inorder Traversal** (Iterative).
    * [Medium] **Binary Tree Level Order Traversal**.
    * [Medium] **Binary Tree Zigzag Level Order Traversal**.

### Day 30: Binary Search Trees (BST)
* **Theory Focus:**
    * BST Property: `Left < Node < Right`.
    * **Validation:** How to validate a BST efficiently (Pass `min` and `max` constraints down recursion).
    * **Deletion:** Handling the 3 cases (Leaf, One Child, Two Children).
* **Problems:**
    * [Medium] **Validate Binary Search Tree**.
    * [Medium] **Lowest Common Ancestor of a BST**.
    * [Medium] **Delete Node in a BST**.

### Day 31: Advanced Tree Logic (Recursion Mastery)
* **Theory Focus:**
    * Passing information *up* the tree (return values) vs. passing information *down* (parameters).
    * **Path Finding:** accumulating values from Root to Leaf.
* **Problems:**
    * [Medium] **Lowest Common Ancestor of a Binary Tree** (General Tree - Requires post-order logic).
    * [Hard] **Binary Tree Maximum Path Sum** (Critical: Local max vs. Global max update).
    * [Medium] **Path Sum II** (Backtracking on a Tree).

### Day 32: Tree Construction & Serialization
* **Theory Focus:**
    * Reconstructing trees from traversal arrays (e.g., Preorder + Inorder).
    * **Serialization:** Converting a tree to a string/file and back.
* **Problems:**
    * [Medium] **Construct Binary Tree from Preorder and Inorder Traversal**.
    * [Hard] **Serialize and Deserialize Binary Tree** (Choose BFS or DFS).

### Day 33: Tries (Prefix Trees)
* **Theory Focus:**
    * Structure: Tree where edges represent characters.
    * Use Case: Autocomplete, Spell Check, IP Routing tables.
    * Complexity: $O(L)$ where $L$ is key length.
* **Coding Task:**
    * Implement a Trie class with `insert`, `search`, `startsWith`.
* **Problems:**
    * [Medium] **Implement Trie (Prefix Tree)**.
    * [Medium] **Design Add and Search Words Data Structure** (Wildcard handling).



### Day 34: Heaps (Priority Queues) Internals
* **Theory Focus:**
    * **Binary Heap:** Array representation logic (`Left = 2i+1`, `Right = 2i+2`).
    * **Operations:** `SiftUp` (Insert), `SiftDown` (Delete Max).
    * **Complexity:** Insert/Delete $O(\log N)$, Peek $O(1)$, Build Heap $O(N)$.
* **Problems:**
    * [Medium] **Kth Largest Element in an Array** (Min-Heap approach).
    * [Medium] **Top K Frequent Elements** (Bucket Sort optimization possibility).

### Day 35: Weekly Review & Retro
* **Activity:**
    * Visualize `SiftDown` logic for a Heap.
    * Explain the difference between `Preorder` and `Postorder` use-cases (e.g., Copying a tree vs. Deleting a tree).

---

## 📅 Week 6: Graphs (Basics & Traversals)

### Day 36: Graph Representation
* **Theory Focus:**
    * **Adjacency Matrix:** $O(1)$ edge lookup, $O(V^2)$ space. Good for dense graphs.
    * **Adjacency List:** $O(1)$ to find neighbors, $O(V+E)$ space. Standard for interviews.
* **Coding Task:**
    * Implement a Graph class using `HashMap<Integer, List<Integer>>`.
* **Problems:**
    * [Medium] **Find the Town Judge** (In-degree/Out-degree counting).
    * [Medium] **Clone Graph** (Deep copy using HashMap to track visited nodes).

### Day 37: Graph BFS (Shortest Path in Unweighted)
* **Theory Focus:**
    * Level-by-level exploration.
    * Using a Queue and `Visited` set.
    * Finding the shortest path in unweighted grids/graphs.
* **Problems:**
    * [Medium] **01 Matrix** (Multi-source BFS).
    * [Medium] **Rotting Oranges** (Simultaneous BFS).
    * [Medium] **Word Ladder** (BFS state transition).

### Day 38: Graph DFS (Connectivity & Cycles)
* **Theory Focus:**
    * Recursive exploration.
    * **Cycle Detection:**
        * Undirected: `visited` + `parent` check.
        * Directed: `recursionStack` (current path) check.
* **Problems:**
    * [Medium] **Number of Islands** (Classic Grid DFS).
    * [Medium] **Max Area of Island**.
    * [Medium] **Surrounded Regions** (Boundary DFS).

### Day 39: Topological Sort (Dependencies)
* **Theory Focus:**
    * DAGs (Directed Acyclic Graphs).
    * **Kahn’s Algorithm:** (BFS + Indegree Array).
    * **DFS Approach:** Post-order reversal.
* **Problems:**
    * [Medium] **Course Schedule I** (Cycle detection).
    * [Medium] **Course Schedule II** (Ordering).
    * [Hard] **Alien Dictionary** (Deriving order from sorted strings).

### Day 40: Union-Find (Disjoint Set Union)
* **Theory Focus:**
    * **Operations:** `find(x)`, `union(x, y)`.
    * **Optimizations:** Path Compression + Union by Rank.
    * **Complexity:** Amortized $\alpha(N)$ (effectively constant).
* **Problems:**
    * [Medium] **Number of Provinces**.
    * [Medium] **Redundant Connection** (Cycle detection in undirected graph).
    * [Hard] **Longest Consecutive Sequence** (Can be solved with UF, though Set is easier).

### Day 41: Advanced Graph Applications
* **Theory Focus:**
    * **Bipartite Graphs:** 2-Coloring problem.
    * **Connected Components:** Counting distinct subgraphs.
* **Problems:**
    * [Medium] **Is Graph Bipartite?**
    * [Medium] **Accounts Merge** (Union-Find application).

### Day 42: Weekly Review & Retro
* **Activity:**
    * Draw the `Union-Find` array state changes for a sequence of unions.
    * **Mock:** Explain "Topological Sort" as a project task scheduler.

---

## 📅 Week 7: Advanced Heaps & Shortest Paths

### Day 43: Dijkstra’s Algorithm
* **Theory Focus:**
    * Shortest path with **non-negative** weights.
    * Priority Queue (Min-Heap) + Greedy approach.
    * Complexity: $O(E \log V)$.
* **Problems:**
    * [Medium] **Network Delay Time** (Standard Dijkstra).
    * [Medium] **Path with Maximum Probability** (Max-Heap modification).

### Day 44: Heap Patterns (Two Heaps)
* **Theory Focus:**
    * Maintaining dynamic statistics (Median).
    * Balancing two heaps (Min and Max).
* **Problems:**
    * [Hard] **Find Median from Data Stream**.
    * [Hard] **Sliding Window Median**.

### Day 45: Merge K Sorted Lists (Review)
* **Theory Focus:**
    * Compare 3 approaches:
        1.  Collect & Sort ($N \log N$).
        2.  Pairwise Merge ($NK$).
        3.  **Min-Heap ($N \log K$)**.
* **Practice:**
    * Re-solve **Merge k Sorted Lists** specifically using the Heap approach.

### Day 46: Prim’s & Kruskal’s (MST)
* **Theory Focus:**
    * **Minimum Spanning Tree:** Connect all nodes with min total weight.
    * **Kruskal’s:** Sort edges + Union-Find.
    * **Prim’s:** Priority Queue (like Dijkstra).
* **Problems:**
    * [Medium] **Min Cost to Connect All Points**.

### Day 47: Bellman-Ford (Optional but Good to Know)
* **Theory Focus:**
    * Handling **negative weights**.
    * Detecting negative cycles.
    * Relaxation $V-1$ times.
* **Problems:**
    * [Medium] **Cheapest Flights Within K Stops** (Often solved with modified BFS/Dijkstra, but relates to Bellman-Ford concepts).

### Day 48: "Hard" Graph Problems
* **Focus:** Combining concepts (e.g., BFS + Bitmask, or Dijkstra + States).
* **Problems:**
    * [Hard] **Shortest Path Visiting All Nodes** (BFS with Bitmask state).
    * [Hard] **Word Search II** (Trie + Backtracking on Grid).

### Day 49: Phase 3 Assessment
* **Challenge:** Solve 3 problems in 75 mins.
    1.  **Topological Sort:** Course Schedule II.
    2.  **Dijkstra:** Network Delay Time.
    3.  **Tree Recursion:** Lowest Common Ancestor.
* **Self-Correction:**
    * Did you use `visited` sets to avoid infinite loops in Graphs?
    * Did you correctly implement the Comparator for the Priority Queue?
---

# Phase 4: Optimization, DP & Advanced Graphs
**Goal:** Master optimization techniques, Dynamic Programming patterns, and complex graph scenarios.

---

## 📅 Week 8: Dynamic Programming I (1D & Grid)

### Day 50: The DP Framework (Memoization)
* **Theory Focus:**
    * **Top-Down (Recursion + Memoization):** The easiest way to learn DP.
    * **The Pattern:**
        1.  Define the state (what variables change?).
        2.  Define the recurrence relation (how does state $i$ relate to $i-1$?).
        3.  Define base cases.
* **Problems:**
    * [Easy] **Climbing Stairs** (Fibonacci in disguise).
    * [Medium] **House Robber** (1D DP, choosing non-adjacent elements).

### Day 51: 1D Dynamic Programming
* **Theory Focus:**
    * **Bottom-Up (Tabulation):** Iterative approach. Removing recursion overhead.
    * **Space Optimization:** reducing $O(N)$ space to $O(1)$ by keeping only previous states.
* **Problems:**
    * [Medium] **House Robber II** (Circular arrangement).
    * [Medium] **Decode Ways** (Handling '0' edge cases).
    * [Medium] **Longest Increasing Subsequence** (Classic $O(N^2)$ vs $O(N \log N)$ patience sorting).

### Day 52: 2D Grid DP (Path Finding)
* **Theory Focus:**
    * State involves coordinates `(row, col)`.
    * Moving Right/Down only vs. 4-directional (which usually becomes BFS/Dijkstra, not DP).
* **Problems:**
    * [Medium] **Unique Paths**.
    * [Medium] **Unique Paths II** (With obstacles).
    * [Medium] **Minimum Path Sum**.

### Day 53: 2D String DP (LCS Pattern)
* **Theory Focus:**
    * Comparing two strings/sequences.
    * Table `dp[i][j]` represents prefix `i` of string A and prefix `j` of string B.
* **Problems:**
    * [Medium] **Longest Common Subsequence** (The parent of all string DP problems).
    * [Hard] **Edit Distance** (Levenshtein Distance - crucial for spell checkers).



### Day 54: Unbounded Knapsack (Coin Change)
* **Theory Focus:**
    * **0/1 Knapsack:** Use an item once or not at all.
    * **Unbounded:** Use an item infinite times.
* **Problems:**
    * [Medium] **Coin Change** (Min coins to make amount).
    * [Medium] **Coin Change II** (Number of ways to make amount).
    * [Medium] **Perfect Squares**.

### Day 55: Decision Making (Stock Problems)
* **Theory Focus:**
    * State Machines in DP.
    * Variables: `day`, `holding_stock?`, `transactions_left`.
* **Problems:**
    * [Medium] **Best Time to Buy and Sell Stock II** (Infinite transactions).
    * [Hard] **Best Time to Buy and Sell Stock III** (At most 2 transactions).
    * [Hard] **Best Time to Buy and Sell Stock IV** (k transactions).

### Day 56: Weekly Review & Retro
* **Activity:**
    * Convert your recursive "Coin Change" solution to an iterative table.
    * Explain why "Longest Path in a Graph" is generally NP-Hard, but "Longest Path in a DAG" is solvable with DP.

---

## 📅 Week 9: Advanced DP & Intervals

### Day 57: 0/1 Knapsack Pattern
* **Theory Focus:**
    * Standard Knapsack: Max value with weight limit $W$.
    * DP State: `dp[index][current_weight]`.
* **Problems:**
    * [Medium] **Partition Equal Subset Sum** (Reduces to: Can we fill a knapsack of capacity `TotalSum/2`?).
    * [Medium] **Target Sum**.

### Day 58: Palindromic DP
* **Theory Focus:**
    * Expanding around center vs. DP Interval method.
    * State: `dp[i][j]` is true if substring `s[i...j]` is a palindrome.
* **Problems:**
    * [Medium] **Longest Palindromic Subsequence**.
    * [Hard] **Palindrome Partitioning II** (Min cuts).

### Day 59: Greedy vs. DP (Differentiation)
* **Theory Focus:**
    * Learning when *not* to use DP.
    * **Interval Scheduling:** Greedy usually works for "Max non-overlapping intervals".
* **Problems:**
    * [Medium] **Jump Game** (Greedy).
    * [Medium] **Jump Game II** (Greedy - Min jumps).
    * Compare with DP versions.

### Day 60: Parentheses & Catalan Numbers
* **Theory Focus:**
    * Problems involving valid combinations of brackets.
* **Problems:**
    * [Medium] **Generate Parentheses**.
    * [Medium] **Different Ways to Add Parentheses**.

### Day 61: Matrix Chain Multiplication (MCM) Pattern
* **Theory Focus:**
    * Splitting an interval `(i, j)` at every possible `k`.
    * $O(N^3)$ complexity.
* **Problems:**
    * [Hard] **Burst Balloons** (Tricky transformation).
    * [Medium] **Minimum Score Triangulation of Polygon**.

### Day 62: DP on Trees (House Robber III)
* **Theory Focus:**
    * Using tree recursion return values as DP states.
    * Example: Return `[val_if_robbed, val_if_not_robbed]`.
* **Problems:**
    * [Medium] **House Robber III**.
    * [Hard] **Binary Tree Maximum Path Sum** (Revisit).
    * [Hard] **Diameter of Binary Tree**.

### Day 63: Weekly Review & Retro
* **Activity:**
    * **Mock Interview:** Explain "Burst Balloons". It's hard to visualize. Focus on the sub-problem definition.

---

## 📅 Week 10: Advanced Graphs & Systems Intersections

### Day 64: Union-Find Advanced
* **Theory Focus:**
    * Revisit Disjoint Set.
    * Applications in image processing and network connectivity.
* **Problems:**
    * [Hard] **Couples Holding Hands** (Cyclic permutation logic).
    * [Medium] **Smallest String With Swaps**.

### Day 65: Shortest Path Variations
* **Theory Focus:**
    * **Floyd-Warshall:** All-pairs shortest path ($O(N^3)$). Small constraints ($N < 400$).
    * **A* Search:** Heuristic basics (Euclidean distance).
* **Problems:**
    * [Medium] **Cheapest Flights Within K Stops**.
    * [Hard] **Find the City With the Smallest Number of Neighbors at a Threshold Distance**.

### Day 66: Eulerian Circuits (Hierholzer’s Algorithm)
* **Theory Focus:**
    * Visiting every edge exactly once.
    * Requirement: In-degree == Out-degree.
* **Problems:**
    * [Hard] **Reconstruct Itinerary** (JFK Airport problem).

### Day 67: Strongly Connected Components (Tarjan’s / Kosaraju’s)
* **Theory Focus:**
    * Finding clusters where every node is reachable from every other node.
    * *Note:* Rarely asked to implement fully, but good for "Critical Connections".
* **Problems:**
    * [Hard] **Critical Connections in a Network** (Finding Bridges / Articulation Points).

### Day 68: Trie + X (Advanced Applications)
* **Theory Focus:**
    * Using Tries with XOR operations (Bitwise Trie).
* **Problems:**
    * [Hard] **Maximum XOR of Two Numbers in an Array**.
    * [Hard] **Word Search II** (Optimization: Pruning the Trie during DFS).

### Day 69: Segment Trees (Concept Only)
* **Theory Focus:**
    * Range Queries: Sum/Max in range $[L, R]$ with updates.
    * *Note:* Often overkill for interviews, but good for Staff "Toolbox".
* **Problems:**
    * [Medium] **Range Sum Query - Mutable** (Can use Binary Indexed Tree / Fenwick Tree too).

### Day 70: Phase 4 Assessment
* **Challenge:** Solve 3 problems in 90 mins.
    1.  **DP:** Edit Distance or Longest Common Subsequence.
    2.  **Intervals:** Burst Balloons (or similar Matrix Chain problem).
    3.  **Graph:** Reconstruct Itinerary.
* **Self-Correction:**
    * Did you identify the DP state correctly immediately?
    * Did you get stuck on the index manipulation in the table?

---

# Phase 5: The "Staff" Differentiators
**Goal:** Bridge the gap between Algorithms and Systems. Focus on Thread Safety, API Design, Scalability, and "Mini-System" algorithms.

---

## 📅 Week 11: Concurrency & Distributed Primitives

### Day 71: Concurrency Fundamentals
* **Theory Focus:**
    * **Process vs. Thread:** Memory sharing models.
    * **Context Switching:** The cost of switching threads.
    * **Deadlock Conditions:** Coffman conditions (Mutual Exclusion, Hold and Wait, No Preemption, Circular Wait).
* **Self-Study:**
    * `synchronized` vs `ReentrantLock` (Java) or `std::mutex` (C++).
    * **Volatile:** Memory visibility vs. Atomicity.
* **Visual Aid:**
    * 

### Day 72: Thread Safety Primitives & Atomics
* **Theory Focus:**
    * **Race Conditions:** Why `count++` is not atomic.
    * **CAS (Compare-And-Swap):** The hardware primitive behind optimistic locking.
    * **Semaphores:** Counting permits vs. Binary Mutex.
* **Coding Task:**
    * Implement a **Thread-Safe Counter** using Locks.
    * Implement a **Thread-Safe Counter** using CAS (AtomicInteger).

### Day 73: The Producer-Consumer Problem
* **Theory Focus:**
    * Decoupling data generation from processing.
    * Handling "Buffer Full" and "Buffer Empty" states without busy waiting.
    * **Condition Variables:** `wait()` and `notify()`.
* **Coding Task:**
    * **Design a Bounded Blocking Queue:**
        * `enqueue(item)`: Blocks if full.
        * `dequeue()`: Blocks if empty.
* **Visual Aid:**
    * 

### Day 74: Advanced Concurrency Patterns
* **Theory Focus:**
    * **Reader-Writer Locks:** Optimizing for read-heavy workloads (allow multiple readers, single writer).
    * **Dining Philosophers:** Handling resource contention.
* **Problem:**
    * [Medium] **The Dining Philosophers** (LeetCode concurrency track).
    * **Print Foobar Alternately** (Synchronization practice).

### Day 75: Distributed Systems Primitives (Algo View)
* **Theory Focus:**
    * **Consistent Hashing:** How to distribute keys across $N$ servers with minimal reshuffling when servers die.
    * **Bloom Filters:** Probabilistic data structure. "Might be in set" vs "Definitely not in set".
* **Problems:**
    * [Medium] **Encode and Decode TinyURL** (Discuss Base62 vs. Random Hash).
    * **Design a Consistent Hashing Ring** (Use `TreeMap` / Binary Search for token lookup).
* **Visual Aid:**
    * 

### Day 76: Rate Limiting Algorithms
* **Theory Focus:**
    * Protection against DDoS and API abuse.
    * **Algorithms:**
        1.  **Token Bucket:** Bursty traffic allowed.
        2.  **Leaky Bucket:** Constant outflow rate.
        3.  **Sliding Window Log:** Accurate but expensive.
* **Coding Task:**
    * Implement a `RateLimiter` class (e.g., allow $N$ requests per minute).

### Day 77: Weekly Review & Retro
* **Activity:**
    * Write a thread-safe **Singleton** (Double-Checked Locking pattern). Explain why `volatile` is needed.
    * Review the difference between **Pessimistic Locking** (DB locks) vs **Optimistic Locking** (Version numbers/CAS).

---

## 📅 Week 12: Real-World Applications & Mock Interviews

### Day 78: Cache Design (LRU/LFU)
* **Theory Focus:**
    * The most common "Design + Algo" interview question.
    * **LRU (Least Recently Used):** Hash Map + Doubly Linked List.
    * **LFU (Least Frequently Used):** Hash Map + Frequency Lists (Harder).
* **Problems:**
    * [Medium] **LRU Cache** (Get/Put in $O(1)$).
    * [Hard] **LFU Cache**.
* **Visual Aid:**
    * 

### Day 79: Spatial Data Structures (Geo-Location)
* **Theory Focus:**
    * How to find "Nearest Neighbors" efficiently.
    * **QuadTree:** Partitioning 2D space into 4 quadrants recursively.
    * **Geohash:** String-based spatial encoding (Z-order curve).
* **Problems:**
    * [Medium] **Construct Quad Tree**.
    * **System Design:** How would you design the backend for Uber/Yelp map search?

### Day 80: Search & Autocomplete
* **Theory Focus:**
    * **Inverted Index:** Mapping words to document IDs (The core of Elasticsearch/Google).
    * **Typeahead:** Using Tries with ranking support (storing top $K$ searches at each node).
* **Problems:**
    * [Hard] **Design Search Autocomplete System**.
    * Review **Word Search II** (Trie optimizations).

### Day 81: Handling Large Data (External Algorithms)
* **Theory Focus:**
    * Algorithms when data > RAM.
    * **External Merge Sort:** Sorting a 100GB file on 1GB RAM.
    * **K-Way Merge:** Using a Min-Heap to merge $K$ sorted chunks from disk.
* **Discussion:**
    * Understand **Disk I/O** costs vs. Memory access costs.

### Day 82: The "Staff" Behavioral Interview
* **Focus:**
    * You are not just a coder; you are a force multiplier.
    * **Core Competencies:** Conflict Resolution, Technical Strategy, Mentorship.
* **Prep:** Prepare stories using **STAR** (Situation, Task, Action, Result) for:
    * "Tell me about a time you disagreed with a Product Manager."
    * "Tell me about a technical debt you championed fixing."
    * "How do you handle a junior engineer who is underperforming?"

### Day 83: Full Mock Interview (System + Algo Hybrid)
* **Scenario:**
    * *"Design an In-Memory Key-Value Store with Transaction Support."*
* **Requirements to cover:**
    * **Data Structure:** Hash Map / Skip List.
    * **Transactions:** `begin()`, `commit()`, `rollback()`. (Requires Stack of maps).
    * **Concurrency:** How to handle simultaneous writes?

### Day 84: Final Assessment & Rest
* **Audit:**
    * Are you comfortable discussing *why* you chose a Linked List over an Array?
    * Can you write clean, modular code without valid syntax errors on a whiteboard?
* **Action:**
    * Take a break. Trust your preparation. You are ready.

---

# The Interview Preparation Protocol

### Step 1: Clarification (The first 3 minutes)
Do not start coding. Ask:
* "What is the range of the input?" (Determines need for `long` vs `int`).
* "How large is the dataset?" (Determines time complexity constraints).
* "Can the input be empty or null?"
* "Are we optimizing for Latency (Time) or Throughput/Memory (Space)?"

### Step 2: The Approach
* Describe your solution in plain English or Pseudocode.
* State the complexity: "Using a Max-Heap, this will take $O(N \log K)$ time."
* Ask the interviewer: "Does this approach look good to you, or should we look for optimizations?"

### Step 3: Coding (Production Style)
* **Variables:** Use `nextUserIndex` instead of `i`.
* **Modularity:** Extract logic into helper functions (e.g., `boolean isValid(...)`).
* **Guards:** Add checks at the top: `if (input == null) return;`

### Step 4: Dry Run
* Manually walk through your code with a sample input.
* Update variables on the "whiteboard" as you step through loops.
* *Catch your own bugs before the interviewer does.*

---

# 📚 Recommended Resources

1.  **Books:**
    * *Cracking the Coding Interview* (Gayle Laakmann McDowell) - Good for process.
    * *Elements of Programming Interviews* (Python/Java/C++ Edition) - **Highly recommended for Senior+**. The problems are harder and the solutions discuss variants.
2.  **Practice Platforms:**
    * LeetCode (Focus on "Top Interview 150").
    * Pramp / exponent (For Mock Interviews - crucial for communication practice).
