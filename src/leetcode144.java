import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetcode144 {
    //二叉树的前序遍历

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        pre(root,res);
        return res;
    }
    //递归写法
   /* public void pre(TreeNode root,List<Integer> res){
        if (root==null){
            return;
        }
        res.add(root.val);
        pre(root.leftNode, res);
        pre(root.rightNode,res);
        return;
    }*/

    //非递归写法(迭代法)(优化)
 /*   public void pre(TreeNode root,List<Integer> res){
        //用栈模拟递归
        Stack<TreeNode> stack = new Stack<>();

        while(root != null||!stack.isEmpty()){
            while(root != null){
                res.add(root.val);
                stack.add(root);
                root=root.leftNode;
            }
            root=stack.pop().rightNode;
        }
    }*/
    //迭代法
    public void pre(TreeNode root,List<Integer> res){
        //用栈模拟
        Stack<TreeNode> stack = new Stack<>();
        //先将根节点压栈
        stack.push(root);
        //遍历节点，中->左->右 ，压栈顺序 中->右->左
        while(!stack.isEmpty()){
            //处理
            TreeNode node = stack.pop();
            res.add(node.val);
            //将右节点压栈
           if (node.rightNode!=null)stack.push(node.rightNode);
            //将左节点压栈
            if (node.leftNode!=null)stack.push(node.leftNode);
        }

    }




}

class TreeNode {
    int val;
    TreeNode leftNode;
    TreeNode rightNode;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode leftNode, TreeNode rightNode) {
        this.val = val;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }
}
