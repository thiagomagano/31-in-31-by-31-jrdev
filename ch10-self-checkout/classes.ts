import { BRL } from "./utils";

export class Item {
  price: number;

  constructor(price: number) {
    this.price = price;
  }

  public getAsMoney(): string {
    return BRL.convert(this.price);
  }
}

export class Checkout {
  private items: Item[];
  readonly TAX_RATE = 5.5;

  private subtotal: number;
  private tax: number;
  private total: number;

  constructor() {
    this.items = [];
    this.subtotal = 0;
    this.tax = 0;
    this.total = 0;
  }

  addItem(item: Item, qtd: number): void {
    for (let i = 0; i < qtd; i++) {
      this.items.push(item);
    }
  }

  listItems(): void {
    this.items.forEach((item) => console.table(item));
  }

  calcSubTotal(): void {
    this.items.forEach((item) => (this.subtotal = this.subtotal + item.price));
  }

  calcTax(): void {
    this.tax = this.subtotal * (this.TAX_RATE / 100);
  }

  calcTotal(): void {
    this.total = this.subtotal + this.tax;
  }

  getSubTotal(): number {
    this.calcSubTotal();
    return this.subtotal;
  }
  getTax(): number {
    this.calcTax();
    return this.tax;
  }
  getTotal(): number {
    this.calcTotal();
    return this.total;
  }

  // Static Methods

  static calcSubTotal(itens: Item[]): number {
    let subTotal = 0;
    itens.forEach((item) => (subTotal = subTotal + item.price));
    return subTotal;
  }
  static calcTax(amount: number, taxRate: number): number {
    return amount * (taxRate / 100);
  }

  static calcTotal(subtotal: number, tax: number): number {
    return subtotal + tax;
  }
}
