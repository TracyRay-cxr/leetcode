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
            s[left]^=s[right];//将a^b的结果放入a
            s[right]^=s[left];//将b再^上a^b得到a 放入b
            s[left++]^=s[right--];//将a^b再^a得到b 放入a

        }
    }
}
