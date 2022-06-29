import java.util.*;

public class leetcode438 {
    /**
     * 定长滑动窗口，记录字母数比较，时间复杂度太高
     * @param s
     * @param p
     * @return
     */
    public List<Integer> findAnagrams(String s, String p) {
        if (s.length()<p.length())return null;
        //构造散列表
        int[] cnt1=new int[128];
        int[] cnt2=new int[128];
        List<Integer> list=new ArrayList<>();
        int plenth=p.length();
        int slenth=s.length();
        //窗口左右边界
       int high=0;
       int slow=0;
        //初始化map
        //先判断初始窗口是否是异构
        for (int i=0;i<plenth;i++){
            cnt2[s.charAt(i)]++;
            cnt1[p.charAt(i)]++;
        }
       if (Arrays.equals(cnt1,cnt2)){
           list.add(0);
       }
       //固定窗口长度为plenth,同时进行移动，判断每次移动的窗口是否是异构
        for (int i=0;i<slenth-plenth;i++){
            cnt2[s.charAt(i)]--;
            cnt2[s.charAt(i+plenth)]++;
            if (Arrays.equals(cnt1,cnt2)){
                list.add(i);
            }
        }
    return list;
    }
    /**
     * 优化过程，不再进行比较，窗口中有不同的字母窗口缩短直到走过不同的子母，如果窗口长度==p长度，窗口必是异构
     */

    public List<Integer> findAnagrams2(String s, String p){
        int high=0;
        int slow=0;
        int[] cnt=new int[128];
        List<Integer> res=new ArrayList<>();
        for (char c:p.toCharArray())cnt[c]++;
        while(high<s.length()){
            if (cnt[s.charAt(high)]>0){
                cnt[s.charAt(high++)]--;
                if ((high-slow)==p.length())res.add(slow);
            }else {
                cnt[s.charAt(slow++)]++;
            }
        }
        return res;
    }
}
