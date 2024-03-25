import Printer from "../utils/Printer";

function main(id: number, title: string): void {
  Printer.open(`Challenge ${id} - ${title}`);
}

main(14, "Tax Calculator");
