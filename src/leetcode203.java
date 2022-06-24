public class leetcode203 {
    //�ݹ�
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {//�ݹ��й�������������һ���ڵ����Ч
            return head;//���Ϲ�
        }
        head.next = removeElements(head.next, val);//�ݹ�
        return head.val == val ? head.next : head;//ɾ������
    }
    //����
   /* public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return dummyHead.next;
    }*/

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
