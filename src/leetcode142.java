public class leetcode142 {
    public ListNode detectCycle(ListNode head) {
        if(head==null|head.next==null)return null;
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;//��ָ����һ��
            fast=fast.next.next;//��ָ��������
            if (slow==fast) {//����֤���л�
                /**
                 *  slowָ���߹��Ľڵ���Ϊ: x + y�� fastָ���߹��Ľڵ�����x + y + n (y + z)��nΪfastָ���ڻ�������nȦ������slowָ�룬 ��y+z��Ϊ һȦ�ڽڵ�ĸ���A��
                 *
                 * ��Ϊfastָ����һ���������ڵ㣬slowָ��һ����һ���ڵ㣬 ���� fastָ���߹��Ľڵ��� = slowָ���߹��Ľڵ��� * 2��
                 *
                 * (x + y) * 2 = x + y + n (y + z)
                 *
                 * ��������һ����x+y��: x + y = n (y + z)
                 *
                 * ��ΪҪ�һ��ε���ڣ���ôҪ�����x����Ϊx��ʾ ͷ��㵽 ������ڽڵ�ĵľ��롣
                 *
                 * ����Ҫ��x ����x�����������棺x = n (y + z) - y ,
                 *
                 * �ٴ�n(y+z)�����һ�� ��y+z����������ʽ֮��Ϊ���¹�ʽ��x = (n - 1) (y + z) + z ע������nһ���Ǵ��ڵ���1�ģ���Ϊ fastָ������Ҫ����һȦ��������slowָ�롣
                 *
                 * �����ʽ˵��ʲô�أ�
                 *
                 * ����nΪ1���������������ζ��fastָ���ڻ�����ת��һȦ֮�󣬾������� slowָ���ˡ�
                 *
                 * �� nΪ1��ʱ�򣬹�ʽ�ͻ���Ϊ x = z��
                 *
                 * �����ζ�ţ���ͷ������һ��ָ�룬�������ڵ� Ҳ����һ��ָ�룬������ָ��ÿ��ֻ��һ���ڵ㣬 ��ô��������ָ��������ʱ����� ������ڵĽڵ㡣
                 */
                //һ����ͷ�ڵ��ߣ�һ���������ڵ��ߣ�ÿ�ζ���һ����������Ϊ���
                ListNode index1 = fast;
                ListNode index2 = head;
                while (index1 != index2) {
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index2; // ���ػ������
            }
        }
        return null;
    }
}
