export interface Iitem {
  price: number;

  getAsMoney(): string;
}

export interface IcheckoutItem {
  item: Item;
  qtd: number;

  getTotal(): number;
  getTotalAsMoney(): string;
}

export interface Icheckout {
  items: IcheckoutItem[];
  TAX_RATE: number;

  subtotal: number;
  tax: number;
  total: number;

  calcSubTotal(): number;
  calcTax(): number;
  calcTotal(): number;
}
