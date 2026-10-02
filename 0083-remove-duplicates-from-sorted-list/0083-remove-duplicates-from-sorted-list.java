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
        ListNode currunt = head;
        while(currunt != null && currunt.next != null){
            if(currunt.val == currunt.next.val){
               currunt.next = currunt.next.next;
            }else{
                currunt = currunt.next;

            }
        }
        return head;
    }
}