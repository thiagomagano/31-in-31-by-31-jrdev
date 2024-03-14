import { describe, it, expect } from "bun:test";
import { Checkout, CheckoutItem, Item } from "./classes";

const item1 = new Item(25);
const item2 = new Item(10);
const item3 = new Item(4);

const coItem1 = new CheckoutItem(item1, 2);
const coItem2 = new CheckoutItem(item2, 1);
const coItem3 = new CheckoutItem(item3, 1);

const checkout = new Checkout([coItem1, coItem2, coItem3]);

describe("Testing Checkout methods", () => {
  it("Calc Subtotal", () => {
    expect(checkout.calcSubTotal()).toBe(64);
  });
  it("Calc Tax", () => {
    expect(checkout.calcTax()).toBe(3.52);
  });
  it("Calc Total", () => {
    expect(checkout.calcTotal()).toBe(67.52);
  });
});
