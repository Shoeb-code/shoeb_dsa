package BackTracking;

public class coin_permutation {
    public static void main(String[] args) {
        int [] coin={2,3,5,6};
        int amount=10;
        permutation(coin,amount,"");
    }
    public static void permutation(int [] coin , int amount , String ans ){

        if (amount==0){
            System.out.println(ans);
            return;
        }
        for (int i=0; i<coin.length; i++){
            if (amount>=coin[i]){
                permutation(coin,amount-coin[i],ans+coin[i]);
            }
        }
    }
}
