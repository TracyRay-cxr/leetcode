import com.sun.source.tree.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class leetcode102 {
    //二叉树的层序遍历
    //迭代法（用队列实现）
   /* public List<List<Integer>> levelOrder(TreeNode root) {
        //结果集 ArrayList底层数组实现，适合查询，改  。而LinkList底层链表实现，适合增删，
        //但是LinkList还实现了Deque接口可以当作队列使用
        List<List<Integer>> res = new LinkedList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        int size = -1;
        if (root==null){
            return res;
        }
        queue.offer(root);
        //队列为空，证明遍历完毕
        while(!queue.isEmpty()){
            //记录每层元素数量，用于遍历下一层以及区分数据
            size =queue.size();
            //每层的元素存放在一维链表，后面放入结果集
            LinkedList<Integer> everyLevel = new LinkedList<>();
            //根据size大小来弹出同一层的节点
            //随后将弹出节点的子节点（如果有的话）放入队列
            while((size--)>0){
                TreeNode node = queue.poll();
                //弹出队列并放入层结果里
                everyLevel.add(node.val);
                //如果存在左孩子，先左孩子入队              ****每一层从左向右遍历的话****
                if (node.leftNode!=null){
                    queue.offer(node.leftNode);
                }
                //同上
                if (node.rightNode!=null){
                    queue.offer(node.rightNode);
                }

            }
            //将处理的这一层放入结果里
            res.add(everyLevel);

        }
        return res;
    }*/

    //递归法实现

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root==null) return  res;
        //调用递归
        fun(root,0);
        return res;
    }

    private void fun(TreeNode node, int deep) {
        //中断条件
        if (node==null)
            return;
        //层数自增，表示一次递归结果集里增加一层
        deep++;

        //使用deep来控制创建每一层的层结果，
        //由于deep在递归内自增，并且由参数来记录上一层的值， 每一层递归左右节点传入的是同一个deep，就是说每一层只会有一个进入循环
        if (res.size()<deep){
            //创建每一层的list
            ArrayList<Integer> itemRes = new ArrayList<>();
            //将这一层的list放入结果集
            res.add(itemRes);
        }
        //处理node
        res.get(deep-1).add(node.val);


        //递归
        fun(node.leftNode,deep);
        fun(node.rightNode,deep);
    }
}
