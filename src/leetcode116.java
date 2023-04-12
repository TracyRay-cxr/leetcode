import java.util.LinkedList;

public class leetcode116 {
    public node connect(node root) {
        //���ÿ���ڵ����һ���Ҳ�ڵ�
        if (root==null){
            return root;
        }
        LinkedList<node> queue = new LinkedList<>();
        int size=0;
        queue.offerLast(root);
        while(!queue.isEmpty()){
            size=queue.size();
            while(size>0){
                node node = queue.pollFirst();
                //����ڵ�
                size--;
                if (size==0){
                    node.next=null;
                }else{
                    node nextNode =queue.peekFirst();
                    node.next=nextNode;
                }
                if (node.left!=null)queue.offerLast(node.left);
                if (node.right!=null)queue.offerLast(node.right);
            }

        }

    return root;
    }
}

class node {
    public int val;
    public node left;
    public node right;
    public node next;

    public node() {}

    public node(int _val) {
        val = _val;
    }

    public node(int _val, node _left, node _right, node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
