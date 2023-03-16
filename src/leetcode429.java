import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class leetcode429 {
    //多叉树层序遍历，注意多叉树结构
    public List<List<Integer>> levelOrder(Node root) {
        if (root==null){
            return new ArrayList<>();
        }
        ArrayList<List<Integer>> res = new ArrayList<>();
        LinkedList<Node> queue = new LinkedList<>();
        int size=0;
        queue.offerLast(root);
        while(!queue.isEmpty()){
            ArrayList<Integer> level = new ArrayList<>();
            size=queue.size();
            for (int i =0;i<size;i++){
                Node poll = queue.pollFirst();
                level.add(poll.val);
                if (poll.children==null||poll.children.size()==0){
                    continue;
                }
                for (Node child : poll.children) {
                    if (child!=null)
                    queue.offerLast(child);
                }
            }
        res.add(level);
        }

        return res;
    }
}
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};