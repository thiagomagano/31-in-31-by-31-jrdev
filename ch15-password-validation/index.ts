import { Printer } from "../utils/utils";

export interface User {
  username: string;
  password: string;
}

export function checkPassword(users: Map<string, string>, user: User): boolean {
  const found = users.has(user.username);

  if (found) {
    return users.get(user.username) === user.password;
  }
  return false;
}

function main(id: number, title: string): void {
  Printer.openMsg(id, title);

  // Mock Users
  const mapUsers = new Map<string, string>();
  mapUsers.set("thi", "1234");
  mapUsers.set("magano", "5678");

  const username = prompt("What is the username? ") as string;
  const password = prompt("Whats is the password? ") as string;

  const user = { username: username, password: password };

  if (checkPassword(mapUsers, user)) {
    console.log("Welcome");
  } else {
    console.log("I don't know you!");
  }
}
main(15, "Password Validation");
