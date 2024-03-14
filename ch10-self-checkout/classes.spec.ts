import { describe, it, expect } from "bun:test";
import { Checkout, Item } from "./classes";

const item1 = new Item(25);
const item2 = new Item(10);
const item3 = new Item(4);

const checkout = new Checkout();

checkout.addItem(item1, 2);
checkout.addItem(item2, 1);
checkout.addItem(item3, 1);

describe("Testing Checkout methods", () => {
  it("Calc Subtotal", () => {
    expect(checkout.getSubTotal()).toBe(64);
  });
  it("Calc Tax", () => {
    expect(checkout.getTax()).toBe(3.52);
  });
  it("Calc Total", () => {
    expect(checkout.getTotal()).toBe(67.52);
  });
});
