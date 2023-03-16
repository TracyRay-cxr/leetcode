
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class leetcode515 {
    //二叉树层序遍历，找每层最大值
    public List<Integer> largestValues(TreeNode root) {
        if (root==null){
            return new ArrayList<>();
        }
        List<Integer> res = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        int size=0;
        queue.offerLast(root);
        while(!queue.isEmpty()){
            size=queue.size();
            int maxValue=Integer.MIN_VALUE;
            for (int i=0;i<size;i++){
                TreeNode node = queue.pollFirst();
                //处理节点
                if (maxValue< node.val){
                    maxValue=node.val;
                }
                if (node.leftNode!=null)queue.offerLast(node.leftNode);
                if (node.rightNode!=null)queue.offerLast(node.rightNode);
            }
            res.add(maxValue);
        }
        return res;


    }
}
