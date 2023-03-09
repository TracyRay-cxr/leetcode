
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
        //���õݹ麯��
        bottom(root,deep);
        //��ת����
        List<List<Integer>> reversedRes = new ArrayList<>();
        for (int i=res.size();i>=0;i--){
            reversedRes.add(res.get(i));
        }
        return reversedRes;
    }


    //�ݹ鷨
    public void bottom(TreeNode node, int deep){
        //�ж�����
        if (node==null)return;
        //deep����,��¼����
        deep++;
        //����ÿһ���Ԫ�ؼ�
        if (res.size()<deep){
            List<Integer> item = new ArrayList<>();
            res.add(item);
        }
        //����ڵ�
        res.get(deep-1).add(node.val);
        //�ݹ����
        bottom(node.leftNode,deep);
        bottom(node.rightNode,deep);

    }*/
  List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root==null){
            return res;
        }
        int deep=0;
        //���õݹ麯��
        bottom(root,deep);
      //������LinkedList������ͷ�����跴ת
        LinkedList<List<Integer>> list = new LinkedList<>();
        for (List<Integer> re : res) {
            list.addFirst(re);
        }
        return list;
    }


    //�ݹ鷨
    public void bottom(TreeNode node, int deep){
        //�ж�����
        if (node==null)return;
        //deep����,��¼����
        deep++;
        //����ÿһ���Ԫ�ؼ�
        if (res.size()<deep){
            List<Integer> item = new ArrayList<>();
            res.add(item);
        }
        //����ڵ�
        res.get(deep-1).add(node.val);
        //�ݹ����
        bottom(node.leftNode,deep);
        bottom(node.rightNode,deep);

    }

}
