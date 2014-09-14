# Legibility
A legible program is one whose meaning is clear when it's read by someone who didn't write it. (Or, soemtimes, by you; code has a nasty habit of turning into gibberish when it's left alone for a few hours.) The goal of a legible program is that people *and* computers can read it.

Using sensible variable and method names is one of the fastest ways to make your code more legible. Here's a few hints:

1. Use verb phrases for methods that perform an action or change a variable, e.g. `convertTemperatureToCelsius`
2. Use descriptive nouns for variables, e.g. `double dinnerTime` or `boolean isRaining` or `int playersAge`.
3. Java convention is writing variables with multiple words in camelCase: remove the spaces, lower case the first word, and capitalize the first letter of all the subsequent words.