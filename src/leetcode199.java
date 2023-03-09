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
        //������
        //ʹ�ö��б���
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        //��¼ÿ���Ԫ�ظ���
        int size=-1;
        TreeNode node=null;
        //���в�Ϊ��
        while(!que.isEmpty()){
            //ͬ�������ڵ�Ԫ�ظ���
            size=que.size();
            while(size>0){
                //����
                node = que.poll();
                size--;
                //ÿ������һ���ڵ��������
                if (size==0){
                    res.add(node.val);
                }
                //�浯������һ��Ԫ�ص��ӽڵ㣨��һ�㲿�֣�
               if (node.leftNode!=null)que.offer(node.leftNode);
               if (node.rightNode!=null)que.offer(node.rightNode);
            }
        }
        return res;
    }
}
