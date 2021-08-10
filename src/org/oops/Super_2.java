package org.oops;

public class Super_2 extends super_1 {
    final int  add (int a, int b)
    {
        int c = a+b;
        return c;
    }
    final int  add (int a)
    {
        int c = a;
        return c;
    }

    Super_2()
    {
        super(2,3,4);
        System.out.println("child Default constructor");

    }

    Super_2(int a)
    {
        System.out.println("child one parameter constructor");
    }

    Super_2(int a, int b)
    {
        System.out.println("child two parameter constructor");
    }

    Super_2(int a, int b,int c)
    {
        System.out.println("child three parameter constructor");
    }

    void method2()
    {
        System.out.println(" Child Default method");
    }

    void method2(int a)
    {
        System.out.println(" Child one parameter method");
    }

    void method2(int a, int b)
    {

        System.out.println(" Child two parameter method");
        super.method1(3);
        super.method1(2,4);
    }

    void method2(int a, int b,int c)
    {
        System.out.println(" Child three parameter method");
    }

    public static void main(String[] args) {
        Super_2 sp2 = new Super_2();
       int c = sp2.add(2,3);
        System.out.println(" "+c);
    }
}
