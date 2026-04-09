package LeetCode;

public class MiddleOfTheLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode middleNode(ListNode head) {

            int total = 0;

            ListNode temp = head;


            while (temp != null) {
                temp = temp.next;
                total++;
            }

            int n = total / 2;

            temp = head;


            for (int i = 0; i < n; i++) {
                temp = temp.next;
            }

            return temp;
        }
    }
}