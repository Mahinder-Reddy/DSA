/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode rab=head;
        ListNode tur=head;
        if(head==null){
            return false;
        }
        while(rab!=null&&rab.next!=null){
            rab=rab.next.next;
            tur=tur.next;
            if(rab==tur){
                return true;
            }
        }
        return false;
    }
}