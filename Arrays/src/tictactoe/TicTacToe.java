package tictactoe;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        char[][] board = new char[3][3];

        for(int row = 0 ; row < board.length ; row++){
            for(int col = 0; col < board.length ; col++){
                board[row][col] = ' ';
            }
        }
        Scanner sc = new Scanner(System.in);
        boolean gameOver = false;
        char player = 'X';

        while(!gameOver){
            printBoard(board);
            System.out.print("Player " + player + "  enter input : " );
            int row = sc.nextInt();
            int col = sc.nextInt();

            if(board[row][col] != ' '){
                System.out.println("You have Entered the wrong input Try Again");
            }
            else{
                if(player == 'X'){
                    board[row][col] = 'X';
                }
                else {
                    board[row][col] = 'O';
                }
                if(haveWon(board, player)) {
                    gameOver = true;
                    System.out.println("The Game is finished , player " + player + "    won the game ");
                }

            }
            player = (player == 'X') ? 'O' : 'X';
        }
    }

    private static boolean haveWon(char[][] board, char player) {

        for(int i = 0 ; i < board.length; i++){
            if(board[i][0] == player && board[i][1] == player && board[i][2] == player){
                return true;
            }
        }

        for(int i = 0 ; i < board.length; i++){
            if(board[0][i] == player && board[1][i] == player && board[2][i] == player){
                return true;
            }
        }

        if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player ){
            return true;
        }

        return false;
    }

    public static void printBoard(char[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0 ; j < board[0].length; j++){
                System.out.print(" " + board[i][j] + " |");
            }
            System.out.println();
        }
    }

}
