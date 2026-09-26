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
    static ListNode reverseList(ListNode head) {

        ListNode curr = head, prev = null, next;

        while (curr != null) {
            next = curr.next;

            
            curr.next = prev;

         
            prev = curr;
            curr = next;
        }

        return prev;
    }
    public void reorderList(ListNode head) {
             int len = 1;
        ListNode temp = head;
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        int n = len;
        temp = head;
        for(int i = 0;i<(n/2);i++){
            temp = temp.next;
        }
        ListNode head2 = temp.next;
        temp.next = null;
        head2 = reverseList(head2);
        temp =head;
            for(int i =0;i<n/2;i++){
                if(head2==null)break;
            ListNode temp2 = temp.next;
                temp.next = head2;
            ListNode temp3 = head2.next;
                head2.next = temp2;
                head2 = temp3;
                temp = temp.next.next;
                
            }
    }
}
