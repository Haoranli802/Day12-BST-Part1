class Solution {
    List<Integer> result;
    public List<Integer> preorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        preorderHelper(root);
        return result;
    }
    private void preorderHelper(TreeNode root){
        if(root == null) return;
        result.add(root.val);
        preorderHelper(root.left);
        preorderHelper(root.right);
    }
}
// Recursion O(N), O(N)

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            result.add(cur.val);
            if(cur.right != null) stack.push(cur.right);
            if(cur.left != null) stack.push(cur.left);
        }
        return result;
    }
}
//Iteratively O(N), O(N)
