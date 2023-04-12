import com.sun.source.tree.Tree;

import java.util.LinkedList;

public class leetcode101 {
    //�Գƶ�����
    //�ݹ鷨
  /*  public boolean isSymmetric(TreeNode root) {
      return   compare(root.leftNode,root.rightNode);
        //����������������˳��һ����

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

        //�Ƚ����
        boolean compareOutsize = compare(left.leftNode,right.rightNode);
        boolean compareInsize = compare(left.rightNode,right.leftNode);
        return compareInsize&&compareOutsize;
    }*/
    //������
    public boolean isSymmetric(TreeNode root) {
        if (root==null)return true;
        //����һ�η���һ�ԣ�����ָ��ֱ�����������ڲ�
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

