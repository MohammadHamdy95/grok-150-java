package com.mohamdy.grok150.linkedlist;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * LeetCode 2. Add Two Numbers &mdash; Medium
 *
 * <p>Complexity (optimal): Time O(max(n, m)), Space O(max(n, m)) (output).
 *
 * @see <a href="https://neetcode.io/problems/add-two-numbers/question">https://neetcode.io/problems/add-two-numbers/question</a>
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int currentSum = 0;
        Queue<Integer> integers = new ArrayDeque<>();
        while (l1.next != null) {
            currentSum = l1.val + l2.val;
            integers.add(currentSum);


            System.out.println(l1.val);
            System.out.println(l2.val);
            System.out.println("-------");
            l1 = l1.next;
            l2 = l2.next;
        }

        System.out.println(integers);

        throw new UnsupportedOperationException("Not implemented yet.");
    }
}
