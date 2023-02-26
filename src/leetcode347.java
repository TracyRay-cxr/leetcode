import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class leetcode347 {
    public int[] topKFrequent(int[] nums, int k) {
        //创建hash表进行出现次数的统计
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //创建优先级队列（堆），设置比较器（小顶堆）
        PriorityQueue<int[]> pq = new PriorityQueue<>((pair1,pair2)->pair1[1]-pair2[1]);
        //只需维护k个二元数组（num，cnt）的小顶堆
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (pq.size()<k){
                pq.add(new int[]{entry.getKey(),entry.getValue()});
            }else {
                if (entry.getValue()>pq.peek()[1]){
                    pq.poll();
                    pq.add(new int[]{entry.getKey(),entry.getValue()});
                }
            }
        }
        int[] ans = new int[k];
        for (int i = k-1;i>=0;i--){
            ans[i]=pq.poll()[0];
        }
        return ans;
    }
}
