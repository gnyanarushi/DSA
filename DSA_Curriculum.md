# DSA Mastery Curriculum — Interview Preparation

> 14 Concepts | 20 Questions Each | FAANG-Level Preparation

---

# Concept 1: Arrays

## Overview

**Definition:** An array is a contiguous block of memory storing elements of the same type, accessed via index in O(1) time.

**Why It Is Important:**
- Foundation of almost every other data structure
- 30-40% of interview questions directly involve arrays
- Tests your ability to optimize brute-force approaches

**Common Time/Space Complexities:**
| Operation | Time |
|-----------|------|
| Access by index | O(1) |
| Search (unsorted) | O(n) |
| Search (sorted) | O(log n) |
| Insert/Delete at end | O(1) amortized |
| Insert/Delete at arbitrary position | O(n) |

**Common Interview Patterns:**
- Sliding Window (fixed & variable size)
- Two Pointers (same direction / opposite direction)
- Prefix Sum / Difference Array
- Kadane's Algorithm (max subarray)
- Dutch National Flag (3-way partition)
- Matrix traversal (spiral, diagonal, rotation)

**Real-World Applications:**
- Image processing (2D arrays/matrices)
- Time-series data and signal processing
- Database indexing and caching
- Audio/video buffers

---

## Prerequisites

- Basic programming (loops, conditionals, functions)
- Understanding of memory layout and indexing
- Big-O notation fundamentals
- Basic math (modular arithmetic, summation)

---

## Theory

### Traversal
Iterating over all elements. Foundation for every array algorithm. Forward, backward, and skip-based traversals.

### Prefix Sum
`prefix[i] = arr[0] + arr[1] + ... + arr[i]`

Allows range sum queries in O(1) after O(n) preprocessing.
- Range sum from index l to r: `prefix[r] - prefix[l-1]`
- Useful for subarray sum problems

### Difference Array
The inverse of prefix sum. Used when you need to apply range updates efficiently.
- To add `val` to range [l, r]: `diff[l] += val; diff[r+1] -= val`
- Reconstruct the array by taking the prefix sum of the difference array
- Useful for multiple range update queries

### Sliding Window
Maintain a window of elements and slide it across the array.
- **Fixed size:** Window of size k slides one element at a time
- **Variable size:** Expand/shrink window based on a condition
- Converts O(n*k) brute force to O(n)

### Two Pointers
Use two indices to traverse the array simultaneously.
- **Opposite direction:** Start from both ends (e.g., two-sum on sorted array)
- **Same direction:** Fast & slow pointer concept (e.g., remove duplicates)

### Kadane's Algorithm
Find the maximum sum contiguous subarray in O(n).
```
maxEndingHere = max(arr[i], maxEndingHere + arr[i])
maxSoFar = max(maxSoFar, maxEndingHere)
```

### Dutch National Flag (DNF)
Sort an array of 0s, 1s, and 2s in a single pass using three pointers: low, mid, high.
- Time: O(n), Space: O(1)

### Matrix Operations
- Spiral traversal
- Rotate matrix 90 degrees (transpose + reverse rows)
- Search in row-wise and column-wise sorted matrix
- Set matrix zeroes

---

## 10 Implementation Questions

| No | Question | Difficulty | Concepts Tested | Expected TC | Expected SC |
|----|----------|-----------|-----------------|-------------|-------------|
| 1 | Implement a dynamic array (ArrayList) from scratch with push, pop, get, and resize operations | Easy | Array basics, amortized doubling | O(1) amortized push | O(n) |
| 2 | Given an array, build its prefix sum array and answer multiple range sum queries | Easy | Prefix Sum | O(n) build + O(1) per query | O(n) |
| 3 | Implement the Difference Array technique: apply multiple range update operations and return the final array | Easy | Difference Array, Prefix Sum | O(n + q) | O(n) |
| 4 | Implement the Sliding Window Maximum: given an array and window size k, return the max element in every window | Medium | Sliding Window, Deque | O(n) | O(k) |
| 5 | Implement Two-Sum on a sorted array using the two-pointer approach (return indices) | Medium | Two Pointers | O(n) | O(1) |
| 6 | Implement Kadane's Algorithm and also return the start and end indices of the maximum subarray | Medium | Kadane's Algorithm | O(n) | O(1) |
| 7 | Implement the Dutch National Flag algorithm to sort an array containing only 0s, 1s, and 2s in a single pass | Medium | Three-way partition | O(n) | O(1) |
| 8 | Implement spiral order traversal of an m x n matrix | Medium | Matrix traversal, boundary tracking | O(m*n) | O(1) extra |
| 9 | Implement an algorithm to rotate an n x n matrix 90 degrees clockwise in-place | Hard | Matrix rotation, transpose | O(n^2) | O(1) |
| 10 | Given a 2D matrix where each row and column is sorted, implement an efficient search algorithm | Hard | Matrix search, staircase approach | O(m + n) | O(1) |

---

## 10 LeetCode Problems

| LC No | Problem | Difficulty | Pattern | Link |
|-------|---------|-----------|---------|------|
| 1 | Two Sum | Easy | Hashing / Two Pointers | https://leetcode.com/problems/two-sum/ |
| 53 | Maximum Subarray | Easy | Kadane's Algorithm | https://leetcode.com/problems/maximum-subarray/ |
| 121 | Best Time to Buy and Sell Stock | Easy | Single pass / Kadane variant | https://leetcode.com/problems/best-time-to-buy-and-sell-stock/ |
| 15 | 3Sum | Medium | Two Pointers + Sorting | https://leetcode.com/problems/3sum/ |
| 560 | Subarray Sum Equals K | Medium | Prefix Sum + HashMap | https://leetcode.com/problems/subarray-sum-equals-k/ |
| 238 | Product of Array Except Self | Medium | Prefix/Suffix Products | https://leetcode.com/problems/product-of-array-except-self/ |
| 48 | Rotate Image | Medium | Matrix Rotation | https://leetcode.com/problems/rotate-image/ |
| 3 | Longest Substring Without Repeating Characters | Medium | Sliding Window | https://leetcode.com/problems/longest-substring-without-repeating-characters/ |
| 42 | Trapping Rain Water | Hard | Two Pointers / Stack | https://leetcode.com/problems/trapping-rain-water/ |
| 239 | Sliding Window Maximum | Hard | Sliding Window + Deque | https://leetcode.com/problems/sliding-window-maximum/ |

---

## Interview Tips

**Common Mistakes:**
- Off-by-one errors in loop boundaries and window sizes
- Not handling empty arrays or single-element arrays
- Forgetting to handle negative numbers in Kadane's
- Modifying the array when the problem says "without extra space" but not "in-place modification allowed"
- Integer overflow on prefix sums (use long/long long)

