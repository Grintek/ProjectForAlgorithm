package com.company.add_two_numbers;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int[] array = {2,4,3};
        ListNode node1 = new ListNode(array[array.length - 1]);
        for (int i = array.length - 2; i > -1; i--){
            node1 = new ListNode(array[i], node1);
        }
        int[] array2 = {5,6,4,3};
        ListNode node2 = new ListNode(array2[array2.length - 1]);
        for (int i = array2.length - 2; i > -1; i--){
            node2 = new ListNode(array2[i], node2);
        }
        int sum = 16;
        System.out.println("output1: " + node1);
        System.out.println("output2: " + node2);
        ListNode ls = new AddTwoNumbers().addTwoNumbers(node1, node2);
        System.out.println(ls);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node1 = l1;
        ListNode node2 = l2;
        ListNode listNode = null;
        int remains = 0;
        while (node1 != null || node2 != null) {
            int sum = (node1 != null ? node1.val : 0) + (node2 != null ? node2.val : 0) + remains;
            remains = sum / 10;

            if(listNode == null){
                listNode = new ListNode(sum - remains * 10);
            } else {
                listNode = new ListNode(sum - remains * 10, listNode);
            }

            if(node1 != null) {
                node1 = node1.next;
            }
            if(node2 != null) {
                node2 = node2.next;
            }
        }

        return listNode;
    }
}
