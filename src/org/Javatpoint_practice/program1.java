package org.Javatpoint_practice;

import org.basicjava.Program1;

import java.util.Scanner;

public class program1
 {

 void  fibonicci(int i) {
      int a = 0, b = 1, c = 0;
      System.out.print("Fibonicci series upto "+(i+2)+" terms is =  "+a + " " + b);
      while (i>= 1) {
          c = a + b;
          System.out.print(" " + c);
          a = b;
          b = c;
          i--;
      }
  }

    public static void main(String[] args) {

         Scanner Sc = new Scanner(System.in);
        System.out.println(" Enter the number of terms you want of fibonicci series : ");
         int no = Sc.nextInt();
         program1 pg = new program1();
         pg.fibonicci(no-2);

    }
}
