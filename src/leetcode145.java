import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class leetcode145 {
    //二叉树后序遍历
    public List<Integer> postorderTraversal(TreeNode root) {
       List<Integer> res = new LinkedList<>();
        post(root,res);//递归函数
        return res;
    }
    //递归法
//    public void post(TreeNode root,List<Integer> list){
//        //中断条件
//        if (root==null){
//            return;
//        }
//        //递归
//        post(root.leftNode,list);
//        post(root.rightNode, list);
//        list.add(root.val);
//    }
    //迭代法，将前序迭代进行改造然后输出
    public void post(TreeNode root,List<Integer> res){
        //用栈模拟
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> reverse =new Stack<>();
        //先将根节点压栈
        stack.push(root);
        //遍历节点，左->右->中 ，压栈顺序 中->左->右 得到 中->右->左,反转数组得到左->右->中
        while(!stack.isEmpty()){
            //处理
            TreeNode node = stack.pop();
            reverse.push(node.val);
            //将左节点压栈
            if (node.leftNode!=null)stack.push(node.leftNode);
            //将右节点压栈
            if (node.rightNode!=null)stack.push(node.rightNode);
        }
        //反转链表
       while(!reverse.isEmpty()) {
           res.add(reverse.pop());
       }
        return ;
    }


}
