package Trees;

public class LinkedList {
    private Node _head;

    // Constructors
    public LinkedList()
    {
        _head = null;
    }
    public LinkedList(Node n)
    {
        _head = n;
    }

    // Add to list - Complexity O(1)
    public void addToList(TreeNode x)
    {
        Node p = new Node(x);

            if (_head != null)
            {
                p.setNext(_head);
            }
            _head = p;
    }

    // Print the linked list
    public String toString()
    {
        String str = "";
        Node p = _head;
        while (p != null)
        {
            str += "-| " + p.getVal() + " |-";
            p = p.getNext();
        }
        return str;
    }
}
