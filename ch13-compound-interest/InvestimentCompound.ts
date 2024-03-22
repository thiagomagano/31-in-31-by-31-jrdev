import Investiment from "../ch12-simple-interest/src/Investiment";
import Money from "../utils/Money";

export default class InvestimetCompound extends Investiment {
  readonly timesCompound: number;
  readonly worthCompound: number;

  constructor(amount: number, rate: number, year: number, times: number) {
    super(amount, rate, year);

    this.timesCompound = times;
    this.worthCompound = this.calculateCompound();
  }

  public static calculateCompound(
    amount: number,
    rate: number,
    years: number,
    compound: number
  ): number {
    const r = rate / 100;
    const worth = amount * Math.pow(1 + r / compound, compound * years);
    return Money.round(worth);
  }

  public calculateCompound(): number {
    const r = this.rate / 100;
    const worth =
      this.amount *
      Math.pow(1 + r / this.timesCompound, this.timesCompound * this.time);

    return Money.round(worth);
  }

  public printWorthCompound(): string {
    return `$${this.amount} invested at ${this.rate}% for ${
      this.time
    } years compounded ${
      this.timesCompound
    } times per year is $${this.calculateCompound()}.`;
  }
}
