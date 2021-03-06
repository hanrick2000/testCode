package lin.E3_20150805;

/**
 * Created by Paul on 8/4/15.
 * http://www.lintcode.com/en/problem/merge-two-sorted-lists/
 *
 */
//Merge Two Sorted Lists
//
//        38% Accepted
//        Merge two sorted (ascending) linked lists and return it as a new sorted list.
//        The new sorted list should be made by splicing
//        together the nodes of the two lists and sorted in ascending order.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given 1->3->8->11->15->null, 2->null , return 1->2->3->8->11->15->null.

/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */
public class E165MergeTwoSortedLists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    /**
     * @param ListNode l1 is the head of the linked list
     * @param ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
//        if(l1 == null && l2 == null) {
//            return null;
//        }
//
//        ListNode fakeHead = new ListNode(0);
//        ListNode p = fakeHead;
//        while(l1 != null && l2 != null) {
//            if(l1.val <= l2.val ){
//                p.next = l1;
//                l1 = l1.next;
//            }else {
//                p.next = l2;
//                l2 = l2.next;
//            }
//            p = p.next;
//        }
//        if(l1 == null) {
//            p.next = l2;
//        }
//        if(l2 == null) {
//            p.next = l1;
//        }
//        return fakeHead.next;
        if(l1 == null && l2 == null) {
            return l2;
        }
        if(l1 != null && l2 == null) {
            return l1;
        }
        if(l1 == null && l2 != null) {
            return l2;
        }
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while(l1 != null && l2 != null) {
            if(l1.val > l2.val) {
                head.next = l2;
                l2 = l2.next;
                head = head.next;
            } else {
                head.next = l1;
                l1 = l1.next;
                head = head.next;
            }
        }
        if(l1 != null) {
            head.next = l1;
        }
        if(l2 != null) {
            head.next = l2;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(8);
        ListNode d = new ListNode(11);
        ListNode e = new ListNode(15);
        ListNode f = new ListNode(2);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        ListNode g = mergeTwoLists(a, f);

    }
}
