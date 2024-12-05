package com.perscholas.java.sudoku;

public class SudokuSolver {
    private static final int GRID_SIZE = 9;

    public static void main(String[] args) {

        int[][] board = {
                {7, 0, 0, 0, 0, 0, 2, 0, 0},
                {0, 8, 0, 0, 0, 7, 0, 9, 0},
                {0, 0, 0, 6, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 4, 0},
                {0, 0, 0, 0, 5, 0, 0, 0, 0},
                {0, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 9, 0, 4, 0, 0, 0, 3, 0},
                {0, 0, 2, 0, 0, 0, 0, 0, 8}
        };

        System.out.println("\nOriginal Sudoku Board:");
        printBoard(board);

        if (solveBoard(board)) {
            System.out.println("\nSolved Sudoku Board:");
            printBoard(board);
        } else {
            System.out.println("\nThis Sudoku puzzle cannot be solved.");
        }
    }

    private static boolean solveBoard(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                if (board[row][col] == 0) {
                    for (int num = 1; num <= GRID_SIZE; num++) {
                        if (isValidPlacement(board, num, row, col)) {
                            board[row][col] = num;
                            if (solveBoard(board)) {
                                return true;
                            }
                            board[row][col] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private static boolean isValidPlacement(int[][] board, int number, int row, int col) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == number) {
                return false;
            }
        }
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[i][col] == number) {
                return false;
            }
        }
        int localBoxRow = row - row % 3;
        int localBoxCol = col - col % 3;

        for (int i = localBoxRow; i < localBoxRow + 3; i++) {
            for (int j = localBoxCol; j < localBoxCol + 3; j++) {
                if (board[i][j] == number) {
                    return false;
                }
            }
        }

        return true;
    }
    private static void printBoard(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("-----------");
            }
            for (int col = 0; col < GRID_SIZE; col++) {
                if (col % 3 == 0 && col != 0) {
                    System.out.print("|");
                }
                System.out.print(board[row][col] == 0 ? " " : board[row][col]);
            }
            System.out.println();
        }
    }
}