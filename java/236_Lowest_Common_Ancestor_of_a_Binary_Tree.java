class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if( root == null) return root;
        if(root == p || root == q) return root;
         
        TreeNode leftRes = lowestCommonAncestor(root.left,p,q);
        TreeNode rightRes =  lowestCommonAncestor(root.right,p,q);
        if (leftRes != null && rightRes != null){
            return root;
        }
        if (leftRes != null && rightRes == null){
            return leftRes;
        }
        if (leftRes == null && rightRes != null){
            return rightRes;
        }
        return null;
    }
}
