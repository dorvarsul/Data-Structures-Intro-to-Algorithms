package Trees;

public class Node {
    private TreeNode _val;
    private Node _next;

    // Constructors
    public Node(TreeNode v, Node n)
    {
        _val = v;
        _next = n;
    }
    public Node(TreeNode v)
    {
        _val = v;
    }

    // Getters & Setters
    public TreeNode getVal() { return _val; }
    public Node getNext() { return _next; }
    public void setVal(TreeNode v) { _val = v; }
    public void setNext(Node n) { _next = n; }
}
