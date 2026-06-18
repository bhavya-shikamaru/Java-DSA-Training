class Solution {
    boolean Balanced = true;
    public boolean isBalanced(TreeNode root) {
        depth(root);
        return Balanced; 
    }
    public int depth(TreeNode node){
        if(node == null) return 0;   
        int left = depth(node.left);
        int right = depth(node.right);
        if (Math.abs(left - right) > 1) {
            Balanced = false;
        }
        return Math.max(left, right) + 1;
    }
}
