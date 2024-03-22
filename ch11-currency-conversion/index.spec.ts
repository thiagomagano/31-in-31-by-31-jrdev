import { describe, it, expect } from "bun:test";
import { convert } from ".";

describe("Function convert()", () => {
  it("Should convert Euro to Dollar: ", () => {
    const got = convert(81, 137.51);
    const want = 111.38;

    expect(got).toBe(want);
  });
});
