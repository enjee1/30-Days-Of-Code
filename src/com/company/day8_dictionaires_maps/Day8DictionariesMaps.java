package com.company.day8_dictionaires_maps;
import java.util.*;
import java.io.*;

public class Day8DictionariesMaps {

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> myMap = new HashMap<String, Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            myMap.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (myMap.containsKey(s)) System.out.println(s + "=" + myMap.get(s));
            else System.out.println("Not found");

        }
        in.close();
    }
}
