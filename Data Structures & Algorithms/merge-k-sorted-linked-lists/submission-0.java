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
     public ListNode merge(ListNode list1, ListNode list2) {
        if(list1 == null)return list2;
        if(list2 == null)return list1;

        if(list1.val<=list2.val){
            list1.next=merge(list1.next,list2);
            return list1;
        }
        else{
            list2.next = merge(list1,list2.next);
            return list2;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)return null;
        Queue<ListNode> q = new LinkedList<>();
        for(int i = 0;i<lists.length;i++){
            q.offer(lists[i]);
        }
        while(q.size()!=1){
            ListNode a = q.poll();
            ListNode b = q.poll();
            ListNode c= merge(a,b);
            q.offer(c);
        }

        return q.poll();
    }
}
