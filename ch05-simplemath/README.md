# Simple Math

You’ll often write programs that deal with numbers. And depending on the programming language you use, you’ll have to convert the inputs you get to numerical data types. 

Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers as shown in the example output

## Example Output

```console
What is the firt number? 10
What is the second number? 5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2
```

## Constraints

- Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
- Keep the inputs and outputs separate from the numerical conversions and other processing.
- Generate a single output statement with line breaks in the appropriate spots.

## Extra Challenges

- Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
- Don’t allow the user to enter a negative number.
- Break the program into functions.
- Implement this program as a GUI program that automatically updates the values when any value changes.

# Analises

Input: number1, number2
process: add, sub, multi, divide of the two inputs
output: the result of 4 operations

### Test

input:  10, 5
expected: 
	add(10,5)=15
	sub(10,5)=5
	multi(10,5)=50
	divide(10,5)=2