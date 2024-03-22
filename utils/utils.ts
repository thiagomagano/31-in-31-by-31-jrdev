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
