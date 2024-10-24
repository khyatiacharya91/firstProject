public class PalindromeList {
    public static void main(String[] args) {

    }
    public static boolean palindrome(LinkedListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while(fast != null && fast.next !=null)
        {
            slow=slow.next;
            fast = fast.next.next;
        }
        LinkedListNode cuurr = slow;
        LinkedListNode pre = null;

        while(cuurr !=null)
        {
            LinkedListNode next = cuurr.next;
            cuurr.next=pre;
            pre = cuurr;
            cuurr =next;
        }
        LinkedListNode firstHalf = head;
        LinkedListNode secondHalf = pre;
        while(secondHalf !=null)
        {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
}
