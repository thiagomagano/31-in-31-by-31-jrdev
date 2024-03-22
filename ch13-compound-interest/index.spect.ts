import { describe, it, expect } from "bun:test";

describe("Test Investimet class", () => {
  const want = 1938.84;

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
    const got = Investment.calculateCompound(
      amount,
      rate,
      timeYears,
      timeCompound
    );

    expect(got).toBe(want);
  });
});
