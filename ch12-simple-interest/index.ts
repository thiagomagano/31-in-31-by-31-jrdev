import { Printer } from "../utils/Printer";
import In from "../utils/Input";
import Investiment from "./src/Investiment";

function main(id: number, title: string): void {
  Printer.open(`Challenge ${id} - ${title}!`);

  const amount = In.readNumber("Enter the principal: ");
  const rate = In.readNumber("Enter the rate of interest: ");
  const time = In.readNumber("Enter the number of years: ");

  const inv = new Investiment(amount, rate, time);

  console.log(inv.printWorth());
}

// Start the Program!
main(12, "Compute Simple Interest");
