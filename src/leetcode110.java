import java.awt.desktop.PreferencesEvent;

public class leetcode110 {
    //判断是否是平衡二叉树
    public boolean isBalanced(TreeNode root) {
        if (gethight(root)==-1){
            return false;
        }else
        {
            return true;
        }
    }
    public int gethight(TreeNode root){
        if (root==null)return 0;
        int leftHight = gethight(root.leftNode);
        if (leftHight==-1)return -1;
        int rightHight = gethight(root.rightNode);
        if (rightHight==-1)return -1;
        if (Math.abs(leftHight-rightHight)>1){
            return -1;
        }else {
            return 1 + Math.max(leftHight, rightHight);
        }

    }

}
