package BackTracking;

public class Queen_combination {
    public static void main(String[] args) {
        boolean [] track=new boolean[4];
        Queen(track,2,0,"",0);
    }
    public static  void Queen(boolean [] board,int tq,int qpsf , String ans, int idx){
        // tq--> total Queen
        // qpsf--> queen placed so far
        if (tq==qpsf){
            System.out.println(ans);
            return;
        }

        for (int i=idx; i<board.length; i++){
            if (board[i]==false){ // Queen placed nhi hai
                board[i]=true; // Queen placed
                Queen(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf+" ",i+1);
                board[i]=false;
            }
        }
    }
}
