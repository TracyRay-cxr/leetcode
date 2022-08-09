import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0;i< nums.length;i++){
            if (nums[i]>0&&nums[i]>target){
                break;//一级剪枝
            }
            if (i>0
                    &&nums[i]==nums[i-1]){
                continue;//一级去重
            }
            for(int j=i+1;j< nums.length;j++)
            {
                if (nums[i]+nums[j]>0&&nums[i]+nums[j]>target){
                    break;//二级剪枝
                }
                if(j>i+1&&nums[j]==nums[j-1]){
                    continue;//二级去重
                }
                int left=j+1;//双指针判断，同三数之和
                int right= nums.length-1;
                while(left<right){
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;
                    }
                    else{
                        list.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));//将结果添加到结果集合里
                        //移动下标,判断下一组，此时同时移动，如果只动其一，则另一个值已固定并与之前的重复
                        right--;
                        left++;
                        //剪枝和去重
                        while(nums[left]==nums[left-1]&&left<right)left++;
                        while (nums[right]==nums[right+1]&&left<right)right--;

                    }
                }
            }
        }
        return list;
    }
}
