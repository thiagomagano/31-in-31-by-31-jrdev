# 12. Computing Simple Interest 

## The Problem

> Computing simple interest is a great way to quickly figure out whether an investment has value. It’s also a good way to get comfortable with explicitly coding the order of operations in your programs
> 
> Create a program that computes simple interest. Prompt for the principal amount, the rate as a percentage, and the time, and display the amount accrued (principal + interest).
> The formula for simple interest is A = P(1 + rt), where P is the principal amount, r is the annual rate of interest, t is the number of years the amount is invested, and A is the amount at the end of the investment.

## Example Output
```console
$ Enter the principal: 1500
$ Enter the rate of interest: 4.3
$ Enter the number of years: 4

$ After 4 years at 4.3%, the investiment will be worth $1758.
```

## Constraints

* Prompt for the rate as percentage (like 15, not .15)
* Ensure that fractions of a cent are rounded up to the next penny.
* Ensure that the output is formatted as money

## Challenges

* Ensure that the values entered for principal, rate, and number of years are numeric and that the program will not let the user proceed without valid inputs.
* Alter the program to use a function called calculateSimpleInterest that takes in the rate, principal, and number of years and returns the amount at the end of the investment
* In addition to printing out the final amount, print out the amount at the end of each year.

---

## Thinking About the problem

* **Inputs**
	* `principalAmount`, `anualRate`, `years`
* **Process**
	* `calcInvestmentWorth()`
		```javascript 
		const iw = principalAmount * (1 + (anualRate * years))
		``` 

* **Outputs**
	* `InvestmentWorth`, `print`
* **Tests**
	* "It should calculate the worth of a investment"
	* want: 1758
	* got: investiment.calculate(1500, 4.3, 4)
	* expect(got).toBe(want);