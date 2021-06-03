package com.company;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;

public class Main4 {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        HashSet<String> list = new HashSet<String>();
        list.add("Alex");
        list.add("Bob");
        list.add("Carry");
        list.add("Don");
        list.add("Elon");
        list.add("Fred");
        list.add("Greg;");
        System.out.println("Enter a name");
        String name = reader.readLine();



        System.out.println( list.contains(name));
      /*  Iterator<String> i = list.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    */}
}