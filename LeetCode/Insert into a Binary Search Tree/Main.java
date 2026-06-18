class Solution {
    public TreeNode insert(TreeNode root, int val){
        if(root==null){
            return new TreeNode(val);
        }
        if(root.val>val){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
        

    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode temp = root;
        return insert(temp,val);

        

    }
}
