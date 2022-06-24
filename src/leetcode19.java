public class leetcode19 {
    public ListNode removeNthFromEnd(ListNode head,int n){
        //创建虚拟节点
        ListNode dummyHead=new ListNode();
        //指向真的头节点
        dummyHead.next=head;
        //慢指针
        ListNode slow=dummyHead;
        //快指针
        ListNode fast=dummyHead;
        //快指针先移动到第n个节点，之后跟慢指针一起移动到链表节点末尾null，从而始终与慢指针保持n个距离，直到最后
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
