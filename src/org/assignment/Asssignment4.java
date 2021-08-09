package org.assignment;

public class Asssignment4 {
    void method1()
    {

        this.method1(2,3,4,5);
        System.out.println("Default method");
        this.method1(2,3);
        this.method1(2);
        this.method1(3,4,5);
    }
    void method1(int a)
    {
        System.out.println("1 parameter method");
    }
    void method1(int a,int b)
    {
        System.out.println("2 parameter method");
    }
    void method1(int a, int b, int c)
    {
        System.out.println("3 parameter method");
    }
    void method1(int a, int b, int c , int d)
    {
        System.out.println("4 parameter method");
    }

    public static void main(String[] args) {
        Asssignment4 as = new Asssignment4();
        as.method1();
    }
}
