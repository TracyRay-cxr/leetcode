import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class text {
public static void  main(String [] agrs) {

//    TreeNode node1 = new TreeNode(1, null, null);
//    TreeNode node2 =new TreeNode(2,null,null);
//    TreeNode node3 = new TreeNode(3,node1,node2);
//    TreeNode node4 = new TreeNode(4,null,null);
//    TreeNode node5 = new TreeNode(5,null,null);
//    TreeNode node6 = new TreeNode(6,node4,node5);
//    TreeNode root = new TreeNode(10,node3,node6);
//    preOrderIteration(root);
//    preorderTraversal(root);


}
//    public static List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        pre(root,res);
//        return res;
//    }
//
//    public static void pre(TreeNode root, List<Integer> res){
//        Stack<TreeNode> stack = new Stack<>();
//        while(root != null||!stack.isEmpty()){
//            while(root != null){
//                res.add(root.val);
//                stack.add(root);
//                root=root.left;
//            }
//            root=stack.pop().right;
//        }
//    }

//    public static void preOrderIteration(TreeNode head) {
//        if (head == null) {
//            return;
//        }
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(head);
//        while (!stack.isEmpty()) {
//            TreeNode node = stack.pop();
//            System.out.print(node.val + " ");
//            if (node.right != null) {
//                stack.push(node.right);
//            }
//            if (node.left != null) {
//                 stack.push(node.left);
//            }
//        }
//    }
}
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode() {}
//    TreeNode(int val) { this.val = val; }
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}
