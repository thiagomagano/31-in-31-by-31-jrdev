export function convert(amount: number, rate: number): number {
  const convertedAmount = amount * (rate / 100);

  return Number(convertedAmount.toFixed(2));
}

const amountFrom = 81;
const rateFrom = 137.51;
const amountTo = convert(amountFrom, rateFrom);

console.log(
  `${amountFrom} euros at an exchange rate of ${rateFrom} is ${amountTo} U.S. dollars.`
);
