package com.util.more;
//sum of arrays
public class Arraysum {
    public static void main(String arg[]) throws Exception
    {
        int s[]={12,5,6,3,11};

        for(int i=0 ; i<s.length;i++)
        {
            for(int j=1;j<s.length;j++)
            {
                 int gd = s[i]+s[j];
                 System.out.println("Sum of two continues numbers :" +gd);
                  
                 if (gd ==15)
                 {
                	  System.exit(0);
                 }
            }

        }



    }
}
