import { Printer } from "../utils/utils";

export interface User {
  username: string;
  password: string;
}

const listUsers: Array<User> = [
  { username: "thi", password: "12345" },
  { username: "magano", password: "5678" },
];

const mapUsers = new Map<User["username"], User["password"]>();

mapUsers.set("thi", "1234");
mapUsers.set("magano", "5678");

console.table(mapUsers);

export function checkPassword(users: Map<string, string>, user: User) {
  const found = users.has(user.username);

  if (found) {
    return users.get(user.username) === user.password;
  }

  return false;
}

function main(id: number, title: string): void {
  Printer.openMsg(id, title);
}

main(15, "Password Validation");
