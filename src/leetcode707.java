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
    //size存储链表元素的个数
    int size;
    //虚拟头节点
    ListNode1 head;

    //初始化链表
    public MyLinkedList(){
        size=0;
        head=new ListNode1();
    }
    //获取第index个节点的数值
    public int get(int index){
        //如果index非法，返回-1
        if(index<0||index>=size){
            return -1;
        }
        ListNode1 currentNode=head;
        for (int i=0;i<=index;i++){
            currentNode = currentNode.next;
        }
        return currentNode.val;
    }
    //链表最前面插入一个节点
    public void addAtHead(int val){
        addAtIndex(0,val);
    }
    //链表末尾插入一个节点
    public void addAtTail(int val){
        addAtIndex(size,val);
    }
    //链表插入通用方法
    public void addAtIndex(int index,int val){
        if(index<0){
            index=0;
        }
        if (index>size){
            return;
        }
        size++;
        //找到要插入节点的前缀
        ListNode1 pred=head;
        for (int i=0;i<index;i++){
            pred=pred.next;
        }
        ListNode1 toAd=new ListNode1(val);
        toAd.next=pred.next;
        pred.next=toAd;

    }
    //删除第index个节点
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


