public class leetcode283 {
    public void moveZeroes(int[] nums) {
        if(nums.length<2){
            return;
        }
        int i=0;
        int j;//˫ָ��
        for(j=0;i<nums.length;i++){
            if(nums[i]!=0){//�ҵ�����ʱ���и���

                if(i>j){//����i=j;
                    nums[j]=nums[i];
                    nums[i]=0;
                }
                j++;//���Ǻ�������ƣ�i=jʱҲҪ����
            }
        }
    }

}
