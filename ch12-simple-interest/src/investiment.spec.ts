import { describe, expect, it } from "bun:test";
import Investiment from "./Investiment";

describe("Test class Investiment", () => {
  const want = 1758;

  describe("Test static methods: ", () => {
    it("Should calcute the worth of a investiment statcly", () => {
      const investment = {
        amount: 1500,
        rate: 4.3,
        time: 4,
      };

      const { amount, rate, time } = investment;

      const got = Investiment.calculate(amount, rate, time);

      expect(got).toBe(want);
    });
  });

  describe("Test object with state", () => {
    const inv = new Investiment(1500, 4.3, 4);

    it("Should calculate the worth correctly", () => {
      const got = inv.calculate();

      expect(got).toBe(want);
    });

    it("Should print the message of worth correctlty", () => {
      const got = inv.printWorth();
      const want =
        "After 4 years at 4.3%, the investiment will be worth $1758.";

      expect(got).toBe(want);
    });
  });
});
