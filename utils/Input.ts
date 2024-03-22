export default class Input {
  public static readNumber(msg: string): number {
    let input = prompt(msg);
    let converted = Number(input);

    while (Number.isNaN(converted)) {
      console.log("Precisa ser um número válido");
      input = prompt(msg);
      converted = Number(input);
    }

    return converted;
  }
}
