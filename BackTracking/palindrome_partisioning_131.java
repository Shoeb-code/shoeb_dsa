package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class palindrome_partisioning_131 {
    public static void main(String[] args) {
        String s="aab";

        List<String> ll =new ArrayList<>();
        List<List<String>> result=new ArrayList<>();
    Partisioning(s,ll,result);
        System.out.println(result);
    }
    public static   void Partisioning(String s, List<String> ll,List<List<String>> result){

        if (s.length()==0){
        result.add(new ArrayList<>(ll));
            return;
        }
        for (int i=1; i<=s.length(); i++) {
            String k = s.substring(0, i);
            if (isPalindrome(k)) {
                ll.add(k);
                Partisioning(s.substring(i), ll,result);
                ll.remove(ll.size()-1);
            }
        }
    }
    public static  boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if (s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
