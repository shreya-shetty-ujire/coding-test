# Java Programs - README

## Programming Language
All programs are written in **Java**.

---

## Problem 1 - Basic Calculator

**Description:**  
Performs basic arithmetic operations: addition, subtraction, multiplication, and division.

**Inputs:**  
- Two double numbers
- A string indicating the operation (e.g., "addition", "division")

### Examples

**Case 1: Valid Addition**  
Input: `a = 10.5`, `b = 2.0`, `operation = "addition"`  
Output: `Result: 12.5`

**Case 2: Valid Division**  
Input: `a = 10.0`, `b = 2.0`, `operation = "division"`  
Output: `Result: 5.0`

**Case 3: Division by Zero**  
Input: `a = 10.0`, `b = 0.0`, `operation = "division"`  
Output: `Cannot divide by zero, Result: -1.0`

**Case 4: Invalid Operation**  
Input: `a = 10.0`, `b = 2.0`, `operation = "modulus"`  
Output: `Invalid operation type: modulus, Result: -1.0`

---

## Problem 2 - Odd Number Series Generator

**Description:**  
Generates the first `a` odd numbers starting from 1.

### Examples

**Case 1: Input = 1**  
Output: `Output: 1`

**Case 2: Input = 3**  
Output: `Output: 1, 3, 5`

**Case 3: Input = 0**  
Output: `Output:` (empty)

**Case 4: Input = -3**  
Output: `Please enter a non-negative integer`

---

## Problem 3 - Odd Number Series (Up to a Count)

**Description:**  
Prints odd numbers up to the given count. If the input is even, it prints one less than the given number of odd numbers.

### Examples

**Case 1: Input = 5**  
Output: `Output: 1, 3, 5, 7, 9`

**Case 2: Input = 4**  
Output: `Output: 1, 3, 5`

**Case 3: Input = 0**  
Output: `Output:` (empty)

**Case 4: Input = -2**  
Output: `Please enter a non-negative integer`

---

## Problem 4 - Multiples Count Map

**Description:**  
Counts how many elements in an integer array are divisible by each number from 1 to 9.

### Examples

**Case 1: Input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30}**  
Output: `{1=11, 2=8, 3=4, 4=4, 5=3, 6=2, 7=0, 8=1, 9=1}`

**Case 2: Input = {2, 4, 9, 18, 27, 36}**  
Output: `{1=6, 2=3, 3=5, 4=2, 5=0, 6=3, 7=0, 8=0, 9=3}`

**Case 3: Input = { }**  
Output: `Array has no elements`
