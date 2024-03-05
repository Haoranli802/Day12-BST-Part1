class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()){
            if(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            else{
                cur = stack.pop();
                result.add(cur.val);
                //System.out.println(cur.val);
                cur = cur.right;
            }
        }
        return result;
    } 
}

//Iteratively 

class Solution {
    List<Integer> result;
    public List<Integer> inorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        inorder(root);
        return result;
    }
    private void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        result.add(root.val);
        inorder(root.right);
    }
}
// recursion
