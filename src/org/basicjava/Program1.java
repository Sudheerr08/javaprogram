package org.basicjava;

import org.oops.Inheritance_1;

public class Program1 {

        int a1,b1 ;
        String S1;

        int add(int a, int b)
        {
            int c = a + b;
            return c;
        }
       void print(int b, String S3)
        {

            System.out.println("Hello, My Name is Sudhir");
            System.out.println(" "+b);
            System.out.println(S3);

        }

    public static void main(String[] args) {

           // Program1 pg = new Program1();

        Inheritance_1 In1 = new Inheritance_1();
                In1.a = 24;
        System.out.println(" "+In1.a);
//            pg.a1=23;
//            pg.S1="Sudhir";
//            pg.print(pg.a1,pg.S1);
//            pg.b1=28;
//        System.out.println("sum of values is  "+pg.add(23,56));




    }
}
