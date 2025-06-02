/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {

        ListNode temp=null;
        temp=node;
        int t =0;
        while(temp!=null){
            t=temp.val;
            temp.val = temp.next.val;
            temp.next.val=t;
            if(temp.next.next==null){
                temp.next=null;
            }
            temp=temp.next;
        }
        
    }
}