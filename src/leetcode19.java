public class leetcode19 {
    public ListNode removeNthFromEnd(ListNode head,int n){
        //��������ڵ�
        ListNode dummyHead=new ListNode();
        //ָ�����ͷ�ڵ�
        dummyHead.next=head;
        //��ָ��
        ListNode slow=dummyHead;
        //��ָ��
        ListNode fast=dummyHead;
        //��ָ�����ƶ�����n���ڵ㣬֮�����ָ��һ���ƶ�������ڵ�ĩβnull���Ӷ�ʼ������ָ�뱣��n�����룬ֱ�����
        while (n-->0){
            fast=fast.next;
        }

        ListNode prev=null;
        while (fast!=null){
           prev=slow;
           slow=slow.next;
           fast=fast.next;
        }
        prev.next=slow.next;

        slow.next=null;

        return dummyHead.next;

    }
}
