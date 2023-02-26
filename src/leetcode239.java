import java.util.ArrayDeque;

public class leetcode239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //����Ҫά�ֶ����ڵ�Ԫ���Ǵ����ڵ�Ԫ�ض����Ǵ������Ԫ�أ����������±������ά��
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int n = nums.length;
        int[] res = new int[n-k+1];
        int idx = 0;
        for (int i = 0; i < n ; i++){
            //ά����������ʹ����������е��±궼�ǵ�ǰ�����ڵ��±꣬��߽�Ϊi-k+1�����������Ԫ�شӶ�ͷ������
            while(!deque.isEmpty()&&deque.peek()<i-k+1){
                deque.poll();
            }
            //ά���������еĵ������ʣ������Ԫ��������ڵ�Ԫ��һһ�Աȣ��������ϵ�����Ԫ�شӶ�β����
            while(!deque.isEmpty()&&nums[deque.peekLast()]<nums[i]){
                deque.pollLast();
            }
            //�������δ����ѱ���ѭ����Ԫ�ؼ������
            deque.offer(i);
            //��Ϊ����������ÿ�δ����ڵ����ֵ���ڶ���
            if(i>=k-1){
                res[idx++]=nums[deque.peek()];
            }

        }
        return res;
    }
}
