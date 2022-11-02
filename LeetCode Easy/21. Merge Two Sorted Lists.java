/**
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
**/


class Solution {
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        ListNode t1 = head1;
        ListNode t2 = head2;
        ListNode head = null;
        ListNode tail = null;

        if(t1.val<=t2.val){
            head = t1;
            tail = t1;
            t1 = t1.next;
        }
        else{
            head = t2;
            tail = t2;
            t2 = t2.next;
        }
        while(t1!=null && t2!=null){
            if(t1.val<=t2.val){
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            }
            else{
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }
        }
        //one list over

        if(t1!=null){
            //first list remaining
            tail.next = t1;
        }
        else{
            tail.next = t2;
        }
        return head;
    }
}

