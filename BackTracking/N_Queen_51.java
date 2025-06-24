package BackTracking;

import java.util.ArrayList;
import java.util.List;

import static Oops.function_demo.display;

public class N_Queen_51 {
    public static void main(String[] args) {
        int n=4;
        boolean [][] board=new boolean[n][n];
        List<Integer> ll =new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        PrintPath(board,0,n);
    }
    public static void PrintPath(boolean [][] board, int row, int tq){
        if (tq==0){
            display(board);
            return;
        }
        if (row==board.length){
            return;
        }

        for (int col=0; col<board.length; col++){

            if (IsItpossible(board,row,col)==true){
                board[row][col]=true;
                PrintPath(board,row+1,tq-1);
                board[row][col]=false;
            }
        }
    }

    private static boolean IsItpossible(boolean[][] board, int row, int col) {

        // upper case
        int r=row;
            while ((r>=0)){
                if (board[r][col]==true){
                    return false;
                }
                r--;
            }
        // right diagonal
         r = row;
        int c = col;
        while (r >= 0 && c < board.length) {
            if (board[r][c] == true) {
                return false;
            }
            r--;
            c++;
        }
        // left diagonal
        r = row;
        c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == true) {
                return false;
            }
            r--;
            c--;
        }
        return true;
    }

    public static void display(boolean[][] board) {
        for (int i=0; i<board.length; i++){
            for (int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
      System.out.println();
    }
}
