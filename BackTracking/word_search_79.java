package BackTracking;

public class word_search_79 {
    public static void main(String[] args) {
        char [][] maze={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word="ABCCED";

        for (int i=0; i< maze.length; i++){
            for (int j =0; j<maze[0].length; j++){
                if (maze[i][j]==word.charAt(0)){
                    boolean ans=findWord(maze,word,i,j,0);
                    if (ans== true){
                        System.out.println(true);
                        return;
                    }
                }
            }

        }
        System.out.println(false);
    }
    public static boolean findWord(char [][] maze, String word, int cr, int cc, int idx ){
        if (idx==word.length()){
            return true;
        }
        if (cc<0 || cc>=maze[0].length || cr<0 || cr>= maze.length || maze[cr][cc]!=word.charAt(idx)){
            return false;
        }
        int []r={0,-1,0,1};
        int []c={1,0,-1,0};

        maze[cr][cc]='*'; // mark  visited

        for (int i=0; i<c.length; i++){

         boolean ans= findWord(maze,word,cr+r[i],cc+c[i],idx+1);
            if (ans== true){
                return ans;
            }
        }
        maze[cr][cc]=word.charAt(idx);   // undo
        return false;


    }
}
