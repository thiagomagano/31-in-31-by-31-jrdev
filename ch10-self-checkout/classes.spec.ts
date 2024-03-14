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
  it("Should add itens to checkout", () => {
    const newCheckout = new Checkout();
    newCheckout.addItem(item1, 5);

    expect(newCheckout.getItems()).toHaveLength(5);
  });

  it("Should Calculate Subtotal correctly", () => {
    expect(checkout.getSubTotal()).toBe(64);
  });
  it("Should Calculate Tax correctly", () => {
    expect(checkout.getTax()).toBe(3.52);
  });
  it("Should Calculate Total correctly", () => {
    expect(checkout.getTotal()).toBe(67.52);
  });
});
