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
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merge = new ListNode(-1);
        ListNode result = merge;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                merge.next = list1; // первое значение оказалось меньше мы записали его в мердже
                list1 = list1.next;
            } else {
                merge.next = list2;
                list2 = list2.next;
            }
            merge = merge.next;
        }
        while (list1 != null) { // если в листе еще остались значения
            merge.next = list1;
            list1 = list1.next;
            merge = merge.next;
        }
        while (list2 != null) {
            merge.next = list2;
            list2 = list2.next;
            merge = merge.next;
        }
        return result.next;
    }
}