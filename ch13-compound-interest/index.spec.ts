import { describe, it, expect } from "bun:test";
import Investiment from "./InvestimentCompound";

describe("Test Investimet class", () => {
  const want = 1938.84;

  describe("Static Methods", () => {
    it("Should calculate compound interest", () => {
      //mock
      const investiment = {
        amount: 1500,
        rate: 4.3,
        timeYears: 6,
        timeCompound: 4,
      };

      // destructing
      const { amount, rate, timeYears, timeCompound } = investiment;

      //calling the class with static method calculate
      const got = Investiment.calculateCompound(
        amount,
        rate,
        timeYears,
        timeCompound
      );

      expect(got).toBe(want);
    });

    describe("Objects with state", () => {
      const inv = new Investiment(1500, 4.3, 6, 4);

      it("Should calculate the worth of compound interest: ", () => {
        const got = inv.calculateCompound();

        expect(got).toBe(want);
      });

      it("Should printh message correctly", () => {
        const want =
          "$1500 invested at 4.3% for 6 years compounded 4 times per year is $1938.84.";
        const got = inv.printWorthCompound();

        expect(got).toBe(want);
      });
    });
  });
});
