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
    public ListNode insert(ListNode head, int n){
        ListNode newNode = new ListNode(n);
        if(head == null) return newNode;

        ListNode temp = head;
        while(temp != null){
            if(temp.next == null) {
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        } 

        return head;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode ans = new ListNode();

        while(temp1 != null && temp2 != null){
            if(temp1.val < temp2.val){
                insert(ans, temp1.val);
                temp1 = temp1.next;
            }

            else if(temp1.val > temp2.val){
                insert(ans, temp2.val);
                temp2 = temp2.next;
            }

            else{
                insert(ans, temp1.val);
                insert(ans, temp2.val);
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }

            ListNode temp3 = ans;
            while(temp3.next != null)
                temp3 = temp3.next;

            if(temp1 == null)
                temp3.next = temp2;

            else if(temp2 == null)
                temp3.next = temp1;
                
        return ans.next;
    }
}