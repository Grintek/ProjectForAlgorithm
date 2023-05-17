package com.company;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        ListNode stepNode = next;
        while (stepNode != null){
            str.append("[").append(stepNode.val).append("]").append(",");
            stepNode = stepNode.next;
        }
        str.deleteCharAt(str.length() -1 );
        return str.toString();
    }
}
