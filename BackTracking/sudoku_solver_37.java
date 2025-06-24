package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class sudoku_solver_37 {
    public static void main(String[] args) {
        String [][] grid={
                {"5","3",".",".","7",".",".",".","."},
                {"6",".",".","1","9","5",".",".","."},
                {".","9","8",".",".",".",".","6","."},
                {"8",".",".",".","6",".",".",".","3"},
                {"4",".",".","8",".","3",".",".","1"},
                {"7",".",".",".","2",".",".",".","6"},
                {".","6",".",".",".",".","2","8","."},
                {".",".",".","4","1","9",".",".","5"},
                {".",".",".",".","8",".",".","7","9"}};

        SodukuSolver(grid,0,0);

        List<List<String>> ans=new ArrayList<>();
        for (String[] row : grid) {
            List<String> listRow = new ArrayList<>();
            for (String cell : row) {
                listRow.add(cell);
            }
            ans.add(listRow);
        }
        System.out.println(ans);
    }
   public static void SodukuSolver(String [][] grid, int row, int col) {
        if (col==9) {
            row++;
            col=0;
        }
        if (row==9){
          //  Display(grid);
            return;
        }

       if (!grid[row][col].equals(".")) {
          SodukuSolver(grid,row,col+1);
       }
       else {
           for (int val = 1; val <= 9; val++) {
               if (IsItPossible(grid, row, col, val)) {
                   grid[row][col] = String.valueOf(val);
                   SodukuSolver(grid,row,col+1);
                   grid[row][col]="."; // undo
               }

           }
       }
   }

    private static boolean IsItPossible(String [][] grid, int row, int col, int val) {
        String valStr = String.valueOf(val);

         // checks column
        int c=0;
        while(c<9){
            if (grid[row][c].equals(valStr)){
                return false;
            }
            c++;
        }
        // checks row
        int  r=0;
        while(r<9){
            if (grid[r][col].equals(valStr)){
                return false;
            }
            r++;
        }
      // for 3X3 matrix
        r=row-row%3;
        c=col-col%3;
        for (int i=r; r<r+3; r++){
            for (int j=c; j<c+3; j++){
                if (grid[i][j].equals(valStr)){
                    return false;
                }
            }
        }
     return true;
    }
    public static void Display(String [][] grid ){
        for (int i=0; i<grid.length; i++){
            for (int j=0; j<grid.length; j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    }


