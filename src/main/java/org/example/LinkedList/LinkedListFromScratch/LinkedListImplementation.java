package org.example.LinkedList.LinkedListFromScratch;

import org.example.LinkedList.Node;

import java.util.Scanner;


public class LinkedListImplementation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
            Node temp=null;
            System.out.println("Enter a value in LinkedList");
            temp=new Node(input.nextInt(),null);
            while(!input.next().equalsIgnoreCase("END")){
                System.out.println("chaliraxa");
                temp.setNext(new Node(input.nextInt(), null));
            }



    }




}
