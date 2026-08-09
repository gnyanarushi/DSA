package august.aug4;

import java.util.ArrayList;
import java.util.List;

public class NQueensLeetcode {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> board = new ArrayList<>();
        for(int i = 0 ; i < n ; i++) {
            List<String> temp = new ArrayList<>();
            for(int j = 0 ; j < n ; j++){
                temp.add(".");
            }
            board.add(temp);
        }

        placeQueensUsingColOperations(board , n , 0 );

        return board;

    }


    public   boolean isSafeToInsertInCol( List<List<String>> board ,int row , int col )  {

        for(int c = col ; c >= 0 ; c--)
            if(board.get(row).get(c).equals("1"))
                return false;

        for(int r = row , c = col ; r >= 0 && c >= 0 ; r-- , c--)
            if(board.get(r).get(c).equals("1"))
                return false;

        for(int r = row , c = col ; r < board.size() && c >= 0 ; r++ , c--)
            if(board.get(r).get(c).equals("1"))
                return false;

        return true;
    }

    public  boolean placeQueensUsingColOperations(List<List<String>> board , int n , int col ){
        //Base case
        if(col >= n )
            return true;
        for(int row = 0 ; row  < n ; row++){
            if(isSafeToInsertInCol(board , row , col)) {
                board.get(row).set(col , "Q");
                if(placeQueensUsingColOperations(board ,  n , col + 1 ))
                    return true;
                board.get(row).set(col , ".");
            }
        }
        return false;
    }


    public static void main(String[] args) {
            int n = new java.util.Scanner(System.in).nextInt();
            NQueensLeetcode nQueensLeetcode = new NQueensLeetcode();
            nQueensLeetcode.solveNQueens(n);
    }
}
