public class leetcode26 {
        public int removeDuplicates(int[] nums) {
            int slowindex;
            int fastindex=1;//快慢指针快指针比慢指针高1位，两个指针进行比较值是否重复
            for(slowindex=0;fastindex<nums.length;fastindex++){
                if(nums[fastindex]!=nums[slowindex]){
                    nums[++slowindex]=nums[fastindex];//慢指针指向第一个值，把后面的重复值覆盖，并且慢指针指向下一个不重复的值
                }
            }
            return slowindex+1;//返回的是数组有效长度；
    }
}
