import { expect, test } from "bun:test";
import { BRL } from "./utils";

test("Testando Conversão de Numeros em dinheiro: ", () => {
  const received = BRL.convert(1234);
  const expected = "R$ 1.1234,00";

  console.log("type: ", typeof received);
  console.log("type: ", typeof expected);

  expect(BRL.convert(1234)).toBe("R$ 1.234,00");
});
