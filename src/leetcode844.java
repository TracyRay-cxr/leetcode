import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class leetcode844 {

        public static boolean backspaceCompare(String s, String t) {
            int i = s.length() - 1;//指针1，遍历字符串s
            int j = t.length() - 1;//指针1，遍历字符串t
            int skipS = 0;//指针2，记录退格#
            int skipT = 0;//指针2，记录退格#
            while (i >= 0 || j >= 0) {//进入大循环，大循环用来判断两个字符串有效字符是否相等
                while (i >= 0) {//小循环，遍历字符串s，通过双指针找到有效字符，并且与大循环共享一个指针
                    if (s.charAt(i) == '#') {//记录退格数，并向前遍历
                        skipS++;
                        i--;
                    } else if (skipS > 0) {//如果有退格数，则该字符是无效字符直接向前遍历
                        skipS--;
                        i--;
                    } else break;//找到有效字符，退出小循环
                }
                while(j>=0){//同上
                    if (t.charAt(j)=='#'){
                        skipT++;
                        j--;
                    }else if (skipT>0){
                        skipT--;
                        j--;
                    }else break;
                }
                if (i>=0&&j>=0){//两个字符串在上方小循环有可能下标越界，在不越界的情况下判等字符
                    if (s.charAt(i)!=t.charAt(j)){//存在一个不相等的即整个不相等
                        return false;
                    }
                }else{//下标越界，如果两个字符串同时越界，则正常结束，等待下一次循环不成立即可
                    if (i>=0||j>=0){//一个字符串没有遍历完而另一个字符串遍历完，说明不等长，也就不相等
                        return false;
                    }
                }
                i--;//如果两个有效字符相等向前遍历
                j--;//同上
            }
            return true;
        }
     public static void main(String[] args) {
         leetcode844 leet=new leetcode844();
         System.out.println(    leet.backspaceCompare("bbbextm","bbb#extm"));

        }
}
