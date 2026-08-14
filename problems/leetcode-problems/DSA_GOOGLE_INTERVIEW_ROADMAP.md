# DSA Roadmap for Google/Product-Based Interviews

> **Language:** Java · **Goal:** Google + strong product companies (Amazon/Meta/Microsoft/Apple) · **Start date:** 2026
> This roadmap is generated from your actual LeetCode dataset (`companies/` + `problems/` CSVs). All problem IDs, titles, difficulties, and links below come directly from that data.

---

## 1. My Current DSA Position

Honest assessment based on what you told me — **no credit for "encountered" unless you can implement it from memory**.

### Known (I have real, working knowledge)
- **N-Queens (51)** — independently implemented, debugged row vs column placement. This is your strongest recursive problem.
- **Pow(x, n) (50)** — independently improved O(n) → O(log n): squaring, halving exponent, odd handling, negatives, Integer.MIN_VALUE.
- **Recursion / Backtracking model** — you understand `choice → update → recurse → undo → next choice` conceptually (Letter Combinations 17, Rat in a Maze, map coloring).

### Practiced (done recently, but don't trust it yet)
- **Letter Combinations of a Phone Number (17)** — recently solved; evidence you're building choice-recursion.
- **Permutations (46)** — implemented the `used[] + current list` version, but **partly from a YouTube tutorial**. Needs independent reimplementation.

### Needs reinforcement (weakest area — this is your core blocker)
- **Independent implementation from scratch.** You recognize patterns when you see them, but you can't reliably rebuild them cold.
- **Permutation Sequence (60)** — first attempt TLE'd (generate-all + sort). Factorial-block approach is NOT mastered. Revisit later.
- **Dynamic programming** — "basics" only. Longest Common Substring/Subsequence concepts exist, but no real DP muscle.
- **Graphs** — terminology only. BFS/DFS, topological sort, shortest paths are effectively greenfield.

### Not yet mastered
- Everything else. Do not mark anything 🟢 until you can reimplement it without help.

---

## 2. How to Use This Roadmap

### The 11-Step Solving Protocol (every problem, every time)

1. **Understand the problem** — restate it in your own words. Identify input/output/constraints.
2. **Write examples manually** — do 2–3 small examples by hand. Write the *expected output* before coding.
3. **Identify brute force** — always write down the naive solution and its complexity first.
4. **Identify the pattern** — which family is this? (two pointers / sliding window / prefix sum / recursion / backtracking / DP / graph / greedy…). Check Section 7.
5. **Write pseudocode** — on paper or comments. Not full code.
6. **Implement in Java** — now code it. Use your pseudocode.
7. **Test edge cases** — empty input, single element, duplicates, negatives, max values, the specific edge case the problem is designed to test.
8. **Analyze time complexity** — be explicit.
9. **Analyze space complexity** — include recursion stack where relevant.
10. **Explain without looking at code** — describe your solution out loud. This is the interview skill.
11. **Reimplement later from memory** — per the repetition schedule in Section 6.

### When you're stuck (IMPORTANT)

If you are stuck for **25–40 minutes**, **do NOT watch a complete solution.** First write down:

