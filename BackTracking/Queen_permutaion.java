package BackTracking;

public class Queen_permutaion {
    public static void main(String[] args) {

        boolean [] track=new boolean[4];
         Queen(track,2,0,"");
    }
    public static  void Queen(boolean [] board,int tq,int qpsf,String ans){
        // tq--> total Queen
        // qpsf--> queen placed so far
        if (tq==qpsf){
            System.out.println(ans);
            return;
        }

        for (int i=0; i<board.length; i++){
            if (board[i]==false){ // Queen placed nhi hai

                board[i]=true; // Queen placed
                Queen(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf+" ");
                board[i]=false;
            }
        }
    }

}
