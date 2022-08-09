public class leetcode541 {
    public String reverseStr(String s, int k) {
        char[] ch=s.toCharArray();
        for(int i = 0; i<ch.length; i+=2*k){//每次循环后跳2k个
            if (i+k<=s.length()){/**这里的区间可以不加=，如果不加=，对应结尾=k这种情况由reverse(ch,i,ch.length-1);处理,
             如果加上等号由reverse(ch,i,i+k-1);处理。不论那种情况处理对于结尾剩k这个条件[i,i+k)和[i,ch.length)这两个区间等价
             */
                reverse(ch,i,i+k-1);//每次翻转k个
                continue;//如果翻转直接跳入下次循环，不再执行后面的结尾处理
            }
            //结尾处理
            reverse(ch,i,ch.length-1);
        }
        return new String(ch);
    }
    //翻转方法
    public void reverse(char[] ch,int a,int b){
        for (;a<b;a++,b--){
            ch[a]^=ch[b];
            ch[b]^=ch[a];
            ch[a]^=ch[b];
        }
    }
}
