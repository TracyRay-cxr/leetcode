import java.util.LinkedList;

public class leetcode226 {
    //��ת������
    public TreeNode invertTree(TreeNode root) {
        if (root==null){
            return new TreeNode();
        }
        invertTreeNode(root);
        return root;
    }
    public static void invertTreeNode(TreeNode root){
        //��ֹ����
        if (root==null){
            return;
        }
        //����������ȴ���ڵ㣨������
        TreeNode temp=null;
        temp=root.leftNode;
        root.leftNode=root.rightNode;
        root.rightNode=temp;

        //�ݹ�
        invertTreeNode(root.leftNode);
        invertTreeNode(root.rightNode);
    }
}
