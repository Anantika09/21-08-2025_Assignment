/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public void getInorder(TreeNode root, ArrayList<Integer> list){
        if(root == null) return;
        getInorder(root.left, list);
        list.add(root.val);
        getInorder(root.right, list);
    }

    public boolean findTarget(TreeNode root, int k){
        ArrayList<Integer> list=new ArrayList<>();
        getInorder(root, list); 
        int s=0;
        int e=list.size()-1;
        while(s<e){
            int sum=list.get(s)+list.get(e);
            if(sum==k){
                return true;
            } 
            else if(sum<k){
                s++;
            }
            else{
                e--;
            }
        }
        return false;
    }
}