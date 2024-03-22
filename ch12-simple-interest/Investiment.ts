export default class Investiment {
  public static calculate(amount: number, rate: number, time: number): number {
    return amount * (1 + (rate / 100) * time);
  }
}
