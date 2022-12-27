package LinkedLists;

public class Node {
    private int _val;
    private Node _next;

    // Constructors
    public Node(int v, Node n)
    {
        _val = v;
        _next = n;
    }
    public Node(int v)
    {
        _val = v;
    }

    // Getters & Setters
    public int getVal() { return _val; }
    public Node getNext() { return _next; }
    public void setVal(int v) { _val = v; }
    public void setNext(Node n) { _next = n; }
}
