# Challenge 15 - Password Validation

Passwords are validated by comparing a user-provided value with a known value that’s stored. Either it’s correct or it’s not.

Create a simple program that validates userlogin credentials. The program must prompt the user for a username and password. The program should compare the password given by the user to a known password. If the password matches, the program should display “Welcome!” If it doesn’t match, the program should display “I don’t know you.”

## Example Output

```console
What is the password? 12345
I don't know you
```

OR

```console
What is the password? 12345
Welcome!
```

## Constraints

- Use an if/else statement for this problem.
- Make sure the program is case sensitive.

## Challenges

- [ ] Investigate how you can prevent the password from being displayed on the screen in clear text when typed.
- [ ] Create a map of usernames and passwords and ensure the username and password combinations match
- [ ] Encode the passwords using _Bcrypt_ and store the hashes in the map instead of the clear-text passwords. Then, when you prompt for the password, encrypt the password using _Bcrypt_ and compare it with the value in your map

---

## Thinking the problem
