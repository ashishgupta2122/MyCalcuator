package com.ashish.mycalculator.temp;
import java.util.*;
public class NQuuenCount {
    public static int count = 0;
    public static boolean isSafe(char board[][],int row,int col) {
        //vertical top
        for (int i = row-1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        //diagonal left
        for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--,j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        //diagonal right
        for (int i = row-1, j = col+1; i >= 0 && j < board.length; i--,j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static void Board(char board[][],int row) {
        //base case
        if (row == board.length) {
            count++;
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board,row,j)) {
                board[row][j] = 'Q';
                Board(board,row+1);
                board[row][j] = 'x';
            }
        }
    }
    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        Board(board,0);
        System.out.println("Total No of Ways "+count);
    }
}