package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
       int result = 0;
       if (x1 >= 0 && x1 < 8 && y1 >= 0 && y1 < 8
           && x2 >= 0 && x2 < 8 && y2 >= 0 && y2 < 8
           && Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
           result = Math.abs(x1 - x2);
       }
        return result;
    }

    public static void main(String[] args) {
       int result = ChessBoard.way(6, 7, 1, 2);
       System.out.println(result);
       result = ChessBoard.way(7, 0, 0, 7);
       System.out.println(result);
       result = ChessBoard.way(2, 6, 4, 1);
       System.out.println(result);
       result = ChessBoard.way(-1, 6, 4, 1);
       System.out.println(result);
       result = ChessBoard.way(2, -1, 4, 1);
       System.out.println(result);
       result = ChessBoard.way(2, 6, -1, 1);
       System.out.println(result);
       result = ChessBoard.way(2, 6, 4, -1);
       System.out.println(result);
       result = ChessBoard.way(10, 6, 4, 1);
       System.out.println(result);
    }
}
