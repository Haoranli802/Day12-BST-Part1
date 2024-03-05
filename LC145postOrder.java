class Solution {
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            result.add(cur.val);
            if(cur.left != null) stack.push(cur.left);
            if(cur.right != null) stack.push(cur.right);
        }
        Collections.reverse(result);
        return result;
    }

}
// Iteratively

class Solution {
    List<Integer> result;
    public List<Integer> postorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        postOrderHelper(root);
        return result;
    }
    private void postOrderHelper(TreeNode root){
        if(root == null) return;
        postOrderHelper(root.left);
        postOrderHelper(root.right);
        result.add(root.val);
    }
}

//recursively
