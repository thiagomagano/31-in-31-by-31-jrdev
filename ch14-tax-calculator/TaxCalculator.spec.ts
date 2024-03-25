import { describe, it, expect } from "bun:test";
import TaxCalculator from "./TaxCalculator";

describe("Tax Calculator", () => {
  describe("Should calculate the tax correctly with WI state", () => {
    const tax = new TaxCalculator("WI");

    it("With no tax rate", () => {
      const want = 10.55;
      const got = tax.calculate(10);

      expect(got).toBe(want);
    });

    it("Given a tax rate", () => {
      const want = 10.55;

      const amount = 10;
      const taxRate = 5.5;

      const got = tax.calculate(amount, taxRate);

      expect(got).toBe(want);
    });
  });
  describe("Should saved the state correctly", () => {
    const want = "WI";

    it("Given a lower case WI", () => {
      const tax = new TaxCalculator("wi");
      const got = tax.state;

      expect(got).toBe(want);
    });
    it("Given a camel case WI", () => {
      const tax = new TaxCalculator("Wi");
      const got = tax.state;

      expect(got).toBe(want);
    });
  });
});
