public class leetcode28 {

    public void getNext(int[] next,String s){
        //初始化
        int j=-1;//初始化前缀的末尾,赋0是另一种写法
        next[0]=j;//由于第一个字符不可能存在相等前后缀，所以初始化为-1或者0

        //初始化后缀的开头
        for (int i=1;i<s.length();i++){//由于一个字符没有后缀，所以从两个字符子串开始，也就是i=1
            while(j>0&&s.charAt(i)!=s.charAt(j+1)){//前后缀不相同的情况
                j=next[j];//回退到上一个相等的位置
            }
            if (s.charAt(i)==s.charAt(j+1)){//前后缀相同的情况
                j++;//进行下一子串的比较
            }
            next[i]=j;//当前子串的最长相等前后缀的长度赋给相对应的元素
        }
    }
    public int strStr(String haystack,String needle){
        if (needle.length()==0){
            return 0;//模式串为0，则返回0
        }
        int[] next=new int[needle.length()];
        getNext(next,needle);
        int j=-1;
        for (int i=0;i<haystack.length();i++){
            while(j>=0&&haystack.charAt(i)!=needle.charAt(j+1)){//目标串与模式串不匹配
                j=next[j];//回退到最长相等前后缀的前缀，用相等前缀代替后缀
            }
            if (haystack.charAt(i)==needle.charAt(j+1)){//目标串与模式串匹配
                j++;//进行下一个子串的匹配
            }
            if (j==needle.length()-1){//目标串与模式串完全匹配
                return (i-needle.length()+1);//则返回子串的开始下标
            }
        }
        return -1;//始终不匹配返回-1
    }
}
