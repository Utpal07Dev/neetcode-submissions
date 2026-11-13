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
        
        int len = 0;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            len+=2;
            fast=fast.next.next;
        }
        if(fast!=null)len++;

        if(n==len)return head.next;
        fast = head;
        for(int i = 0;i<len-n-1;i++){
            fast=fast.next;
        }
        fast.next = fast.next.next;

    return head;
    }
}
