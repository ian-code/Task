package com.trial;

import java.io.*;
import java.util.*;
public class Circle {

    public static void main(String[] args)
    throws FileNotFoundException{

     Map<Integer,String> student=new HashMap<>();

        student.put(1,"dave");
        student.put(2,"den");
        student.put(3,"sally");
        student.put(4,"house");
        student.put(5,"kelly");

System.out.println(student.get(2));

     student.keySet();
        System.out.println(student.entrySet());
        System.out.println(student.values());
        system.out.println("Alteration made ");
}

}
