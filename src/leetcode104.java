import java.util.LinkedList;

public class leetcode104 {
    //二叉树的最大深度
    //迭代
//    public int maxDepth(TreeNode root) {
//        if(root==null){
//            return 0;
//        }
//        LinkedList<TreeNode> queue = new LinkedList<>();
//        queue.offerLast(root);
//        int size=0;
//        int deep=1;
//        while(!queue.isEmpty()){
//            size = queue.size();
//            for (int i=0;i<size;i++){
//                TreeNode node=queue.pollFirst();
//                if (node.leftNode!=null)queue.offerLast(node.leftNode);
//                if (node.rightNode!=null)queue.offerLast(node.rightNode);
//            }
//            deep++;
//        }
//        return deep;
//    }
    //递归
    public static int maxDepth(TreeNode root) {
        if (root==null)return 0;

        int leftDepth=maxDepth(root.leftNode);
        int rightDepth=maxDepth(root.rightNode);
        return Math.max(leftDepth,rightDepth)+1;

    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        node1.leftNode=node2;
        node1.rightNode=node3;
        node2.leftNode=node4;
        node3.leftNode=node5;
        node5.leftNode=node6;
        maxDepth(node1);

    }
}
