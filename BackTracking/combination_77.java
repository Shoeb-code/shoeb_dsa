package BackTracking;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class combination_77 {

    public static void main(String[] args) {
    int n=4;
    int k=2;
    int [] arr=new int[4];
    for (int i=0; i<n; i++){
        arr[i]=i+1;
    }
    // 1  2  3  4
        List<Integer> ll =new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
       CombineNumber(arr,k,0,0,ans,ll);
        System.out.println(ans);
    }
    public static   void CombineNumber(int [] n,int k,int idx,int l,List<List<Integer>> ans,List<Integer> ll ){
        if (l==k){
            ans.add(new ArrayList<>(ll));
            return;
        }

        for (int i=idx; i<n.length; i++ ){
            if (k>l){
               ll.add(n[i]);
               CombineNumber(n,k,i+1,l+1,ans,ll);
               ll.remove(ll.size()-1);
            }
        }

    }
}
