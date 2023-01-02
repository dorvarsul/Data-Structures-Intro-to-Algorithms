package Trees;

import Trees.UtilityClasses.NodeQueue;

/*
 * This class has a function which prints a binary tree values using BFS method. meaning we first print the
 * values on level i before continuing down the tree to level i+1.
 */
public class BFSTreeSearch {
    public static void BFS(TreeNode root)
    {
        if (root == null)
        {
            return;
        }

        NodeQueue q = new NodeQueue();
        q.enqueue(root);

        while(!q.isEmpty())
        {
            TreeNode n = q.dequeue();
            System.out.print(n.getVal());
            if (n.getLeft() != null)
            {
                q.enqueue(n.getLeft());
            }
            if (n.getRight() != null)
            {
                q.enqueue(n.getRight());
            }
        }
    }
}
