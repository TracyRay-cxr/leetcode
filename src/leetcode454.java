import java.util.HashMap;
import java.util.Map;

public class leetcode454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        if(nums1==null||nums2==null||nums3==null||nums4==null){
            return 0;
        }
        if (nums1.length<0||nums2.length<0||nums3.length<0||nums4.length<0){
            return 0;
        }
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        int sum=0;
        int target=0;
        //����1��2�ĺͣ����map�key�Ǻͣ�val�Ǵ���
        for(int i=0;i<nums1.length;i++){
            for (int j=0;j<nums2.length;j++){
                sum=nums1[i]+nums2[j];
                if (map.containsKey(sum)){
                    map.put(sum,map.get(sum)+1);
                }else{
                    map.put(sum,1);
                }
            }
        }
        //����3��4�ĺͣ�֮��ͺ�����֮��һ������map�����¸���
        for(int i=0;i<nums3.length;i++){
            for (int j=0;j<nums4.length;j++){
                target=0-(nums3[i]+nums4[j]);
                if (map.containsKey(target)){
                    count+=map.get(target);
                }
            }
        }
        return count;
    }
}
