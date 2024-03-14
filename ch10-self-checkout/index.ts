import { Item, Checkout } from "./classes";
import { BRL } from "./utils";

const item1 = new Item(25);
const item2 = new Item(10);
const item3 = new Item(4);

const checkout = new Checkout();

checkout.addItem(item1, 2);
checkout.addItem(item2, 1);
checkout.addItem(item3, 1);

checkout.listItems();

console.log("Subtotal: ", BRL.convert(checkout.getSubTotal()));

console.log("Tax: ", BRL.convert(checkout.getTax()));

console.log("Subtotal: ", BRL.convert(checkout.getTotal()));
