import { Item, Checkout, CheckoutItem } from "./classes";
import { BRL } from "./utils";

const item1 = new Item(25);
const item2 = new Item(10);
const item3 = new Item(4);

const coItem1 = new CheckoutItem(item1, 2);
const coItem2 = new CheckoutItem(item2, 1);
const coItem3 = new CheckoutItem(item3, 1);

const checkout = new Checkout([coItem1, coItem2, coItem3]);

console.log("SubTotal: ", BRL.convert(checkout.subtotal));
console.log("Tax: ", BRL.convert(checkout.tax));
console.log("Total: ", BRL.convert(checkout.total));
