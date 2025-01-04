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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0) return head;
        ListNode fast=head;ListNode slow=head;
        int size=1;
        while(fast.next!=null){
             size++;
             fast=fast.next;
        }
        k=k%size;
        for(int i=size-k;i>1;i--){
           slow=slow.next;
        }
        fast.next=head;
        head=slow.next;
        slow.next=null;
        return head;
    }
}