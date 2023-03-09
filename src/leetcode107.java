
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class leetcode107 {
  /*  List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root==null){
            return res;
        }
        int deep=0;
        //调用递归函数
        bottom(root,deep);
        //反转链表
        List<List<Integer>> reversedRes = new ArrayList<>();
        for (int i=res.size();i>=0;i--){
            reversedRes.add(res.get(i));
        }
        return reversedRes;
    }


    //递归法
    public void bottom(TreeNode node, int deep){
        //中断条件
        if (node==null)return;
        //deep自增,记录层数
        deep++;
        //创建每一层的元素集
        if (res.size()<deep){
            List<Integer> item = new ArrayList<>();
            res.add(item);
        }
        //处理节点
        res.get(deep-1).add(node.val);
        //递归过程
        bottom(node.leftNode,deep);
        bottom(node.rightNode,deep);

    }*/
  List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root==null){
            return res;
        }
        int deep=0;
        //调用递归函数
        bottom(root,deep);
      //用链表（LinkedList）可以头插无需反转
        LinkedList<List<Integer>> list = new LinkedList<>();
        for (List<Integer> re : res) {
            list.addFirst(re);
        }
        return list;
    }


    //递归法
    public void bottom(TreeNode node, int deep){
        //中断条件
        if (node==null)return;
        //deep自增,记录层数
        deep++;
        //创建每一层的元素集
        if (res.size()<deep){
            List<Integer> item = new ArrayList<>();
            res.add(item);
        }
        //处理节点
        res.get(deep-1).add(node.val);
        //递归过程
        bottom(node.leftNode,deep);
        bottom(node.rightNode,deep);

    }

}
