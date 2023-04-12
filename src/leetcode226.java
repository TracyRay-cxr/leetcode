import java.util.LinkedList;

public class leetcode226 {
    //反转二叉树
    public TreeNode invertTree(TreeNode root) {
        if (root==null){
            return new TreeNode();
        }
        invertTreeNode(root);
        return root;
    }
    public static void invertTreeNode(TreeNode root){
        //终止条件
        if (root==null){
            return;
        }
        //先序遍历，先处理节点（交换）
        TreeNode temp=null;
        temp=root.leftNode;
        root.leftNode=root.rightNode;
        root.rightNode=temp;

        //递归
        invertTreeNode(root.leftNode);
        invertTreeNode(root.rightNode);
    }
}
