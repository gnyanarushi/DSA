package august.aug4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueensProblem {

    private  static void printBoard(int[][] board){
        for(int[] arr : board) {
            for(int b : arr){
                System.out.print( b + " ");
            }
            System.out.println();
        }
    }

    public static  boolean isSafeToInsertInRow(int[][] board ,int row , int col )  {

        for(int c = col ; c >= 0 ; c--)
            if(board[row][c] == 1)
                return false;

        for(int r = row , c = col ; r >= 0 && c >= 0 ; r-- , c--)
            if(board[r][c] == 1)
                return false;

        for(int r = row , c = col ; r >= 0 && c < board.length ; r-- , c++)
            if(board[r][c] == 1 )
                return false;

        return true;
    }

    public static  boolean isSafeToInsertInCol(int[][] board ,int row , int col )  {

        for(int c = col ; c >= 0 ; c--)
            if(board[row][c] == 1)
                return false;

        for(int r = row , c = col ; r >= 0 && c >= 0 ; r-- , c--)
            if(board[r][c] == 1)
                return false;

        for(int r = row , c = col ; r < board.length && c >= 0 ; r++ , c--)
            if(board[r][c] == 1)
                return false;

        return true;
    }



    public static boolean placeQueensUsingRowOperations(int[][] board , int n , int row ){
        //Base case
        if(row >= n )
            return true;
        for(int col = 0 ; col  < n ; col++){
            if(isSafeToInsertInRow(board , row , col)) {
                board[row][col] = 1 ;
                 if(placeQueensUsingRowOperations(board ,  n , row + 1 ))
                     return true;
                 board[row][col] = 0;
            }
        }
        return false;
    }


    public static boolean placeQueensUsingColOperations(int[][] board , int n , int col ){
        //Base case
        if(col >= n )
            return true;
        for(int row = 0 ; row  < n ; row++){
            if(isSafeToInsertInCol(board , row , col)) {
                board[row][col] = 1 ;
                 if(placeQueensUsingColOperations(board ,  n , col + 1 ))
                     return true;
                 board[row][col] = 0;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        int n = new java.util.Scanner(System.in).nextInt();

        int[][]  board = new int[n][n];

       boolean possible =  placeQueensUsingColOperations(board , n , 0 );

       List<List<String>> list = new ArrayList<>();

       if(possible) {
           printBoard(board);
       }
       else
           System.out.println("Solution does not exists");
    }
}
