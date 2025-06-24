package BackTracking;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class path_sum_II_113 {
    public class TreeNode {
      int val;
      TreeNode left;
     TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    class Solution {
        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
         List<List<Integer>> ans=new ArrayList<>();
         List<Integer>  ll=new ArrayList<>();
         return ans;
        }
        public static void PathSum2(TreeNode root, int targetSum,List<List<Integer>> ans,List<Integer>  ll){
            if (root==null){
                return;
            }
            ll.add(root.val);
            if ( root.left==null && root.right==null && targetSum-root.val==0){
                ans.add(new ArrayList<>(ll));
            }
             else {
            PathSum2(root.left,targetSum- root.val,ans,ll);
            PathSum2(root.right,targetSum- root.val,ans,ll);}

            ll.remove(ll.size()-1);
        }
    }
}

