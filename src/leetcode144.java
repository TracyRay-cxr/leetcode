import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetcode144 {
    //��������ǰ�����

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        pre(root,res);
        return res;
    }
    //�ݹ�д��
   /* public void pre(TreeNode root,List<Integer> res){
        if (root==null){
            return;
        }
        res.add(root.val);
        pre(root.leftNode, res);
        pre(root.rightNode,res);
        return;
    }*/

    //�ǵݹ�д��(������)(�Ż�)
 /*   public void pre(TreeNode root,List<Integer> res){
        //��ջģ��ݹ�
        Stack<TreeNode> stack = new Stack<>();

        while(root != null||!stack.isEmpty()){
            while(root != null){
                res.add(root.val);
                stack.add(root);
                root=root.leftNode;
            }
            root=stack.pop().rightNode;
        }
    }*/
    //������
    public void pre(TreeNode root,List<Integer> res){
        //��ջģ��
        Stack<TreeNode> stack = new Stack<>();
        //�Ƚ����ڵ�ѹջ
        stack.push(root);
        //�����ڵ㣬��->��->�� ��ѹջ˳�� ��->��->��
        while(!stack.isEmpty()){
            //����
            TreeNode node = stack.pop();
            res.add(node.val);
            //���ҽڵ�ѹջ
           if (node.rightNode!=null)stack.push(node.rightNode);
            //����ڵ�ѹջ
            if (node.leftNode!=null)stack.push(node.leftNode);
        }

    }




}

class TreeNode {
    int val;
    TreeNode leftNode;
    TreeNode rightNode;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode leftNode, TreeNode rightNode) {
        this.val = val;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }
}
