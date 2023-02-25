package dayThree;
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
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head, nxt; // обьявление переменных предыдущей ,текущей следующего элемента;
        while (curr != null) {
            nxt = curr.next; // запоминаем куда текущая нода указывает;
            curr.next = prev; // текущая нода указывает на предыдущую
            prev = curr; // сама предыдущая нода становиться текущей
            curr = nxt;
        }
        return prev;
    }
}