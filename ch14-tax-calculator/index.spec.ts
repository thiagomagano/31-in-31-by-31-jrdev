import { describe, it, expect } from "bun:test";
import TaxCalculator from "./TaxCalculator";

describe("Tax Calculator", () => {
  it("Should calculate the tax correctly", () => {
    const tax = new TaxCalculator();
    const want = 10.55;
    const got = tax.calculate(10);

    expect(got).toBe(want);
  });
});
