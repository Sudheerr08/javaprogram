package org.assignment;

import java.util.Scanner;

public class Assignment6_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2= sc.nextInt();
        int x3= sc.nextInt();
        int x4= sc.nextInt();
        int x5= sc.nextInt();
        int x6= sc.nextInt();
        Assignment6_1 As= new Assignment6_1();

        System.out.println("Result of assignment 1 is : "+As.div(As.mul(As.add(As.sub(As.add(x1,x2),x3),x4),x5),x6));
        System.out.println("Result of assignment 1 is : "+As.div(As.sub(As.add(As.sub(As.mul(x1,x2),x3),x4),x5),x6));

    }

}
