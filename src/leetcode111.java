import java.util.LinkedList;

public class leetcode111 {
    //�����������С�߶�
    //���������������
   /* public int minDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        int size=0;
        //�ö��е���
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offerLast(root);
        //��ʼ����
        int i=0;
        while(!queue.isEmpty()){
            //��¼��ǰ��Ľڵ���
            size= queue.size();
            i++;
            while(size>0){
                TreeNode node = queue.pollFirst();
                if (node.leftNode==null&&node.rightNode==null){
                    return i;
                }
                if (node.leftNode!=null)queue.offerLast(node.leftNode);
                if (node.rightNode!=null)queue.offerLast(node.rightNode);
                size--;
            }

        }
        return i;
    }*/
    //�ݹ飨���������
    public int minDepth(TreeNode root) {
       if(root==null)return 0;
      int leftDepth= minDepth(root.leftNode);
      int rightDepth = minDepth(root.rightNode);
       if (root.leftNode==null){
           return rightDepth+1;
       }
        if (root.rightNode==null){
            return leftDepth+1;
        }
        return Math.min(leftDepth,rightDepth)+1;
    }

}
