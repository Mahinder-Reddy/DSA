class Solution {

    public ListNode findMiddle(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode tur = head;
        ListNode rab = head;

        while (rab.next != null && rab.next.next != null) {
            tur = tur.next;
            rab = rab.next.next;
        }

        return tur;
    }

    public ListNode reverseSecHalf(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = head;
        ListNode cur = head.next;

        while (cur != null) {

            ListNode next = cur.next;

            cur.next = prev;

            prev = cur;
            cur = next;
        }

        head.next = null;

        return prev;
    }

    public ListNode Merge(ListNode head1, ListNode head2) {

        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;

        while (head1 != null && head2 != null) {

            cur.next = head1;
            cur = cur.next;
            head1 = head1.next;

            cur.next = head2;
            cur = cur.next;
            head2 = head2.next;
        }

        if (head1 != null) {
            cur.next = head1;
        }

        if (head2 != null) {
            cur.next = head2;
        }

        return dummy.next;
    }

    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        // 1. Find middle
        ListNode mid = findMiddle(head);

        // 2. Separate second half
        ListNode second = mid.next;
        mid.next = null;

        // 3. Reverse second half
        second = reverseSecHalf(second);

        // 4. Merge alternately
        Merge(head, second);
    }
}