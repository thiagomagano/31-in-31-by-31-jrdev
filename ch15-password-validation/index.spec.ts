import { describe, it, expect } from "bun:test";
import { checkPassword } from ".";
import type { User } from ".";

describe("UserLogin()", () => {
  const mockUsers = new Map<string, string>();

  mockUsers.set("thi", "1234");
  mockUsers.set("magano", "5678");

  describe("Should check password correctly", () => {
    it("With correct password", () => {
      const user: User = {
        username: "thi",
        password: "1234",
      };

      const got = checkPassword(mockUsers, user);

      expect(got).toBeTrue();
    });

    it("With incorrect password", () => {
      const user: User = {
        username: "thi",
        password: "incorrect",
      };

      const got = checkPassword(mockUsers, user);

      expect(got).toBeFalsy();
    });

    it("With incorrect user", () => {
      const user: User = {
        username: "Incorrect User",
        password: "12345",
      };

      const got = checkPassword(mockUsers, user);

      expect(got).toBeFalsy();
    });
  });
});
