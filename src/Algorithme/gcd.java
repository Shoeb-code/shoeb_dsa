package Algorithme;

public class gcd {
    public static void main(String[] args) {
        int a=18;
        int b=6;
        System.out.println(GCD(a,b));
    }
    public static int GCD(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
