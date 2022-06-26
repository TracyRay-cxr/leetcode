import java.util.*;

public class leetcode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        /**
         * ���򷽷�
         */
        //��ɢ�б�洢ӳ���ϵ���ж�ÿ����������Ӧ��ӳ��
        Map<String,List<String>> map=new HashMap<>();
        //�����е�������
        for (String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            //ɢ�б����������ĵ���ʱ�������б���
            List<String> list=map.getOrDefault(key,new ArrayList<>());
            list.add(s);
            //����ɢ�б�
            map.put(key,list);
        }
        //���췵��ֵ
        return new ArrayList<List<String>>(map.values());
    }
    /**
     * ��������ӳ���ϵ
     * �˻�̫��������ˣ����Ƽ�
     */
    public List<List<String>> groupAnagrams2(String[] strs){
        //��ɢ�б�洢ӳ���ϵ
        //������������ĸ��������ֲ�ͬ����ĸ
        Map<Integer,List<String>> map =new HashMap<>();
        int[] record=new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101 };
        //����ӳ���ϵ
        for (String s:strs){
            char[] ch=s.toCharArray();
            //ӳ��ļ�
            int product=1;
            int length = s.length();
            for (int i = 0; i < length; i++) {
                //����ÿ����ĸ�����������������˵õ�Ψһֵ
                product=product*record[ch[i]- 'a'];
            }
            List<String> list=map.getOrDefault(product,new ArrayList<>());
            list.add(s);
            map.put(product,list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
