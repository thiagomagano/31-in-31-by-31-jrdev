export default abstract class Money {
  public static round(amount: number): number {
    return Math.ceil(amount * 100) / 100;
  }
}
