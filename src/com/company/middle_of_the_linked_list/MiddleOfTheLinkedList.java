package com.company.middle_of_the_linked_list;

import com.company.ListNode;

public class MiddleOfTheLinkedList {

    public static void main(String[] args) {
        int[] array = {65,66,26,77,96,86,11,21,13,80};
        ListNode node = new ListNode(array[array.length - 1]);
        for (int i = array.length - 2; i > -1; i--){
            node = new ListNode(array[i], node);
        }
        System.out.println("input :" + node);
        System.out.println(middleNode(node));
    }

    public static ListNode middleNode(ListNode head) {
        ListNode node = head;
        ListNode result = node;
        int step = 0;
        while (node != null){
            step++;
            if(step == 1) {
                node = node.next;
                continue;
            }

            if(step % 2 == 1 ){
                result = result.next;
            } else if(node.next == null){
                result = result.next;
            }
            node = node.next;
        }
        return result;
    }

}
