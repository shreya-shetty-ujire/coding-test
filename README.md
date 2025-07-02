##  Programming Language

The programs are written in **Java**.

# Problem 1 - Basic Calculator

---

## Description

`Program1.java` is a simple calculator that supports four basic arithmetic operations: Addition, Subtraction, Multiplication, Division

The class uses a constructor to initialize input values and a method to perform calculations based on the selected operation. The inputs are:
- Two `double` numbers (operands)
- One `String` specifying the operation

---

## 📥 Input Format

Inputs are passed via object creation


####  Case 1: Valid Addition
**Input:**
a = 10.5 b = 2.0 operation ="addition"
**Output:**
Result: 12.5
---

#### Case 2: Valid Division  
**Input:**  
a = 10.0, b = 2.0, operation = `"division"`  
**Output:**  
`Result: 5.0`  
**Explanation:** Performs division (a ÷ b) when b is not zero.

---

####  Case 3: Division by Zero  
**Input:**  
a = 10.0, b = 0.0, operation = `"division"`  
**Output:**  
`Cannot divide by zero, Result: -1.0`  
**Explanation:** The program checks if `b == 0`. If true, it prints an error message and returns `-1.0` to indicate failure.

---

#### Case 4: Invalid Operation  
**Input:**  
a = 10.0, b = 2.0, operation = `"modulus"`  
**Output:**  
`Invalid operation type: modulus, Result: -1.0`  
**Explanation:** If the operation doesn't match any of the valid cases, it prints an error and returns `-1.0`.

-------------------------------------------

# Problem 2 - Odd Number Series Generator

This program generates a sequence of the first `a` **odd numbers** starting from 1.  
It takes an integer input from the user and prints `a` odd numbers in a comma-separated format.

---

## Output Behavior & Edge Cases

#### Case 1: Input = 1  
**Input:**  
`a = 1`  
**Output:**  
`Output: 1`  
**Explanation:** Only the first odd number is printed.

---

#### Case 2: Input = 3  
**Input:**  
`a = 3`  
**Output:**  
`Output: 1, 3, 5`  
**Explanation:** Prints the first 3 odd numbers starting from 1.

---

#### Case 3: Input = 0  
**Input:**  
`a = 0`  
**Output:**  
`Output:`  
**Explanation:** No numbers are printed. The loop doesn't execute.

---

#### Case 4: Input = -3 (Negative number)  
**Input:**  
`a = -3`  
**Output:**  
`Please enter a non-negative integer`  
**Explanation:** Negative input is rejected with a message and program terminates.

--------------------------------------------------------------------------------

# Problem 3 - Odd Number Series

## Behavior & Edge Cases

#### Case 1: Input = 5  
**Output:**  
`Output: 1, 3, 5, 7, 9`  
**Explanation:** Since 5 is odd, it prints 5 odd numbers.

---

#### Case 3: Input = 0  
**Output:**  
`Output:`  
**Explanation:** Zero input results in no numbers printed.

---

#### Case 4: Input = -2  
**Output:**  
`Please enter a non-negative integer`  
**Explanation:** Program handles negative input with a validation message.

-----------------------------------------------------------------------------
# Program4 - Multiples Count Map

## Description

This program takes an array of integers and calculates how many elements in the array are divisible by each number from 1 to 9. It returns a map of divisor → count of multiples.

### Case 1: Input = `{1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30}`  
**Output:**  
`{1=11, 2=8, 3=4, 4=4, 5=3, 6=2, 7=0, 8=1, 9=1}`  
**Explanation:** Each key (1 to 9) shows how many numbers in the array are divisible by it.

---

#### Case 3: Input = `{}`  
**Output:**  
`Array has no elements`  
**Explanation:** The method prints a warning if the input array is empty.

---

