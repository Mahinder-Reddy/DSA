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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode rightHead=slow.next;
        slow.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(rightHead);
        return merge(left,right);
    }
    public ListNode merge(ListNode left,ListNode right){
         ListNode dummy = new ListNode(0);
         ListNode cur = dummy;
        while(left!=null&&right!=null){
            if(left.val<=right.val){
                cur.next=left;
                left=left.next;
            }else{
                cur.next=right;
                right=right.next;
            }
            cur=cur.next;
        }
        if (left != null) {
            cur.next = left;
        }

        if (right != null) {
            cur.next = right;
        }

        return dummy.next;
    }
}