package org.assignment;

public class Assignment2 {

            int sum(int a, int b)
            {
                int c = a+b;
                return c;
            }
            int sub(int a, int b)
            {
                int c = a-b;
                return c;
            }

               int mul(int a, int b)
               {
                   int c = a*b;
                   return c;
               }

            int div(int a, int b)
            {
                int c = a/b;
                return c;
            }
    public static void main(String[] args) {
        Assignment2 As1= new Assignment2();
        System.out.println("Result of first assignment is : "+As1.div(As1.mul(As1.sub(As1.sum(As1.sum(10,2),2),2),2),2));
        System.out.println("Result of second assignment is : "+As1.div(As1.sub(As1.sum(As1.sub(As1.mul(10,2),2),2),2),2));

    }
}
