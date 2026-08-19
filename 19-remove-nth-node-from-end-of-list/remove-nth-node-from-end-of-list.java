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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }

      int size=0;
      ListNode cur=head;
      while(cur!=null){
        size++;
        cur=cur.next;
      }  
      if(size==n){
        return head.next;
      }
      ListNode pre=head;
      int ind=size-n;
      int i=1;
      while(i<ind){
        pre=pre.next;
        i++;

      }
      pre.next=pre.next.next;
      return head;
    }
}