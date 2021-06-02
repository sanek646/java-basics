package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));
        Hashtable<String, String> map = new Hashtable<>();
        map.put("A", "Oleg");
        map.put("B", "Sasha");
        map.put("C", "Andrey");
        map.put("D", "Kolya");
        map.put("E", "Vasya");
        map.put("F", "Petya");
        map.put("G", "Andrey");
        map.put("H", "Oleg");
        map.put("I", "Sasha");
        map.put("J", "Andrey");
        System.out.println("Insert name");
        String str2 = reader.readLine();
        String hashstr ;
        boolean exist=false;
        for (Map.Entry<String, String> entry : map.entrySet()){
            hashstr = entry.getValue();
        if(str2.equalsIgnoreCase(hashstr))
            exist = true;
        }
       if (exist) System.out.println("Exist");
       else System.out.println("NOT Exist");

    }
}
