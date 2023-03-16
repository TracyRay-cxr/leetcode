

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class leetcode637 {
    //������������У���ÿ��ڵ�ֵ�ĺ�
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        //�ö��е���
        LinkedList<TreeNode> queue = new LinkedList<>();
        //��ʼ������
        int size=Integer.MIN_VALUE;
        //��ʼ��������
        int shang =0;
        queue.offerLast(root);

        while (!queue.isEmpty()){
            //�����������ƽ��ֵ
            Double sum= 0.0;
            //��ö��д�С
            size=queue.size();
           for (int i =0;i<size;i++){
                //����ڵ�
                TreeNode node = queue.pollFirst();
                //��ǰ��֮��
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
