import com.sun.source.tree.Tree;

import java.util.LinkedList;

public class leetcode101 {
    //对称二叉树
    //递归法
  /*  public boolean isSymmetric(TreeNode root) {
      return   compare(root.leftNode,root.rightNode);
        //遍历两边树，遍历顺序一个左

    }
    private  boolean compare(TreeNode left,TreeNode right){
        if (left == null && right != null){
            return false;
        }
        if (left != null && right ==null){
            return false;
        }
        if (left == null && right == null){
            return true;
        }
        if (left.val!=right.val){
            return false;
        }

        //比较外侧
        boolean compareOutsize = compare(left.leftNode,right.rightNode);
        boolean compareInsize = compare(left.rightNode,right.leftNode);
        return compareInsize&&compareOutsize;
    }*/
    //迭代法
    public boolean isSymmetric(TreeNode root) {
        if (root==null)return true;
        //队列一次放入一对，两个指针分别遍历的外侧或内侧
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offerFirst(root.leftNode);
        queue.offerLast(root.rightNode);
        while(!queue.isEmpty()){
            TreeNode leftNode=queue.pollFirst();
            TreeNode rightNode=queue.pollLast();
            if (leftNode==null&&rightNode==null){
                continue;
            }
            if (leftNode==null&&rightNode!=null){
                return false;
            }
            if (leftNode!=null&&rightNode==null){
                return false;
            }
            if (leftNode.val!= rightNode.val){
                return false;
            }
            queue.offerFirst(leftNode.leftNode);
            queue.offerFirst(leftNode.rightNode);
            queue.offerLast(rightNode.rightNode);
            queue.offerLast(rightNode.leftNode);
        }
        return true;

    }

}

