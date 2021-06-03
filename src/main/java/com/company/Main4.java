package com.company;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class Main4 {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        HashSet<String> list = new HashSet<String>();
        list.add("alex");
        list.add("bob");
        list.add("carry");
        list.add("don");
        list.add("elon");
        list.add("fred");
        list.add("greg;");
        System.out.println("Enter a name");
        String name = reader.readLine().toLowerCase();
        if (list.contains(name))
            System.out.println("Exist!");
        else System.out.println("Not Exist!!!");
    }

}