import java.util.HashMap;
import java.util.Map;

public class leetcode904 {
    public int  totalFruit(int[] fruits){
        int i =0;//�������ڵ���ʼλ��
        int j =0;//�������ڵ���ֹλ��
        int result=Integer.MIN_VALUE;//���ս��
        Map<Integer,Integer> map=new HashMap<>();
        int totalFruitlen=0;//���ڳ���
        for (j=0;j<fruits.length;j++){//��������
            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);//�жϼ������Ƿ������������������ȡ��ֵ����1��������ֱ�Ӹ�ֵ1��
            while(map.size()>2){//�жϼ������Ƿ񳬹�������ֵ��
                map.put(fruits[i
                        ],map.get(fruits[i])-1);//ÿ�ƶ�����ʱ������ֵ��ֵ��������1
                if (map.get(fruits[i])==0)//��һ����ֵ��ֵ�Լ�Ϊ0ʱ
                    map.remove(fruits[i]);//ɾ�������ֵ
                i++;//�ƶ����ڵ�ָ��
            }
        totalFruitlen=j-i+1;
        result=totalFruitlen<result?result:totalFruitlen;
        }
        return  result;

    }
}
