package com.company;

// class from leetCode
public class ListNode {
    public int val;
    public ListNode next;
    ListNode() {}
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        ListNode stepNode = this;
        while (stepNode != null){
            str.append("[").append(stepNode.val).append("]").append(",");
            stepNode = stepNode.next;
        }
        str.deleteCharAt(str.length() -1 );
        return str.toString();
    }
}
