import java.util.ArrayDeque;

public class leetcode239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //由于要维持队列内的元素是窗口内的元素而不是窗口外的元素，存入数组下标更容易维护
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int n = nums.length;
        int[] res = new int[n-k+1];
        int idx = 0;
        for (int i = 0; i < n ; i++){
            //维护单调队列使得满足队列中的下标都是当前窗口内的下标，左边界为i-k+1，将不合理的元素从队头弹出；
            while(!deque.isEmpty()&&deque.peek()<i-k+1){
                deque.poll();
            }
            //维护单调队列的单调性质，放入的元素与队列内的元素一一对比，将不符合单调的元素从队尾弹出
            while(!deque.isEmpty()&&nums[deque.peekLast()]<nums[i]){
                deque.pollLast();
            }
            //经过两次处理后把本次循环的元素加入队列
            deque.offer(i);
            //因为单调，所以每次窗口内的最大值都在队首
            if(i>=k-1){
                res[idx++]=nums[deque.peek()];
            }

        }
        return res;
    }
}
