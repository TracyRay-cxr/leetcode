import java.util.HashMap;
import java.util.Map;

public class leetcode904 {
    public int  totalFruit(int[] fruits){
        int i =0;//滑动窗口的起始位置
        int j =0;//滑动窗口的终止位置
        int result=Integer.MIN_VALUE;//最终结果
        Map<Integer,Integer> map=new HashMap<>();
        int totalFruitlen=0;//窗口长度
        for (j=0;j<fruits.length;j++){//遍历数组
            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);//判断集合内是否存在这个数，如果存在取其值自增1，不存在直接赋值1。
            while(map.size()>2){//判断集合内是否超过两种数值。
                map.put(fruits[i
                        ],map.get(fruits[i])-1);//每移动窗口时该类数值的值计数减少1
                if (map.get(fruits[i])==0)//当一种数值的值自减为0时
                    map.remove(fruits[i]);//删除这个数值
                i++;//移动窗口的指针
            }
        totalFruitlen=j-i+1;
        result=totalFruitlen<result?result:totalFruitlen;
        }
        return  result;

    }
}
