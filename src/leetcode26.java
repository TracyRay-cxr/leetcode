public class leetcode26 {
        public int removeDuplicates(int[] nums) {
            int slowindex;
            int fastindex=1;//����ָ���ָ�����ָ���1λ������ָ����бȽ�ֵ�Ƿ��ظ�
            for(slowindex=0;fastindex<nums.length;fastindex++){
                if(nums[fastindex]!=nums[slowindex]){
                    nums[++slowindex]=nums[fastindex];//��ָ��ָ���һ��ֵ���Ѻ�����ظ�ֵ���ǣ�������ָ��ָ����һ�����ظ���ֵ
                }
            }
            return slowindex+1;//���ص���������Ч���ȣ�
    }
}
