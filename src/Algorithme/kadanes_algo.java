package Algorithme;

public class kadanes_algo {
    public static void main(String[] args) {
        int [] arr={2,-5,1,-4,3,-2};

        System.out.println();
    }
    public static int kadans(int [] arr){
        int max=Integer.MIN_VALUE;
        int cursum=0;
        for (int a:arr){
            cursum=Math.abs(cursum+a);
            if (cursum>max){
                max=Math.max(max,cursum);
            }
            else {
                cursum=0;
            }
        }
        return max;
    }
}
