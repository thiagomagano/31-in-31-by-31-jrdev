import { BRL } from "./utils";
import type { Icheckout, Iitem, IcheckoutItem } from "./interfaces";

export class Item implements Iitem {
  price: number;

  constructor(price: number) {
    this.price = price;
  }

  public getAsMoney(): string {
    return BRL.convert(this.price);
  }
}

export class CheckoutItem implements IcheckoutItem {
  item: Item;
  qtd: number;

  constructor(i: Item, qtd: number) {
    this.item = i;
    this.qtd = qtd;
  }
  getTotal(): number {
    return this.item.price * this.qtd;
  }

  getTotalAsMoney(): string {
    const total = this.getTotal();
    return BRL.convert(total);
  }
}

export class Checkout implements Icheckout {
  items: IcheckoutItem[];
  readonly TAX_RATE = 5.5;

  subtotal: number;
  tax: number;
  total: number;

  constructor(items: IcheckoutItem[]) {
    this.items = items;
    this.subtotal = this.calcSubTotal();
    this.tax = this.calcTax();
    this.total = this.calcTotal();
  }

  calcSubTotal(): number {
    let subTotal = 0;

    this.items.forEach((item) => (subTotal = subTotal + item.getTotal()));

    return subTotal;
  }

  calcTax(): number {
    return this.subtotal * (this.TAX_RATE / 100);
  }

  calcTotal(): number {
    return this.subtotal + this.tax;
  }
}
