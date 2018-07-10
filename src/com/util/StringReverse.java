package com.util;

import java.util.Arrays;

public class StringReverse {
    public static void main(String arg[]) throws Exception{
        //String class does not have 'reverse()' method but StringBuilder  have it.
        //String class have toCharArray[] but StringBuilder  does not have that.

        String name = "Howareyra";
        byte[] bname= name.getBytes();
        byte[] result = new byte[bname.length];
        for (int i=0;i<bname.length;i++) {
            result[i] = bname[bname.length -i - 1];
        }
          //  System.out.println(new String(result));
       //------------------------------------------------
       StringBuilder sb = new StringBuilder(name);  //convert String to StringBuilder
     //  System.out.println(sb.reverse());
        //-----------------------
        StringBuilder sb1 = new StringBuilder();
        sb1.append(name);
        sb1.reverse();
       for(int i=0;i<sb1.length();i++) {
         //  System.out.print(sb1.charAt(i));
       }
       //--------------------
       // Convert String to CharArry
          char[] chrs = name.toCharArray();
          for (int i=chrs.length-1; i >=0;i--)
        {
          //  System.out.print(chrs[i]);
        }
        //--
        String str = "Hello how are";
          System.out.print(str.length());
        char[] strc = str.toCharArray();
        int left,right=0;
        right= strc.length-1;
        for(left=0;left<right;left++,right--)
        {
           char temp =strc[left];
           strc[left]=strc[right];
            strc[right]=temp;
        }

        //------------
        String str1 = "Hello how are";

        int adsf[] ={1,2,4};
        int adsf1[] ={1,2,4};

        Object[] stt={adsf};
        Object[] stt1={adsf1};

        if(Arrays.deepEquals(stt1,stt))
        {
             System.out.print("equals() stt stt1");
        }

        if (adsf==adsf1)
        {
           // System.out.print("equals()");
        }else
        {
          //  System.out.print("==");

        }

        if (Arrays.equals(adsf,adsf1))
        {
           // System.out.print("equals()");
        }else
        {
            System.out.print("==");


        }















    }
}
