import java.util.HashMap;
import java.util.Map;

public class leetcode76 {
    public String minWindow(String s, String t) {
        int i=0;//窗口起始位置
        int j=0;//窗口结束位置
        int startstr=0;//符合条件的窗口的起始位置
        int result=Integer.MAX_VALUE;//最终结果
        Map<Character,Integer> map=new HashMap<>();//存放t数组的各个字符，用来比对窗口里是否存在目标字符
        for (char c:t.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);//存放过程
        }
       while(j<s.length()){//遍历s字符串
            char ch=s.charAt(j);//保存当前字符
            if (map.containsKey(ch)){//判断是否在map钟
                map.put(ch,map.getOrDefault(ch,0)-1);//如果存在，则值就自减1
            }
            j++;//向右移动窗口
           /**
            * 更新窗口，保存最小窗口；
            */
            while(check(map)){//判断map中的所有字符是否都已经在窗口钟
                int windowlen=j-i;//保存当前窗口长度
                if (windowlen<result){//判断是否跟当前最小覆盖子串的大小
                    result=windowlen;//取最小，更新最小窗口
                    startstr=i;//记录上一次窗口的起始位置，如果之后都没有更小的窗口，则该变量即为最终字符串的起始位置
                }

                /**
                 *    窗口左边界移动，缩小窗口：
                 *    缩小同时要检验左边界是否是目标字符，是否需要在map中自增（目标字符移出窗口，即不再被窗口覆盖）
                 */

                if (map.containsKey(s.charAt(i)))//判断左边界的值是否在map中
                    map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);//存在就自增表示不再覆盖该值
                i++;//无论是否不再覆盖，都要缩小窗口找下一个满足条件的值
            }
        }
       if (result!=Integer.MAX_VALUE){//判断是否s中不包括t的子串
           return s.substring(startstr,startstr+result);//返回最小覆盖子串
       }
        return "";//否则返回空串
    }
    public boolean check(Map<Character,Integer> map){//判断窗口是否覆盖了目标子串
        for (int val: map.values()) {//遍历 值集
            if (val>0)//如果有一个大于0就说明没有覆盖到全部子串
                return false;//返回false不再进行更新
        }
        return true;//进行更新操作
    }
}
