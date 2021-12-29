package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = row; index < board.length; index++) {
            for (int cell = 0; cell < board[index].length; cell++) {
                int val = board[index][cell];
                if (val != board[index][cell]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (char[] chars : board) {
            for (int cell = column; cell < chars.length; cell++) {
                int val = chars[cell];
                if (val != chars[cell]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < rsl.length; index++) {
            rsl[index] = board[index][index];
        }
        return rsl;
    }
}
