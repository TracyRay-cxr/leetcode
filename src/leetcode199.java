import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root==null){
            return res;
        }
        //迭代法
        //使用队列遍历
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        //记录每层的元素个数
        int size=-1;
        TreeNode node=null;
        //队列不为空
        while(!que.isEmpty()){
            //同步队列内的元素个数
            size=que.size();
            while(size>0){
                //出队
                node = que.poll();
                size--;
                //每层的最后一个节点存入结果集
                if (size==0){
                    res.add(node.val);
                }
                //存弹出的这一层元素的子节点（下一层部分）
               if (node.leftNode!=null)que.offer(node.leftNode);
               if (node.rightNode!=null)que.offer(node.rightNode);
            }
        }
        return res;
    }
}
