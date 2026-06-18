class Solution {
    List<Integer> ans = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        return(ans.get(k-1));


}
    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        ans.add(root.val);
        inorder(root.right);
 
    }}
