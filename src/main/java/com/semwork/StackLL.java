package com.semwork;

public class StackLL {
    private class Node{
        int data;
        Node next;
        Node() {
            this.next=null;
        }
        Node(int data) {
            this.data=data;
            next=null;
        }
    }
    Node top;
    StackLL() {
        top = null;
    }
    void push(int data) {
        Node new_node=new Node(data);
        System.out.println(data+" added successfully");
        if (top == null) {
            top = new_node;
            return;
        }
        new_node.next=top;
        top = new_node;
    }
    void pop() {
        System.out.println("The value popped is "+top.data);
        top=top.next;
    }
    void display() {
        Node temp=new Node();
        temp=top;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        StackLL stack=new StackLL();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();
        stack.pop();
        stack.pop();
        stack.display();

    }
}
