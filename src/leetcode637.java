

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class leetcode637 {
    //二叉树层序编列，找每层节点值的和
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        //用队列迭代
        LinkedList<TreeNode> queue = new LinkedList<>();
        //初始化层数
        int size=Integer.MIN_VALUE;
        //初始化被除数
        int shang =0;
        queue.offerLast(root);

        while (!queue.isEmpty()){
            //创建变量存放平均值
            Double sum= 0.0;
            //获得队列大小
            size=queue.size();
           for (int i =0;i<size;i++){
                //处理节点
                TreeNode node = queue.pollFirst();
                //求当前层之和
                sum+= node.val;
                if (node.leftNode!=null)queue.offerLast(node.leftNode);
                if (node.rightNode!=null)queue.offerLast(node.rightNode);
            }
            double avg = sum / size;
           res.add(avg);

        }
        return res;
    }
}
