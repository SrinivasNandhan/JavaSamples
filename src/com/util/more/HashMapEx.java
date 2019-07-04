package com.util.more;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HashMapEx {
    public static void main(String str [])throws Exception
    {

        String[] elements = new String[] {"Ryan", "Julie", "Bob"};
        List list = new ArrayList(Arrays.asList(elements));
        // list.forEach(e-> System.out.println(e));
         list.parallelStream().forEach(e->System.out.println(e));
      
         HashMap<String, String> loans = new HashMap<String, String>();
        loans.put("home loan", "citibank");
        loans.put("personal loan", "Wells Fargo");

        for (String key : loans.keySet()) {
            System.out.println("key: " + key + " value: " + loans.get(key));
        }







    }
}
