# Java Tutorial

There's a lot of tutorials out there, so here's another one.  
Originally made as a supplement to this YouTube video: xxx

Splits Java up into different **Levels** (sounds more fun), see [Levels](#Levels) below.  
Each **Level** also has multiple exercises associated with them, see [Exercises](#Exercises) below.

## Usage

Here's my recommended usage of this resource:
1. Find another Java tutorial (or use the video posted above).
2. Use this resource as a reference page / notes.
3. Code! Code! Code!
4. If you forget something while coding, use this as a refresher.

Working on projects will be the best way to learn all the material.
If you're like me (and can't ever think of projects to work on), I listed
numerous [exercises](#Exercises) to supplement this supplement.

Be consistent - good luck!

## Levels

<details><summary>Level 1 Topics</summary><p>

- **Comments**                   (single/multiline)
- **Variables**                  (declaration vs. initialization)
- **Operators**                  (assignment, arithmetic, unary)
- **Console I/O**                (System.out.println() and Scanner class)
- **Data types**                 (primitives vs. references)
- **Casting**                    (narrowing vs. widening)
- **Overflow**                   (& how to avoid it)
- **Common Math/String methods** (more can be found online)
- **Random class**               (+ how to get a random number between two values)

</p></details>

<details><summary>Level 2 Topics</summary><p>

- **If statements**     (if...else-if...else ladder)
- **Operators**         (relational, logical)
- **Short circuiting**  (concept)
- **== vs. equals()**   (equality of primitives vs. references)
- **Tenary operators**  (single line if statements)
- **Switch statements** (+ break keyword)

</p></details>

# Exercises

<details><summary>Level 1 Exercises</summary><p>

```
Exercise: TemperatureConversion
Difficulty: Easy

Let the user input an integer, temp, that represents a temperature in Fahrenheit.  
Convert the given temperature from Fahrenheit to Celsius (Google the equation) and print out the result.
	
Temperature in °F: 102
It is currently 38.88°C outside!
```
	
```
Exercise: SpecialNumber
Difficulty: Easy

Let the user input an integer, max, that represents a maximum number.
Generate a random number, x, in the range [0, max].
Square root x, round to the nearest whole number, and print out the result.

Input a number: 9
Your random number is 7.
Your special number is 3! 
```

```
Exercise: PizzaDay
Difficulty: Hard

Let the user input two integers, pizzaSlices and pizzaEaters, that represent the number of pizza slices and pizza eaters, respectively.
Let the user input a string, name, that represents your name.

Calculate the average amount of pizza slices each pizza eater can eat.
All pizza eaters (except you) can only eat the average amount of slices, rounded down.
Print out the maximum number of pizza slices you can eat.

Optional Constraints:
 - First letter of name should be capitalized. All other letters should be lowercased.
 - The resulting number (maximum pizza slices you can eat) should be an integer. It should not end in ".0".

Slices of pizza: 24
Number of pizza eaters: 5
Your name: Colin

Colin can eat up to 8 slices of pizza!
```

</p></details>
