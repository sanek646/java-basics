package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main4 {

    public static class    HashMapCaseInsensitive extends HashMap<String, String>{

        @Override
        public String put(String key, String value){
            return super.put(key.toLowerCase(), value);
        }

        @Override
        public String get(Object key){
            return super.get(key.toString().toLowerCase());
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        HashMap<String, String> list = new HashMapCaseInsensitive();
        list.put("Alex", "10");
        list.put("Bob", "12");
        list.put("Carry", "15");
        list.put("Don", "25");
        list.put("Elon", "34");
        list.put("Fred", "28");
        list.put("Greg", "21");

        System.out.println("Введите имя");
        String name = reader.readLine();

        if (list.containsKey(name.toLowerCase()))
            System.out.println("Exist");
        else System.out.println("NOT EXIST 1");
    }
}
