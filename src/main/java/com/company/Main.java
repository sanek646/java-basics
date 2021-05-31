package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number:");
        String strInput = input.readLine();
        int size = Integer.parseInt(strInput);

        System.out.println("array length" + size);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter" + (i + 1) + "array element");
            String strArr = input.readLine();
            array[i] = Integer.parseInt(strArr);
        }
        System.out.println("Output of the entire array by elements");
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + "array element" + array[i]);
        }
    }
}

