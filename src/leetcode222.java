import com.sun.source.tree.Tree;

import java.util.LinkedList;

public class leetcode222 {
  /*  public int countNodes(TreeNode root) {
        //完全二叉树的节点个数
        //递归法
        //中断条件
        if(root==null) return 0;
        //后续编列
       int countLeft = countNodes(root.leftNode);
       int countRight = countNodes(root.rightNode);
        return countLeft+countRight+1;
    }*/




    /*public int countNodes(TreeNode root){
        //迭代法
        if (root==null){
            return 0;
        }
        //队列迭代
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offerLast(root);
        int result=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size-->0){
                TreeNode node = queue.pollFirst();
                result++;
                if (node.leftNode!=null)queue.offerLast(node.leftNode);
                if (node.rightNode!=null)queue.offerLast(node.rightNode);

            }
        }
        return result;
    }*/

    public int countNode(TreeNode root){
        //完全二叉树性质法
        if (root == null)return 0;
        TreeNode left = root.leftNode;
        TreeNode right = root.rightNode;
        int leftDepth = 0,rightDepth=0;//初始化为0，后面有用
        while(left != null){//求左子树的深度
            left = left.leftNode;
            leftDepth++;
        }
        while(right != null){//求右子树的深度
            right = right.rightNode;
            rightDepth++;
        }
        if (leftDepth == rightDepth){
            return (2<<leftDepth)-1;//满二叉树的节点数： 2^depth-1，如果左右子树都为空，由于初始化为0，所以节点的个数是1
        }
        return countNode(root.leftNode)+countNode(root.rightNode)+1;
    }
}
