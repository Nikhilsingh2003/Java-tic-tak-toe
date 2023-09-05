package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        char[][] board = {
                {'X', 'O', 'X'},
                {'O', 'X', 'O'},
                {'X', 'X', 'O'}
        };

        printTicTacToeBoard(board);
    }
    public static void printTicTacToeBoard(char[][] board){
        for (int row = 0; row < board.length; row++){
            for (int col = 0; col < board[row].length; col++){
                System.out.print(board[row][col]);

                if (col < board[row].length-1) {
                    System.out.print(" | ");
                }
            }

            System.out.println();

            if (row < board.length - 1) {
                System.out.println("---------");
            }
        }
    }
}