package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> head = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ListNode node = null;
        for (int i = 6; i >= 0; i--){
            node = new ListNode(i, node);
        }
        System.out.println(middleNode(node));

    }

    public static ListNode middleNode(ListNode head) {
        ListNode node = head;
        int step = 0;
        while (node != null){
            step++;
            node = node.next;
        }
        return head;
    }

}
