import com.sun.source.tree.Tree;

import java.util.LinkedList;

public class leetcode222 {
  /*  public int countNodes(TreeNode root) {
        //��ȫ�������Ľڵ����
        //�ݹ鷨
        //�ж�����
        if(root==null) return 0;
        //��������
       int countLeft = countNodes(root.leftNode);
       int countRight = countNodes(root.rightNode);
        return countLeft+countRight+1;
    }*/




    /*public int countNodes(TreeNode root){
        //������
        if (root==null){
            return 0;
        }
        //���е���
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
        //��ȫ���������ʷ�
        if (root == null)return 0;
        TreeNode left = root.leftNode;
        TreeNode right = root.rightNode;
        int leftDepth = 0,rightDepth=0;//��ʼ��Ϊ0����������
        while(left != null){//�������������
            left = left.leftNode;
            leftDepth++;
        }
        while(right != null){//�������������
            right = right.rightNode;
            rightDepth++;
        }
        if (leftDepth == rightDepth){
            return (2<<leftDepth)-1;//���������Ľڵ����� 2^depth-1���������������Ϊ�գ����ڳ�ʼ��Ϊ0�����Խڵ�ĸ�����1
        }
        return countNode(root.leftNode)+countNode(root.rightNode)+1;
    }
}
