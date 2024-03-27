export class Printer {
  public static stars(message: string): void {
    for (const w of message) {
      process.stdout.write("*");
      if (w === message.at(-1)) {
        process.stdout.write("\n");
      }
    }
  }
  public static openMsg(id: number, title: string): void {
    const message = `Challenge ${id} - ${title}!`;

    this.stars(message);
    console.log(message);
    this.stars(message);
    console.log("");
  }
}

export class Money {
  public static round(amount: number): number {
    return Math.ceil(amount * 100) / 100;
  }
}

export class BRL {
  private static readonly options = {
    style: "currency",
    currency: "BRL",
    minimumFractionDigits: 2,
    maximumFractionDigits: 3,
  };

  static convert(amount: number): string {
    const formatter = new Intl.NumberFormat("pt-BR", this.options);

    return formatter.format(amount);
  }
}
