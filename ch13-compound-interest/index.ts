import Investiment from "./InvestimentCompound";

import In from "../utils/Input";
import { Printer } from "../utils/utils";

function main(id: number, title: string) {
  Printer.openMsg(id, title);

  const amount = In.readNumber("What is the principal amount? ");
  const rate = In.readNumber("What is the rate? ");
  const years = In.readNumber("What is the number of year? ");
  const compound = In.readNumber(
    "What is the number of times the interest is compounded per year? "
  );

  const inv = new Investiment(amount, rate, years, compound);

  inv.calculateCompound();
  console.log(inv.printWorthCompound());
}

main(13, "Determining Compound Interest");
