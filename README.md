[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/lhSoSQoA)
# Experiment 63: File Statistics

## Problem Statement

Write a Java program to read a text file named `sample.txt` and compute the following statistics:
1. Total number of lines.
2. Total number of words (separated by spaces).
3. Total number of characters (excluding newline characters).

Use `FileReader` and `BufferedReader` to process the file line by line.

## Important Note
Assume the input file (`sample.txt`) is present in the working directory alongside your program. 

## Input Format

* No console input. 
* The program reads strictly from `sample.txt`.

## Output Format

Output the statistics exactly in the format below:
```text
Lines: [count]
Words: [count]
Characters: [count]
```

### Example

**Assume `sample.txt` contains:**
```text
Java file I/O is powerful.
It makes data handling easy.
```

**Output:**
```text
Lines: 2
Words: 10
Characters: 54
```
*(Note: Character count is 26 for the first line and 28 for the second line, excluding the hidden newline characters).*
