import java.util.HashMap;
import java.util.Map;

public class leetcode1 {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];//�������

        //�п�
        if (nums==null||nums.length==0){
            return res;
        }
        //�����Ҫ����ֵ����Ҫ�����±꣬����ֵ���±�ȫҪ���£������map
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();

        for (int i=0;i<nums.length;i++){
            if (map.containsKey(target-nums[i])){//�ж��Ƿ����target-nums[i]����һ������
                res[0]=i;//���ؼ���1��
                res[1]=map.get(target-nums[i]);//���ؼ���2
            }
            map.put(nums[i],i);//��������ڣ�ֱ�Ӽ���map�ȴ�������ж�
        }
        return res;
    }
}
