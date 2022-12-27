package LinkedLists.Stacks;

import LinkedLists.Node;

/*
 * Implementation of a stack using a linked list
 */
public class Stack {
    Node _head;

    // Constructor
    public Stack()
    {
        _head = null;
    }

    // Push operation , Complexity O(1)
    public void push(int v)
    {
        Node temp = new Node(v);
        temp.setNext(_head);
        _head = temp;
    }

    // Pop operation , Complexity O(1)
    public int pop()
    {
        if (_head == null)
        {
            throw null;
        }
        else
        {
            int v = _head.getVal();
            _head = _head.getNext();
            return v;
        }
    }

    public boolean isEmpty()
    {
        return (_head == null);
    }

    public int peek()
    {
        return _head.getVal();
    }
}
