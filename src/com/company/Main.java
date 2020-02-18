package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        Set<String> set = new HashSet<String>();
        for (String retval: s.split(" ")){
            set.add(retval);
        }
        ArrayList <String> list = new ArrayList<>(set);
        Collections.sort(list);
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
