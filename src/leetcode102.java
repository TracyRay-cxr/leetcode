import com.sun.source.tree.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class leetcode102 {
    //�������Ĳ������
    //���������ö���ʵ�֣�
   /* public List<List<Integer>> levelOrder(TreeNode root) {
        //����� ArrayList�ײ�����ʵ�֣��ʺϲ�ѯ����  ����LinkList�ײ�����ʵ�֣��ʺ���ɾ��
        //����LinkList��ʵ����Deque�ӿڿ��Ե�������ʹ��
        List<List<Integer>> res = new LinkedList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        int size = -1;
        if (root==null){
            return res;
        }
        queue.offer(root);
        //����Ϊ�գ�֤���������
        while(!queue.isEmpty()){
            //��¼ÿ��Ԫ�����������ڱ�����һ���Լ���������
            size =queue.size();
            //ÿ���Ԫ�ش����һά���������������
            LinkedList<Integer> everyLevel = new LinkedList<>();
            //����size��С������ͬһ��Ľڵ�
            //��󽫵����ڵ���ӽڵ㣨����еĻ����������
            while((size--)>0){
                TreeNode node = queue.poll();
                //�������в����������
                everyLevel.add(node.val);
                //����������ӣ����������              ****ÿһ��������ұ����Ļ�****
                if (node.leftNode!=null){
                    queue.offer(node.leftNode);
                }
                //ͬ��
                if (node.rightNode!=null){
                    queue.offer(node.rightNode);
                }

            }
            //���������һ���������
            res.add(everyLevel);

        }
        return res;
    }*/

    //�ݹ鷨ʵ��

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root==null) return  res;
        //���õݹ�
        fun(root,0);
        return res;
    }

    private void fun(TreeNode node, int deep) {
        //�ж�����
        if (node==null)
            return;
        //������������ʾһ�εݹ�����������һ��
        deep++;

        //ʹ��deep�����ƴ���ÿһ��Ĳ�����
        //����deep�ڵݹ��������������ɲ�������¼��һ���ֵ�� ÿһ��ݹ����ҽڵ㴫�����ͬһ��deep������˵ÿһ��ֻ����һ������ѭ��
        if (res.size()<deep){
            //����ÿһ���list
            ArrayList<Integer> itemRes = new ArrayList<>();
            //����һ���list��������
            res.add(itemRes);
        }
        //����node
        res.get(deep-1).add(node.val);


        //�ݹ�
        fun(node.leftNode,deep);
        fun(node.rightNode,deep);
    }
}
