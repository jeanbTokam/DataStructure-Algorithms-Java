package LinkedList;

import java.sql.SQLOutput;

public class LinkedList {
    private Node tail;
    private Node head;
    private int length;

    public class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {

        Node newNode = new Node(value);
        tail = newNode;
        head = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTail() {
           if (length == 1)
               System.out.println("Head:" + head.value);
    }

   public void getHead(){
        if (length == 1){
            System.out.println("Tail:" + tail.value);
        }
   }
   public void getLength(){
       System.out.println("Length:"+ length);
   }
   public void Append(int value){
        Node newNode = new Node(value);

       if (length == 0) {
           head = newNode;
           tail = newNode;
       } else {
           tail.next = newNode;
           tail = newNode;
       }
       length++;

   }
}
