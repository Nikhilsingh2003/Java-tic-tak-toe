# My Tic-Tac-Toe Board Printer

This Java project contains a simple program for printing a Tic-Tac-Toe board to the console.

## Code Overview

The main functionality is provided by the `printTicTacToeBoard` method in the `Main` class. This method takes a two-dimensional character array (`board`) representing the Tic-Tac-Toe board as input and prints it to the console in a user-friendly format.

## Usage

To use this code, simply call the `printTicTacToeBoard` method with your Tic-Tac-Toe board as an argument. Here's an example:

```
char[][] board = {
    {'X', 'O', 'X'},
    {'O', 'X', 'O'},
    {'X', 'X', 'O'}
};

printTicTacToeBoard(board);
``` 
## This will print the following Tic-Tac-Toe board to the console:
```
X | O | X
---------
O | X | O
---------
X | X | O
```

## Learning Points
While working on this project, I learned the following:

How to create a two-dimensional character array in Java.
Iterating through a two-dimensional array using nested loops.
Formatting console output to display a Tic-Tac-Toe board.