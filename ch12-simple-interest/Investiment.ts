export default class Investiment {
  readonly amount: number;
  readonly rate: number;
  readonly time: number;

  readonly worth: number;

  constructor(amount: number, rate: number, time: number) {
    this.amount = amount;
    this.rate = rate;
    this.time = time;

    this.worth = this.calculate();
  }

  public calculate(): number {
    return this.amount * (1 + (this.rate / 100) * this.time);
  }

  public static calculate(amount: number, rate: number, time: number): number {
    return amount * (1 + (rate / 100) * time);
  }

  public printWorth(): string {
    return `After ${this.time} years at ${this.rate}%, the investiment will be worth $${this.worth}.`;
  }
}
