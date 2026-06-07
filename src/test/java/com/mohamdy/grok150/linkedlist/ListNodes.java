package com.mohamdy.grok150.linkedlist;

// Test-only helpers for building/reading linked lists.
final class ListNodes {
    private ListNodes() {
    }

    static ListNode of(int... values) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        for (int v : values) {
            cur.next = new ListNode(v);
            cur = cur.next;
        }
        return dummy.next;
    }

    static int[] toArray(ListNode head) {
        java.util.List<Integer> out = new java.util.ArrayList<>();
        while (head != null) {
            out.add(head.val);
            head = head.next;
        }
        int[] r = new int[out.size()];
        for (int i = 0; i < r.length; i++) {
            r[i] = out.get(i);
        }
        return r;
    }
}
