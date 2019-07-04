package com.util.more;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class PhonePad1 {

    private static LinkedHashMap<String, String> map;

    private static ArrayList<String> deriveWordCombinations(String number) {

        ArrayList<String> finalWord = new ArrayList<String>();
        ArrayList<String> iterative = new ArrayList<String>();
        finalWord.add("");

        for (int i = 0; i < number.length(); i++) {
            String c = number.substring(i, i + 1);
          //  String c =number.charAt(i);

            String stringForNumber = map.get(c);
            for (String s : finalWord) {
                for (char cs : stringForNumber.toCharArray()) {
                    iterative.add(s + cs);
                }
            }
            finalWord = iterative;
            iterative = new ArrayList<String>();
            System.out.println("Final Word->" + finalWord);
        }

        return finalWord;
    }

    public void makeHashMap() {
        map.put("1", "");
        map.put("2", "ABC");
        map.put("3", "DEF");
        map.put("4", "GHI");
        map.put("5", "JKL");
        map.put("6", "MNO");
        map.put("7", "PQRS");
        map.put("8", "TUV");
        map.put("9", "WXYZ");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	PhonePad1 obj = new PhonePad1();
        map = new LinkedHashMap<String, String>();
        obj.makeHashMap();
        // System.out.println(map);
        String str = "23";
        ArrayList<String> word = PhonePad1.deriveWordCombinations(str);
      //  System.out.println("Word->" + word);

    }
}