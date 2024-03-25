export default class Printer {
  public static stars(message: string): void {
    for (const w of message) {
      process.stdout.write("*");
      if (w === message.at(-1)) {
        process.stdout.write("\n");
      }
    }
  }
  public static open(message: string): void {
    console.log("");
    this.stars(message);
    console.log(message);
    this.stars(message);
    console.log("");
  }
}
