public class IntNode
{
    int val;
    IntNode next;

    public IntNode(int x)
    {
        val = x;
        next = null;
    }
    
    public void setNext(IntNode n)
    {
        next = n;
    }
    public void setVal(int x)
    {
        val = x;
    }
    public IntNode getNext()
    {
        return next;
    }
    public int getVal()
    {
        return val;
    }
}