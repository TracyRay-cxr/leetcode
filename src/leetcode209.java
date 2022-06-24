public class leetcode209 {
    public int minSubArraylen(int target,int[] nums){
        int i=0;//滑动窗口的起始指针
        int j=0;//滑动窗口的终止指针
        int result=nums.length;//最终结果
        int subArraylen=0;//和数数组的长度（窗口长度）
        int sum=0;//窗口内之和
        for (j=0;j<nums.length;j++){
            sum+=nums[j];
            while(sum>=target){//判断是否满足题目条件
                subArraylen=j-i+1;//窗口的长度
                result=result<subArraylen?result:subArraylen;//取小的值更新result
                sum-=nums[i++];//因为sum是窗口之和，当缩小窗口时，sum也要改变，i++先取值再自增;
            }
        }
        if (subArraylen==0){
            return 0;
        }
        return result;
    }
}
