import Printer from "../utils/Printer";
import In from "../utils/Input";
import TaxCalculator from "./TaxCalculator";

export function main(id: number, title: string): void {
  Printer.open(`Challenge ${id} - ${title}`);

  const inputAmount = In.readNumber("What is the order amount? ");
  const inputState = prompt("What is the state? ");

  const tax = new TaxCalculator(inputState as string);

  const subtotal = inputAmount;
  const total = tax.calculate(inputAmount);
  const taxAmount = total - subtotal;

  if (taxAmount !== 0) {
    console.log(`The subtotal is $${subtotal}`);
    console.log(`The tax is $${taxAmount.toFixed(2)}`);
  }

  console.log(`The total is $${total}`);
}

main(14, "Tax Calculator");
