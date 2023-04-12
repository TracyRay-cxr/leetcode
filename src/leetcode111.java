import java.util.LinkedList;

public class leetcode111 {
    //求二叉树的最小高度
    //迭代（层序遍历）
   /* public int minDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        int size=0;
        //用队列迭代
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offerLast(root);
        //开始迭代
        int i=0;
        while(!queue.isEmpty()){
            //记录当前层的节点数
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
    //递归（后序遍历）
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
