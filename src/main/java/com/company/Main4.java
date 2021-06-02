package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Map;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));
        HashSet<String> list= new HashSet<String>();
        list.add("Oleg");
        list.add("Sasha");
        list.add("Andrey");
        list.add("Kolya");
        list.add("Vasya");
        list.add("Petya");
        list.add("Anton");
        list.add("Olivia");
        list.add("Stas");
        list.add("Alex");
        System.out.println("Insert name");
        String str2 = reader.readLine();
        //String hashstr ;
        boolean exist=false;
       // for (Map.Entry<String, String> entry : map.entrySet()){
           // hashstr = entry.getValue();
            if(str2.equalsIgnoreCase(&&&))
                exist = true;
        //}
        if (exist) System.out.println("Exist");
        else System.out.println("NOT Exist");

    }
}
