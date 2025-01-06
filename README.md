
# Sudoku Solver

This project implements a Sudoku Solver in Java. The program takes a 9x9 Sudoku board as input, where empty cells are represented by a `.` character. It solves the Sudoku puzzle using a backtracking algorithm and prints the solved board if a solution exists.

## Features

- Accepts user input for a 9x9 Sudoku puzzle.
- Validates the placement of numbers according to Sudoku rules.
- Solves the puzzle using a recursive backtracking algorithm.
- Displays the original and solved Sudoku boards in a formatted style.

## How It Works

1. The program reads a 9x9 Sudoku board from the user.
2. It uses a backtracking algorithm to solve the puzzle:
   - Checks if a number can be safely placed in an empty cell.
   - If safe, places the number and recursively attempts to solve the rest of the board.
   - If no solution is possible, backtracks and tries the next number.
3. Prints the solved Sudoku board or notifies the user if no solution exists.

## Input Format

- Enter the Sudoku puzzle row by row.
- Use `.` to represent empty cells.
- Each row should have exactly 9 characters.

### Example Input:
```
53..7....
6..195...
.98....6.
8...6...3
4..8.3..1
7...2...6
.6....28.
...419..5
....8..79
```

## Output Format

The program will display the original and solved Sudoku boards in a formatted grid:

### Original Sudoku Board:
```
+-------+-------+-------+
| 5 3 . | . 7 . | . . . |
| 6 . . | 1 9 5 | . . . |
| . 9 8 | . . . | . 6 . |
|-------+-------+-------|
| 8 . . | . 6 . | . . 3 |
| 4 . . | 8 . 3 | . . 1 |
| 7 . . | . 2 . | . . 6 |
|-------+-------+-------|
| . 6 . | . . . | 2 8 . |
| . . . | 4 1 9 | . . 5 |
| . . . | . 8 . | . 7 9 |
+-------+-------+-------+
```

### Solved Sudoku Board:
```
+-------+-------+-------+
| 5 3 4 | 6 7 8 | 9 1 2 |
| 6 7 2 | 1 9 5 | 3 4 8 |
| 1 9 8 | 3 4 2 | 5 6 7 |
|-------+-------+-------|
| 8 5 9 | 7 6 1 | 4 2 3 |
| 4 2 6 | 8 5 3 | 7 9 1 |
| 7 1 3 | 9 2 4 | 8 5 6 |
|-------+-------+-------|
| 9 6 1 | 5 3 7 | 2 8 4 |
| 2 8 7 | 4 1 9 | 6 3 5 |
| 3 4 5 | 2 8 6 | 1 7 9 |
+-------+-------+-------+
```

## How to Run

1. Clone this repository or copy the code into your Java IDE.
2. Compile the program:
   ```
   javac sudoku.java
   ```
3. Run the program:
   ```
   java sudoku
   ```
4. Enter the Sudoku puzzle row by row as prompted.
5. View the solution or an appropriate message if no solution exists.

## Algorithm Details

### `isSafe` Method
- Checks if placing a number in a specific cell violates Sudoku rules (row, column, or 3x3 grid).

### `helper` Method
- Implements the recursive backtracking logic.
- Tries all numbers from 1 to 9 in each empty cell and proceeds recursively.
- Backtracks if no valid number can be placed.

### `solveSudoku` Method
- Wrapper method to initiate the solving process.

### `printBoard` Method
- Displays the board in a neatly formatted grid.

## Example Usage

### Input:
```
53..7....
6..195...
.98....6.
8...6...3
4..8.3..1
7...2...6
.6....28.
...419..5
....8..79
```

### Output:
```
Original Sudoku Board:
+-------+-------+-------+
| 5 3 . | . 7 . | . . . |
| 6 . . | 1 9 5 | . . . |
| . 9 8 | . . . | . 6 . |
|-------+-------+-------|
| 8 . . | . 6 . | . . 3 |
| 4 . . | 8 . 3 | . . 1 |
| 7 . . | . 2 . | . . 6 |
|-------+-------+-------|
| . 6 . | . . . | 2 8 . |
| . . . | 4 1 9 | . . 5 |
| . . . | . 8 . | . 7 9 |
+-------+-------+-------+

Solved Sudoku Board:
+-------+-------+-------+
| 5 3 4 | 6 7 8 | 9 1 2 |
| 6 7 2 | 1 9 5 | 3 4 8 |
| 1 9 8 | 3 4 2 | 5 6 7 |
|-------+-------+-------|
| 8 5 9 | 7 6 1 | 4 2 3 |
| 4 2 6 | 8 5 3 | 7 9 1 |
| 7 1 3 | 9 2 4 | 8 5 6 |
|-------+-------+-------|
| 9 6 1 | 5 3 7 | 2 8 4 |
| 2 8 7 | 4 1 9 | 6 3 5 |
| 3 4 5 | 2 8 6 | 1 7 9 |
+-------+-------+-------+
```

