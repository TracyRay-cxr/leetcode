public class leetcode707 {
}
class ListNode1{
    int val;
    ListNode1 next;
    ListNode1(){}
    ListNode1(int val){
        this.val=val;
    }
}
class MyLinkedList{
    //size�洢����Ԫ�صĸ���
    int size;
    //����ͷ�ڵ�
    ListNode1 head;

    //��ʼ������
    public MyLinkedList(){
        size=0;
        head=new ListNode1();
    }
    //��ȡ��index���ڵ����ֵ
    public int get(int index){
        //���index�Ƿ�������-1
        if(index<0||index>=size){
            return -1;
        }
        ListNode1 currentNode=head;
        for (int i=0;i<=index;i++){
            currentNode = currentNode.next;
        }
        return currentNode.val;
    }
    //������ǰ�����һ���ڵ�
    public void addAtHead(int val){
        addAtIndex(0,val);
    }
    //����ĩβ����һ���ڵ�
    public void addAtTail(int val){
        addAtIndex(size,val);
    }
    //�������ͨ�÷���
    public void addAtIndex(int index,int val){
        if(index<0){
            index=0;
        }
        if (index>size){
            return;
        }
        size++;
        //�ҵ�Ҫ����ڵ��ǰ׺
        ListNode1 pred=head;
        for (int i=0;i<index;i++){
            pred=pred.next;
        }
        ListNode1 toAd=new ListNode1(val);
        toAd.next=pred.next;
        pred.next=toAd;

    }
    //ɾ����index���ڵ�
    public void deleteAtIndex(int index){
        if (index<0||index>=size){
            return;
        }
        size--;
        ListNode1 pred=head;
        for (int i=0;i<index;i++){
            pred=pred.next;
        }
        pred.next=pred.next.next;
    }
}


