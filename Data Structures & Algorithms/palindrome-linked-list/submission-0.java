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
    public boolean isPalindrome(ListNode head) {
    //     if(head==null || head.next==null)return true;
    //     ListNode ll2=new ListNode(head.val) ;
    //     ListNode temp = head.next;
    //     while(temp!=null){
    //         ListNode t = new ListNode(temp.val);
    //         t.next = ll2;
    //         ll2=t;
    //         temp=temp.next;
    //     }

    //     temp = head;
    //     while(temp!=null){
    //         if(temp.val!=ll2.val)return false;
    //         temp=temp.next;
    //         ll2=ll2.next;
    //     }
    // return true;



    //Better Implementation with O(n) time and O(1) space

    if (head == null || head.next == null) return true;

    ListNode slow =head;
    ListNode fast=head;
    while(fast.next!=null && fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }

    ListNode head2 = rev(slow.next);
    slow.next=null;

    ListNode head11 = head;
    ListNode head22=head2;
    while(head11!=null && head22!=null){
        if(head11.val!=head22.val)return false;
        head11=head11.next;
        head22=head22.next;
    }

        return true;
    }

    ListNode rev(ListNode head){
        ListNode prev=null,cur=head,next;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;

    }
}