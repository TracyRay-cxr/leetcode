import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class leetcode145 {
    //�������������
    public List<Integer> postorderTraversal(TreeNode root) {
       List<Integer> res = new LinkedList<>();
        post(root,res);//�ݹ麯��
        return res;
    }
    //�ݹ鷨
//    public void post(TreeNode root,List<Integer> list){
//        //�ж�����
//        if (root==null){
//            return;
//        }
//        //�ݹ�
//        post(root.leftNode,list);
//        post(root.rightNode, list);
//        list.add(root.val);
//    }
    //����������ǰ��������и���Ȼ�����
    public void post(TreeNode root,List<Integer> res){
        //��ջģ��
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> reverse =new Stack<>();
        //�Ƚ����ڵ�ѹջ
        stack.push(root);
        //�����ڵ㣬��->��->�� ��ѹջ˳�� ��->��->�� �õ� ��->��->��,��ת����õ���->��->��
        while(!stack.isEmpty()){
            //����
            TreeNode node = stack.pop();
            reverse.push(node.val);
            //����ڵ�ѹջ
            if (node.leftNode!=null)stack.push(node.leftNode);
            //���ҽڵ�ѹջ
            if (node.rightNode!=null)stack.push(node.rightNode);
        }
        //��ת����
       while(!reverse.isEmpty()) {
           res.add(reverse.pop());
       }
        return ;
    }


}
