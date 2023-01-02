package Trees;

public class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

    // Constructor
    public TreeNode(int v)
    {
        val = v;
    }
    public TreeNode(TreeNode c)
    {
        val = c.getVal();
        left = c.getLeft();
        right = c.getRight();
    }
    
    // Getters & Setters
    public void setLeft(TreeNode l)
    {
        left = l;
    }
    public void setRight(TreeNode r)
    {
        right = r;
    }
    public void setVal(int v)
    {
        val = v;
    }

    public TreeNode getLeft()
    {
        return left;
    }
    public TreeNode getRight()
    {
        return right;
    }
    public int getVal()
    {
        return val;
    }
}
