import java.util.*;

public class leetcode438 {
    /**
     * �����������ڣ���¼��ĸ���Ƚϣ�ʱ�临�Ӷ�̫��
     * @param s
     * @param p
     * @return
     */
    public List<Integer> findAnagrams(String s, String p) {
        if (s.length()<p.length())return null;
        //����ɢ�б�
        int[] cnt1=new int[128];
        int[] cnt2=new int[128];
        List<Integer> list=new ArrayList<>();
        int plenth=p.length();
        int slenth=s.length();
        //�������ұ߽�
       int high=0;
       int slow=0;
        //��ʼ��map
        //���жϳ�ʼ�����Ƿ����칹
        for (int i=0;i<plenth;i++){
            cnt2[s.charAt(i)]++;
            cnt1[p.charAt(i)]++;
        }
       if (Arrays.equals(cnt1,cnt2)){
           list.add(0);
       }
       //�̶����ڳ���Ϊplenth,ͬʱ�����ƶ����ж�ÿ���ƶ��Ĵ����Ƿ����칹
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
     * �Ż����̣����ٽ��бȽϣ��������в�ͬ����ĸ��������ֱ���߹���ͬ����ĸ��������ڳ���==p���ȣ����ڱ����칹
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
