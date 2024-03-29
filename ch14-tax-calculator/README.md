# Challenge 14 - Tax Calculator

You don’t always need a complex control structure to solve simple problems. Sometimes a program requires an extra step in one case, but in all other cases there’s nothing to do.

Write a simple program to compute the tax on an order amount. The program should prompt for the order amount and the state. If the state is “WI,” then the order must be charged 5.5% tax. The program should display the subtotal, tax, and total for Wisconsin residents but display just the total for non-residents.

## Example Output

```console
What is the order amount? 10
What is the state? WI
The subtotal is $10.00.
The tax is $0.55.
The total is $10.55
```

OR

```console
What is the order amount? 10
What is the state? MN
The Total is $10.00.
```

## Constraints

- Implement this program using only a simple if statement—don’t use an else clause
- Ensure that all money is rounded up to the nearest cent.
- Use a single output statement at the end of the program to display the program results.

## Challenges

- [x] Allow the user to enter a state abbreviation in upper, lower, or mixed case.
- [x] Also Allow the user to enter the state's full name in upper , lower or mixed case.

---

## Thinking the problem

```typescript
// INPUTS
let amount: number;
const TAX_RATE: number;
let state: string;

//PROCESS;
function calcTax(amount, rate) {}

// OUTPUT
const taxAmount: number;
const subTotal: number;
const total: number;
```
