import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetcode94 {
    //二叉树中序遍历
    //递归法
//    public List<Integer> inorderTraversal(TreeNode root) {
//        ArrayList<Integer> res = new ArrayList<>();
//        inorder(root,res);
//        return res;
//    }
//    public void inorder(TreeNode root,List<Integer> list){
//        //中断条件
//        if (root==null){
//            return;
//        }
//        inorder(root.leftNode,list);
//        list.add(root.val);
//        inorder(root.rightNode, list);
//    }
    //迭代法
    public List<Integer> inorderTraversal(TreeNode root){
        //结果集合
        ArrayList<Integer> res = new ArrayList<>();
        //判空
        if (root==null){
            return res;
        }
        //本质是使用栈进行模拟递归
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        //遍历节点
        while(root!=null||!stack.isEmpty()){
            if (cur!=null){
                //当前节点不为空，说明还没到叶子节点压栈
                 stack.push(cur);
                 //遍历左节点
                cur=cur.leftNode;
            }else {
                //当前节点为空，说明栈顶为叶子节点
                //弹栈
                cur=stack.pop();
                //处理
                res.add(cur.val);
                //遍历右节点，由于是叶子节点所以会弹出叶子节点的父节点
                cur=cur.rightNode;
            }
        }
        return res;
    }
}
