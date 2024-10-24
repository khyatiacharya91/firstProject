package recursion;

public class addTwoNumbers {
    public static void main(String[] args) {
        addTwoNumbers addTwoNumbers = new addTwoNumbers();
        ListNode l1 = new ListNode(2);
        l1.val = 1;
        l1.val=2;

//        addTwoNumbers.addTwoNumbers();

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbersRecursive(l1, l2, 0);
    }

    private ListNode addTwoNumbersRecursive(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        int sum = carry;
        if (l1 != null) {
            sum += l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            sum += l2.val;
            l2 = l2.next;
        }
        carry = sum / 10;
        ListNode resultNode = new ListNode(sum % 10);

        resultNode.next = addTwoNumbersRecursive(l1, l2, carry);

        return resultNode;
    }
}
