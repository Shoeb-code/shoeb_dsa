package BackTracking;

import java.util.Scanner;

public class Rat_chase_hackerblocks {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char [][] maze=new char[n][m];
        for (int i=0; i<maze.length; i++){
            String s=sc.next();
            for (int j=0; j<s.length(); j++){
                maze[i][j]=s.charAt(j);
            }
        }
        int [][] ans =new int[n][m];
        MazePAth(maze,0,0,ans);
        if (val == false) {
            System.out.println("NO PATH FOUND");
        }
    }
    static boolean val = false;
    public static void MazePAth(char [][] maze , int cr, int cc , int [][] ans ){


        if ( cc==maze[0].length-1 && cr==maze.length-1){
            if (maze[cr][cc]=='O'){
                ans[cr][cc]=1;
                displaye(ans);
                ans[cr][cc]=0;
                val = true;
            }
            return;
        }
    if (cr<0 || cr>=maze.length || cc<0 || cc>=maze[0].length || maze[cr][cc]=='X'){
        return;
        // cr--> current row
        // cc--> current column
    }
        int [] r={0,-1,0,1};
        int [] c={1,0,-1,0};

        maze[cr][cc]='X'; // visited
        ans[cr][cc]=1;

        for (int i=0;i<c.length; i++){
            MazePAth(maze,cr+r[i],cc+c[i],ans);
        }
        maze[cr][cc]='O'; // backtrack after all four calls
        ans[cr][cc]=0;
    }

    private static void displaye(int[][] ans) {
        for (int i=0; i<ans.length; i++){
            for (int j=0; j<ans[0].length; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
