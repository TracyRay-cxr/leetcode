public class leetcode283 {
    public void moveZeroes(int[] nums) {
        if(nums.length<2){
            return;
        }
        int i=0;
        int j;//双指针
        for(j=0;i<nums.length;i++){
            if(nums[i]!=0){//找到非零时进行覆盖

                if(i>j){//避免i=j;
                    nums[j]=nums[i];
                    nums[i]=0;
                }
                j++;//覆盖后进行右移，i=j时也要右移
            }
        }
    }

}
