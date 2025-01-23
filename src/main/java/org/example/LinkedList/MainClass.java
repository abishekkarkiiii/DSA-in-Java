package org.example.LinkedList;

public class MainClass {
    public static void main(String[] args) {
        Node linkedList4=new Node(4,null);
        Node linkedList3=new Node(3,linkedList4);
        Node linkedList2=new Node(2,linkedList3);
        Node linkedList1=new Node(1,linkedList2);
        //direct acessing the value through node if  you don't undertsand please revise the concept of OOP
        System.out.println(linkedList1.getNext().getNext().getNext().getData());
        Node temp=linkedList1;



        while(temp!=null){//acessing the node value by while loop
            System.out.println(temp.getData());
            temp=temp.getNext();
        }



        for (int i = 0; i < 4; i++) {//giving the value through node by for loop
            System.out.println(temp.getData());
            temp=temp.getNext();

        }



    }
}
