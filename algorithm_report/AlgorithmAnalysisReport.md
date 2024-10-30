## Report on Algorithm Analysis
This report provides an analysis of the time and space complexity of the array and string operations implemented in Java. We will review the complexity of each method, using Big O notation to highlight worst-case performance. Additionally, we will solve given recurrence relations relevant to typical recursive algorithms.


________________________________________
## Part 1: Complexity Analysis of Array and String Operations
1. Array Operations
a. StaticArray Class
•	Insertion (at a specific index):
o	Time Complexity: O(n), where nnn is the size of the array. Inserting at an arbitrary position requires shifting elements to the right, so in the worst case (inserting at the start), all nnn elements need to be shifted.
o	Space Complexity: O(1), since the array size is fixed, and no additional space is required for the operation.

•	Deletion (at a specific index):
o	Time Complexity: O(n). Similar to insertion, deletion involves shifting elements to the left after removing an element at the specified index.
o	Space Complexity: O(1)O(1)O(1), as no additional space is required.

•	Traversal:
o	Time Complexity: O(n), since each element in the array is accessed once.
o	Space Complexity: O(1), as no additional space is needed for traversal.

b. DynamicArray Class
•	Insertion (at a specific index):
o	Time Complexity: O(n) in the worst case for inserting an element at an arbitrary position.
o	Resizing (Doubling): When the array is full, it needs to be resized, which is an O(n) operation as it involves copying all elements to a new array. Since resizing happens infrequently (when capacity is reached), the amortized time complexity for insertion is O(1).
o	Space Complexity: O(n) since the array dynamically resizes to fit new elements.

•	Deletion (at a specific index):
o	Time Complexity: O(n), as elements after the deleted index need to be shifted left.
o	Space Complexity: O(1) for the operation itself; resizing might occur, affecting total space usage.

•	Traversal:
o	Time Complexity: O(n) for accessing each element once.
o	Space Complexity: O(1).

2. String Operations
a. Concatenation
•	Time Complexity: O(m+n), where m and n are the lengths of the two strings being concatenated. Each character must be copied to a new string.
•	Space Complexity: O(m+n)O, since the new string is of combined length m+nm + nm+n.

b. Substring Extraction
•	Time Complexity: O(n), where nnn is the length of the substring. In Java, substring runs in O(1) but copying elements in some implementations may take O(n).
•	Space Complexity: O(n), as a new substring object of length nnn is created.

c. Comparison
•	Time Complexity: O(n), where nnn is the length of the shorter string. String comparison terminates early if characters differ.
•	Space Complexity: O(1), since no additional space is needed.

d. Character Frequency (using an Array)
•	Time Complexity: O(n), where nnn is the length of the string. We iterate through each character once.
•	Space Complexity: O(1) for ASCII character frequency analysis, as the array size is fixed at 256.

________________________________________
## Part 2: Solving Recurrence Relations
1. Recurrence Relation 1: T(n)=T(n/2)+O(1)
•	Solution: This is a classic divide-and-conquer recurrence.
•	Method: Using the recurrence tree method or Master’s Theorem.
•	Result: O(log⁡n)O(\log n)O(logn). The recurrence describes an algorithm that divides the problem in half each time with constant work at each level.

2. Recurrence Relation 2: T(n)=2T(n/2)+O(n)
•	Solution: This relation follows the divide-and-conquer structure of the Merge Sort algorithm.
•	Method: Apply Master’s Theorem.
•	Result: O(nlog⁡n). Here, each level of recursion involves O(n) work, and the depth is O(log⁡n), resulting in O(nlog⁡n) total complexity.

3. Recurrence Relation 3: T(n)=T(n−1)+O(1)
•	Solution: This recurrence represents a problem that reduces by one in each step.
•	Method: Expand the recurrence to observe the pattern.
•	Result: O(n). Each level involves a constant amount of work, and there are nnn levels, so the complexity is linear.
________________________________________
This analysis provides insight into the efficiency of different data operations, laying the foundation for selecting appropriate data structures and algorithms for various scenarios in software development.
