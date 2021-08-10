package org.StringProgram;

import java.util.Scanner;

public class String1 {
    void reverseString( String Str)
    {
        int n = Str.length()-1;
      for (int i=n;i>=0;i--)
      {
          System.out.print(Str.charAt(i));
      }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Str1 = sc.nextLine();
        String1 St = new String1();
        St.reverseString(Str1);



    }

}
