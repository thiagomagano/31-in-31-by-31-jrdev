# 03. Printing Quotes

>Quotation marks are often used to denote the start and end of a string. But sometimes we need to print out the quotation marks themselves by using escape characters. 
>Create a program that prompts for a quote and an author. Display the quotation and author as shown in the example output

## Example Output

```console
What is the quote? These aren't the droids you're looing for.
Who said it? Obi-Wan Kenobi
Obi-Wan Kenobi says, "These aren't the droid you're looking for."
```

## Constraints

- Use a single output statement to produce this output, using appropriate string-escaping techniques for quotes.
- If your language supports string interpolation or string substitution, don’t use it for this exercise. Use string concatenation instead.

## Analizing

Input: Quote, WhoSaid
Process: Make quote marks apper in the string.
output: a frase with his author

## Tests

input: These aren't the droids you're looing for, Obi-Wan-Kenobi
expected: Obi-Wan Kenobi Says, "These aren't the droids you're looking for"

Test in this string must have quote marks.

## Extra Challenge

- [x] Modify this program so that instead of prompting for quotes from the user, you create a structure that holds quotes and their associated attributions and then display all of the quotes using the format in the example. An array of maps would be a good choice.