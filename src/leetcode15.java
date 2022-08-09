import java.util.*;

public class leetcode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            if (nums[i]>0){
                break;//排序后!第一个元素就小于0，说明数组里任意三数之和不能=0
            }
            if (i>0
                    &&nums[i]==nums[i-1]){
                continue;//去重，要和之前的比这样不会漏掉，{-2，-1，-1，-1，-1，-1，-1，-1，2}这种如果跟i+1比会漏掉一个
            }
            int left=i+1;
            int right= nums.length-1;
            while(left<right){
                if (nums[i]+nums[left]+nums[right]>0){//三数之和大于0，又因为数组排序，所以right左移可以减小和的值
                    right--;
                }
                else if (nums[i]+nums[left]+nums[right]<0){//同上
                    left++;
                }
                else{
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));//排除大于和小于就是找到三个=0的数，添加到要返回的list
                    //然后去重
                    //重复的组合直接跳过 ,两种方式
                    //1.跟下一个比,要在先进性一次left++和right--之前跳
//                    while(left<right&&nums[left]==nums[left+1])left++;
//                    while (left< right&&nums[right]==nums[right-1])right--;
                    //不管跳不跳重复的都要进行left和right下一次组合
                    left++;
                    right--;
                    //2.跟上一个比，要在先进性一次left++和right--之后跳
                    while(left<right&&nums[left]==nums[left-1])left++;
                    while (left< right&&nums[right]==nums[right+1])right--;
                }
            }
        }
        return res;
    }
}
