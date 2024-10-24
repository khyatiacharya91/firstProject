package recursion;

 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public static void main(String[] args) {
        Solution solution =new Solution();
        ListNode listNode = new ListNode();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        solution.isPalindrome(head);
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer=head;
        while(fastPointer != null && fastPointer.next != null)
        {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        fastPointer =reverseList(head);
        return recursivelyCheck(fastPointer,slowPointer);
    }

    private boolean recursivelyCheck(ListNode fastPointer,ListNode slowPointer) {
        if(slowPointer ==null) return false;

        if (!recursivelyCheck(fastPointer.next,slowPointer.next))
        {
            return false;
        }

        return fastPointer.val == slowPointer.val;
    }
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}