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
    public ListNode detectCycle(ListNode head) {
        ListNode tur=head;
        ListNode rab=head;
        while(rab!=null&&rab.next!=null){
            tur=tur.next;
            rab=rab.next.next;
            if(rab==tur){
                break;
            }
        }
        if(rab==null||rab.next==null){
            return null;
        }
        tur=head;
        while(tur!=rab){
            tur=tur.next;
            rab=rab.next;
        }
        return tur;
    }
}