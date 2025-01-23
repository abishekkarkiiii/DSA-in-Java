package org.example.ArrayList;

import org.example.ArrayList.Entity.Worker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstArrayList {
    public static void main(String[] args) {
//        ArrayList <String>l1=new ArrayList<>();
//        ArrayList <Integer>l=new ArrayList<>();
//        l1.add("e");
//        l1.add("a");
//        l1.add("c");
//        l1.add("b");
//        l1.add("d");
//
//        l1.sort((a,b)->b.compareTo(a));
//        System.out.println(l1);
//
//
//
//        for (int i = 0; i <=5 ; i++) {
//            l.add(i);
//
//        }
//        for (int i = 15; i <= 20; i++) {
//            l.add(i);
//        }
//        l.sort((a,b)->b-a);
//
//        for (int i:l){
//            System.out.println(i);
//
//        }

        ArrayList<Worker> workers= new ArrayList<>();
        workers.add(new Worker("abishek",45000));
        workers.add(new Worker("ram",35000));
        workers.add(new Worker("hari",50000));
        workers.add(new Worker("keshar",16000));

        workers.sort((x,y)->{
            if(y.getSalary()-x.getSalary()>0){
                 return 1;
            } else if (y.getSalary()-x.getSalary()<0) {
                return -1;
             }else {
                 return 0;
             }
        });

        System.out.println(workers);




    }
}
