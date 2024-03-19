# Challenge 11 Currency conversion

At some point, you might have to deal with currency exchange rates, and you’ll need to ensure your calculations are as precise as possible

Write a program that converts currency. Specifically, convert euros to U.S. dollars. Prompt for the amount of money in euros you have, and prompt for the current exchange rate of the euro. Print out the new amount in U.S. dollars. The formula for currency conversion is
![[Pasted image 20240319201847.png]]

where

- Amount to is the amount in U.S. dollars.
- Amount from is the amount in euros.
- Rate from is the current exchange rate in euros.
- Rate to is the current exchange rate of the U.S. dollar.

## Example Output

```console
$ How many euros are you exchanging? 81
$ What is the exchange rate? 137.51
$ 81 euros at an exchange rate of 137.51 is 111.38 U.S. dollars.
```

## Constraints

- Ensure that fractions of a center are rounded up to the next penny.
- Use a single output statement.

## Challenges

- [ ] Build a dictionary of conversion rates and prompt for the countries instead of the rates.
- [ ] Wire up your application to an external API1 that provides the current exchange rates

## Tests

- **Input**: AmountFrom, RateFrom
- **Process**: ConvertTo(AmountFrom, RateFrom, RateTo) : AmountTo
- **Output**: AmountTo.