- **What I know** (facts given, things I'm confident about)
- **Where I am stuck** (the exact line/step that breaks)
- **What the expected state should be** (what should the function return / what should the data look like at this step)
- **One or two possible approaches** (even guesses)

Only after writing these, take **one hint** (not the solution). If the hint unblocks you, finish on your own and mark the problem 🟠 **Solved With Hint**. If you have to see the solution, mark it 🔵 **Solved With Guidance** and **reimplement it from memory later** — it does NOT count as solved.

---

## 3. Difficulty Ladder

LeetCode difficulty ≠ your difficulty. This ladder ranks by *what you personally need to learn*.

| Level | Name | What it means | Example |
|-------|------|---------------|---------|
| **0** | Warm-up / implementation | Rebuild basic loops, arrays, string ops confidently | Two Sum (1), Move Zeroes (283) |
| **1** | Easy pattern recognition | See a pattern and apply it in ≤30 min | Valid Anagram (242), Max Subarray (53) |
| **2** | Easy-to-medium implementation | Multi-step but no tricky insight | Product Except Self (238), 3Sum (15) |
| **3** | Medium interview problems | Standard FAANG phone/screen level | Number of Islands (200), Course Schedule (207) |
| **4** | Medium pattern combinations | Two+ patterns combined | Minimum Window Substring (76), Serialize Tree (297) |
| **5** | Advanced / product-company | Google hard-level, rare patterns | Robot Room Cleaner (489), Burst Balloons (312) |

> Note: **Recursion/backtracking problems are Level 2–3 for you** because you know the concepts — but your *implementation* will make them feel like Level 4 until you rebuild muscle. That's normal and expected. The recursion track (Section 4C) is deliberately gradual.

---

## 4. Topic Roadmap

This is the **learning sequence**, organized by pattern progression. Problems are referenced by their number in Section 5's Exact Problem List.

### A. Arrays
1. **Traversal / in-place** — #2 (Remove Duplicates), #6 (Move Zeroes), #10 (Rotate Array)
2. **Counting / frequency** — #5 (Majority Element), #4 (Contains Duplicate)
3. **Prefix / suffix** — #21 (Pivot Index), #11 (Product Except Self), #22 (Subarray Sum = K), #23 (Divisible by K)
4. **Two pointers** — #6, #7, #12 (3Sum), #13 (Container)
5. **Sliding window** — #24–#33 (see Strings too)
6. **Hashing** — #4, #14 (Longest Consecutive), #22
7. **Sorting-based** — #12 (3Sum), #16 (Merge Intervals)
8. **Intervals** — #16, #17 (Insert Interval), #170 (Intersections), #136 (Meeting Rooms II)
9. **Binary search on arrays** — #95–#104 (Section G)
10. **Advanced patterns** — #15 (First Missing Positive), #18 (Sort Colors), #19 (Rotate Image), #20 (Spiral)

### B. Strings
1. **Frequency / hashing** — #34 (Valid Anagram), #35 (Group Anagrams), #36 (First Unique)
2. **Two pointers** — #37 (Valid Palindrome), #38 (Palindrome II), #39 (Reverse Words)
3. **Sliding window** — #24–#33
4. **Substring / expand** — #41 (Longest Palindromic Substring), #42 (Palindromic Substrings)
5. **Palindrome patterns** — #37, #38, #41, #42, then #189 (Longest Palindromic Subsequence) in DP
6. **Construction / simulation** — #40 (Add Strings), #43 (Longest Common Prefix), #44 (Most Common Word), #45 (Unique Email)

### C. Recursion ← **HIGHEST PRIORITY**
Build in this exact order — each stage is a prerequisite for the next:

1. **Basic recursion** — #47 (Fibonacci), #50 (Merge Two Sorted Lists), #51 (Reverse Linked List)
2. **Recursion with parameters** — #49 (K-th Symbol in Grammar — trace the tree by hand)
3. **Recursion returning values** — #48 (Pow(x,n)), #46 (Climbing Stairs → DP)
4. **Recursion with choices** — #52 (Letter Combinations)
5. **Subsets** — #53 (Subsets), #54 (Subsets II)
6. **Combinations** — #55 (Combinations), #56 (Combination Sum), #57 (Sum II), #58 (Sum III)
7. **Permutations** — #59 (Permutations), #60 (Permutations II)
8. **Partitioning** — #62 (Palindrome Partitioning), #63 (Restore IP Addresses)
9. **Backtracking** — #61 (Generate Parentheses), #64 (Word Search)
10. **Constraint satisfaction** — #65 (N-Queens), #66 (N-Queens II), #69 (Sudoku Solver)
11. **Factorial / ordering** — #67 (Permutation Sequence) — *revisit after #59–#60 are stable*

### D. Linked Lists
1. **Basics** — #73 (Middle), #71/#72 (Cycle I/II), #80 (Intersection)
2. **Reversal** — #51 (Reverse), #74 (Remove Nth), #81 (k-Group)
3. **Merge / two lists** — #50 (Merge Two), #77 (Add Two), #78 (Merge k Sorted)
4. **Patterns** — #75 (Reorder), #79 (Sort List), #77 (Random Pointer Copy)
5. **Design** — #82 (LRU Cache — Amazon all-time #1)

### E. Stack and Queue
1. **Basic stack** — #83 (Valid Parentheses), #84 (Min Stack), #85 (Queue using Stacks)
2. **Evaluation** — #86 (RPN), #92 (Basic Calculator II)
3. **Monotonic stack** — #87 (Daily Temperatures), #88 (Next Greater II), #89 (Largest Rectangle), #90 (Trapping Rain Water)
4. **String + stack** — #91 (Decode String), #93 (Min Remove Valid Parens), #94 (Asteroid Collision)

### F. Hashing / HashMap / HashSet
1. **Frequency maps** — #4, #5, #34, #35, #36, #44
2. **Map-based search** — #1 (Two Sum), #22 (Subarray = K), #14 (Longest Consecutive)
3. **Design hashing** — #209 (Insert Delete GetRandom), #210 (Time-Based KV)
4. **HashMap problems in Java** — always prefer `HashMap<Integer,Integer>`; mind `getOrDefault`.

### G. Binary Search
1. **Foundational** — #95 (Binary Search), #96 (Insert Position), #97 (First/Last)
2. **Rotated arrays** — #98 (Search Rotated), #99 (Find Minimum)
3. **Peak / 2D** — #100 (Peak), #101 (Search 2D)
4. **Search on answer** — #102 (Koko), #103 (Ship Packages) — *this is the "hardest easy pattern" Google loves*
5. **Advanced** — #104 (Median of Two Sorted Arrays)

### H. Trees
1. **Recursion basics** — #105 (Max Depth), #106 (Invert), #107 (Same), #108 (Symmetric), #109 (Balanced)
2. **Post-order recursion** — #110 (Diameter), #119 (Max Path Sum), #128 (Cameras)
3. **Traversals** — #94/#144/#145 (In/Pre/Post), #111 (Level Order), #113 (Zigzag)
4. **BFS views** — #112 (Right Side), #114 (Vertical Order)
5. **DFS path problems** — #115 (Tree Paths), #116 (Path Sum), #117 (Path Sum II), #118 (Path Sum III)
6. **BST** — #122 (Validate), #121 (LCA BST), #123 (Kth Smallest)
7. **Lowest Common Ancestor** — #120 (LCA Binary Tree)
8. **Tree construction** — #124 (Pre+Inorder)
9. **Advanced tree recursion** — #125 (Flatten), #126 (Serialize), #127 (All Nodes Distance K)

### I. Heap / Priority Queue
1. **Basics** — #129 (Last Stone Weight), #131 (Kth in Stream)
2. **Top-K** — #130 (Kth Largest), #132 (Top K Frequent), #133 (K Closest), #138 (Top K Words)
3. **Two heaps** — #134 (Find Median)
4. **Greedy heaps** — #135 (Task Scheduler), #136 (Meeting Rooms II), #137 (Reorganize String)
5. **Java note** — `PriorityQueue` is a min-heap by default; reverse for max-heap.

### J. Graphs
1. **Representation + DFS/BFS basics** — #139 (Flood Fill), #140 (Number of Islands), #141 (Max Area), #145 (Clone Graph)
2. **BFS level/state** — #142 (Rotting Oranges), #143 (01 Matrix), #144 (Pacific Atlantic), #157 (Word Ladder), #158 (Open the Lock)
3. **Connectivity** — #148 (Graph Valid Tree), #149 (Connected Components), #146 (Course Schedule), #147 (Schedule II)
4. **Cycle detection** — #71/#72 (Linked List Cycle), #146 (Course Schedule)
5. **Topological sort** — #146, #147, #159 (Alien Dictionary)
6. **Bipartite** — #150 (Is Bipartite?)
7. **Shortest path** — #155 (Network Delay Time), #156 (Cheapest Flights K Stops)
8. **Union-Find** — #151 (Evaluate Division), #152 (Accounts Merge), #153 (Redundant Connection), #154 (Network Connected), #160 (Islands II)
9. **Advanced** — #161 (Critical Connections — Tarjan)

### K. Greedy
1. **Simple greedy** — #162 (Buy/Sell II), #171 (Boats)
2. **Reachability** — #163 (Jump Game), #164 (Jump Game II), #165 (Gas Station)
3. **Interval greedy** — #166 (Non-overlapping), #167 (Arrows)
4. **Classic Amazon** — #168 (Partition Labels), #169 (Queue Reconstruction), #170 (Interval Intersections)

### L. Dynamic Programming ← **build gradually, this is your next big mountain**
1. **Recursion → memo → tabulation** — start with #47 (Fibonacci), #46 (Climbing Stairs)
2. **1D DP** — #172 (Min Cost Climbing), #173 (House Robber), #174 (House Robber II), #179 (Perfect Squares), #190 (Decode Ways)
3. **Coin / subset DP** — #180 (Coin Change), #181 (Coin Change 2), #182 (Combination Sum IV), #183 (Target Sum), #184 (Partition Equal Subset)
4. **Grid DP** — #175 (Unique Paths), #176 (Unique Paths II), #177 (Min Path Sum), #178 (Triangle), #197 (Dungeon Game)
5. **Two-sequence DP** — #185 (LCS), #186 (Edit Distance), #189 (Longest Palindromic Subsequence), #193 (Buy/Sell Cooldown)
6. **Subsequence / LIS** — #187 (LIS), #188 (String Chain), #191 (Word Break)
7. **Kadane variants** — #3 (Max Subarray), #192 (Max Product)
8. **State DP (buy/sell family)** — #193 (Cooldown), #194 (Buy/Sell III)
9. **Advanced DP** — #195 (Longest Increasing Path), #196 (Burst Balloons), #198 (Partition to K) — only after 1–8 are stable

### M. Backtracking (reinforces Section C)
- #53–#70 (Subsets through Sudoku). Revisit #67 (Permutation Sequence) at the end.
- **Constraint problems first-class:** #65 (N-Queens), #66 (N-Queens II), #69 (Sudoku), #64 (Word Search)

### N. Advanced Topics (ONLY after foundation is strong)
- **Trie** — #199 (Implement Trie), #200 (Add & Search), #201 (Replace Words), #202 (Search Suggestions), #70 (Word Search II)
- **Bit manipulation** — #203 (Number of 1 Bits), #204 (Reverse Bits), #205 (Counting Bits), #206 (Sum of Two Integers), #207 (Missing Number), #208 (Max XOR)
- **Advanced graph** — #161 (Critical Connections), #305 (Islands II)
- **Advanced DP** — #195, #196, #198
- **Monotonic stack (hard)** — #89 (Largest Rectangle), #90 (Trapping Rain)
- **Segment / Fenwick** — #213 (Count Smaller After Self), #214 (Range Sum 2D Mutable) — *defer until everything else is solid*

---

## 5. Exact Problem List

**184 problems.** Solve in the order shown. Update the **Status** column as you complete each.

| Order | Problem | LeetCode ID | Difficulty | Pattern | Why I am solving it | Status |
|-------|---------|-------------|-----------|---------|--------------------|--------|
| 1 | [Two Sum](https://leetcode.com/problems/two-sum) | 1 | Easy | Hash Map | The classic. Prove clean hashing. | 🔴 |
| 2 | [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array) | 26 | Easy | Two Pointers · In-place | In-place array editing. | 🔴 |
| 3 | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray) | 53 | Easy | Kadane / Prefix | Foundation of subarray thinking. | 🔴 |
| 4 | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate) | 217 | Easy | Hashing | First real HashSet use. | 🔴 |
| 5 | [Majority Element](https://leetcode.com/problems/majority-element) | 169 | Easy | Frequency | Majority element. | 🔴 |
| 6 | [Move Zeroes](https://leetcode.com/problems/move-zeroes) | 283 | Easy | Two Pointers | Move zeroes. | 🔴 |
| 7 | [Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array) | 977 | Easy | Two Pointers | Squares of a sorted array. | 🔴 |
| 8 | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock) | 121 | Easy | One-Pass | Most-asked Amazon/MS; greedy min. | 🔴 |
| 9 | [Single Number](https://leetcode.com/problems/single-number) | 136 | Easy | XOR | First bit trick. | 🔴 |
| 10 | [Rotate Array](https://leetcode.com/problems/rotate-array) | 189 | Easy | In-place Reversal | Rotate array. | 🔴 |
| 11 | [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self) | 238 | Medium | Prefix/Suffix | Product except self — Amazon classic. | 🔴 |
| 12 | [3Sum](https://leetcode.com/problems/3sum) | 15 | Medium | Two Pointers + Sort | 3Sum. | 🔴 |
| 13 | [Container With Most Water](https://leetcode.com/problems/container-with-most-water) | 11 | Medium | Two Pointers | Container with most water. | 🔴 |
| 14 | [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence) | 128 | Hard | Hashing | Longest consecutive sequence. | 🔴 |
| 15 | [First Missing Positive](https://leetcode.com/problems/first-missing-positive) | 41 | Hard | Index-as-Hash | First missing positive. | 🔴 |
| 16 | [Merge Intervals](https://leetcode.com/problems/merge-intervals) | 56 | Medium | Intervals | Merge intervals — interval anchor. | 🔴 |
| 17 | [Insert Interval](https://leetcode.com/problems/insert-interval) | 57 | Hard | Intervals | Insert interval. | 🔴 |
| 18 | [Sort Colors](https://leetcode.com/problems/sort-colors) | 75 | Medium | Dutch Flag | Sort colors. | 🔴 |
| 19 | [Rotate Image](https://leetcode.com/problems/rotate-image) | 48 | Medium | Matrix In-place | Rotate image. | 🔴 |
| 20 | [Spiral Matrix](https://leetcode.com/problems/spiral-matrix) | 54 | Medium | Matrix Simulation | Spiral matrix. | 🔴 |
| 21 | [Find Pivot Index](https://leetcode.com/problems/find-pivot-index) | 724 | Easy | Prefix Sum | Find pivot index. | 🔴 |
| 22 | [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k) | 560 | Medium | Prefix Sum + Map | Subarray sum equals K — Amazon/Meta favorite. | 🔴 |
| 23 | [Subarray Sums Divisible by K](https://leetcode.com/problems/subarray-sums-divisible-by-k) | 974 | Medium | Prefix Sum + Mod | Subarray sums divisible by K. | 🔴 |
| 24 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters) | 3 | Medium | Sliding Window | Longest substring without repeating — window anchor. | 🔴 |
| 25 | [Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum) | 209 | Medium | Sliding Window | Minimum size subarray sum. | 🔴 |
| 26 | [Permutation in String](https://leetcode.com/problems/permutation-in-string) | 567 | Medium | Sliding Window | Permutation in string. | 🔴 |
| 27 | [Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string) | 438 | Medium | Sliding Window | Find all anagrams in a string. | 🔴 |
| 28 | [Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement) | 424 | Medium | Sliding Window | Longest repeating char replacement. | 🔴 |
| 29 | [Max Consecutive Ones III](https://leetcode.com/problems/max-consecutive-ones-iii) | 1004 | Medium | Sliding Window | Max consecutive ones III. | 🔴 |
| 30 | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring) | 76 | Hard | Sliding Window | Minimum window substring — hardest core window. | 🔴 |
| 31 | [Longest Substring with At Most K Distinct Characters](https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters) | 340 | Hard | Sliding Window | At most K distinct. | 🔴 |
| 32 | [Subarrays with K Different Integers](https://leetcode.com/problems/subarrays-with-k-different-integers) | 992 | Hard | Sliding Window | Subarrays with K different integers. | 🔴 |
| 33 | [Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum) | 239 | Hard | Sliding Window Max | Deque-based window maximum. | 🔴 |
| 34 | [Valid Anagram](https://leetcode.com/problems/valid-anagram) | 242 | Easy | Hashing | Valid anagram. | 🔴 |
| 35 | [Group Anagrams](https://leetcode.com/problems/group-anagrams) | 49 | Medium | Hashing | Group anagrams. | 🔴 |
| 36 | [First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string) | 387 | Easy | Counting | First unique character. | 🔴 |
| 37 | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome) | 125 | Easy | Two Pointers | Valid palindrome. | 🔴 |
| 38 | [Valid Palindrome II](https://leetcode.com/problems/valid-palindrome-ii) | 680 | Easy | Two Pointers | Valid palindrome II. | 🔴 |
| 39 | [Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string) | 151 | Medium | String Manip | Reverse words in a string. | 🔴 |
| 40 | [Add Strings](https://leetcode.com/problems/add-strings) | 415 | Easy | Simulation | Add strings. | 🔴 |
| 41 | [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring) | 5 | Medium | Expand Center | Longest palindromic substring. | 🔴 |
| 42 | [Palindromic Substrings](https://leetcode.com/problems/palindromic-substrings) | 647 | Medium | Expand Center | Palindromic substrings. | 🔴 |
| 43 | [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix) | 14 | Easy | Prefix Scan | Longest common prefix. | 🔴 |
| 44 | [Most Common Word](https://leetcode.com/problems/most-common-word) | 819 | Easy | Parsing | Most common word (Amazon). | 🔴 |
| 45 | [Unique Email Addresses](https://leetcode.com/problems/unique-email-addresses) | 929 | Easy | Parsing | Unique email addresses (Google). | 🔴 |
| 46 | [Fibonacci Number](https://leetcode.com/problems/fibonacci-number) | 509 | Easy | Recursion → Memo | Fibonacci. | 🔴 |
| 47 | [Climbing Stairs](https://leetcode.com/problems/climbing-stairs) | 70 | Easy | Recursion → DP | Climbing stairs. | 🔴 |
| 48 | [Pow(x;n)](https://leetcode.com/problems/powx-n) | 50 | Medium | Divide & Conquer | Pow(x,n) — you improved this already. | 🔴 |
| 49 | [K-th Symbol in Grammar](https://leetcode.com/problems/k-th-symbol-in-grammar) | 779 | Medium | Recursion | K-th symbol in grammar. | 🔴 |
| 50 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists) | 21 | Easy | Recursion | Merge two sorted lists. | 🔴 |
| 51 | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list) | 206 | Easy | Recursion | Reverse linked list. | 🔴 |
| 52 | [Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number) | 17 | Medium | Choice Recursion | Letter combinations — building this. | 🔴 |
| 53 | [Subsets](https://leetcode.com/problems/subsets) | 78 | Medium | Subsets | Subsets — THE branching backbone. | 🔴 |
| 54 | [Subsets II](https://leetcode.com/problems/subsets-ii) | 90 | Medium | Subsets · Dedup | Subsets II. | 🔴 |
| 55 | [Combinations](https://leetcode.com/problems/combinations) | 77 | Medium | Combinations | Combinations k from n. | 🔴 |
| 56 | [Combination Sum](https://leetcode.com/problems/combination-sum) | 39 | Medium | Combination Sum | Unbounded combination sum. | 🔴 |
| 57 | [Combination Sum II](https://leetcode.com/problems/combination-sum-ii) | 40 | Medium | Combination Sum II | With duplicates. | 🔴 |
| 58 | [Combination Sum III](https://leetcode.com/problems/combination-sum-iii) | 216 | Medium | Combination Sum III | Fixed size. | 🔴 |
| 59 | [Permutations](https://leetcode.com/problems/permutations) | 46 | Medium | Permutations | Reimplement independently. | 🔴 |
| 60 | [Permutations II](https://leetcode.com/problems/permutations-ii) | 47 | Medium | Permutations II | With duplicates. | 🔴 |
| 61 | [Generate Parentheses](https://leetcode.com/problems/generate-parentheses) | 22 | Medium | Constraint | Generate parentheses. | 🔴 |
| 62 | [Palindrome Partitioning](https://leetcode.com/problems/palindrome-partitioning) | 131 | Medium | Partitioning | Palindrome partitioning. | 🔴 |
| 63 | [Restore IP Addresses](https://leetcode.com/problems/restore-ip-addresses) | 93 | Medium | Partitioning | Restore IP addresses. | 🔴 |
| 64 | [Word Search](https://leetcode.com/problems/word-search) | 79 | Medium | Grid Backtracking | Word search. | 🔴 |
| 65 | [N-Queens](https://leetcode.com/problems/n-queens) | 51 | Hard | Constraint | N-Queens — you have confidence here. | 🔴 |
| 66 | [N-Queens II](https://leetcode.com/problems/n-queens-ii) | 52 | Hard | Constraint | N-Queens II (count only). | 🔴 |
| 67 | [Permutation Sequence](https://leetcode.com/problems/permutation-sequence) | 60 | Hard | Factorial System | Permutation sequence — DO NOT count mastered. | 🔴 |
| 68 | [Letter Case Permutation](https://leetcode.com/problems/letter-case-permutation) | 784 | Medium | Choice Recursion | Letter case permutation. | 🔴 |
| 69 | [Sudoku Solver](https://leetcode.com/problems/sudoku-solver) | 37 | Hard | Constraint | Sudoku solver. | 🔴 |
| 70 | [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle) | 141 | Easy | Cycle Detection | Linked list cycle. | 🔴 |
| 71 | [Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii) | 142 | Medium | Cycle Detection | Linked list cycle II. | 🔴 |
| 72 | [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list) | 876 | Easy | Fast/Slow | Middle of the linked list. | 🔴 |
| 73 | [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list) | 19 | Medium | Two Pointers | Remove Nth from end. | 🔴 |
| 74 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers) | 2 | Medium | Simulation | Add two numbers. | 🔴 |
| 75 | [Copy List with Random Pointer](https://leetcode.com/problems/copy-list-with-random-pointer) | 138 | Medium | Hash Copy | Copy list with random pointer. | 🔴 |
| 76 | [Reorder List](https://leetcode.com/problems/reorder-list) | 143 | Medium | Tortoise+Reverse+Merge | Reorder list. | 🔴 |
| 77 | [Intersection of Two Linked Lists](https://leetcode.com/problems/intersection-of-two-linked-lists) | 160 | Easy | Two Pointers | Intersection of two linked lists. | 🔴 |
| 78 | [LRU Cache](https://leetcode.com/problems/lru-cache) | 146 | Medium | Design · LRU | LRU cache — Amazon #1. | 🔴 |
| 79 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses) | 20 | Easy | Stack | Valid parentheses. | 🔴 |
| 80 | [Min Stack](https://leetcode.com/problems/min-stack) | 155 | Easy | Design Stack | Min stack. | 🔴 |
| 81 | [Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks) | 232 | Easy | Design | Implement queue using stacks. | 🔴 |
| 82 | [Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation) | 150 | Medium | Stack Eval | Evaluate reverse polish notation. | 🔴 |
| 83 | [Daily Temperatures](https://leetcode.com/problems/daily-temperatures) | 739 | Medium | Monotonic Stack | Daily temperatures. | 🔴 |
| 84 | [Next Greater Element II](https://leetcode.com/problems/next-greater-element-ii) | 503 | Medium | Monotonic Stack | Next greater element II. | 🔴 |
| 85 | [Largest Rectangle in Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram) | 84 | Hard | Monotonic Stack | Largest rectangle in histogram. | 🔴 |
| 86 | [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water) | 42 | Hard | Two Pointers/Stack | Trapping rain water. | 🔴 |
| 87 | [Decode String](https://leetcode.com/problems/decode-string) | 394 | Medium | Stack | Decode string. | 🔴 |
| 88 | [Basic Calculator II](https://leetcode.com/problems/basic-calculator-ii) | 227 | Medium | Stack | Basic calculator II. | 🔴 |
| 89 | [Minimum Remove to Make Valid Parentheses](https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses) | 1249 | Medium | Stack | Minimum remove to make valid parentheses. | 🔴 |
| 90 | [Asteroid Collision](https://leetcode.com/problems/asteroid-collision) | 735 | Medium | Stack | Asteroid collision. | 🔴 |
| 91 | [Binary Search](https://leetcode.com/problems/binary-search) | 704 | Easy | Binary Search | Binary search foundation. | 🔴 |
| 92 | [Search Insert Position](https://leetcode.com/problems/search-insert-position) | 35 | Easy | Binary Search | Search insert position. | 🔴 |
| 93 | [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array) | 34 | Medium | Binary Search | First and last position. | 🔴 |
| 94 | [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array) | 33 | Medium | Binary Search | Search rotated sorted array. | 🔴 |
| 95 | [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array) | 153 | Medium | Binary Search | Find minimum in rotated array. | 🔴 |
| 96 | [Find Peak Element](https://leetcode.com/problems/find-peak-element) | 162 | Medium | Binary Search | Find peak element. | 🔴 |
| 97 | [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix) | 74 | Medium | Binary Search | Search a 2D matrix. | 🔴 |
| 98 | [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas) | 875 | Medium | BS on Answer | Koko eating bananas. | 🔴 |
| 99 | [Capacity To Ship Packages Within D Days](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days) | 1011 | Medium | BS on Answer | Capacity to ship packages. | 🔴 |
| 100 | [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays) | 4 | Hard | Binary Search | Median of two sorted arrays. | 🔴 |
| 101 | [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree) | 104 | Easy | Tree Recursion | Maximum depth. | 🔴 |
| 102 | [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree) | 226 | Easy | Tree Recursion | Invert binary tree. | 🔴 |
| 103 | [Same Tree](https://leetcode.com/problems/same-tree) | 100 | Easy | Tree Recursion | Same tree. | 🔴 |
| 104 | [Symmetric Tree](https://leetcode.com/problems/symmetric-tree) | 101 | Easy | Tree Recursion | Symmetric tree. | 🔴 |
| 105 | [Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree) | 110 | Easy | Tree Recursion | Balanced binary tree. | 🔴 |
| 106 | [Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree) | 543 | Easy | Tree Recursion | Diameter of binary tree. | 🔴 |
| 107 | [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal) | 102 | Medium | BFS | Level order traversal. | 🔴 |
| 108 | [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view) | 199 | Medium | BFS/DFS | Right side view. | 🔴 |
| 109 | [Binary Tree Paths](https://leetcode.com/problems/binary-tree-paths) | 257 | Easy | DFS Paths | Binary tree paths. | 🔴 |
| 110 | [Path Sum](https://leetcode.com/problems/path-sum) | 112 | Easy | DFS | Path sum. | 🔴 |
| 111 | [Path Sum II](https://leetcode.com/problems/path-sum-ii) | 113 | Medium | DFS | Path sum II. | 🔴 |
| 112 | [Lowest Common Ancestor of a Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree) | 236 | Medium | DFS LCA | LCA of binary tree. | 🔴 |
| 113 | [Lowest Common Ancestor of a Binary Search Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree) | 235 | Easy | BST LCA | LCA of BST. | 🔴 |
| 114 | [Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree) | 98 | Medium | BST Validate | Validate BST. | 🔴 |
| 115 | [Kth Smallest Element in a BST](https://leetcode.com/problems/kth-smallest-element-in-a-bst) | 230 | Medium | BST Inorder | Kth smallest element in a BST. | 🔴 |
| 116 | [Last Stone Weight](https://leetcode.com/problems/last-stone-weight) | 1046 | Easy | Heap | Last stone weight. | 🔴 |
| 117 | [Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array) | 215 | Medium | Heap/Quickselect | Kth largest element. | 🔴 |
| 118 | [Kth Largest Element in a Stream](https://leetcode.com/problems/kth-largest-element-in-a-stream) | 703 | Easy | Heap | Kth largest in stream. | 🔴 |
| 119 | [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements) | 347 | Medium | Heap | Top K frequent elements. | 🔴 |
| 120 | [K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin) | 973 | Medium | Heap | K closest points to origin. | 🔴 |
| 121 | [Find Median from Data Stream](https://leetcode.com/problems/find-median-from-data-stream) | 295 | Hard | Two Heaps | Find median from data stream. | 🔴 |
| 122 | [Top K Frequent Words](https://leetcode.com/problems/top-k-frequent-words) | 692 | Medium | Heap + Trie | Top K frequent words. | 🔴 |
| 123 | [Flood Fill](https://leetcode.com/problems/flood-fill) | 733 | Easy | Graph DFS | Flood fill. | 🔴 |
| 124 | [Number of Islands](https://leetcode.com/problems/number-of-islands) | 200 | Medium | Graph DFS | Number of islands. | 🔴 |
| 125 | [Max Area of Island](https://leetcode.com/problems/max-area-of-island) | 695 | Medium | Graph DFS | Max area of island. | 🔴 |
| 126 | [Rotting Oranges](https://leetcode.com/problems/rotting-oranges) | 994 | Medium | Graph BFS | Rotting oranges. | 🔴 |
| 127 | [01 Matrix](https://leetcode.com/problems/01-matrix) | 542 | Medium | Graph BFS | 01 matrix. | 🔴 |
| 128 | [Pacific Atlantic Water Flow](https://leetcode.com/problems/pacific-atlantic-water-flow) | 417 | Medium | Graph DFS | Pacific Atlantic water flow. | 🔴 |
| 129 | [Clone Graph](https://leetcode.com/problems/clone-graph) | 133 | Medium | Graph DFS | Clone graph. | 🔴 |
| 130 | [Course Schedule](https://leetcode.com/problems/course-schedule) | 207 | Medium | Topological | Course schedule. | 🔴 |
| 131 | [Course Schedule II](https://leetcode.com/problems/course-schedule-ii) | 210 | Medium | Topological | Course schedule II. | 🔴 |
| 132 | [Graph Valid Tree](https://leetcode.com/problems/graph-valid-tree) | 261 | Medium | Connectivity | Graph valid tree. | 🔴 |
| 133 | [Number of Connected Components in an Undirected Graph](https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph) | 323 | Medium | Connectivity | Number of connected components. | 🔴 |
| 134 | [Is Graph Bipartite?](https://leetcode.com/problems/is-graph-bipartite) | 785 | Medium | Bipartite | Is graph bipartite? | 🔴 |
| 135 | [Evaluate Division](https://leetcode.com/problems/evaluate-division) | 399 | Medium | DFS/Union | Evaluate division. | 🔴 |
| 136 | [Accounts Merge](https://leetcode.com/problems/accounts-merge) | 721 | Medium | Union-Find | Accounts merge. | 🔴 |
| 137 | [Redundant Connection](https://leetcode.com/problems/redundant-connection) | 684 | Medium | Union-Find | Redundant connection. | 🔴 |
| 138 | [Number of Operations to Make Network Connected](https://leetcode.com/problems/number-of-operations-to-make-network-connected) | 1319 | Medium | Union-Find | Network connected. | 🔴 |
| 139 | [Network Delay Time](https://leetcode.com/problems/network-delay-time) | 743 | Medium | Dijkstra | Network delay time. | 🔴 |
| 140 | [Cheapest Flights Within K Stops](https://leetcode.com/problems/cheapest-flights-within-k-stops) | 787 | Medium | Dijkstra | Cheapest flights within K stops. | 🔴 |
| 141 | [Word Ladder](https://leetcode.com/problems/word-ladder) | 127 | Medium | BFS | Word ladder. | 🔴 |
| 142 | [Open the Lock](https://leetcode.com/problems/open-the-lock) | 752 | Medium | BFS | Open the lock. | 🔴 |
| 143 | [Alien Dictionary](https://leetcode.com/problems/alien-dictionary) | 269 | Hard | Topological | Alien dictionary. | 🔴 |
| 144 | [Best Time to Buy and Sell Stock II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii) | 122 | Easy | Greedy | Best time to buy/sell II. | 🔴 |
| 145 | [Jump Game](https://leetcode.com/problems/jump-game) | 55 | Medium | Greedy | Jump game. | 🔴 |
| 146 | [Gas Station](https://leetcode.com/problems/gas-station) | 134 | Medium | Greedy | Gas station. | 🔴 |
| 147 | [Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals) | 435 | Medium | Greedy/Interval | Non-overlapping intervals. | 🔴 |
| 148 | [Minimum Number of Arrows to Burst Balloons](https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons) | 452 | Medium | Greedy/Interval | Minimum arrows to burst balloons. | 🔴 |
| 149 | [Partition Labels](https://leetcode.com/problems/partition-labels) | 763 | Medium | Greedy | Partition labels (Amazon). | 🔴 |
| 150 | [Queue Reconstruction by Height](https://leetcode.com/problems/queue-reconstruction-by-height) | 406 | Medium | Greedy/Sort | Queue reconstruction by height. | 🔴 |
| 151 | [Interval List Intersections](https://leetcode.com/problems/interval-list-intersections) | 986 | Medium | Two Pointers | Interval list intersections. | 🔴 |
| 152 | [Boats to Save People](https://leetcode.com/problems/boats-to-save-people) | 881 | Medium | Greedy | Boats to save people. | 🔴 |
| 153 | [Min Cost Climbing Stairs](https://leetcode.com/problems/min-cost-climbing-stairs) | 746 | Easy | 1D DP | Min cost climbing stairs. | 🔴 |
| 154 | [House Robber](https://leetcode.com/problems/house-robber) | 198 | Easy | 1D DP | House robber. | 🔴 |
| 155 | [House Robber II](https://leetcode.com/problems/house-robber-ii) | 213 | Medium | 1D DP | House robber II. | 🔴 |
| 156 | [Unique Paths](https://leetcode.com/problems/unique-paths) | 62 | Medium | Grid DP | Unique paths. | 🔴 |
| 157 | [Unique Paths II](https://leetcode.com/problems/unique-paths-ii) | 63 | Medium | Grid DP | Unique paths II. | 🔴 |
| 158 | [Minimum Path Sum](https://leetcode.com/problems/minimum-path-sum) | 64 | Medium | Grid DP | Minimum path sum. | 🔴 |
| 159 | [Triangle](https://leetcode.com/problems/triangle) | 120 | Medium | Grid DP | Triangle. | 🔴 |
| 160 | [Perfect Squares](https://leetcode.com/problems/perfect-squares) | 279 | Medium | 1D DP | Perfect squares. | 🔴 |
| 161 | [Coin Change](https://leetcode.com/problems/coin-change) | 322 | Medium | Coin DP | Coin change. | 🔴 |
| 162 | [Coin Change 2](https://leetcode.com/problems/coin-change-2) | 518 | Medium | Coin DP | Coin change 2. | 🔴 |
| 163 | [Combination Sum IV](https://leetcode.com/problems/combination-sum-iv) | 377 | Medium | Coin DP | Combination sum IV. | 🔴 |
| 164 | [Target Sum](https://leetcode.com/problems/target-sum) | 494 | Medium | Subset DP | Target sum. | 🔴 |
| 165 | [Partition Equal Subset Sum](https://leetcode.com/problems/partition-equal-subset-sum) | 416 | Medium | Subset DP | Partition equal subset sum. | 🔴 |
| 166 | [Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence) | 1143 | Medium | 2-String DP | Longest common subsequence. | 🔴 |
| 167 | [Edit Distance](https://leetcode.com/problems/edit-distance) | 72 | Hard | 2-String DP | Edit distance. | 🔴 |
| 168 | [Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence) | 300 | Medium | LIS | Longest increasing subsequence. | 🔴 |
| 169 | [Longest Palindromic Subsequence](https://leetcode.com/problems/longest-palindromic-subsequence) | 516 | Medium | 2-String DP | Longest palindromic subsequence. | 🔴 |
| 170 | [Decode Ways](https://leetcode.com/problems/decode-ways) | 91 | Medium | 1D DP | Decode ways. | 🔴 |
| 171 | [Word Break](https://leetcode.com/problems/word-break) | 139 | Medium | DP + Set | Word break. | 🔴 |
| 172 | [Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray) | 152 | Medium | Kadane variant | Maximum product subarray. | 🔴 |
| 173 | [Best Time to Buy and Sell Stock with Cooldown](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown) | 309 | Medium | State DP | Buy/sell with cooldown. | 🔴 |
| 174 | [Implement Trie (Prefix Tree)](https://leetcode.com/problems/implement-trie-prefix-tree) | 208 | Medium | Trie | Implement trie. | 🔴 |
| 175 | [Add and Search Word - Data structure design](https://leetcode.com/problems/add-and-search-word-data-structure-design) | 211 | Medium | Trie | Add and search word. | 🔴 |
| 176 | [Replace Words](https://leetcode.com/problems/replace-words) | 648 | Medium | Trie | Replace words. | 🔴 |
| 177 | [Search Suggestions System](https://leetcode.com/problems/search-suggestions-system) | 1268 | Medium | Trie/Sort | Search suggestions system (Amazon). | 🔴 |
| 178 | [Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits) | 191 | Easy | Bit | Number of 1 bits. | 🔴 |
| 179 | [Reverse Bits](https://leetcode.com/problems/reverse-bits) | 190 | Easy | Bit | Reverse bits. | 🔴 |
| 180 | [Counting Bits](https://leetcode.com/problems/counting-bits) | 338 | Medium | Bit DP | Counting bits. | 🔴 |
| 181 | [Sum of Two Integers](https://leetcode.com/problems/sum-of-two-integers) | 371 | Medium | Bit | Sum of two integers. | 🔴 |
| 182 | [Missing Number](https://leetcode.com/problems/missing-number) | 268 | Easy | Bit/XOR | Missing number. | 🔴 |
| 183 | [Insert Delete GetRandom O(1)](https://leetcode.com/problems/insert-delete-getrandom-o1) | 380 | Medium | Design | Insert delete getRandom O(1). | 🔴 |
| 184 | [Time Based Key-Value Store](https://leetcode.com/problems/time-based-key-value-store) | 981 | Medium | Design | Time based key-value store. | 🔴 |

**Legend for "Why":** every problem was selected for a specific skill you need. If you can already do a problem cold in ≤15 min with no hints, reimplement it from memory and mark 🟢, then skip ahead — don't redo easy work.

---

## 6. Mandatory Repetition System

**This section fixes your #1 problem: losing implementation ability after interruptions.**

For **every** problem marked 🔵 or worse, follow this schedule. Pick 3–5 "active" problems at a time; add to the queue as you go.

| Day | Action |
|-----|--------|
| **Day 0** | Solve it (with the 11-step protocol). Log it. |
| **Day 2** | Reimplement **without looking**. If you fail, add 1 hint, finish, mark 🔵. |
| **Day 7** | **Explain** the approach + complexity out loud (no code). |
| **Day 21** | Solve a **related problem** from the same family (Section 7). |
| **Day 45** | Revisit if still weak. Reimplement. If solid → ⭐. |

### Reimplementation Queue (maintain this list)

Keep this in a scratch file/notes app and update daily. Current queue (based on your history):

1. 🔴 **46 Permutations** — reimplement `used[]` approach cold (you learned it from YouTube; now own it).
2. 🔴 **78 Subsets** — derive the branching structure yourself.
3. 🔴 **17 Letter Combinations** — re-solve without help to lock in choice recursion.
4. 🔴 **60 Permutation Sequence** — factorial-block approach; **do not** mark solved until you can derive it.
5. 🔴 **70 Climbing Stairs / 322 Coin Change** — your DP restart point.

---

## 7. Pattern Families

Group related problems so you recognize *patterns*, not solutions.

### Sliding Window Family
- #24 (Longest Substring No Repeat) · #25 (Min Size Subarray Sum) · #26 (Permutation in String) · #27 (All Anagrams) · #28 (Replacement) · #29 (Max Consecutive Ones III) · #30 (Min Window) · #31 (At Most K Distinct) · #32 (K Different Integers) · #33 (Window Max)

**What should I recognize?** "Subarray/substring + find max/min/count with a constraint" → variable-size window with left/right pointers. "Exactly K" → solve `atMost(K) - atMost(K-1)`.

### Two Pointer Family
- #6 (Move Zeroes) · #7 (Squares) · #8 (Buy/Sell I) · #12 (3Sum) · #13 (Container) · #37 (Valid Palindrome) · #38 (Palindrome II) · #90 (Trapping Rain) · #170 (Interval Intersections) · #171 (Boats)

**What should I recognize?** Sorted array or "two values that trade off" → two pointers. Palindrome validation → outward/inward pointers.

### Prefix Sum Family
- #3 (Max Subarray) · #21 (Pivot) · #11 (Product Except Self) · #22 (Subarray = K) · #23 (Divisible by K)

**What should I recognize?** "Subarray sum" → prefix sums; "count subarrays with sum S" → prefix + HashMap; "divisible by K" → prefix mod K.

### Binary Search Family
- #95–#104 (foundational → rotated → answer space)

**What should I recognize?** "Find value in monotonic function" → binary search. "Minimize max / maximize min / feasibility check" → search on answer (#102, #103).

### Recursion Family
- #47 (Fibonacci) · #46 (Climbing Stairs) · #48 (Pow) · #49 (K-th Symbol) · #50 (Merge Two) · #51 (Reverse LL)

**What should I recognize?** A function whose result depends on a smaller version of itself. Write the base case first, then the recursive step.

### Backtracking Family
- #52 (Letter Combo) · #53 (Subsets) · #55 (Combinations) · #56–#58 (Combination Sums) · #59–#60 (Permutations) · #61 (Parens) · #62 (Pal Partition) · #63 (IPs) · #64 (Word Search) · #65–#69 (N-Queens → Sudoku)

**What should I recognize?** "All possible combinations/orderings/assignments" → backtracking. The skeleton is always: `if base case: add to result; for each choice: make choice → recurse → undo`.

### Tree DFS Family
- #105–#110 (recursion basics) · #110 (Diameter) · #115–#119 (paths) · #120 (LCA) · #124 (Construct) · #125 (Flatten) · #126 (Serialize) · #128 (Cameras)

**What should I recognize?** Tree problem → "what does the root need from its left/right children?" → post-order recursion returning a value.

### Graph BFS/DFS Family
- #139–#145 (islands/levels) · #146–#159 (topological/bipartite/shortest) · #151–#160 (union-find)

**What should I recognize?** Grid → DFS flood fill or BFS. "Levels from source" → BFS. "Prerequisite ordering" → topological sort. "Equivalence/connectivity" → union-find.

### DP Family
- #172–#198 (1D → coin → grid → 2-string → LIS → advanced)

**What should I recognize?** "Count/optimize ways to reach a state" → DP. First try recursion, then memo, then tabulate. Two inputs → 2D table. Subsequence → focus on character-by-character decisions.

---

## 8. Google / Product Company Track

**Methodology.** For each company I used the `problems/{company}_*.csv` files from your dataset. The **Frequency** column there is computed from historical interview reports. I ranked problems by:

1. **Frequency (alltime)** — the raw historical importance (Google table below).
2. **Recency window (6months/1year)** — what companies are asking *now* (candidate must be current).
3. **Difficulty** — Google filters on Medium/Hard; Easy only when high-frequency.
4. **Cross-company overlap** — problems appearing across Google + Amazon + Meta + Microsoft get the highest priority because they train transferable skill.

Verified company files present in the dataset: **Google, Amazon, Facebook (Meta), Microsoft, Apple, Netflix, LinkedIn, Uber, Adobe, Bloomberg, Oracle, Nvidia, Salesforce** (all with alltime + 1y/2y/6m windows). I did not fabricate any company data.

### Google — All-Time High Frequency (top 20 by `google_alltime.csv`)

| 5.91 | [Longest Absolute File Path](https://leetcode.com/problems/longest-absolute-file-path) | 388 | Medium |
| 5.78 | [K Empty Slots](https://leetcode.com/problems/k-empty-slots) | 683 | Hard |
| 5.65 | [Next Closest Time](https://leetcode.com/problems/next-closest-time) | 681 | Medium |
| 5.64 | [Two Sum](https://leetcode.com/problems/two-sum) | 1 | Easy |
| 5.64 | [Unique Email Addresses](https://leetcode.com/problems/unique-email-addresses) | 929 | Easy |
| 5.62 | [Fruit Into Baskets](https://leetcode.com/problems/fruit-into-baskets) | 904 | Medium |
| 5.49 | [License Key Formatting](https://leetcode.com/problems/license-key-formatting) | 482 | Easy |
| 5.48 | [Range Sum Query 2D - Mutable](https://leetcode.com/problems/range-sum-query-2d-mutable) | 308 | Hard |
| 5.35 | [Minimum Domino Rotations For Equal Row](https://leetcode.com/problems/minimum-domino-rotations-for-equal-row) | 1007 | Medium |
| 5.22 | [Guess the Word](https://leetcode.com/problems/guess-the-word) | 843 | Hard |
| 5.08 | [Unique Word Abbreviation](https://leetcode.com/problems/unique-word-abbreviation) | 288 | Medium |
| 4.95 | [Robot Room Cleaner](https://leetcode.com/problems/robot-room-cleaner) | 489 | Hard |
| 4.93 | [Evaluate Division](https://leetcode.com/problems/evaluate-division) | 399 | Medium |
| 4.89 | [Odd Even Jump](https://leetcode.com/problems/odd-even-jump) | 975 | Hard |
| 4.84 | [Repeated String Match](https://leetcode.com/problems/repeated-string-match) | 686 | Easy |
| 4.78 | [Sentence Screen Fitting](https://leetcode.com/problems/sentence-screen-fitting) | 418 | Medium |
| 4.70 | [Cracking the Safe](https://leetcode.com/problems/cracking-the-safe) | 753 | Hard |
| 4.68 | [Encode and Decode Strings](https://leetcode.com/problems/encode-and-decode-strings) | 271 | Medium |
| 4.67 | [Bomb Enemy](https://leetcode.com/problems/bomb-enemy) | 361 | Medium |
| 4.60 | [Binary Tree Longest Consecutive Sequence](https://leetcode.com/problems/binary-tree-longest-consecutive-sequence) | 298 | Medium |

### Google — Recent (last 6 months, `google_6months.csv`) — what's hot right now

| 1.21 | [Guess the Word](https://leetcode.com/problems/guess-the-word) | 843 | Hard |
| 1.13 | [Expressive Words](https://leetcode.com/problems/expressive-words) | 809 | Medium |
| 1.10 | [Validate Stack Sequences](https://leetcode.com/problems/validate-stack-sequences) | 946 | Medium |
| 1.02 | [Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit](https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit) | 1438 | Medium |
| 0.95 | [Delete Nodes And Return Forest](https://leetcode.com/problems/delete-nodes-and-return-forest) | 1110 | Medium |
| 0.90 | [Minimum Window Subsequence](https://leetcode.com/problems/minimum-window-subsequence) | 727 | Hard |
| 0.89 | [Logger Rate Limiter](https://leetcode.com/problems/logger-rate-limiter) | 359 | Easy |
| 0.81 | [Hand of Straights](https://leetcode.com/problems/hand-of-straights) | 846 | Medium |
| 0.79 | [Split Array into Consecutive Subsequences](https://leetcode.com/problems/split-array-into-consecutive-subsequences) | 659 | Medium |
| 0.78 | [Two Sum](https://leetcode.com/problems/two-sum) | 1 | Easy |

### Meta (Facebook) — All-Time High Frequency

| 5.58 | [Remove Invalid Parentheses](https://leetcode.com/problems/remove-invalid-parentheses) | 301 | Hard |
| 5.44 | [Integer to English Words](https://leetcode.com/problems/integer-to-english-words) | 273 | Hard |
| 5.31 | [Verifying an Alien Dictionary](https://leetcode.com/problems/verifying-an-alien-dictionary) | 953 | Easy |
| 5.18 | [Read N Characters Given Read4 II - Call multiple times](https://leetcode.com/problems/read-n-characters-given-read4-ii-call-multiple-times) | 158 | Hard |
| 5.09 | [Serialize and Deserialize Binary Tree](https://leetcode.com/problems/serialize-and-deserialize-binary-tree) | 297 | Hard |
| 4.96 | [Regular Expression Matching](https://leetcode.com/problems/regular-expression-matching) | 10 | Hard |
| 4.93 | [Decode Ways](https://leetcode.com/problems/decode-ways) | 91 | Medium |
| 4.89 | [Meeting Rooms II](https://leetcode.com/problems/meeting-rooms-ii) | 253 | Medium |
| 4.79 | [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self) | 238 | Medium |
| 4.73 | [Valid Palindrome II](https://leetcode.com/problems/valid-palindrome-ii) | 680 | Easy |
| 4.72 | [3Sum](https://leetcode.com/problems/3sum) | 15 | Medium |
| 4.68 | [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k) | 560 | Medium |
| 4.67 | [First Bad Version](https://leetcode.com/problems/first-bad-version) | 278 | Easy |
| 4.62 | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring) | 76 | Hard |
| 4.62 | [K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin) | 973 | Medium |

### Meta (Facebook) — Recent 6 months

| 2.99 | [Verifying an Alien Dictionary](https://leetcode.com/problems/verifying-an-alien-dictionary) | 953 | Easy |
| 2.79 | [Minimum Remove to Make Valid Parentheses](https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses) | 1249 | Medium |
| 2.59 | [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k) | 560 | Medium |
| 2.43 | [Valid Palindrome II](https://leetcode.com/problems/valid-palindrome-ii) | 680 | Easy |
| 2.42 | [K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin) | 973 | Medium |
| 2.39 | [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self) | 238 | Medium |
| 2.19 | [Integer to English Words](https://leetcode.com/problems/integer-to-english-words) | 273 | Hard |
| 1.99 | [Alien Dictionary](https://leetcode.com/problems/alien-dictionary) | 269 | Hard |
| 1.94 | [Add Strings](https://leetcode.com/problems/add-strings) | 415 | Easy |
| 1.74 | [Leftmost Column with at Least a One](https://leetcode.com/problems/leftmost-column-with-at-least-a-one) | 1428 | Medium |

### Microsoft — All-Time High Frequency (top 12)

| 3.70 | [Copy List with Random Pointer](https://leetcode.com/problems/copy-list-with-random-pointer) | 138 | Medium |
| 3.60 | [Two Sum](https://leetcode.com/problems/two-sum) | 1 | Easy |
| 3.49 | [LRU Cache](https://leetcode.com/problems/lru-cache) | 146 | Medium |
| 3.39 | [Spiral Matrix](https://leetcode.com/problems/spiral-matrix) | 54 | Medium |
| 3.37 | [Integer to English Words](https://leetcode.com/problems/integer-to-english-words) | 273 | Hard |
| 3.27 | [Find the Celebrity](https://leetcode.com/problems/find-the-celebrity) | 277 | Medium |
| 3.19 | [Design Tic-Tac-Toe](https://leetcode.com/problems/design-tic-tac-toe) | 348 | Medium |
| 3.17 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers) | 2 | Medium |
| 3.07 | [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water) | 42 | Hard |
| 3.03 | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list) | 206 | Easy |
| 3.01 | [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring) | 5 | Medium |
| 2.98 | [String to Integer (atoi)](https://leetcode.com/problems/string-to-integer-atoi) | 8 | Medium |

### Apple — All-Time High Frequency (top 8)

| 2.44 | [Two Sum](https://leetcode.com/problems/two-sum) | 1 | Easy |
| 2.29 | [LRU Cache](https://leetcode.com/problems/lru-cache) | 146 | Medium |
| 2.14 | [Frog Jump](https://leetcode.com/problems/frog-jump) | 403 | Hard |
| 1.98 | [Spiral Matrix](https://leetcode.com/problems/spiral-matrix) | 54 | Medium |
| 1.94 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers) | 2 | Medium |
| 1.90 | [Peeking Iterator](https://leetcode.com/problems/peeking-iterator) | 284 | Medium |
| 1.75 | [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays) | 4 | Hard |
| 1.60 | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray) | 53 | Easy |

### Other strong product companies (dataset-supported)

**LinkedIn** (alltime top 6): | 6.08 | [Shortest Word Distance II](https://leetcode.com/problems/shortest-word-distance-ii) | 244 | Medium |
| 5.86 | [Nested List Weight Sum II](https://leetcode.com/problems/nested-list-weight-sum-ii) | 364 | Medium |
| 5.34 | [Two Sum III - Data structure design](https://leetcode.com/problems/two-sum-iii-data-structure-design) | 170 | Easy |
| 4.82 | [Nested List Weight Sum](https://leetcode.com/problems/nested-list-weight-sum) | 339 | Easy |
| 4.70 | [Closest Binary Search Tree Value II](https://leetcode.com/problems/closest-binary-search-tree-value-ii) | 272 | Hard |
| 4.68 | [Binary Tree Upside Down](https://leetcode.com/problems/binary-tree-upside-down) | 156 | Medium |

**Uber** (alltime top 6): | 3.20 | [Construct Quad Tree](https://leetcode.com/problems/construct-quad-tree) | 427 | Medium |
| 3.01 | [Word Pattern II](https://leetcode.com/problems/word-pattern-ii) | 291 | Hard |
| 2.82 | [Minesweeper](https://leetcode.com/problems/minesweeper) | 529 | Medium |
| 2.79 | [Number of Islands II](https://leetcode.com/problems/number-of-islands-ii) | 305 | Hard |
| 2.73 | [Cherry Pickup](https://leetcode.com/problems/cherry-pickup) | 741 | Hard |
| 2.53 | [Set Intersection Size At Least Two](https://leetcode.com/problems/set-intersection-size-at-least-two) | 757 | Hard |

**Note on Amazon:** its full track is in **Section 9** because you just took their OA.

**How to use this track:** once your core list (Section 5) is ~60% 🟢, start mixing in Google's 6-month list weekly. Google is interview-rich and favors *explanation + follow-up variation*, so always do step 10 (explain out loud) on these.

---

## 9. Amazon Track

Side track after core foundation — do NOT let it replace the main progression. Amazon was verified in the dataset: `amazon_alltime.csv` and `amazon_6months.csv`.

### Amazon — All-Time High Frequency (top 18)

| 5.67 | [Reorder Data in Log Files](https://leetcode.com/problems/reorder-data-in-log-files) | 937 | Easy |
| 5.56 | [Number of Islands](https://leetcode.com/problems/number-of-islands) | 200 | Medium |
| 5.45 | [Critical Connections in a Network](https://leetcode.com/problems/critical-connections-in-a-network) | 1192 | Hard |
| 5.34 | [Two Sum](https://leetcode.com/problems/two-sum) | 1 | Easy |
| 5.27 | [LRU Cache](https://leetcode.com/problems/lru-cache) | 146 | Medium |
| 5.16 | [K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin) | 973 | Medium |
| 5.04 | [Most Common Word](https://leetcode.com/problems/most-common-word) | 819 | Easy |
| 5.03 | [Copy List with Random Pointer](https://leetcode.com/problems/copy-list-with-random-pointer) | 138 | Medium |
| 4.92 | [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring) | 5 | Medium |
| 4.81 | [Rotting Oranges](https://leetcode.com/problems/rotting-oranges) | 994 | Medium |
| 4.70 | [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water) | 42 | Hard |
| 4.60 | [Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists) | 23 | Hard |
| 4.55 | [Partition Labels](https://leetcode.com/problems/partition-labels) | 763 | Medium |
| 4.44 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers) | 2 | Medium |
| 4.36 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses) | 20 | Easy |
| 4.32 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists) | 21 | Easy |
| 4.31 | [Word Ladder](https://leetcode.com/problems/word-ladder) | 127 | Medium |
| 4.29 | [Find Median from Data Stream](https://leetcode.com/problems/find-median-from-data-stream) | 295 | Hard |

### Amazon — Last 6 Months (top 18) — closest match to a current OA

| 3.95 | [Reorder Data in Log Files](https://leetcode.com/problems/reorder-data-in-log-files) | 937 | Easy |
| 3.66 | [Number of Islands](https://leetcode.com/problems/number-of-islands) | 200 | Medium |
| 3.36 | [Critical Connections in a Network](https://leetcode.com/problems/critical-connections-in-a-network) | 1192 | Hard |
| 3.17 | [Partition Labels](https://leetcode.com/problems/partition-labels) | 763 | Medium |
| 2.87 | [Rotting Oranges](https://leetcode.com/problems/rotting-oranges) | 994 | Medium |
| 2.72 | [Top K Frequent Words](https://leetcode.com/problems/top-k-frequent-words) | 692 | Medium |
| 2.43 | [Most Common Word](https://leetcode.com/problems/most-common-word) | 819 | Easy |
| 2.13 | [LRU Cache](https://leetcode.com/problems/lru-cache) | 146 | Medium |
| 1.83 | [Analyze User Website Visit Pattern](https://leetcode.com/problems/analyze-user-website-visit-pattern) | 1152 | Medium |
| 1.74 | [Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists) | 23 | Hard |
| 1.68 | [Design In-Memory File System](https://leetcode.com/problems/design-in-memory-file-system) | 588 | Hard |
| 1.51 | [Two Sum](https://leetcode.com/problems/two-sum) | 1 | Easy |
| 1.48 | [Concatenated Words](https://leetcode.com/problems/concatenated-words) | 472 | Hard |
| 1.43 | [K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin) | 973 | Medium |
| 1.34 | [Prison Cells After N Days](https://leetcode.com/problems/prison-cells-after-n-days) | 957 | Medium |
| 1.19 | [LFU Cache](https://leetcode.com/problems/lfu-cache) | 460 | Hard |
| 1.18 | [Minimum Cost to Connect Sticks](https://leetcode.com/problems/minimum-cost-to-connect-sticks) | 1167 | Medium |
| 1.10 | [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water) | 42 | Hard |

### Amazon OA revision tips
- Amazon loves **behavioral + LLD**, but the OA coding is pattern-based: arrays, strings, graphs (islands/rotten oranges), LRU-style designs, K-Closest, and heap problems. Everything above is covered in your core list.
- Practice these as **timed 45-minute** sessions to mimic the OA.

---

## 10. Daily Problem-Solving Template

Copy this for every problem:

```
Problem:            [Title] (LeetCode ID)
Pattern:            [from Section 7]
Difficulty:         [LeetCode + your level]
First thought:      [what I tried first]
Brute force:        [naive + complexity]
Optimized idea:     [the insight]
Why it works:       [correctness argument in 1–2 sentences]
Code:               [Java]
Mistake:            [what went wrong / where I got stuck]
Time complexity:    [O(...)]
Space complexity:   [O(...)]
What I learned:     [1 line — the transferable lesson]
Can I reimplement without help?  [Yes / No]
Next review date:   [Day 2 / Day 7 / Day 21 / Day 45]
```

---

## 11. Weekly Structure

You study Java/Spring Boot, CS fundamentals, communication, projects, and college — DSA should NOT consume your day. Consistency beats volume.

### Normal Day (~1.5–2 hrs DSA)
- 20 min: **reimplement 1 problem** from the queue (Section 6) — no looking
- 60–80 min: **1 new problem** with the 11-step protocol
- 15 min: update the template + schedule next review

### Heavy DSA Day (weekend, ~4 hrs)
- 30 min: revision queue (2 problems from memory)
- 3 hrs: 2 new problems + 1 pattern-family stretch (Section 7)
- 30 min: explain 2 solutions out loud (step 10)

### College-Heavy Day (~45 min)
- Just the **reimplementation queue** (2 problems from memory, timed). Protecting the repetition system matters more than new problems.

### Revision Day (every 7th day)
- No new problems. Reimplement the week's problems from memory, update statuses, prune the queue.

---

## 12. Anti-Stuck Rules

Your tendency: spending hours on one problem. Explicit rules:

- **Easy:** max **30–40 minutes** before seeking a hint
- **Medium:** max **45–60 minutes**
- **Hard:** max **60–90 minutes**
- **Never spend an entire day staring at one problem.**
- If stuck, **write the state and example manually** (paper always helps).
- If still stuck, **ask for a hint** — not the full solution.
- **After seeing a solution, close it and reimplement it yourself.**
- Mark the problem **🔵 Solved With Guidance**, not "solved."

---

## 13. Mastery Levels

| Status | Meaning |
|--------|---------|
| 🔴 **Not Started** | Haven't attempted. |
| 🟡 **Attempted** | Tried, couldn't finish. Needs a hint/solution next session. |
| 🟠 **Solved With Hint** | Finished after a hint (not the solution). Good progress. |
| 🔵 **Solved With Guidance** | Needed to see the solution. **Does not count as solved.** Must reimplement from memory. |
| 🟢 **Independently Solved** | Solved cold, no hints. |
| ⭐ **Mastered / Can Reimplement** | Can reimplement from memory + explain complexity. Passed the Day-45 check. |
| 🔁 **Needs Revision** | Was stable, now fuzzy after an interruption — back in the queue. |

> **Rule:** "Watched a YouTube solution" **never** counts as independently solved. At best it's 🔵.

---

## 14. Current Starting Point

### START HERE TODAY

You have real confidence in **N-Queens (51)** and **Pow(x,n) (50)**, and you're mid-way through choice recursion (17, 46). These 5 problems **reinforce the exact weakness you described** and gradually push difficulty:

1. **78 — Subsets** (Medium, 🔴) — The branching backbone. If you can derive subsets independently, combinations and permutations become mechanical. *Start here.*
2. **46 — Permutations** (Medium, 🔴) — Reimplement the `used[]` version **cold**. You learned it from a video; now prove you own it. This directly fixes your stated gap.
3. **17 — Letter Combinations of a Phone Number** (Medium, 🟡) — You solved this recently. Solve it again without help to convert 🟡 → 🟢 and lock in choice recursion.
4. **77 — Combinations** (Medium, 🔴) — Bridges subsets → permutations. Forces you to manage the `start` index — a classic source of bugs.
5. **51 — N-Queens** (Hard, 🟢→⭐) — Your strongest problem. Reimplement from memory to convert confidence into a reproducible skill, then compare your current solution to the general backtracking skeleton.

**Why this exact set:** #1–#4 build the subsets→combinations→permutations ladder around the *one* pattern you need most. #5 anchors it to something you've already mastered so you end the week on a win. Do NOT start with #60 (Permutation Sequence) — factorial math will frustrate you before the basics are locked.

### AFTER THESE 5 (the next 10, in order)

6. **90 — Subsets II** (Medium) — deduplication; teaches `sort + skip-duplicates` which you'll reuse everywhere
7. **47 — Permutations II** (Medium) — same dedup skill on permutations
8. **39 — Combination Sum** (Medium) — unbounded choice; introduces "remaining target" state
9. **40 — Combination Sum II** (Medium) — duplicates + dedup; the sum version of #6/#7
10. **216 — Combination Sum III** (Medium) — fixed size k + sum; locks the whole family
11. **22 — Generate Parentheses** (Medium) — a *constraint* on choices (open>close); first step from pure recursion toward backtracking
12. **131 — Palindrome Partitioning** (Medium) — partition-based recursion (you know LCS concepts; now build the recursive slicing)
13. **93 — Restore IP Addresses** (Medium) — partition with numeric constraints
14. **79 — Word Search** (Medium) — move the same pattern onto a **grid** (visited tracking)
15. **52 — N-Queens II** (Hard) — count-only variant of your strongest problem; a fast win that confirms mastery

Then jump back to the ordered list in Section 5 and continue from #67 (Permutation Sequence) when recursion/backtracking feels automatic.

---

## 15. What NOT to Do

Postpone these until the prerequisites below them are stable:

- ❌ **Advanced DP** (Burst Balloons #196, Partition to K #198, Longest Increasing Path #195, Buy/Sell III #194) **before** 1D/coin/grid DP (#172–#192) are 🟢. Your DP is at "basics"; jumping to interval DP will feel like reading a foreign language.
- ❌ **Advanced graph algorithms** (Tarjan #161, Islands II #160, Alien Dictionary #159) **before** BFS/DFS + topological + union-find basics (#139–#156) are stable.
- ❌ **Segment tree / Fenwick tree** (#213, #214) until you can solve most of Section 5 comfortably. These are Google-hard and not worth the early hours.
- ❌ **Permutation Sequence (60)** until Permutations (46) is ⭐ — its factorial logic will demoralize you otherwise.
- ❌ **Skipping the repetition system** to "do more problems." Your failure mode is decay, not lack of exposure.
- ❌ **Marking YouTube-solved problems as solved.** That's how you fool yourself; the queue will punish it at Day 45.

---

# My Current DSA Mission

You are a B.Tech student with real DSA knowledge but one critical weakness: **you can recognize patterns but can't reliably implement them from scratch after interruptions.** Your biggest leverage right now is not new topics — it's the **recursion→subsets→combinations→permutations→backtracking ladder**, because it rebuilds your ability to translate "I know the idea" into "I wrote the code." Focus on the 5 starting problems, then the 10 after them; protect the Day-2/Day-7/Day-45 repetition schedule above everything else, because it directly repairs the implementation decay that keeps breaking your progress. Good progress looks like: 46, 78, 77 reimplemented cold, N-Queens and Pow(x,n) promoted to ⭐, and at least 3 problems promoted from 🔵→🟢 each week. When you get stuck, stop, write the problem state by hand, take a single hint, and never count a watched solution as solved. **Your next milestone: finish the first 15 problems (5 + 10) with ≥10 of them at 🟢 or better, then start Section 5 from #67.**
