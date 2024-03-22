import { Printer } from "../utils/Printer";

function main(id: number, title: string): void {
  const msg = `Challenge ${id} - ${title}!`;
  Printer.open(msg);
}

// Start the Program!
main(12, "Compute Simple Interest");
