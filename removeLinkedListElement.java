/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 *  1->3->5->5->3
 *  
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode current = head;
        ListNode newHead = head;
        while(current!=null){
            if(current.val == val && prev ==null){
                newHead = current.next;
                current = current.next;
            }
            else if(current.val==val){
                prev.next = current.next;
                current = current.next;
            }
            else{
                prev = current;
                current = current.next;
            }
        }
        return newHead;
    }
}