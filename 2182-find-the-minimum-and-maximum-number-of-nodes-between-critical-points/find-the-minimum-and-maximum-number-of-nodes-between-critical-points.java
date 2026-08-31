/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int minDistance = Integer.MAX_VALUE;
        int maxDistance = -1;

        ListNode prev = head;
        ListNode curr = head.next;

        int index = 1;

        int firstCritical = -1;
        int lastCritical = -1;

        while (curr.next != null) {

            // Check whether curr is a critical point
            if ((curr.val > prev.val && curr.val > curr.next.val) ||
                (curr.val < prev.val && curr.val < curr.next.val)) {

                // First critical point
                if (firstCritical == -1) {
                    firstCritical = index;
                }

                // If this is not the first critical point
                if (lastCritical != -1) {
                    minDistance = Math.min(
                        minDistance,
                        index - lastCritical
                    );
                }

                lastCritical = index;
            }

            prev = curr;
            curr = curr.next;
            index++;
        }

        // Fewer than two critical points
        if (firstCritical == lastCritical) {
            return new int[]{-1, -1};
        }

        // Distance between first and last critical points
        maxDistance = lastCritical - firstCritical;

        return new int[]{minDistance, maxDistance};
    }
}