public class leetcode27 {
    public int removeElement(int[] nums, int val) {
        int leftindex=0;
        int rightindex=nums.length-1;//相向指针
        while(leftindex<=rightindex){//当两个指针会面时结束循环
            while(leftindex<=rightindex&&nums[leftindex]!=val){//找到目标值
                ++leftindex;//指针向后移动一位，遍历直到找到目标值
            }
            while(leftindex<=rightindex&&nums[rightindex]==val){//找到非目标值
                --rightindex;//指针向前移动一位，遍历直到找到非目标值
            }
            if(leftindex<rightindex){
                nums[leftindex++]=nums[rightindex--];//把找到的目标值和非目标值覆盖，覆盖完后自增保证下次遍历,等价于下面的
                //nums[leftindex]=nums[rightindex--];
                //leftindex++;
                //rightindex--;
            }
        }
        return leftindex;
    }
}
