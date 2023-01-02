package Trees;

public class NodeQueue {
        private Node _front;
        private Node _back;
    
        public void enqueue(TreeNode n)
        {
            Node temp = new Node(n);
            temp.setNext(null);
    
            // This if will be executed if the queue is currently empty
            if (_back == null)
            {
                _front = temp;
                _back = temp;
            }
            else
            {
                _back.setNext(temp);
                _back = _back.getNext();
            }
        }
    
        public TreeNode dequeue()
        {
            // This if will throw an exception if we try to dequeue from an empty queue
            if (_front == null)
            {
                throw null;
            }
    
            TreeNode x = _front.getVal();
            _front = _front.getNext();
    
            // This if will execute if we have one last remaining element in the queue (which we are now dequeueing)
            if (_front == null)
            {
                _back = null;
            }
    
            return x;
        }

        public boolean isEmpty()
        {
            if(_front == null)
            {
                return true;
            }
            return false;
        }
}
