public class CycleDetection {
    public static boolean detectCycle(LinkedListNode head) {
        if(head == null)
        {
            return false;
        }
        LinkedListNode slow=head;
        LinkedListNode fast=head;

        while(fast != null && fast.next !=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                return true;
            }
        }
        return false;
    }
}

// Template for linked list node class

class LinkedListNode {
    public int data;
    public LinkedListNode next;
    // Constructor will be used to make a LinkedListNode type object
    public LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
