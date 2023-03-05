import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetcode94 {
    //�������������
    //�ݹ鷨
//    public List<Integer> inorderTraversal(TreeNode root) {
//        ArrayList<Integer> res = new ArrayList<>();
//        inorder(root,res);
//        return res;
//    }
//    public void inorder(TreeNode root,List<Integer> list){
//        //�ж�����
//        if (root==null){
//            return;
//        }
//        inorder(root.leftNode,list);
//        list.add(root.val);
//        inorder(root.rightNode, list);
//    }
    //������
    public List<Integer> inorderTraversal(TreeNode root){
        //�������
        ArrayList<Integer> res = new ArrayList<>();
        //�п�
        if (root==null){
            return res;
        }
        //������ʹ��ջ����ģ��ݹ�
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        //�����ڵ�
        while(root!=null||!stack.isEmpty()){
            if (cur!=null){
                //��ǰ�ڵ㲻Ϊ�գ�˵����û��Ҷ�ӽڵ�ѹջ
                 stack.push(cur);
                 //������ڵ�
                cur=cur.leftNode;
            }else {
                //��ǰ�ڵ�Ϊ�գ�˵��ջ��ΪҶ�ӽڵ�
                //��ջ
                cur=stack.pop();
                //����
                res.add(cur.val);
                //�����ҽڵ㣬������Ҷ�ӽڵ����Իᵯ��Ҷ�ӽڵ�ĸ��ڵ�
                cur=cur.rightNode;
            }
        }
        return res;
    }
}
