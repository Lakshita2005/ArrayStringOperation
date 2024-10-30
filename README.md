# Array and String Operations Project

## Overview
This project implements various array and string operations in Java, including:
- **StaticArray**: A fixed-size array with insertion, deletion, and traversal operations.
- **DynamicArray**: A resizable array that automatically expands as elements are added, with insertion, deletion, and traversal operations.
- **StringOperations**: A class providing string manipulation methods such as concatenation, substring extraction, comparison, and character frequency analysis.

## Requirements
- **Java Development Kit (JDK)** must be installed on your system.
- **Git** (optional, but required if you plan to use version control or submit via a GitHub repository).

## Instructions to Run the Code

1. **Navigate to the `src` directory**:
   cd src
2. **Compile all Java files**:
    javac *.java
3. **Run the Main class to see the output**:
    java Main


## Classes and Methods
StaticArray
* insert(int index, int value) - Inserts a value at a specified index.
* delete(int index) - Deletes the value at a specified index.
* traverse() - Displays all elements in the array.

DynamicArray
* insert(int value) - Adds a value to the array, expanding the size if necessary.
* delete(int index) - Deletes the value at a specified index.
* traverse() - Displays all elements in the array.

StringOperations
* concatenate(String a, String b) - Concatenates two strings and returns the result.
* substring(String str, int start, int end) - Extracts a substring from a string given the start and end indices.
* compare(String a, String b) - Compares two strings lexicographically, returning an integer based on comparison.
* characterFrequency(String str) - Returns the frequency of each character in a string, with each character frequency on a new line.

## Example Output
Running the Main class should produce output similar to this:

=== Array Operations ===
Inserting elements into StaticArray and DynamicArray...
StaticArray after insertions: [10, 20, 30]
DynamicArray after insertions: [10, 20, 30, 40, 50]

=== StringOperations ===
Concatenation: HelloWorld
Substring: Hello
Comparison: -15
Character Frequency:
H: 1
e: 3
l: 2
o: 1
 : 1
t: 1
h: 1
r: 1
!: 1

