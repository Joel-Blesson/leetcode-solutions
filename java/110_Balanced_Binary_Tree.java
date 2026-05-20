class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        else{
            int left = maxSubTree(root.left);
            int right =maxSubTree(root.right);

            return Math.abs(left - right) <=1 && isBalanced(root.left) && isBalanced(root.right);
        }

       

    }

    private int maxSubTree(TreeNode node){
        if(node == null) return 0;
        else{
            return 1 + Math.max(maxSubTree(node.left),maxSubTree(node.right)); 
        }
    }
}
