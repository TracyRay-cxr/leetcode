public class leetcode344 {
    public void reverseString(char[] s) {
        if (s.length<=0||s==null){
            return;
        }
//        char temp;
        int left=0;
        int right=s.length-1;
        while(left<s.length/2){
//            temp=s[left];
//            s[left++]=s[right];
//            s[right--]=temp;
            s[left]^=s[right];//��a^b�Ľ������a
            s[right]^=s[left];//��b��^��a^b�õ�a ����b
            s[left++]^=s[right--];//��a^b��^a�õ�b ����a

        }
    }
}
