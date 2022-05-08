package linkedlist;

import linkedlist.Simple_list;

public class LinkedListMain {

    public static void main(String[] args) {

        Simple_list obj = new Simple_list();
        obj.append(56);
        obj.append(70);
        System.out.println("The current LinkedList is: ");
        obj.showLinkedList();
        obj.insert(56, 30, 70);
        System.out.println("Linked List after inserting 30 between 56 and 70: ");
        obj.showLinkedList();
        obj.popLast();
        System.out.println("Linked List after popping the Last element: ");
        obj.showLinkedList();
    }
}