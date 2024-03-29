package com.LinkedList;

/**
 * Given a linked list, remove the n-th node from the end of list and return its head.
 *
 * Example:
 *
 * Given linked list: 1->2->3->4->5, and n = 2.
 *
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 *
 * Given n will always be valid.
 *
 * Follow up:
 *
 * Could you do this in one pass?
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode sentinel=new ListNode(0);
        ListNode slow=sentinel, fast=sentinel;
        sentinel.next=head;
        //Move fast in front so that the gap between slow and fast becomes n
        for(int i=1;i<=n+1;i++){
            fast=fast.next;
        }
        // move fast to the end, maintaining the gap
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        //skip the desired node
        slow.next=slow.next.next;
        return sentinel.next;
    }
    }
