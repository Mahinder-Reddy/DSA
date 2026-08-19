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
    public ListNode reverse(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode prev=head;
        ListNode cur=head.next;
        while(cur!=null){
            ListNode nextnode=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nextnode;
        }
        head.next=null;
        head=prev;
        return prev;
    }
    public ListNode findMid(ListNode head){
        ListNode tur=head;
        ListNode rab=head;
        while(rab.next!=null&&rab.next.next!=null){
            rab=rab.next.next;
            tur=tur.next;
        }
        return tur;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
        ListNode mid=findMid(head);
        ListNode secSt=reverse(mid.next);
        ListNode fisSt=head;
        while(secSt!=null){
            if(fisSt.val!=secSt.val){
                return false;
            }
            fisSt=fisSt.next;
            secSt=secSt.next;
        }
        return true;
    }
}