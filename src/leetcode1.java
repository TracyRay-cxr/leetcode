import java.util.HashMap;
import java.util.Map;

public class leetcode1 {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];//结果数组

        //判空
        if (nums==null||nums.length==0){
            return res;
        }
        //此题既要查找值，有要返回下标，所以值和下标全要记下，因此用map
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();

        for (int i=0;i<nums.length;i++){
            if (map.containsKey(target-nums[i])){//判断是否存在target-nums[i]的另一个加数
                res[0]=i;//返回加数1；
                res[1]=map.get(target-nums[i]);//返回加数2
            }
            map.put(nums[i],i);//如果不存在，直接加入map等待后面的判断
        }
        return res;
    }
}
