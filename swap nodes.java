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
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode temp = head;
        ListNode buf = temp.next;
        temp.next = buf.next;
        buf.next = temp;
        ListNode newhead = buf;
        while(temp.next!=null && temp.next.next!=null){
            ListNode buff = temp.next;
            temp.next = buff.next;
            buff.next = temp.next.next;
            temp.next.next = buff;
            temp = buff;
        }
        return newhead;
    }
}
