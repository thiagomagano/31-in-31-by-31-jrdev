import { describe, expect, it } from "bun:test";
import Investiment from "./Investiment";

describe("Investiment()", () => {
  it("Should calcute the worth of a investiment", () => {
    const want = 1758;

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
