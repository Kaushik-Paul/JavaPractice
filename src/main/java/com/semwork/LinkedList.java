package com.semwork;

public class LinkedList {
    private class Node {
        int data;
        Node next;

        Node() {
            this.next = null;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

        Node head = null;
        void add(int data) {
            Node new_node = new Node(data);
            System.out.println(data+" added successfully");
            if (head == null) {
                head = new_node;
                return;
            }
            Node temp=head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
        void display() {
            if (head == null) {
                System.out.println("Linked List is empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("NULL");
        }

        public static void main(String[] args) {
            LinkedList ll=new LinkedList();
            ll.add(10);
            ll.add(20);
            ll.add(30);
            ll.display();
            ll.add(40);
            ll.add(50);
            ll.display();
        }

}
