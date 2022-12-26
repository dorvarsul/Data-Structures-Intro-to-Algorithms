public class SwapKElementsInLinkedList {

    /*
     * Write an algorithm to replace K elements from the start of a linked list with the K elements from the end.
     * Example : List = 1 -> 3 -> 5 -> 7 -> 9 -> 11 , k = 2
     *           New List = 9 -> 11 -> 5 -> 7 -> 1 -> 3
     * 
     * Time Complexity = O(n)
     *
     * Algorithm explanation by steps:
     * -Find the K element from the start
     * -Find the K element from the last and save the node before it (I'll refer to it as prev).
     * -Take the prev and have it point to the head of the list 
     * -Have the head of the list point to the K element from the last
     * -Find the last element in the list and have the K element from the start point to it.
     * -Set the K element from the start point to null (making it the last element on the list)
     */

    static void SwapK(LinkedList list, int k)
    {
        IntNode startK = list.getHead();
        int count = 1;

        while (startK != null && count < k)
        {
            startK = startK.getNext();
            count++;
        }
        if (startK == null)
            return;
        
        IntNode last = startK;
        IntNode lastK = list.getHead();
        IntNode prev = null;

        while (last.next != null)
        {
            last = last.next;
            prev = lastK;
            lastK = lastK.next;
        }
    }
}