**Edge Cases:**
- Empty array
- Array with one element
- All elements are the same
- Array is already sorted / reverse sorted
- Very large arrays (10^5 to 10^6 elements)
- All negative numbers (Kadane's)
- Matrix with single row or single column

**Frequently Asked Variations:**
- "Can you do it in one pass?"
- "Can you do it in O(1) extra space?"
- "What if the array is sorted?"
- "What if duplicates are present?"
- "Return all possible answers" (vs just one)

---

## Revision Checklist

- [ ] Can implement prefix sum and answer range queries from scratch
- [ ] Can apply difference array for range updates
- [ ] Can identify when to use fixed vs variable sliding window
- [ ] Can apply two-pointer technique on both sorted and unsorted arrays
- [ ] Can implement Kadane's with subarray indices
- [ ] Can sort 0/1/2 array in single pass (DNF)
- [ ] Can traverse matrix in spiral order
- [ ] Can rotate matrix 90 degrees in-place
- [ ] Can search in row-column sorted matrix in O(m+n)
- [ ] Can identify which pattern to use for a new array problem within 2 minutes
- [ ] Comfortable with all edge cases listed above

---

> **Concept 2: Strings follows below**

---

# Concept 2: Strings

## Overview

**Definition:** A string is a sequence of characters stored contiguously in memory, typically immutable in languages like Java/Python. String manipulation is the art of transforming, searching, and pattern-matching within character sequences.

**Why It Is Important:**
- Appears in 20-25% of coding interviews
- Tests precision with indices, edge cases, and character encoding
- Foundation for pattern matching, parsing, and text processing

**Common Time/Space Complexities:**
| Operation | Time |
|-----------|------|
| Access by index | O(1) |
| Concatenation (immutable) | O(n) |
| Substring search (brute force) | O(n*m) |
| Substring search (KMP/Rabin-Karp) | O(n+m) |
| Palindrome check | O(n) |

**Common Interview Patterns:**
- Two Pointers (palindrome, reversal)
- Sliding Window (longest substring problems)
- Hashing / Frequency Count
- String matching (KMP, Rabin-Karp)
- StringBuilder / character array manipulation
- Anagram detection and grouping

**Real-World Applications:**
- Text editors and search engines
- DNA sequence analysis
- Compiler tokenization and parsing
- Data compression algorithms

---

## Prerequisites

- Arrays fundamentals (indexing, traversal)
- ASCII/Unicode character encoding
- Hash maps / frequency counting
- Basic modular arithmetic (for Rabin-Karp)

---

## Theory

### Character Encoding & Immutability
Strings in Java/Python are immutable — every modification creates a new string. Use `StringBuilder` (Java) or list of characters (Python) for in-place operations to avoid O(n²) concatenation cost.

### Two Pointers on Strings
Used for palindrome checking, reversal, and partitioning. Compare characters from both ends moving inward.

### Sliding Window on Strings
Maintain a frequency map of the current window. Expand right pointer, shrink left pointer when constraint is violated.
- Fixed window: anagram detection
- Variable window: longest substring with at most K distinct characters

### Frequency Counting
Use an array of size 26 (lowercase) or 128 (ASCII) or a HashMap for character frequency problems.
- Anagram check: two strings have identical frequency arrays
- Character rearrangement: based on frequency priority

### KMP (Knuth-Morris-Pratt) Algorithm
Pattern matching in O(n+m) using a failure/prefix function.
- Build LPS (Longest Proper Prefix which is also Suffix) array
- Use LPS to skip unnecessary comparisons during matching

### Rabin-Karp Algorithm
Rolling hash-based pattern matching.
- Compute hash of pattern and rolling hash of text windows
- Average O(n+m), worst O(n*m) with hash collisions
- Useful for multi-pattern search

### Palindrome Techniques
- Two-pointer expand from center: O(n²) for all palindromic substrings
- Manacher's algorithm: O(n) for longest palindromic substring
- DP approach: `dp[i][j] = true` if `s[i..j]` is a palindrome

### String Rotation & Reversal
- Rotation check: `s2` is a rotation of `s1` iff `s2` is a substring of `s1 + s1`
- Word reversal: reverse entire string, then reverse each word

---

## 10 Implementation Questions

| No | Question | Difficulty | Concepts Tested | Expected TC | Expected SC |
|----|----------|-----------|-----------------|-------------|-------------|
| 1 | Check if two strings are anagrams of each other using frequency counting | Easy | Frequency Array | O(n) | O(1) |
| 2 | Check if a given string is a palindrome (ignoring non-alphanumeric characters and case) | Easy | Two Pointers | O(n) | O(1) |
| 3 | Implement a function to reverse words in a string without using split | Easy | Two Pointers, Reversal | O(n) | O(1) extra |
| 4 | Implement the KMP pattern matching algorithm with LPS array construction | Medium | KMP, Prefix Function | O(n+m) | O(m) |
| 5 | Find the longest substring without repeating characters using sliding window | Medium | Sliding Window, HashMap | O(n) | O(min(n,26)) |
| 6 | Given a string, find all anagrams of a pattern in it (return start indices) | Medium | Sliding Window, Frequency Array | O(n) | O(1) |
| 7 | Implement Rabin-Karp algorithm for pattern matching with rolling hash | Medium | Hashing, Modular Arithmetic | O(n+m) avg | O(1) |
| 8 | Find the longest palindromic substring using expand-around-center | Medium | Palindrome, Two Pointers | O(n²) | O(1) |
| 9 | Given a string, find the minimum window substring containing all characters of another string | Hard | Sliding Window, Frequency Map | O(n) | O(m) |
| 10 | Implement a string compression algorithm (e.g., "aabccc" → "a2b1c3") in-place | Hard | Two Pointers, In-place manipulation | O(n) | O(1) |

---

## 10 LeetCode Problems

| LC No | Problem | Difficulty | Pattern | Link |
|-------|---------|-----------|---------|------|
| 242 | Valid Anagram | Easy | Frequency Counting | https://leetcode.com/problems/valid-anagram/ |
| 125 | Valid Palindrome | Easy | Two Pointers | https://leetcode.com/problems/valid-palindrome/ |
| 344 | Reverse String | Easy | Two Pointers | https://leetcode.com/problems/reverse-string/ |
| 3 | Longest Substring Without Repeating Characters | Medium | Sliding Window | https://leetcode.com/problems/longest-substring-without-repeating-characters/ |
| 438 | Find All Anagrams in a String | Medium | Sliding Window + Frequency | https://leetcode.com/problems/find-all-anagrams-in-a-string/ |
| 5 | Longest Palindromic Substring | Medium | Expand Around Center | https://leetcode.com/problems/longest-palindromic-substring/ |
| 49 | Group Anagrams | Medium | Hashing + Sorting | https://leetcode.com/problems/group-anagrams/ |
| 567 | Permutation in String | Medium | Sliding Window | https://leetcode.com/problems/permutation-in-string/ |
| 76 | Minimum Window Substring | Hard | Sliding Window + HashMap | https://leetcode.com/problems/minimum-window-substring/ |
| 10 | Regular Expression Matching | Hard | DP / Recursion | https://leetcode.com/problems/regular-expression-matching/ |

---

## Interview Tips

**Common Mistakes:**
- Forgetting string immutability — causing O(n²) with repeated concatenation
- Off-by-one errors with substring indices
- Not handling empty strings or single-character strings
- Case sensitivity issues (not normalizing before comparison)
- Not considering Unicode/special characters

**Edge Cases:**
- Empty string
- Single character string
- All characters the same ("aaaa")
- String with spaces only
- Very long strings (10^5 characters)
- Pattern longer than text (matching problems)

**Frequently Asked Variations:**
- "Can you do it without extra space?"
- "Is the string ASCII or Unicode?"
- "Should comparison be case-sensitive?"
- "Can the string contain spaces/special characters?"
- "Return all valid answers vs just one"

---

## Revision Checklist

- [ ] Can check palindromes with two pointers in O(1) space
- [ ] Can implement sliding window for substring problems
- [ ] Can build and use frequency arrays for anagram detection
- [ ] Can implement KMP with LPS array from scratch
- [ ] Can implement Rabin-Karp with rolling hash
- [ ] Can find longest palindromic substring in O(n²)
- [ ] Can solve minimum window substring optimally
- [ ] Can reverse words in-place without split
- [ ] Can detect string rotation in O(n)
- [ ] Can identify string patterns within 2 minutes of reading a problem

---

# Concept 3: Recursion & Backtracking

## Overview

**Definition:** Recursion is a technique where a function calls itself to solve smaller subproblems. Backtracking extends recursion by exploring all possible solutions and abandoning ("pruning") paths that cannot lead to a valid answer.

**Why It Is Important:**
- Foundation for Trees, Graphs, DP, and Divide & Conquer
- 15-20% of interviews test recursive thinking directly
- Backtracking is the go-to approach for constraint satisfaction and combinatorial problems

**Common Time/Space Complexities:**
| Pattern | Time | Space (Call Stack) |
|---------|------|--------------------|
| Linear recursion | O(n) | O(n) |
| Binary recursion (e.g., Fibonacci naive) | O(2^n) | O(n) |
| Permutations | O(n!) | O(n) |
| Subsets/Power set | O(2^n) | O(n) |
| Backtracking with pruning | Variable (better than brute force) | O(n) |

**Common Interview Patterns:**
- Divide & Conquer (merge sort, quick sort, binary search)
- Generate all subsets / combinations / permutations
- Constraint satisfaction (N-Queens, Sudoku)
- Path finding with constraints
- Decision trees (include/exclude pattern)

**Real-World Applications:**
- Compilers (parsing recursive grammars)
- AI game solvers (chess, sudoku)
- File system traversal
- Network routing with constraints

---

## Prerequisites

- Functions and call stack understanding
- Arrays and strings basics
- Big-O notation (especially exponential complexities)
- Basic combinatorics (permutations, combinations)

---

## Theory

### Recursion Fundamentals
Every recursive function needs:
1. **Base case:** Condition to stop recursion
2. **Recursive case:** Break problem into smaller subproblems
3. **Progress toward base case:** Each call must reduce the problem size

### Call Stack & Stack Overflow
Each recursive call adds a frame to the call stack. Maximum recursion depth is typically ~10^4 in most languages. Tail recursion can be optimized by some compilers.

### Divide & Conquer
Split the problem into independent subproblems, solve each recursively, combine results.
- **Merge Sort:** Split array, sort halves, merge — O(n log n)
- **Quick Sort:** Partition around pivot, sort halves — O(n log n) average
- **Master Theorem:** T(n) = aT(n/b) + O(n^d) — determines complexity

### Subset Generation (Include/Exclude Pattern)
At each index, make a binary choice: include or exclude the element.
```
generate(index, current):
    if index == n: add current to results
    generate(index + 1, current)            // exclude
    generate(index + 1, current + arr[i])   // include
```

### Permutation Generation
At each position, choose from remaining unused elements.
- Use a `visited[]` array or swap-based approach
- Total permutations: n!

### Backtracking Framework
```
backtrack(state):
    if isValid(state): add to results; return
    if isInvalid(state): return  // PRUNE
    for each choice in choices:
        make choice
        backtrack(updated state)
        undo choice  // BACKTRACK
```

### Pruning Strategies
- **Constraint propagation:** Skip choices that violate constraints early
- **Symmetry breaking:** Avoid generating duplicate solutions
- **Bound checking:** If partial solution already exceeds limit, prune
- **Sorting first:** Enables skipping duplicates and early termination

### Branch & Bound
Extension of backtracking where we compute a bound (upper/lower) on the best solution reachable from current state. If bound is worse than current best, prune the entire subtree.

---

## 10 Implementation Questions

| No | Question | Difficulty | Concepts Tested | Expected TC | Expected SC |
|----|----------|-----------|-----------------|-------------|-------------|
| 1 | Implement power(x, n) using recursion with O(log n) time (fast exponentiation) | Easy | Divide & Conquer | O(log n) | O(log n) |
| 2 | Generate all subsets (power set) of a given array of distinct integers | Easy | Include/Exclude, Recursion | O(2^n) | O(n) stack |
| 3 | Print all permutations of a string/array of distinct elements | Easy | Permutation, Swap technique | O(n!) | O(n) |
| 4 | Implement merge sort from scratch | Medium | Divide & Conquer, Merging | O(n log n) | O(n) |
| 5 | Generate all valid combinations of n pairs of parentheses | Medium | Backtracking, Constraint counting | O(4^n / √n) | O(n) |
| 6 | Solve the N-Queens problem: place N queens on N×N board such that no two attack each other | Medium | Backtracking, Pruning | O(N!) | O(N²) |
| 7 | Find all combinations of candidates that sum to a target (elements may be reused) | Medium | Backtracking, Pruning, Sorting | O(2^t) | O(t) |
| 8 | Implement a Sudoku solver using backtracking | Medium | Backtracking, Constraint propagation | O(9^empty_cells) | O(1) |
| 9 | Given a string of digits, return all possible letter combinations (phone keypad mapping) | Hard | Backtracking, Multiple choices | O(4^n) | O(n) |
| 10 | Solve the Word Search problem: find if a word exists in a 2D grid following adjacent cells | Hard | Backtracking, DFS, Pruning | O(m*n*4^L) | O(L) |

---

## 10 LeetCode Problems

| LC No | Problem | Difficulty | Pattern | Link |
|-------|---------|-----------|---------|------|
| 50 | Pow(x, n) | Easy | Divide & Conquer | https://leetcode.com/problems/powx-n/ |
| 78 | Subsets | Easy | Include/Exclude | https://leetcode.com/problems/subsets/ |
| 46 | Permutations | Easy | Permutation generation | https://leetcode.com/problems/permutations/ |
| 22 | Generate Parentheses | Medium | Backtracking + Constraints | https://leetcode.com/problems/generate-parentheses/ |
| 39 | Combination Sum | Medium | Backtracking + Pruning | https://leetcode.com/problems/combination-sum/ |
| 51 | N-Queens | Medium | Backtracking + Board state | https://leetcode.com/problems/n-queens/ |
| 17 | Letter Combinations of a Phone Number | Medium | Backtracking + Mapping | https://leetcode.com/problems/letter-combinations-of-a-phone-number/ |
| 79 | Word Search | Medium | Backtracking + DFS | https://leetcode.com/problems/word-search/ |
| 37 | Sudoku Solver | Hard | Backtracking + Constraint Propagation | https://leetcode.com/problems/sudoku-solver/ |
| 212 | Word Search II | Hard | Backtracking + Trie | https://leetcode.com/problems/word-search-ii/ |

---

## Interview Tips

**Common Mistakes:**
- Missing or incorrect base case (infinite recursion)
- Not undoing state changes when backtracking (forgetting to "un-choose")
- Generating duplicate solutions (not handling repeated elements)
- Not pruning early enough (TLE on backtracking problems)
- Confusing recursion depth with time complexity

**Edge Cases:**
- Empty input (n=0)
- Single element input
- All elements identical (duplicate handling)
- Very deep recursion (stack overflow risk)
- Target that cannot be reached

**Frequently Asked Variations:**
- "Can you do it iteratively?" (stack-based simulation)
- "How do you handle duplicates in the input?"
- "What is the time complexity?" (often tricky for backtracking)
- "Can you prune more aggressively?"
- "What's the maximum recursion depth?"

---

## Revision Checklist

- [ ] Can identify base case and recursive case for any problem
- [ ] Can implement fast exponentiation recursively
- [ ] Can generate all subsets using include/exclude pattern
- [ ] Can generate all permutations using swap technique
- [ ] Can write the backtracking template from memory
- [ ] Can solve N-Queens with proper pruning
- [ ] Can implement merge sort from scratch
- [ ] Can handle duplicate elements in subset/permutation generation
- [ ] Can explain time complexity of recursive solutions using recurrence relations
- [ ] Can convert between recursive and iterative approaches
- [ ] Understand Branch & Bound as an extension of backtracking

---

# Concept 4: Linked Lists

## Overview

**Definition:** A linked list is a linear data structure where elements (nodes) are connected via pointers. Each node contains data and a reference to the next (and optionally previous) node.

**Why It Is Important:**
- Tests pointer manipulation and memory understanding
- Foundation for stacks, queues, hash chaining, adjacency lists
- 10-15% of interview questions involve linked lists
- Tests ability to handle edge cases with null pointers

**Common Time/Space Complexities:**
| Operation | Singly LL | Doubly LL |
|-----------|-----------|-----------|
| Access by index | O(n) | O(n) |
| Insert at head | O(1) | O(1) |
| Insert at tail (with tail pointer) | O(1) | O(1) |
| Delete a given node | O(n) | O(1) |
| Search | O(n) | O(n) |

**Common Interview Patterns:**
- Fast & Slow Pointers (Floyd's cycle detection)
- Reversal (iterative and recursive)
- Merge two sorted lists
- Dummy head node technique
- Runner technique (two pointers at different speeds)

**Real-World Applications:**
- Memory allocation (free lists in OS)
- Browser history (doubly linked list)
- Music playlist (circular linked list)
- LRU Cache (doubly linked list + hash map)

---

## Prerequisites

- Pointers/references and memory concepts
- Basic recursion
- Object-oriented programming (Node class)
- Understanding of null/None handling

---

## Theory

### Singly Linked List
Each node has `data` and `next`. Traversal is one-directional. Insert/delete at head is O(1); at arbitrary position requires traversal.

### Doubly Linked List
Each node has `data`, `next`, and `prev`. Allows bidirectional traversal. Deletion of a known node is O(1) since we have access to both neighbors.

### Circular Linked List
Last node points back to the head. Useful for round-robin scheduling and circular buffers.

### Fast & Slow Pointer (Floyd's Algorithm)
- **Cycle detection:** Slow moves 1 step, fast moves 2 steps. If they meet, cycle exists.
- **Cycle start:** After meeting, reset one pointer to head. Move both 1 step at a time — they meet at cycle start.
- **Middle of list:** When fast reaches end, slow is at the middle.

### Reversal Techniques
**Iterative:**
```
prev = null, curr = head
while curr:
    next = curr.next
    curr.next = prev
    prev = curr
    curr = next
return prev
```
**Recursive:**
```
reverse(node):
    if node == null or node.next == null: return node
    rest = reverse(node.next)
    node.next.next = node
    node.next = null
    return rest
```

### Dummy Head Technique
Create a dummy node before the real head. Simplifies edge cases where the head itself might be removed or changed. Return `dummy.next` as the new head.

### Merge Technique
Merge two sorted lists by comparing heads and attaching the smaller one to the result. Foundation for merge sort on linked lists.

### In-place Modifications
Many linked list problems require O(1) space — manipulate existing pointers rather than creating new nodes.

---

## 10 Implementation Questions

| No | Question | Difficulty | Concepts Tested | Expected TC | Expected SC |
|----|----------|-----------|-----------------|-------------|-------------|
| 1 | Implement a singly linked list with insert, delete, search, and display operations | Easy | Basic LL operations | O(n) per op | O(1) |
| 2 | Reverse a singly linked list iteratively | Easy | Pointer manipulation | O(n) | O(1) |
| 3 | Detect if a linked list has a cycle using Floyd's algorithm | Easy | Fast & Slow pointers | O(n) | O(1) |
| 4 | Find the middle node of a linked list in one pass | Medium | Fast & Slow pointers | O(n) | O(1) |
| 5 | Merge two sorted linked lists into one sorted list | Medium | Merge technique, Dummy head | O(n+m) | O(1) |
| 6 | Remove the Nth node from the end of a linked list in one pass | Medium | Two pointers with gap | O(n) | O(1) |
| 7 | Reverse a linked list in groups of K nodes | Medium | Reversal, Counting | O(n) | O(1) |
| 8 | Detect the starting node of a cycle in a linked list | Medium | Floyd's cycle detection | O(n) | O(1) |
| 9 | Implement a Doubly Linked List with insert, delete at any position | Hard | DLL pointer manipulation | O(n) | O(1) |
| 10 | Implement LRU Cache using a doubly linked list and a hash map | Hard | DLL + HashMap, Design | O(1) per op | O(capacity) |

---

## 10 LeetCode Problems

| LC No | Problem | Difficulty | Pattern | Link |
|-------|---------|-----------|---------|------|
| 206 | Reverse Linked List | Easy | Iterative/Recursive reversal | https://leetcode.com/problems/reverse-linked-list/ |
| 21 | Merge Two Sorted Lists | Easy | Merge + Dummy head | https://leetcode.com/problems/merge-two-sorted-lists/ |
| 141 | Linked List Cycle | Easy | Floyd's Fast & Slow | https://leetcode.com/problems/linked-list-cycle/ |
| 19 | Remove Nth Node From End of List | Medium | Two pointers with gap | https://leetcode.com/problems/remove-nth-node-from-end-of-list/ |
| 142 | Linked List Cycle II | Medium | Floyd's cycle start | https://leetcode.com/problems/linked-list-cycle-ii/ |
| 148 | Sort List | Medium | Merge Sort on LL | https://leetcode.com/problems/sort-list/ |
| 143 | Reorder List | Medium | Middle + Reverse + Merge | https://leetcode.com/problems/reorder-list/ |
| 25 | Reverse Nodes in k-Group | Medium | Group reversal | https://leetcode.com/problems/reverse-nodes-in-k-group/ |
| 146 | LRU Cache | Hard | DLL + HashMap | https://leetcode.com/problems/lru-cache/ |
| 23 | Merge k Sorted Lists | Hard | Divide & Conquer / Heap | https://leetcode.com/problems/merge-k-sorted-lists/ |

---

## Interview Tips

**Common Mistakes:**
- Losing reference to the next node during reversal
- Not handling null head or single-node list
- Forgetting to update tail pointer in operations
- Off-by-one errors with the "Nth from end" pattern
- Creating cycles accidentally during pointer manipulation

**Edge Cases:**
- Empty list (null head)
- Single node list
- Two node list (many operations behave differently)
- Cycle at the head vs cycle in the middle
- K > list length (for group reversal)

**Frequently Asked Variations:**
- "Can you do it in one pass?"
- "Can you do it with O(1) extra space?"
- "What if the list is doubly linked?"
- "What if the list is circular?"
- "Can you do it recursively? Now iteratively?"

---

## Revision Checklist

- [ ] Can implement singly and doubly linked list from scratch
- [ ] Can reverse a linked list both iteratively and recursively
- [ ] Can detect cycle and find cycle start using Floyd's
- [ ] Can find middle of list in one pass
- [ ] Can merge two sorted lists using dummy head
- [ ] Can remove Nth node from end in one pass
- [ ] Can reverse in groups of K
- [ ] Can implement LRU Cache with O(1) operations
- [ ] Comfortable with dummy head technique for edge case simplification
- [ ] Can sort a linked list using merge sort in O(n log n)

---

# Concept 5: Stack & Queue

## Overview

**Definition:** A Stack is a LIFO (Last In, First Out) data structure. A Queue is a FIFO (First In, First Out) data structure. Both are abstract data types that can be implemented using arrays or linked lists.

**Why It Is Important:**
- Stacks power function calls, expression parsing, undo operations
- Queues power BFS, scheduling, and buffering
- 10-15% of interview problems directly use stacks/queues
- Monotonic stacks/queues are critical for optimization problems

**Common Time/Space Complexities:**
| Operation | Stack | Queue | Deque |
|-----------|-------|-------|-------|
| Push/Enqueue | O(1) | O(1) | O(1) |
| Pop/Dequeue | O(1) | O(1) | O(1) |
| Peek/Front | O(1) | O(1) | O(1) |
| Search | O(n) | O(n) | O(n) |

**Common Interview Patterns:**
- Monotonic Stack (next greater/smaller element)
- Stack for expression evaluation (infix, postfix)
- Queue using two stacks / Stack using two queues
- BFS with queue
- Sliding window maximum with deque

**Real-World Applications:**
- Browser back/forward (stack)
- Print queue, task scheduling (queue)
- Expression evaluation in calculators
- Call stack in programming languages
- Message queues in distributed systems

---

## Prerequisites

- Arrays and linked list basics
- Understanding of LIFO and FIFO concepts
- Basic recursion (call stack)
- Understanding of amortized analysis

---

## Theory

### Stack Operations
- `push(x)`: Add element to top
- `pop()`: Remove and return top element
- `peek()`: View top element without removing
- `isEmpty()`: Check if stack is empty

### Queue Operations
- `enqueue(x)`: Add element to rear
- `dequeue()`: Remove and return front element
- `front()`: View front element without removing
- `isEmpty()`: Check if queue is empty

### Monotonic Stack
A stack that maintains elements in strictly increasing or decreasing order.
- **Next Greater Element:** For each element, find the next element that is greater to its right. Use a decreasing monotonic stack.
- **Next Smaller Element:** Use an increasing monotonic stack.
- Useful for histogram problems, stock span, temperature problems.

### Expression Evaluation
- **Infix to Postfix:** Use operator stack with precedence rules
- **Postfix evaluation:** Use operand stack; push numbers, apply operators
- **Balanced parentheses:** Push opening brackets, pop and match closing brackets

### Queue Implementations
- **Circular Queue:** Array-based with front and rear wrapping around using modulo
- **Queue using Two Stacks:** Enqueue into stack1, for dequeue transfer to stack2 if empty — amortized O(1)
- **Priority Queue:** Elements dequeue by priority (implemented with heaps)

### Deque (Double-ended Queue)
Supports insertion and removal from both ends in O(1). Used for sliding window maximum problems.

### Min Stack / Max Stack
Maintain an auxiliary stack tracking the minimum/maximum at each level. Every push/pop updates the auxiliary stack.

---

## 10 Implementation Questions

| No | Question | Difficulty | Concepts Tested | Expected TC | Expected SC |
|----|----------|-----------|-----------------|-------------|-------------|
| 1 | Implement a Stack using an array with push, pop, peek, and isEmpty | Easy | Stack basics | O(1) per op | O(n) |
| 2 | Implement a Queue using two stacks with amortized O(1) dequeue | Easy | Stack, Amortized analysis | O(1) amortized | O(n) |
| 3 | Check if a given string of parentheses is balanced (includes `()`, `{}`, `[]`) | Easy | Stack, Matching | O(n) | O(n) |
| 4 | Implement a Min Stack that supports push, pop, top, and getMin in O(1) | Medium | Auxiliary stack | O(1) per op | O(n) |
| 5 | Implement Next Greater Element for each element in an array using monotonic stack | Medium | Monotonic Stack | O(n) | O(n) |
| 6 | Evaluate a postfix (Reverse Polish Notation) expression using a stack | Medium | Stack, Expression evaluation | O(n) | O(n) |
| 7 | Implement a Circular Queue with fixed capacity using an array | Medium | Circular indexing, Modulo | O(1) per op | O(k) |
| 8 | Implement the Stock Span problem: for each day, find how many consecutive previous days had price ≤ today | Medium | Monotonic Stack | O(n) | O(n) |
| 9 | Find the largest rectangle in a histogram using a stack | Hard | Monotonic Stack | O(n) | O(n) |
| 10 | Implement an LFU (Least Frequently Used) Cache | Hard | HashMap + Doubly LL + Frequency tracking | O(1) per op | O(capacity) |

---

## 10 LeetCode Problems

| LC No | Problem | Difficulty | Pattern | Link |
|-------|---------|-----------|---------|------|
| 20 | Valid Parentheses | Easy | Stack matching | https://leetcode.com/problems/valid-parentheses/ |
| 232 | Implement Queue using Stacks | Easy | Two stacks | https://leetcode.com/problems/implement-queue-using-stacks/ |
| 155 | Min Stack | Easy | Auxiliary stack | https://leetcode.com/problems/min-stack/ |
| 496 | Next Greater Element I | Medium | Monotonic Stack + HashMap | https://leetcode.com/problems/next-greater-element-i/ |
| 150 | Evaluate Reverse Polish Notation | Medium | Stack evaluation | https://leetcode.com/problems/evaluate-reverse-polish-notation/ |
| 739 | Daily Temperatures | Medium | Monotonic Stack | https://leetcode.com/problems/daily-temperatures/ |
| 622 | Design Circular Queue | Medium | Circular indexing | https://leetcode.com/problems/design-circular-queue/ |
| 901 | Online Stock Span | Medium | Monotonic Stack | https://leetcode.com/problems/online-stock-span/ |
| 84 | Largest Rectangle in Histogram | Hard | Monotonic Stack | https://leetcode.com/problems/largest-rectangle-in-histogram/ |
| 460 | LFU Cache | Hard | HashMap + DLL + Frequency | https://leetcode.com/problems/lfu-cache/ |

---

## Interview Tips

**Common Mistakes:**
- Popping from an empty stack (always check isEmpty first)
- Not handling the circular queue wrap-around correctly
- Forgetting to reset stack/queue state after operations
- Using O(n) approach when monotonic stack gives O(1) amortized
- Not considering when to pop from monotonic stack

**Edge Cases:**
- Empty stack/queue operations
- Single element
- All elements are the same (monotonic stack)
- Expression with only one operand
- Queue/stack at full capacity

**Frequently Asked Variations:**
- "Can you implement X using only stacks/queues?"
- "What's the amortized complexity?"
- "Can you do it without extra space?"
- "What if you need both min and max?"
- "Extend to handle multiple types of brackets"

---

## Revision Checklist

- [ ] Can implement stack and queue from scratch (array and linked list based)
- [ ] Can implement queue using two stacks with amortized O(1)
- [ ] Can check balanced parentheses
- [ ] Can implement Min Stack in O(1) for all operations
- [ ] Can solve Next Greater Element using monotonic stack
- [ ] Can evaluate postfix expressions
- [ ] Can implement circular queue
- [ ] Can solve largest rectangle in histogram
- [ ] Can identify when monotonic stack is applicable
- [ ] Understand the difference between monotonic increasing and decreasing stacks

---

# Concept 6: Hashing

## Overview

**Definition:** Hashing is a technique that maps data of arbitrary size to fixed-size values using a hash function. Hash tables (HashMaps/HashSets) provide average O(1) lookup, insert, and delete operations.

**Why It Is Important:**
- Most common way to achieve O(1) lookups in interviews
- Used as a building block in 30-40% of interview solutions
- Foundation for caching, indexing, deduplication
- Understanding collisions and load factors tests CS fundamentals

**Common Time/Space Complexities:**
| Operation | Average | Worst (all collisions) |
|-----------|---------|------------------------|
| Insert | O(1) | O(n) |
| Search | O(1) | O(n) |
| Delete | O(1) | O(n) |
| Space | O(n) | O(n) |

**Common Interview Patterns:**
- Two Sum pattern (complement lookup)
- Frequency counting
- Grouping by key (anagrams, categorization)
- Sliding window + HashMap
- HashSet for deduplication and existence checks

**Real-World Applications:**
- Database indexing
- Caching systems (Redis, Memcached)
- Deduplication in distributed systems
- Password storage (cryptographic hashing)
- Load balancing (consistent hashing)

---

## Prerequisites

- Arrays fundamentals
- Understanding of key-value pairs
- Modular arithmetic basics
- Basic probability (for collision analysis)

---

## Theory

### Hash Function Properties
A good hash function should:
1. Be deterministic (same input → same output)
2. Distribute keys uniformly across the table
3. Be fast to compute
4. Minimize collisions

### Collision Resolution
**Chaining (Open Hashing):** Each bucket contains a linked list of entries that hash to the same index.
- Simple to implement
- Performance degrades with long chains

**Open Addressing (Closed Hashing):** All entries stored in the table itself.
- **Linear Probing:** Try next slot sequentially — causes clustering
- **Quadratic Probing:** Try slots at 1², 2², 3²... offsets
- **Double Hashing:** Use second hash function for step size

### Load Factor & Rehashing
- Load factor α = n / table_size
- When α exceeds threshold (typically 0.75), resize table (usually 2x) and rehash all entries
- Amortized O(1) insert even with rehashing

### Common Hash Functions
- **Division method:** h(k) = k mod m (choose m as prime)
- **Multiplication method:** h(k) = floor(m * (k*A mod 1)) where A ≈ 0.618
- **String hashing:** Polynomial rolling hash — h(s) = Σ(s[i] * p^i) mod m

### HashMap vs HashSet
- **HashMap:** Stores key-value pairs, allows lookup by key
- **HashSet:** Stores only keys, used for membership testing

### Frequency Map Pattern
Count occurrences of elements. Foundation for:
- Anagram detection
- Finding majority element
- Top K frequent elements
- Subarray sum problems

### Two-Sum Pattern
For each element x, check if (target - x) exists in the map. O(n) time, O(n) space.

---

## 10 Implementation Questions

| No | Question | Difficulty | Concepts Tested | Expected TC | Expected SC |
|----|----------|-----------|-----------------|-------------|-------------|
| 1 | Implement a basic HashMap from scratch with put, get, and remove using chaining | Easy | Hash function, Chaining | O(1) avg | O(n) |
| 2 | Given an array, find two numbers that add up to a target using a HashMap | Easy | Two-Sum pattern | O(n) | O(n) |
| 3 | Count the frequency of each element in an array and return the most frequent element | Easy | Frequency Map | O(n) | O(n) |
| 4 | Group an array of strings into anagram groups using HashMap | Medium | Hashing, Sorting as key | O(n * k log k) | O(n * k) |
| 5 | Find the longest subarray with sum equal to K using prefix sum + HashMap | Medium | Prefix Sum + HashMap | O(n) | O(n) |
| 6 | Implement a HashSet using open addressing with linear probing | Medium | Open Addressing, Probing | O(1) avg | O(n) |
| 7 | Find the first non-repeating character in a string using HashMap | Medium | Frequency + Order | O(n) | O(1) |
| 8 | Check if two strings are isomorphic using two HashMaps | Medium | Bijection mapping | O(n) | O(1) |
| 9 | Implement a consistent hashing ring for distributed systems | Hard | Hashing, TreeMap/sorted structure | O(log n) | O(n) |
| 10 | Find the longest consecutive sequence in an unsorted array using HashSet | Hard | HashSet, Sequence detection | O(n) | O(n) |

---

## 10 LeetCode Problems

| LC No | Problem | Difficulty | Pattern | Link |
|-------|---------|-----------|---------|------|
| 1 | Two Sum | Easy | HashMap complement lookup | https://leetcode.com/problems/two-sum/ |
| 217 | Contains Duplicate | Easy | HashSet membership | https://leetcode.com/problems/contains-duplicate/ |
| 242 | Valid Anagram | Easy | Frequency counting | https://leetcode.com/problems/valid-anagram/ |
| 49 | Group Anagrams | Medium | HashMap with sorted key | https://leetcode.com/problems/group-anagrams/ |
| 560 | Subarray Sum Equals K | Medium | Prefix Sum + HashMap | https://leetcode.com/problems/subarray-sum-equals-k/ |
| 347 | Top K Frequent Elements | Medium | Frequency Map + Bucket Sort | https://leetcode.com/problems/top-k-frequent-elements/ |
| 128 | Longest Consecutive Sequence | Medium | HashSet + Sequence start | https://leetcode.com/problems/longest-consecutive-sequence/ |
| 205 | Isomorphic Strings | Medium | Dual HashMap mapping | https://leetcode.com/problems/isomorphic-strings/ |
| 76 | Minimum Window Substring | Hard | Sliding Window + Frequency Map | https://leetcode.com/problems/minimum-window-substring/ |
| 41 | First Missing Positive | Hard | In-place hashing | https://leetcode.com/problems/first-missing-positive/ |

---

## Interview Tips

**Common Mistakes:**
- Not handling hash collisions (assuming no collisions occur)
- Using mutable objects as HashMap keys
- Forgetting that HashMap doesn't preserve insertion order (use LinkedHashMap if needed)
- Not considering the space cost of hashing solutions
- Integer overflow in hash function computation

**Edge Cases:**
- Empty input
- All elements hash to the same bucket (worst case)
- Negative numbers as keys
- Very large key space
- Duplicate keys (overwrite vs multi-map)

**Frequently Asked Variations:**
- "Can you do it without extra space?" (in-place hashing)
- "What if the array is sorted?" (binary search may beat hashing)
- "How do you handle collisions?"
- "What's the worst-case complexity?"
- "Can you design your own hash function?"

---

## Revision Checklist

- [ ] Can implement a HashMap from scratch with chaining
- [ ] Can implement open addressing with linear probing
- [ ] Can solve Two-Sum in O(n) using HashMap
- [ ] Can use prefix sum + HashMap for subarray sum problems
- [ ] Can group elements by a computed key (anagram grouping)
- [ ] Can find longest consecutive sequence using HashSet
- [ ] Can explain load factor, rehashing, and amortized O(1)
- [ ] Can identify collision resolution strategies and their tradeoffs
- [ ] Can compute string hash using polynomial rolling hash
- [ ] Can identify when HashMap is the right tool vs other data structures

---

# Concept 7: Binary Search

## Overview

**Definition:** Binary Search is a divide-and-conquer algorithm that finds a target in a sorted array by repeatedly halving the search space. It extends beyond simple search to any problem with a monotonic predicate.

**Why It Is Important:**
- Fundamental O(log n) algorithm — expected knowledge in every interview
- Extends to "binary search on answer" for optimization problems
- Foundation for search in BSTs, sorted matrices, and rotated arrays
- Tests precision with boundary conditions

**Common Time/Space Complexities:**
| Variant | Time | Space |
|---------|------|-------|
| Standard binary search | O(log n) | O(1) |
| Binary search on answer | O(log(range) * f(n)) | O(1) |
| Lower/Upper bound | O(log n) | O(1) |

**Common Interview Patterns:**
- Standard search in sorted array
- Find first/last occurrence (lower bound / upper bound)
- Search in rotated sorted array
- Binary search on answer (minimize maximum / maximize minimum)
- Peak finding
- Search in 2D sorted matrix

**Real-World Applications:**
- Database index lookups (B-Tree search)
- Git bisect (finding the commit that introduced a bug)
- Load balancing (finding optimal threshold)
- Numerical methods (square root, nth root)

---

## Prerequisites

- Arrays (sorted property)
- Understanding of loop invariants
- Divide & Conquer concept
- Basic inequality reasoning

---

## Theory

### Standard Binary Search
```
low = 0, high = n - 1
while low <= high:
    mid = low + (high - low) / 2
    if arr[mid] == target: return mid
    else if arr[mid] < target: low = mid + 1
    else: high = mid - 1
return -1
```

### Lower Bound (First Occurrence)
Find the smallest index where `arr[i] >= target`.
```
while low < high:
    mid = low + (high - low) / 2
    if arr[mid] < target: low = mid + 1
    else: high = mid
return low
```

### Upper Bound (Last Occurrence)
Find the largest index where `arr[i] <= target`.
```
while low < high:
    mid = low + (high - low + 1) / 2
    if arr[mid] > target: high = mid - 1
    else: low = mid
return low
```

### Search in Rotated Sorted Array
At least one half of the array around `mid` is always sorted. Determine which half is sorted, then check if target lies within that half.

### Binary Search on Answer
When the answer lies in a range [lo, hi] and there exists a monotonic predicate `canAchieve(x)`:
```
while lo < hi:
    mid = (lo + hi) / 2
    if canAchieve(mid): hi = mid
    else: lo = mid + 1
return lo
```
Used for: minimum capacity to ship packages, split array largest sum, Koko eating bananas.

### Peak Element
In an array where `arr[i] != arr[i+1]`, a peak is an element greater than its neighbors. Binary search works because moving toward the higher neighbor guarantees finding a peak.

### Searching in Sorted Matrix
- Row-wise sorted: binary search each row — O(m * log n)
- Row-wise + column-wise sorted: staircase from top-right — O(m + n)
- Fully sorted (row-major): treat as 1D array — O(log(m*n))

---

## 10 Implementation Questions

| No | Question | Difficulty | Concepts Tested | Expected TC | Expected SC |
|----|----------|-----------|-----------------|-------------|-------------|
| 1 | Implement standard binary search to find a target in a sorted array | Easy | Basic binary search | O(log n) | O(1) |
| 2 | Find the first and last occurrence of a target in a sorted array | Easy | Lower/Upper bound | O(log n) | O(1) |
| 3 | Implement integer square root using binary search (floor value) | Easy | Binary search on answer | O(log n) | O(1) |
| 4 | Search for a target in a rotated sorted array (no duplicates) | Medium | Rotated array search | O(log n) | O(1) |
| 5 | Find the peak element in an array where no two adjacent elements are equal | Medium | Peak finding | O(log n) | O(1) |
| 6 | Given a sorted array of unknown size, find the target (Infinite Array Search) | Medium | Exponential + Binary search | O(log n) | O(1) |
| 7 | Find minimum in a rotated sorted array | Medium | Modified binary search | O(log n) | O(1) |
| 8 | Koko Eating Bananas: find minimum eating speed to finish in H hours | Medium | Binary search on answer | O(n * log(max)) | O(1) |
| 9 | Split Array Largest Sum: split array into m parts minimizing the maximum sum | Hard | Binary search on answer | O(n * log(sum)) | O(1) |
| 10 | Find the median of two sorted arrays | Hard | Binary search on partition | O(log(min(m,n))) | O(1) |

---

## 10 LeetCode Problems

| LC No | Problem | Difficulty | Pattern | Link |
|-------|---------|-----------|---------|------|
| 704 | Binary Search | Easy | Standard search | https://leetcode.com/problems/binary-search/ |
| 34 | Find First and Last Position of Element | Easy | Lower/Upper bound | https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/ |
| 69 | Sqrt(x) | Easy | Binary search on answer | https://leetcode.com/problems/sqrtx/ |
| 33 | Search in Rotated Sorted Array | Medium | Rotated search | https://leetcode.com/problems/search-in-rotated-sorted-array/ |
| 162 | Find Peak Element | Medium | Peak finding | https://leetcode.com/problems/find-peak-element/ |
| 153 | Find Minimum in Rotated Sorted Array | Medium | Rotated minimum | https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/ |
| 875 | Koko Eating Bananas | Medium | Binary search on answer | https://leetcode.com/problems/koko-eating-bananas/ |
| 410 | Split Array Largest Sum | Medium | Binary search on answer | https://leetcode.com/problems/split-array-largest-sum/ |
| 4 | Median of Two Sorted Arrays | Hard | Partition-based search | https://leetcode.com/problems/median-of-two-sorted-arrays/ |
| 774 | Minimize Max Distance to Gas Station | Hard | Binary search on answer | https://leetcode.com/problems/minimize-max-distance-to-gas-station/ |

---

## Interview Tips

**Common Mistakes:**
- Integer overflow: use `mid = low + (high - low) / 2` not `(low + high) / 2`
- Off-by-one: `low <= high` vs `low < high` depends on the template
- Infinite loops: forgetting to update `low` or `high` correctly
- Not identifying the monotonic property in "search on answer" problems
- Applying binary search when input isn't sorted or doesn't have monotonic predicate

**Edge Cases:**
- Empty array
- Single element array
- Target smaller than all elements / larger than all elements
- All elements are the same
- Array of size 2 (many boundary bugs appear here)
- Rotated array with minimum rotation (i.e., not rotated at all)

**Frequently Asked Variations:**
- "What if there are duplicates?"
- "Can you find the boundary/transition point?"
- "What is the search space?" (for binary search on answer)
- "How do you verify a candidate answer?" (predicate function)
- "What are the bounds of your search space?"

---

## Revision Checklist

- [ ] Can implement standard binary search without bugs
- [ ] Can implement lower bound and upper bound
- [ ] Can search in rotated sorted array
- [ ] Can find peak element using binary search
- [ ] Can apply binary search on answer with a predicate function
- [ ] Can solve Koko Eating Bananas / Split Array type problems
- [ ] Can find median of two sorted arrays
- [ ] Can explain when to use `low <= high` vs `low < high`
- [ ] Can identify the monotonic property in non-obvious problems
- [ ] Can handle duplicates in binary search variants

---

# Concept 8: Trees

## Overview

**Definition:** A tree is a hierarchical data structure consisting of nodes connected by edges, with one root node and no cycles. A Binary Tree has at most two children per node. A Binary Search Tree (BST) maintains the property: left < root < right.

**Why It Is Important:**
- Appears in 15-20% of coding interviews
- Foundation for file systems, databases (B-Trees), and compilers (ASTs)
- Tests recursive thinking, DFS/BFS, and structural reasoning
- BSTs enable O(log n) search, insert, delete when balanced

**Common Time/Space Complexities:**
| Operation | BST (balanced) | BST (skewed) | AVL/Red-Black |
|-----------|---------------|--------------|---------------|
| Search | O(log n) | O(n) | O(log n) guaranteed |
| Insert | O(log n) | O(n) | O(log n) |
| Delete | O(log n) | O(n) | O(log n) |
| Traversal | O(n) | O(n) | O(n) |

**Common Interview Patterns:**
- DFS traversals (inorder, preorder, postorder)
- BFS (level-order traversal)
- Recursive structure (height, diameter, balanced check)
- BST property validation and operations
- Lowest Common Ancestor (LCA)
- Serialize/Deserialize

**Real-World Applications:**
- File systems (directory tree)
- Database indexing (B-Trees, B+ Trees)
- Compiler syntax trees (AST)
- Decision trees in ML
- DOM tree in web browsers

---

## Prerequisites

- Recursion fundamentals
- Queue (for BFS / level-order)
- Stack (for iterative traversals)
- Basic graph concepts

---

## Theory

### Tree Traversals (DFS)
- **Inorder (Left, Root, Right):** Gives sorted order for BST
- **Preorder (Root, Left, Right):** Used for serialization, tree copy
- **Postorder (Left, Right, Root):** Used for deletion, expression evaluation

### Level-Order Traversal (BFS)
Use a queue. Process nodes level by level. Useful for:
- Finding depth/height
- Level-wise operations (zigzag, right view, level averages)

### Binary Search Tree (BST)
**Property:** For every node, all keys in left subtree < node.key < all keys in right subtree.
- **Search:** Compare with root, go left or right
- **Insert:** Search for position, insert as leaf
- **Delete:** Three cases — leaf, one child, two children (replace with inorder successor/predecessor)
- **Inorder traversal gives sorted output**

### Balanced BSTs
- **AVL Tree:** Balance factor (|height(left) - height(right)|) ≤ 1 for every node. Rotations: LL, RR, LR, RL.
- **Red-Black Tree:** Color-based balancing with 5 properties ensuring O(log n) height.
- Java TreeMap/TreeSet use Red-Black Trees internally.

### Tree Properties (Recursive Patterns)
- **Height:** max(height(left), height(right)) + 1
- **Diameter:** max(height(left) + height(right)) across all nodes
- **Balanced check:** |height(left) - height(right)| ≤ 1 for all nodes
- **Mirror/Symmetric:** left subtree mirrors right subtree

### Lowest Common Ancestor (LCA)
- **BST:** If both nodes < root, go left; if both > root, go right; else root is LCA
- **Binary Tree:** Recursively search left and right; if both return non-null, current node is LCA

### Construction from Traversals
- **Preorder + Inorder → Unique tree:** First element of preorder is root; find it in inorder to split left/right
- **Postorder + Inorder → Unique tree:** Last element of postorder is root
- **Preorder + Postorder → NOT unique** (except for full binary trees)

### Views of a Tree
- **Left/Right view:** First/last node at each level
- **Top/Bottom view:** Based on horizontal distance from root
- **Boundary traversal:** Left boundary + leaves + right boundary (reversed)

---

## 10 Implementation Questions

| No | Question | Difficulty | Concepts Tested | Expected TC | Expected SC |
|----|----------|-----------|-----------------|-------------|-------------|
| 1 | Implement inorder, preorder, and postorder traversals (both recursive and iterative) | Easy | DFS traversals, Stack | O(n) | O(h) |
| 2 | Find the height/maximum depth of a binary tree | Easy | Recursion | O(n) | O(h) |
| 3 | Check if a binary tree is a valid BST | Easy | BST property, Range validation | O(n) | O(h) |
| 4 | Implement level-order traversal and return nodes grouped by level | Medium | BFS, Queue | O(n) | O(w) |
| 5 | Find the Lowest Common Ancestor of two nodes in a binary tree | Medium | Recursion, LCA | O(n) | O(h) |
| 6 | Find the diameter of a binary tree (longest path between any two nodes) | Medium | Post-order, Height tracking | O(n) | O(h) |
| 7 | Construct a binary tree from preorder and inorder traversal arrays | Medium | Tree construction, Recursion | O(n) | O(n) |
| 8 | Implement BST insertion, deletion, and search operations | Medium | BST operations | O(h) per op | O(h) |
| 9 | Serialize and deserialize a binary tree to/from a string | Hard | Preorder + null markers, Queue | O(n) | O(n) |
| 10 | Find the Kth smallest element in a BST | Hard | Inorder traversal, Counting | O(h + k) | O(h) |

---

## 10 LeetCode Problems

| LC No | Problem | Difficulty | Pattern | Link |
|-------|---------|-----------|---------|------|
| 104 | Maximum Depth of Binary Tree | Easy | Recursion | https://leetcode.com/problems/maximum-depth-of-binary-tree/ |
| 226 | Invert Binary Tree | Easy | Recursion / BFS | https://leetcode.com/problems/invert-binary-tree/ |
| 98 | Validate Binary Search Tree | Easy | Range validation DFS | https://leetcode.com/problems/validate-binary-search-tree/ |
| 102 | Binary Tree Level Order Traversal | Medium | BFS + Queue | https://leetcode.com/problems/binary-tree-level-order-traversal/ |
| 236 | Lowest Common Ancestor of a Binary Tree | Medium | Recursive LCA | https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/ |
| 543 | Diameter of Binary Tree | Medium | Post-order height | https://leetcode.com/problems/diameter-of-binary-tree/ |
| 105 | Construct Binary Tree from Preorder and Inorder | Medium | Recursive construction | https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/ |
| 230 | Kth Smallest Element in a BST | Medium | Inorder + count | https://leetcode.com/problems/kth-smallest-element-in-a-bst/ |
| 297 | Serialize and Deserialize Binary Tree | Hard | Preorder + null markers | https://leetcode.com/problems/serialize-and-deserialize-binary-tree/ |
| 124 | Binary Tree Maximum Path Sum | Hard | Post-order, Global max | https://leetcode.com/problems/binary-tree-maximum-path-sum/ |

---

## Interview Tips

**Common Mistakes:**
- Confusing height vs depth (height is bottom-up, depth is top-down)
- Not handling null nodes in recursive calls
- Modifying BST structure during traversal
- Forgetting that BST inorder gives sorted order
- Off-by-one in level-order when grouping by level

**Edge Cases:**
- Empty tree (null root)
- Single node tree
- Completely skewed tree (like a linked list)
- Tree with only left children or only right children
- Duplicate values in BST

**Frequently Asked Variations:**
- "Can you do it iteratively?"
- "Can you do it in O(1) extra space?" (Morris traversal)
- "What if the tree is not balanced?"
- "What if there are duplicate values?"
- "Can you modify the tree in-place?"

---

## Revision Checklist

- [ ] Can implement all three DFS traversals recursively and iteratively
- [ ] Can implement BFS level-order traversal
- [ ] Can validate a BST using range-based approach
- [ ] Can find LCA in both BST and general binary tree
- [ ] Can compute height and diameter
- [ ] Can construct tree from preorder + inorder
- [ ] Can implement BST insert, delete, search
- [ ] Can serialize/deserialize a binary tree
- [ ] Understand AVL rotations (LL, RR, LR, RL) conceptually
- [ ] Can identify tree problems as DFS vs BFS within 1 minute

---

# Concept 9: Heaps & Priority Queue

## Overview

**Definition:** A Heap is a complete binary tree that satisfies the heap property — in a Max-Heap, every parent is ≥ its children; in a Min-Heap, every parent is ≤ its children. A Priority Queue is an abstract data type implemented using a heap that always gives access to the highest (or lowest) priority element.

**Why It Is Important:**
- Provides O(1) access to min/max and O(log n) insert/remove
- Foundation for Top-K problems, stream processing, scheduling
- Heap Sort provides O(n log n) in-place sorting
- Used in graph algorithms (Dijkstra's, Prim's)

**Common Time/Space Complexities:**
| Operation | Time |
|-----------|------|
| Insert (push) | O(log n) |
| Extract min/max (poll) | O(log n) |
| Peek min/max | O(1) |
| Build heap (heapify array) | O(n) |
| Heap Sort | O(n log n) |

**Common Interview Patterns:**
- Top K elements (Kth largest/smallest)
- Merge K sorted structures
- Running median (two heaps)
- Task scheduling with priorities
- Stream processing (continuous data)

**Real-World Applications:**
- Operating system process scheduling
- Dijkstra's shortest path algorithm
- Event-driven simulation
- Huffman coding (data compression)
- Load balancing (least connections)

---

## Prerequisites

- Binary tree concepts (complete binary tree)
- Array representation of trees (parent = i/2, children = 2i, 2i+1)
- Understanding of comparators/ordering
- Basic sorting concepts

---

## Theory

### Heap Structure
A heap is stored as an array where for index i (0-based):
- Parent: `(i - 1) / 2`
- Left child: `2 * i + 1`
- Right child: `2 * i + 2`

### Heapify (Sift Down)
Restore heap property from a given index downward. Compare with children, swap with the larger (max-heap) or smaller (min-heap) child. Repeat until heap property is restored.

### Build Heap
Start from the last non-leaf node `(n/2 - 1)` and heapify each node going upward. Time: O(n) — NOT O(n log n) due to the mathematical sum of work at each level.

### Insert (Sift Up)
Add element at the end of the array, then bubble up by comparing with parent until heap property is satisfied.

### Extract Min/Max
Remove root, replace with last element, then sift down from root.

### Heap Sort
1. Build a max-heap from the array — O(n)
2. Repeatedly extract max and place at the end — O(n log n)
3. In-place, not stable, O(1) extra space

### Two-Heap Pattern (Running Median)
- Max-heap for left half (smaller elements)
- Min-heap for right half (larger elements)
- Balance sizes so they differ by at most 1
- Median is top of max-heap (odd count) or average of both tops (even count)

### Top-K Pattern
- **Kth largest:** Maintain a min-heap of size K. The root is the Kth largest.
- **Kth smallest:** Maintain a max-heap of size K. The root is the Kth smallest.
- After processing all elements: O(n log k)

### Merge K Sorted Lists/Arrays
Use a min-heap of size K containing one element from each list. Extract min, then push the next element from that same list. Time: O(N log K) where N = total elements.

---

## 10 Implementation Questions

| No | Question | Difficulty | Concepts Tested | Expected TC | Expected SC |
|----|----------|-----------|-----------------|-------------|-------------|
| 1 | Implement a Min-Heap from scratch with insert, extractMin, and peek operations | Easy | Heap operations, Sift up/down | O(log n) per op | O(n) |
| 2 | Build a max-heap from an unsorted array using the bottom-up heapify approach | Easy | Build heap, Heapify | O(n) | O(1) |
| 3 | Implement Heap Sort on an array in-place | Easy | Build heap + Extract | O(n log n) | O(1) |
| 4 | Find the Kth largest element in an unsorted array using a min-heap of size K | Medium | Top-K pattern | O(n log k) | O(k) |
| 5 | Merge K sorted arrays into one sorted array using a min-heap | Medium | Merge K pattern | O(N log K) | O(K) |
| 6 | Implement a running median calculator (add number + find median) | Medium | Two-heap pattern | O(log n) add, O(1) median | O(n) |
| 7 | Given a stream of integers, find the Kth largest at any point | Medium | Min-heap of size K | O(log k) per add | O(k) |
| 8 | Sort a nearly sorted (K-sorted) array where each element is at most K positions from its sorted position | Medium | Min-heap of size K+1 | O(n log k) | O(k) |
| 9 | Find the K closest points to the origin | Hard | Max-heap of size K | O(n log k) | O(k) |
| 10 | Design a system that efficiently returns the median, min, and max from a data stream | Hard | Two heaps + tracking | O(log n) insert | O(n) |

---

## 10 LeetCode Problems

| LC No | Problem | Difficulty | Pattern | Link |
|-------|---------|-----------|---------|------|
| 703 | Kth Largest Element in a Stream | Easy | Min-heap of size K | https://leetcode.com/problems/kth-largest-element-in-a-stream/ |
| 1046 | Last Stone Weight | Easy | Max-heap simulation | https://leetcode.com/problems/last-stone-weight/ |
| 215 | Kth Largest Element in an Array | Easy | Heap / Quickselect | https://leetcode.com/problems/kth-largest-element-in-an-array/ |
| 347 | Top K Frequent Elements | Medium | Frequency Map + Heap | https://leetcode.com/problems/top-k-frequent-elements/ |
| 373 | Find K Pairs with Smallest Sums | Medium | Min-heap + expansion | https://leetcode.com/problems/find-k-pairs-with-smallest-sums/ |
| 378 | Kth Smallest Element in a Sorted Matrix | Medium | Min-heap / Binary Search | https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/ |
| 621 | Task Scheduler | Medium | Greedy + Max-heap | https://leetcode.com/problems/task-scheduler/ |
| 295 | Find Median from Data Stream | Medium | Two heaps | https://leetcode.com/problems/find-median-from-data-stream/ |
| 23 | Merge k Sorted Lists | Hard | Min-heap merge | https://leetcode.com/problems/merge-k-sorted-lists/ |
| 632 | Smallest Range Covering Elements from K Lists | Hard | Min-heap + sliding | https://leetcode.com/problems/smallest-range-covering-elements-from-k-lists/ |

---

## Interview Tips

**Common Mistakes:**
- Confusing min-heap vs max-heap for Top-K problems (use min-heap for Kth largest)
- Forgetting to maintain heap size constraint
- Not handling the case when heap has fewer than K elements
- Using max-heap when min-heap is needed (or vice versa)
- Forgetting that Java PriorityQueue is a min-heap by default

**Edge Cases:**
- K = 1 (just need min or max)
- K = n (full sort)
- Stream with fewer than K elements so far
- All elements are the same
- Negative numbers in the stream

**Frequently Asked Variations:**
- "Can you do better than O(n log n)?" (heap for Top-K: O(n log k))
- "What if data is coming as a stream?"
- "Can you do it in-place?"
- "What about Quickselect?" (O(n) average for Kth element)
- "How does this compare to sorting?"

---

## Revision Checklist

- [ ] Can implement a min-heap and max-heap from scratch
- [ ] Can build a heap in O(n) using bottom-up heapify
- [ ] Can implement heap sort in-place
- [ ] Can solve Top-K problems using appropriate heap type
- [ ] Can merge K sorted lists/arrays using min-heap
- [ ] Can maintain running median using two heaps
- [ ] Can explain why build-heap is O(n) not O(n log n)
- [ ] Can sort a K-sorted array efficiently
- [ ] Can identify heap problems vs sorting problems
- [ ] Understand the array representation of a complete binary tree

---

# Concept 10: Graphs

## Overview

**Definition:** A graph G = (V, E) consists of a set of vertices (nodes) V and edges E connecting pairs of vertices. Graphs can be directed/undirected, weighted/unweighted, and cyclic/acyclic.

**Why It Is Important:**
- Models relationships, networks, and dependencies
- 15-20% of FAANG interviews involve graph problems
- Foundation for shortest paths, connectivity, and network flow
- Tests BFS, DFS, and ability to model problems as graphs

**Common Time/Space Complexities:**
| Algorithm | Time | Space |
|-----------|------|-------|
| BFS / DFS | O(V + E) | O(V) |
| Dijkstra's (min-heap) | O((V+E) log V) | O(V) |
| Bellman-Ford | O(V * E) | O(V) |
| Floyd-Warshall | O(V³) | O(V²) |
| Topological Sort | O(V + E) | O(V) |
| Kruskal's MST | O(E log E) | O(V) |
| Prim's MST | O((V+E) log V) | O(V) |

**Common Interview Patterns:**
- BFS (shortest path in unweighted graph, level-order)
- DFS (cycle detection, connected components, path finding)
- Topological Sort (DAG ordering, course schedule)
- Union-Find / Disjoint Set (connectivity, MST)
- Dijkstra's (shortest path in weighted graph)
- Grid-based graph problems (islands, flood fill)

**Real-World Applications:**
- Social networks (friend connections)
- Maps and navigation (shortest path)
- Dependency resolution (build systems, package managers)
- Network routing and internet protocols
- Recommendation systems

---

## Prerequisites

- Recursion and iteration
- Queue (for BFS) and Stack (for DFS)
- Priority Queue / Heap (for Dijkstra's)
- Hash maps and adjacency representation
- Basic set theory

---

## Theory

### Graph Representations
- **Adjacency Matrix:** V×V matrix; `matrix[i][j] = 1` if edge exists. O(V²) space. Good for dense graphs.
- **Adjacency List:** Array of lists; `adj[i]` contains neighbors of i. O(V+E) space. Good for sparse graphs.
- **Edge List:** List of (u, v, weight) tuples. Used in Kruskal's.

### Breadth-First Search (BFS)
Explores level by level using a queue. Guarantees shortest path in unweighted graphs.
```
queue = [start], visited = {start}
while queue:
    node = queue.dequeue()
    for neighbor in adj[node]:
        if neighbor not in visited:
            visited.add(neighbor)
            queue.enqueue(neighbor)
```

### Depth-First Search (DFS)
Explores as deep as possible using recursion or explicit stack.
- **Cycle detection:** Track "currently in stack" nodes (gray nodes)
- **Connected components:** Run DFS from each unvisited node
- **Path finding:** DFS with backtracking

### Topological Sort
Linear ordering of DAG vertices such that for every edge u→v, u appears before v.
- **Kahn's Algorithm (BFS):** Process nodes with in-degree 0; reduce neighbors' in-degree
- **DFS-based:** Post-order DFS, reverse the result

### Shortest Path Algorithms
- **BFS:** Unweighted graphs — O(V+E)
- **Dijkstra's:** Non-negative weights — O((V+E) log V) with min-heap
- **Bellman-Ford:** Handles negative weights — O(V*E)
- **Floyd-Warshall:** All-pairs shortest path — O(V³)

### Minimum Spanning Tree (MST)
- **Kruskal's:** Sort edges by weight, add edges that don't create cycles (Union-Find)
- **Prim's:** Grow MST from a source using min-heap, always add cheapest crossing edge

### Union-Find (Disjoint Set Union)
```
find(x): return root of x's component (with path compression)
union(x, y): merge components of x and y (with union by rank)
```
- Nearly O(1) amortized per operation (inverse Ackermann)
- Used for: connectivity queries, Kruskal's, cycle detection in undirected graphs

### Grid as Graph
Treat each cell as a node, adjacent cells (4-directional or 8-directional) as edges.
- Number of islands: DFS/BFS from unvisited land cells
- Shortest path in grid: BFS
- Flood fill: DFS/BFS

---

## 10 Implementation Questions

| No | Question | Difficulty | Concepts Tested | Expected TC | Expected SC |
|----|----------|-----------|-----------------|-------------|-------------|
| 1 | Implement BFS and DFS traversal on an adjacency list representation | Easy | BFS, DFS, Graph traversal | O(V+E) | O(V) |
| 2 | Detect if an undirected graph contains a cycle using DFS | Easy | DFS, Parent tracking | O(V+E) | O(V) |
| 3 | Find the number of connected components in an undirected graph | Easy | DFS/BFS, Component counting | O(V+E) | O(V) |
| 4 | Implement Topological Sort using Kahn's algorithm (BFS) | Medium | Topological Sort, In-degree | O(V+E) | O(V) |
| 5 | Detect if a directed graph has a cycle using DFS coloring | Medium | DFS, Three-color marking | O(V+E) | O(V) |
| 6 | Implement Dijkstra's shortest path algorithm using a min-heap | Medium | Dijkstra's, Priority Queue | O((V+E)logV) | O(V) |
| 7 | Find the number of islands in a 2D grid using DFS/BFS | Medium | Grid traversal, Flood fill | O(m*n) | O(m*n) |
| 8 | Implement Union-Find with path compression and union by rank | Medium | DSU, Amortized analysis | O(α(n)) per op | O(n) |
| 9 | Implement Kruskal's MST algorithm using Union-Find | Hard | MST, Sorting, DSU | O(E log E) | O(V) |
| 10 | Find shortest path in a weighted graph with negative edges using Bellman-Ford | Hard | Bellman-Ford, Relaxation | O(V*E) | O(V) |

---

## 10 LeetCode Problems

| LC No | Problem | Difficulty | Pattern | Link |
|-------|---------|-----------|---------|------|
| 200 | Number of Islands | Easy | DFS/BFS on grid | https://leetcode.com/problems/number-of-islands/ |
| 733 | Flood Fill | Easy | BFS/DFS grid traversal | https://leetcode.com/problems/flood-fill/ |
| 547 | Number of Provinces | Easy | DFS / Union-Find | https://leetcode.com/problems/number-of-provinces/ |
| 207 | Course Schedule | Medium | Topological Sort / Cycle detection | https://leetcode.com/problems/course-schedule/ |
| 210 | Course Schedule II | Medium | Topological Sort (Kahn's) | https://leetcode.com/problems/course-schedule-ii/ |
| 994 | Rotting Oranges | Medium | Multi-source BFS | https://leetcode.com/problems/rotting-oranges/ |
| 743 | Network Delay Time | Medium | Dijkstra's | https://leetcode.com/problems/network-delay-time/ |
| 785 | Is Graph Bipartite? | Medium | BFS/DFS coloring | https://leetcode.com/problems/is-graph-bipartite/ |
| 127 | Word Ladder | Hard | BFS shortest path | https://leetcode.com/problems/word-ladder/ |
| 332 | Reconstruct Itinerary | Hard | DFS + Euler path | https://leetcode.com/problems/reconstruct-itinerary/ |

---

## Interview Tips

**Common Mistakes:**
- Forgetting to mark nodes as visited (infinite loops)
- Not distinguishing directed vs undirected cycle detection
- Using DFS when BFS is needed for shortest path (unweighted)
- Applying Dijkstra's with negative edge weights
- Not handling disconnected components

**Edge Cases:**
- Disconnected graph (multiple components)
- Single node graph
- Self-loops
- Graph with no edges
- Negative weight cycles (Bellman-Ford)
- Grid problems: cells on the boundary

**Frequently Asked Variations:**
- "Is the graph directed or undirected?"
- "Are the weights non-negative?"
- "Can there be cycles?"
- "Is the graph connected?"
- "Can you model this as a graph problem?" (implicit graph)

---

## Revision Checklist

- [ ] Can implement BFS and DFS on adjacency list
- [ ] Can detect cycles in both directed and undirected graphs
- [ ] Can perform topological sort (both Kahn's and DFS-based)
- [ ] Can implement Dijkstra's with a min-heap
- [ ] Can implement Union-Find with path compression and union by rank
- [ ] Can solve grid/island problems using DFS/BFS
- [ ] Can implement Kruskal's and Prim's MST
- [ ] Can identify when to use BFS vs DFS
- [ ] Can model implicit graphs (word ladder, state space)
- [ ] Understand when Bellman-Ford is needed over Dijkstra's

---

# Concept 11: Greedy Algorithms

## Overview

**Definition:** A greedy algorithm makes the locally optimal choice at each step, hoping to find the global optimum. It never reconsiders choices once made, unlike backtracking or DP.

**Why It Is Important:**
- Efficient solutions when greedy choice property holds
- Simpler and faster than DP for suitable problems
- Foundation for scheduling, Huffman coding, and graph algorithms
- Tests ability to prove correctness (exchange argument, stays-ahead)

**Common Time/Space Complexities:**
| Problem Type | Typical Time |
|-------------|-------------|
| Activity Selection / Intervals | O(n log n) |
| Huffman Coding | O(n log n) |
| Fractional Knapsack | O(n log n) |
| Job Scheduling | O(n log n) |
| Minimum Platforms | O(n log n) |

**Common Interview Patterns:**
- Interval scheduling (sort by end time)
- Interval merging (sort by start time)
- Activity selection / meeting rooms
- Jump game / minimum jumps
- Huffman coding / optimal merge
- Fractional knapsack

**Real-World Applications:**
- Network routing (shortest path algorithms)
- Data compression (Huffman coding)
- Task scheduling in operating systems
- Resource allocation
- Coin change (specific denominations)

---

## Prerequisites

- Sorting algorithms
- Basic proof techniques (exchange argument)
- Priority Queues / Heaps
- Understanding of optimization problems
- Interval concepts

---

## Theory

### Greedy Choice Property
A problem exhibits the greedy choice property if a locally optimal choice leads to a globally optimal solution. The key is proving that the greedy choice is safe — it doesn't eliminate the optimal solution.

### Optimal Substructure
After making the greedy choice, the remaining subproblem must also have an optimal solution that, combined with the greedy choice, gives the optimal solution to the original problem.

### Proof Techniques
- **Exchange Argument:** Assume an optimal solution that differs from greedy. Show you can "exchange" one choice to match greedy without worsening the result.
- **Stays-Ahead:** Show the greedy solution is always at least as good as any other solution at every step.

### Interval Scheduling
**Activity Selection:** Select maximum non-overlapping intervals.
- Sort by end time
- Greedily pick the interval that finishes earliest and doesn't conflict

**Interval Merging:** Merge overlapping intervals.
- Sort by start time
- Merge if current start ≤ previous end

### Job Scheduling with Deadlines
Each job has a deadline and profit. Maximize profit by scheduling jobs within their deadlines.
- Sort by profit (descending)
- For each job, find the latest available slot before its deadline

### Fractional Knapsack
Items can be fractionally taken. Sort by value/weight ratio, take greedily.
- Time: O(n log n) for sorting
- Unlike 0/1 Knapsack (which needs DP)

### Huffman Coding
Build an optimal prefix-free binary code for data compression.
- Use a min-heap of character frequencies
- Repeatedly merge the two smallest nodes
- Produces minimum total encoding length

### Jump Game Pattern
- **Can you reach the end?** Track the farthest reachable index
- **Minimum jumps?** BFS-like greedy — count levels

### Minimum Platforms / Meeting Rooms
- Sort arrivals and departures separately
- Use two-pointer to count overlapping intervals
- Maximum overlap = minimum platforms needed

---

## 10 Implementation Questions

| No | Question | Difficulty | Concepts Tested | Expected TC | Expected SC |
|----|----------|-----------|-----------------|-------------|-------------|
| 1 | Given a set of activities with start/end times, select the maximum number of non-overlapping activities | Easy | Activity selection, Greedy | O(n log n) | O(1) |
| 2 | Given an array of coin denominations and an amount, find the minimum number of coins (greedy — valid for canonical systems) | Easy | Greedy coin selection | O(n) | O(1) |
| 3 | Merge all overlapping intervals in a list of intervals | Easy | Interval merging, Sorting | O(n log n) | O(n) |
| 4 | Given jobs with deadlines and profits, schedule to maximize profit | Medium | Job scheduling, Greedy | O(n log n) | O(n) |
| 5 | Implement Huffman coding: build the tree and generate codes for given character frequencies | Medium | Huffman, Min-heap | O(n log n) | O(n) |
| 6 | Jump Game: determine if you can reach the last index | Medium | Farthest reachable tracking | O(n) | O(1) |
| 7 | Find the minimum number of platforms needed at a railway station | Medium | Event sorting, Two pointer | O(n log n) | O(1) |
| 8 | Fractional Knapsack: maximize value given a weight capacity (items can be broken) | Medium | Value/weight sorting | O(n log n) | O(1) |
| 9 | Minimum number of jumps to reach the end of an array | Hard | BFS-like greedy | O(n) | O(1) |
| 10 | Find the minimum number of intervals to remove to make the rest non-overlapping | Hard | Interval scheduling | O(n log n) | O(1) |

---

## 10 LeetCode Problems

| LC No | Problem | Difficulty | Pattern | Link |
|-------|---------|-----------|---------|------|
| 455 | Assign Cookies | Easy | Greedy matching | https://leetcode.com/problems/assign-cookies/ |
| 55 | Jump Game | Easy | Farthest reachable | https://leetcode.com/problems/jump-game/ |
| 56 | Merge Intervals | Easy | Interval merging | https://leetcode.com/problems/merge-intervals/ |
| 45 | Jump Game II | Medium | BFS-like greedy | https://leetcode.com/problems/jump-game-ii/ |
| 435 | Non-overlapping Intervals | Medium | Interval scheduling | https://leetcode.com/problems/non-overlapping-intervals/ |
| 452 | Minimum Number of Arrows to Burst Balloons | Medium | Interval greedy | https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/ |
| 621 | Task Scheduler | Medium | Greedy + frequency | https://leetcode.com/problems/task-scheduler/ |
| 134 | Gas Station | Medium | Circular greedy | https://leetcode.com/problems/gas-station/ |
| 135 | Candy | Hard | Two-pass greedy | https://leetcode.com/problems/candy/ |
| 765 | Couples Holding Hands | Hard | Greedy swap | https://leetcode.com/problems/couples-holding-hands/ |

---

## Interview Tips

**Common Mistakes:**
- Applying greedy when the problem actually requires DP (0/1 Knapsack, coin change with arbitrary denominations)
- Not proving the greedy choice is optimal
- Sorting by the wrong criterion (start time vs end time)
- Not handling ties correctly in scheduling
- Confusing fractional knapsack (greedy) with 0/1 knapsack (DP)

**Edge Cases:**
- All intervals overlap
- No intervals overlap
- Single interval/activity
- Zero capacity (knapsack)
- Array where you can't reach the end (Jump Game returns false)

**Frequently Asked Variations:**
- "How do you know greedy works here?" (prove it!)
- "What if items can't be broken?" (switch to DP)
- "What if intervals have weights/values?"
- "Can you do it in O(n) without sorting?"
- "What about the online version?" (streaming data)

---

## Revision Checklist

- [ ] Can solve activity selection by sorting end times
- [ ] Can merge overlapping intervals
- [ ] Can implement Huffman coding with a min-heap
- [ ] Can solve Jump Game I (reachability) and II (minimum jumps)
- [ ] Can solve Job Scheduling with deadlines
- [ ] Can distinguish greedy-solvable problems from DP-required ones
- [ ] Can explain the exchange argument for proving greedy correctness
- [ ] Can solve minimum platforms / meeting rooms
- [ ] Can implement fractional knapsack
- [ ] Can identify the sorting criterion that makes greedy work

---

# Concept 12: Dynamic Programming

## Overview

**Definition:** Dynamic Programming (DP) is an optimization technique that solves problems by breaking them into overlapping subproblems and storing their results to avoid redundant computation. It combines optimal substructure with memoization/tabulation.

**Why It Is Important:**
- 20-25% of FAANG interview problems involve DP
- Tests ability to define state, recurrence, and transitions
- Required for optimization problems where greedy fails
- Mastering DP patterns covers a wide range of problem types

**Common Time/Space Complexities:**
| Pattern | Typical Time | Typical Space |
|---------|-------------|---------------|
| 1D DP (Fibonacci, Climbing Stairs) | O(n) | O(n) or O(1) |
| 2D DP (Grid, LCS, Knapsack) | O(n*m) | O(n*m) or O(m) |
| Interval DP (Matrix Chain) | O(n³) | O(n²) |
| Bitmask DP | O(2^n * n) | O(2^n) |

**Common Interview Patterns:**
- 1D linear DP (Fibonacci, house robber, climbing stairs)
- 2D grid DP (unique paths, min path sum)
- String DP (LCS, edit distance, palindrome)
- Knapsack variants (0/1, unbounded, subset sum)
- Interval DP (matrix chain multiplication, burst balloons)
- State machine DP (stock problems)

**Real-World Applications:**
- Bioinformatics (DNA sequence alignment — edit distance)
- Finance (portfolio optimization)
- Natural language processing (Viterbi algorithm)
- Operations research (resource allocation)
- Game theory (optimal strategies)

---

## Prerequisites

- Recursion and memoization
- Mathematical induction (proving recurrences)
- Arrays and matrices
- Basic combinatorics
- Understanding of state and transitions

---

## Theory

### Top-Down (Memoization)
Start from the original problem, recursively break into subproblems, cache results.
```
memo = {}
solve(state):
    if state in memo: return memo[state]
    if base_case(state): return base_value
    memo[state] = combine(solve(subproblems))
    return memo[state]
```

### Bottom-Up (Tabulation)
Build solutions iteratively from smallest subproblems upward.
```
dp[base] = base_value
for state in topological_order:
    dp[state] = combine(dp[subproblems])
return dp[target]
```

### Space Optimization
When `dp[i]` only depends on `dp[i-1]` (or a fixed number of previous states), use rolling variables instead of a full array. Reduces O(n) space to O(1).

### DP Framework (5 Steps)
1. **Define state:** What does `dp[i]` (or `dp[i][j]`) represent?
2. **Identify transitions:** How does `dp[i]` relate to smaller subproblems?
3. **Base cases:** What are the trivially solvable states?
4. **Computation order:** Ensure dependencies are solved before current state
5. **Answer extraction:** Where is the final answer in the DP table?

### 1D Linear DP
- **Fibonacci:** `dp[i] = dp[i-1] + dp[i-2]`
- **Climbing Stairs:** Same as Fibonacci with k step options
- **House Robber:** `dp[i] = max(dp[i-1], dp[i-2] + arr[i])`
- **Longest Increasing Subsequence:** `dp[i] = max(dp[j] + 1)` for all j < i where arr[j] < arr[i] — O(n²); O(n log n) with patience sorting

### 2D Grid DP
- **Unique Paths:** `dp[i][j] = dp[i-1][j] + dp[i][j-1]`
- **Min Path Sum:** `dp[i][j] = grid[i][j] + min(dp[i-1][j], dp[i][j-1])`
- **Obstacles:** Set dp = 0 for blocked cells

### String DP
- **Longest Common Subsequence (LCS):**
  - Match: `dp[i][j] = dp[i-1][j-1] + 1`
  - No match: `dp[i][j] = max(dp[i-1][j], dp[i][j-1])`
- **Edit Distance:** min of insert, delete, replace operations
- **Palindrome Subsequence:** LCS of string with its reverse

### Knapsack Problems
- **0/1 Knapsack:** `dp[i][w] = max(dp[i-1][w], dp[i-1][w-wt[i]] + val[i])`
- **Unbounded Knapsack:** `dp[w] = max(dp[w], dp[w-wt[i]] + val[i])` for all i
- **Subset Sum:** `dp[i][s] = dp[i-1][s] || dp[i-1][s-arr[i]]`
- **Coin Change:** `dp[amount] = min(dp[amount], dp[amount-coin] + 1)` for each coin

### Interval DP
For problems on subarrays/substrings where you choose a split point:
`dp[i][j] = optimal over all k in [i, j-1] of dp[i][k] + dp[k+1][j] + cost`
Examples: Matrix chain multiplication, burst balloons, optimal BST.

### State Machine DP
Model states as a finite automaton. Each state has transitions.
- Stock Buy/Sell: states = {holding, not_holding, cooldown}
- Pattern matching with wildcards

---

## 10 Implementation Questions

| No | Question | Difficulty | Concepts Tested | Expected TC | Expected SC |
|----|----------|-----------|-----------------|-------------|-------------|
| 1 | Compute the nth Fibonacci number using memoization and tabulation, then optimize to O(1) space | Easy | Basic DP, Space optimization | O(n) | O(1) |
| 2 | Climbing Stairs: find number of ways to reach the top with 1 or 2 steps at a time | Easy | 1D DP | O(n) | O(1) |
| 3 | House Robber: find max sum of non-adjacent elements | Easy | 1D DP, Include/Exclude | O(n) | O(1) |
| 4 | Longest Common Subsequence of two strings | Medium | 2D String DP | O(n*m) | O(n*m) |
| 5 | 0/1 Knapsack: maximize value within weight capacity | Medium | 2D Knapsack DP | O(n*W) | O(n*W) |
| 6 | Coin Change: find minimum coins needed to make an amount | Medium | Unbounded Knapsack variant | O(n*amount) | O(amount) |
| 7 | Longest Increasing Subsequence (LIS) with O(n log n) approach | Medium | Patience sorting, Binary search | O(n log n) | O(n) |
| 8 | Edit Distance (Levenshtein Distance) between two strings | Medium | 2D String DP | O(n*m) | O(n*m) |
| 9 | Matrix Chain Multiplication: find minimum cost of multiplying chain of matrices | Hard | Interval DP | O(n³) | O(n²) |
| 10 | Longest Palindromic Subsequence | Hard | String DP, LCS variant | O(n²) | O(n²) |

---

## 10 LeetCode Problems

| LC No | Problem | Difficulty | Pattern | Link |
|-------|---------|-----------|---------|------|
| 70 | Climbing Stairs | Easy | 1D DP (Fibonacci variant) | https://leetcode.com/problems/climbing-stairs/ |
| 198 | House Robber | Easy | 1D DP (include/exclude) | https://leetcode.com/problems/house-robber/ |
| 62 | Unique Paths | Easy | 2D Grid DP | https://leetcode.com/problems/unique-paths/ |
| 322 | Coin Change | Medium | Unbounded Knapsack | https://leetcode.com/problems/coin-change/ |
| 300 | Longest Increasing Subsequence | Medium | 1D DP / Binary Search | https://leetcode.com/problems/longest-increasing-subsequence/ |
| 1143 | Longest Common Subsequence | Medium | 2D String DP | https://leetcode.com/problems/longest-common-subsequence/ |
| 72 | Edit Distance | Medium | 2D String DP | https://leetcode.com/problems/edit-distance/ |
| 416 | Partition Equal Subset Sum | Medium | Subset Sum / 0/1 Knapsack | https://leetcode.com/problems/partition-equal-subset-sum/ |
| 312 | Burst Balloons | Hard | Interval DP | https://leetcode.com/problems/burst-balloons/ |
| 10 | Regular Expression Matching | Hard | 2D DP / State Machine | https://leetcode.com/problems/regular-expression-matching/ |

---

## Interview Tips

**Common Mistakes:**
- Not clearly defining what `dp[i]` represents
- Wrong base cases (especially off-by-one with empty string/array)
- Incorrect transition — missing a case or wrong dependency direction
- Not considering space optimization when only previous row is needed
- Jumping to DP when a greedy solution exists

**Edge Cases:**
- Empty input (string/array of length 0)
- Single element input
- All elements the same
- Target = 0 (knapsack/subset sum)
- Very large DP tables (need space optimization)
- Negative numbers in the input

**Frequently Asked Variations:**
- "Can you optimize the space?"
- "Can you reconstruct the solution?" (backtrack through DP table)
- "Is there a greedy solution?" (prove or disprove)
- "What's the recurrence relation?"
- "Top-down or bottom-up — which do you prefer and why?"

---

## Revision Checklist

- [ ] Can identify DP problems (overlapping subproblems + optimal substructure)
- [ ] Can define state, transition, and base cases clearly
- [ ] Can implement both memoization and tabulation
- [ ] Can optimize space from O(n²) to O(n) or O(1)
- [ ] Can solve 0/1 Knapsack and its variants
- [ ] Can solve LCS, Edit Distance, and palindrome DP
- [ ] Can solve coin change (min coins and number of ways)
- [ ] Can find LIS in O(n log n)
- [ ] Can set up interval DP (matrix chain multiplication)
- [ ] Can reconstruct the actual solution from DP table
- [ ] Can distinguish DP problems from greedy problems

---

# Concept 13: Tries & Advanced Data Structures

## Overview

**Definition:** A Trie (prefix tree) is a tree-like data structure used to efficiently store and retrieve strings by their prefixes. Advanced data structures include Segment Trees (range queries), Fenwick Trees (prefix sums), and Disjoint Set Union (connectivity).

**Why It Is Important:**
- Tries enable O(L) prefix-based operations (L = word length)
- Segment Trees handle range queries + updates in O(log n)
- These structures appear in 5-10% of hard interview questions
- Knowing when to use them signals strong problem-solving ability

**Common Time/Space Complexities:**
| Structure | Build | Query | Update | Space |
|-----------|-------|-------|--------|-------|
| Trie | O(n*L) | O(L) | O(L) | O(n*L*26) |
| Segment Tree | O(n) | O(log n) | O(log n) | O(4n) |
| Fenwick Tree (BIT) | O(n log n) | O(log n) | O(log n) | O(n) |
| Disjoint Set Union | O(n) | O(α(n)) | O(α(n)) | O(n) |

**Common Interview Patterns:**
- Trie for autocomplete / prefix search / word dictionary
- Trie + DFS/Backtracking (word search II)
- Segment Tree for range min/max/sum with updates
- Fenwick Tree for prefix sums with point updates
- DSU for dynamic connectivity

**Real-World Applications:**
- Autocomplete and spell checkers (Trie)
- IP routing tables (Trie)
- Database range queries (Segment Tree)
- Network connectivity (DSU)
- Text editors (Segment Tree for line indexing)

---

## Prerequisites

- Trees and recursion
- Arrays and prefix sums
- Bit manipulation basics (for Fenwick Tree)
- Graph basics (for DSU context)
- Understanding of range queries

---

## Theory

### Trie (Prefix Tree)
Each node has up to 26 children (for lowercase English). A path from root to a node represents a prefix.
```
TrieNode:
    children[26]
    isEndOfWord: boolean

insert(word): traverse/create nodes for each character
search(word): traverse; return true if last char node is end
startsWith(prefix): traverse; return true if prefix path exists
```

### Trie Operations
- **Insert:** O(L) — create nodes along the word path
- **Search:** O(L) — follow the path, check isEndOfWord
- **Prefix Search:** O(L) — follow the path, return whether path exists
- **Delete:** O(L) — remove nodes that are no longer part of any other word
- **Autocomplete:** DFS from prefix node to collect all words

### Trie Optimizations
- **Compressed Trie (Radix Tree):** Merge single-child chains into one node
- **Ternary Search Tree:** Three children (less, equal, greater) — more space efficient

### Segment Tree
A balanced binary tree where each leaf is an array element and internal nodes store aggregate values (sum, min, max) of their range.
```
build(node, start, end):
    if start == end: tree[node] = arr[start]
    else:
        mid = (start + end) / 2
        build(left_child, start, mid)
        build(right_child, mid+1, end)
        tree[node] = merge(tree[left], tree[right])

query(node, start, end, l, r):  // query range [l, r]
    if [start,end] outside [l,r]: return identity
    if [start,end] inside [l,r]: return tree[node]
    return merge(query(left, ...), query(right, ...))

update(node, start, end, idx, val):  // point update
    if start == end: tree[node] = val
    else: update appropriate child, recalculate tree[node]
```

### Lazy Propagation
For range updates on Segment Trees. Instead of updating all leaves, mark a node as "lazy" and propagate updates only when needed during queries.

### Fenwick Tree (Binary Indexed Tree)
Array-based structure for prefix sums with point updates. Uses bit manipulation to navigate parent/child.
- **Update:** Add value at index — traverse upward using `i += i & (-i)`
- **Query:** Prefix sum up to index — traverse downward using `i -= i & (-i)`
- Simpler to implement than Segment Tree but limited to prefix operations

### Disjoint Set Union (Union-Find)
Manages a partition of elements into disjoint sets.
- **Find(x):** Return representative of x's set — with path compression
- **Union(x, y):** Merge sets containing x and y — with union by rank/size
- Nearly O(1) amortized per operation

---

## 10 Implementation Questions

| No | Question | Difficulty | Concepts Tested | Expected TC | Expected SC |
|----|----------|-----------|-----------------|-------------|-------------|
| 1 | Implement a Trie with insert, search, and startsWith methods | Easy | Trie basics | O(L) per op | O(n*L) |
| 2 | Implement a Trie that counts the number of words with a given prefix | Easy | Trie + counting | O(L) | O(n*L) |
| 3 | Implement Union-Find with path compression and union by rank | Easy | DSU | O(α(n)) per op | O(n) |
| 4 | Implement a Segment Tree for range sum queries with point updates | Medium | Segment Tree, Build/Query/Update | O(log n) per op | O(4n) |
| 5 | Implement autocomplete: given a prefix, return all words in the Trie that start with it | Medium | Trie + DFS | O(L + k) | O(n*L) |
| 6 | Implement a Fenwick Tree (BIT) for prefix sum queries and point updates | Medium | Bit manipulation, BIT | O(log n) per op | O(n) |
| 7 | Using a Trie, find the longest common prefix among an array of strings | Medium | Trie traversal | O(n*L) | O(n*L) |
| 8 | Implement range minimum query using a Segment Tree | Medium | Segment Tree variant | O(log n) query | O(4n) |
| 9 | Implement a Segment Tree with lazy propagation for range updates and range queries | Hard | Lazy propagation | O(log n) per op | O(4n) |
| 10 | Find the maximum XOR of two numbers in an array using a Trie | Hard | Bitwise Trie | O(n * 32) | O(n * 32) |

---

## 10 LeetCode Problems

| LC No | Problem | Difficulty | Pattern | Link |
|-------|---------|-----------|---------|------|
| 208 | Implement Trie (Prefix Tree) | Easy | Trie basics | https://leetcode.com/problems/implement-trie-prefix-tree/ |
| 14 | Longest Common Prefix | Easy | Trie / Vertical scan | https://leetcode.com/problems/longest-common-prefix/ |
| 720 | Longest Word in Dictionary | Easy | Trie + BFS/DFS | https://leetcode.com/problems/longest-word-in-dictionary/ |
| 211 | Design Add and Search Words Data Structure | Medium | Trie + DFS (wildcards) | https://leetcode.com/problems/design-add-and-search-words-data-structure/ |
| 648 | Replace Words | Medium | Trie prefix matching | https://leetcode.com/problems/replace-words/ |
| 307 | Range Sum Query - Mutable | Medium | Segment Tree / BIT | https://leetcode.com/problems/range-sum-query-mutable/ |
| 421 | Maximum XOR of Two Numbers | Medium | Bitwise Trie | https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/ |
| 212 | Word Search II | Hard | Trie + Backtracking | https://leetcode.com/problems/word-search-ii/ |
| 315 | Count of Smaller Numbers After Self | Hard | Segment Tree / BIT / Merge Sort | https://leetcode.com/problems/count-of-smaller-numbers-after-self/ |
| 732 | My Calendar III | Hard | Segment Tree + Lazy | https://leetcode.com/problems/my-calendar-iii/ |

---

## Interview Tips

**Common Mistakes:**
- Forgetting to mark `isEndOfWord` in Trie (search returns true for prefixes)
- Off-by-one in Segment Tree indices (0-based vs 1-based)
- Not propagating lazy values before querying children
- Using DSU for directed graph problems (it's for undirected connectivity)
- Allocating too much memory for Trie (consider HashMap-based children)

**Edge Cases:**
- Empty string insertion/search in Trie
- Single character words
- Prefix that is itself a complete word
- Segment Tree with single element
- DSU: union of element with itself
- All strings in Trie are the same

**Frequently Asked Variations:**
- "Can you do it without a Trie?" (hash-based alternatives)
- "What if the alphabet is larger than 26?"
- "Can you support delete in your Trie?"
- "Range update + range query?" (lazy propagation needed)
- "Online vs offline queries?" (determines structure choice)

---

## Revision Checklist

- [ ] Can implement a Trie with insert, search, and startsWith
- [ ] Can implement autocomplete using Trie + DFS
- [ ] Can build a Segment Tree and perform range queries + point updates
- [ ] Can implement lazy propagation for range updates
- [ ] Can implement Fenwick Tree for prefix sum queries
- [ ] Can implement Union-Find with path compression and union by rank
- [ ] Can find maximum XOR using a bitwise Trie
- [ ] Can identify when Segment Tree vs Fenwick Tree is appropriate
- [ ] Can distinguish problems needing advanced DS from simpler approaches
- [ ] Understand time-space tradeoffs of each structure

---

# Concept 14: Bit Manipulation

## Overview

**Definition:** Bit manipulation involves directly operating on the binary representation of numbers using bitwise operators (AND, OR, XOR, NOT, shift). It enables elegant O(1) solutions for many problems.

**Why It Is Important:**
- Provides O(1) tricks that replace O(n) loops
- XOR properties solve "find the unique element" family of problems
- Bitmasks enable subset representation in O(2^n) DP
- Tests low-level understanding of how data is stored

**Common Time/Space Complexities:**
| Operation | Time | Space |
|-----------|------|-------|
| Single bitwise operation | O(1) | O(1) |
| Count set bits | O(number of bits) or O(1) with lookup | O(1) |
| Iterate over all subsets of a bitmask | O(2^n) | O(1) |
| Bitmask DP | O(2^n * n) | O(2^n) |

**Common Interview Patterns:**
- XOR for finding unique/missing elements
- Bit masking for subset representation
- Power of 2 checks
- Counting set bits (Brian Kernighan's)
- Isolate / set / clear / toggle specific bits
- Bitmask DP (TSP, subset enumeration)

**Real-World Applications:**
- Network subnet masking (IP addresses)
- Graphics (color manipulation, alpha blending)
- Cryptography (XOR ciphers, hash functions)
- Embedded systems (hardware register manipulation)
- Compression algorithms
- Permission systems (Unix file permissions)

---

## Prerequisites

- Binary number system (conversion between decimal and binary)
- Basic logical operators (AND, OR, NOT, XOR)
- Understanding of signed vs unsigned integers
- Two's complement representation

---

## Theory

### Bitwise Operators
| Operator | Symbol | Effect |
|----------|--------|--------|
| AND | `&` | 1 only if both bits are 1 |
| OR | `\|` | 1 if at least one bit is 1 |
| XOR | `^` | 1 if bits are different |
| NOT | `~` | Flips all bits |
| Left Shift | `<<` | Multiply by 2^k |
| Right Shift | `>>` | Divide by 2^k |

### Essential Bit Tricks
```
n & (n - 1)        // Clear the lowest set bit
n & (-n)           // Isolate the lowest set bit
n | (1 << k)       // Set the kth bit
n & ~(1 << k)      // Clear the kth bit
n ^ (1 << k)       // Toggle the kth bit
(n >> k) & 1       // Check if kth bit is set
n & 1              // Check if n is odd
```

### XOR Properties
- `a ^ a = 0` (self-cancellation)
- `a ^ 0 = a` (identity)
- XOR is commutative and associative
- XOR of all elements where all appear twice except one → gives the unique element

### Brian Kernighan's Algorithm
Count set bits by repeatedly clearing the lowest set bit:
```
count = 0
while n > 0:
    n = n & (n - 1)
    count++
```
Time: O(number of set bits)

### Power of 2 Check
`n > 0 && (n & (n - 1)) == 0`
A power of 2 has exactly one bit set.

### Bitmask as Subset Representation
An integer of n bits represents a subset of n elements.
- Bit i is set → element i is in the subset
- Iterate all subsets of {0, 1, ..., n-1}: `for mask in 0 to 2^n - 1`
- Iterate all subsets of a given mask m: `sub = m; while sub > 0: sub = (sub - 1) & m`

### Bitmask DP
Used when state involves a subset of n elements (n ≤ 20).
- **Travelling Salesman:** `dp[mask][i]` = min cost to visit cities in `mask`, ending at city `i`
- **Assignment Problem:** `dp[mask]` = optimal assignment for first `popcount(mask)` people

### Two's Complement & Negative Numbers
- `-n` is represented as `~n + 1`
- Useful for isolating lowest set bit: `n & (-n)`
- Be careful with right shift on negative numbers (arithmetic vs logical)

### Swap Without Temp
```
a = a ^ b
b = a ^ b  // now b = original a
a = a ^ b  // now a = original b
```

---

## 10 Implementation Questions

| No | Question | Difficulty | Concepts Tested | Expected TC | Expected SC |
|----|----------|-----------|-----------------|-------------|-------------|
| 1 | Check if a number is a power of 2 using bit manipulation | Easy | AND trick | O(1) | O(1) |
| 2 | Count the number of set bits (1s) in an integer using Brian Kernighan's algorithm | Easy | Kernighan's algorithm | O(set bits) | O(1) |
| 3 | Find the single number in an array where every other element appears twice | Easy | XOR cancellation | O(n) | O(1) |
| 4 | Swap two numbers without using a temporary variable | Medium | XOR swap | O(1) | O(1) |
| 5 | Find two non-repeating elements in an array where every other element appears twice | Medium | XOR + bit partitioning | O(n) | O(1) |
| 6 | Reverse the bits of a 32-bit unsigned integer | Medium | Bit shifting | O(32) | O(1) |
| 7 | Generate all subsets of an array using bitmask enumeration | Medium | Bitmask as subset | O(2^n * n) | O(1) extra |
| 8 | Find the missing number in array [0, n] with one number missing using XOR | Medium | XOR with index | O(n) | O(1) |
| 9 | Count total number of set bits from 1 to N | Hard | Pattern recognition, Recursion | O(log n) | O(1) |
| 10 | Solve the Travelling Salesman Problem using bitmask DP for small n | Hard | Bitmask DP, State compression | O(2^n * n²) | O(2^n * n) |

---

## 10 LeetCode Problems

| LC No | Problem | Difficulty | Pattern | Link |
|-------|---------|-----------|---------|------|
| 136 | Single Number | Easy | XOR cancellation | https://leetcode.com/problems/single-number/ |
| 191 | Number of 1 Bits | Easy | Kernighan's / shift | https://leetcode.com/problems/number-of-1-bits/ |
| 231 | Power of Two | Easy | n & (n-1) trick | https://leetcode.com/problems/power-of-two/ |
| 268 | Missing Number | Medium | XOR with indices | https://leetcode.com/problems/missing-number/ |
| 190 | Reverse Bits | Medium | Bit shifting | https://leetcode.com/problems/reverse-bits/ |
| 137 | Single Number II | Medium | Bit counting / state machine | https://leetcode.com/problems/single-number-ii/ |
| 260 | Single Number III | Medium | XOR + partition by bit | https://leetcode.com/problems/single-number-iii/ |
| 338 | Counting Bits | Medium | DP + bit trick | https://leetcode.com/problems/counting-bits/ |
| 1461 | Check If a String Contains All Binary Codes of Size K | Hard | Bitmask / HashSet | https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/ |
| 847 | Shortest Path Visiting All Nodes | Hard | Bitmask BFS / DP | https://leetcode.com/problems/shortest-path-visiting-all-nodes/ |

---

## Interview Tips

**Common Mistakes:**
- Signed vs unsigned confusion (right shift behavior differs)
- Integer overflow when shifting (1 << 31 in Java is negative)
- Forgetting that XOR of a number with itself is 0
- Off-by-one with bit positions (0-indexed vs 1-indexed)
- Applying bit tricks to floating-point numbers (doesn't work directly)

**Edge Cases:**
- n = 0 (power of 2 check should return false)
- Negative numbers (two's complement behavior)
- 32-bit vs 64-bit integers
- Single element array (single number problems)
- All bits set (e.g., n = 2^31 - 1)

**Frequently Asked Variations:**
- "Can you do it without extra space?" (XOR tricks)
- "What if elements appear three times instead of two?"
- "Can you do it in O(1) time?" (pre-computed lookup table)
- "What about the 64-bit version?"
- "Can you explain the bit representation?"

---

## Revision Checklist

- [ ] Can check power of 2 in O(1)
- [ ] Can count set bits using Brian Kernighan's algorithm
- [ ] Can find single number using XOR in O(n) time O(1) space
- [ ] Can find two unique numbers using XOR + bit partitioning
- [ ] Can use bitmask to represent and enumerate subsets
- [ ] Can reverse bits of a 32-bit integer
- [ ] Can swap two numbers using XOR
- [ ] Can solve bitmask DP problems (TSP for small n)
- [ ] Understand two's complement and signed/unsigned differences
- [ ] Can identify when bit manipulation provides an elegant O(1) trick

---

> **End of DSA Mastery Curriculum — 14 Concepts | 280 Questions Total**
