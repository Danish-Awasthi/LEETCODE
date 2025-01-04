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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy= new ListNode(0,head);
        ListNode curr=head;
        ListNode temp=dummy;
        while(curr!=null && curr.next!=null){
            if(curr.val!=curr.next.val){
                temp=curr;
                curr=curr.next;
            }
            else{
                int dup=curr.val;
                while(curr!=null && curr.val==dup){
                    curr=curr.next;
                }
                temp.next=curr;
            }
        }
        return dummy.next;
    }
}