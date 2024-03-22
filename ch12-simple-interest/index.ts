import { Printer } from "../utils/Printer";

function main(id: number, title: string) {
  const openMsg = `Challenge ${id} - ${title}!`;
  Printer.open(openMsg);
}

main(12, "Compute Simple Interest");
