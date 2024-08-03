/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeElements(ListNode* head, int value) {
        ListNode* dummy=  new ListNode(0);
        ListNode* current = head;
        ListNode* previous = dummy;
        while(current){
            if(current->val!=value){
                previous->next=current;
                previous=current;
            }
            current=current->next;
        }
        previous->next=NULL;
        return dummy->next;

    }
};