import Money from "../utils/Money";

export default class TaxCalculator {
  state: string = "OTHER";
  taxRate: number = 0;
  constructor(state: string) {
    // Winscoinsin tax rate constant
    const WI_TAXT_RATE = 5.5;

    // Normalize all inputs to uppercase;
    this.state = state.toUpperCase();

    if (this.state === "WI") this.taxRate = WI_TAXT_RATE;
  }

  calculate(amount: number, rate?: number): number {
    let total = 0;
    let calcRate = this.taxRate;

    if (rate) {
      calcRate = rate;
    }
    total = amount * (1 + calcRate / 100);

    return Money.round(total);
  }
}
