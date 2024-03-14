import { expect, test } from "bun:test";
import { BRL } from "./utils";

test("Testando Conversão de Numeros em dinheiro: ", () => {
  expect(BRL.convert(1234)).toContain("R$ 1.234,00");
});
