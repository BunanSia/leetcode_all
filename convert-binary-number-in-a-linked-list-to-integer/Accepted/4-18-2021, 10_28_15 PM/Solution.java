// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer

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
    int result=0;
    public int getDecimalValue(ListNode head) {
            if(head==null)
                return result;
            result=result<<1;
            result+=head.val;
            getDecimalValue(head.next);
            return result;
        
    }
}