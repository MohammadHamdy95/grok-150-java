package com.mohamdy.grok150.linkedlist;

/**
 * LeetCode 19. Remove Nth Node From End of List &mdash; Medium
 *
 * <p>Complexity (optimal): Time O(n), Space O(1).
 *
 * @see <a href="https://neetcode.io/problems/remove-node-from-end-of-linked-list/question">https://neetcode.io/problems/remove-node-from-end-of-linked-list/question</a>
 */
public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 4;
        ListNode curent = head;
        while (curent.next != null) {
//            if (index == n-1){
//                curent.next = curent.next.next;
//                return head;
//            }
            curent = curent.next;
            size++;
        }
        ListNode tail = curent;
        System.out.println("Tail: "+tail.val);
        int indexToRemove = size - n;
        int index = 0;
        curent = head;
        while (index <= indexToRemove) {
            if (index == indexToRemove-1) {
                System.out.println(curent.next.val);
                curent.next = curent.next.next;
            }
            System.out.println(curent.val);
            curent = curent.next;
            index++;
        }

        System.out.println(size);
        return head;

//        throw new UnsupportedOperationException("Not implemented yet.");
    }
}
