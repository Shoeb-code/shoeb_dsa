package BackTracking;

public class coin_combination {
    public static void main(String[] args) {
        int [] coin={2,3,5,6};
        int amount=10;
        combination(coin,amount,"",0);
    }
    public static void combination(int [] coin , int amount , String ans, int idx ){

        if (amount==0){
            System.out.println(ans);
            return;
        }
        for (int i=idx; i<coin.length; i++){
            if (amount>=coin[i]){
                combination(coin,amount-coin[i],ans+coin[i],i);
            }
        }
    }
}
