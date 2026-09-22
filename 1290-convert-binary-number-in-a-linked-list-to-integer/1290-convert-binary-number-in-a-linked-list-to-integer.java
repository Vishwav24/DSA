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
    public int getDecimalValue(ListNode head) {
        int count = -1, ans = 0;
        ListNode temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }

        temp = head;
        while(temp != null){
            if(temp.val == 1) 
                ans = ans + (int)(Math.pow(2, count));
            count--;
            temp = temp.next;
        }
        return ans;
    }
}