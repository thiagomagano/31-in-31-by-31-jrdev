## 08. Pizza Party

Division isn’t always exact, and sometimes you’ll write programs that will need to deal with the leftovers as a whole number instead of a decimal. 

Write a program to evenly divide pizzas. Prompt for the number of people, the number of pizzas, and the number of slices per pizza. Ensure that the number of pieces comes out even. Display the number of pieces of pizza each person should get. If there are leftovers, show the number of leftover pieces.

## Example Output

```console
How many people? 8 
How many pizzas do you have? 2 

8 people with 2 pizzas Each person gets 2 pieces of pizza. 
There are 0 leftover pieces
```

## Extra Challenges

- Revise the program to ensure that inputs are entered as numeric values. Don't allow the user to process if the value entered is not numeric.
- After the output so it handles pluralization properly
- Create a variant of the program that prompts for the number of people and the number of pieces each person wants, and calculate how many full pizzas you need to purchase.

## Analize

- **Input**: NumbersOfPizza, NumberOfPeople, NumberOfSlices
- **Process**: DividePizzaEvenly, leftover
- **Output**: PiecesForPeople, leftover