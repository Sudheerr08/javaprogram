package org.assignment;

public class Assignment3 {
    Assignment3()
    {
        this(2,3,4,3);
        System.out.println("Default constructor");
    }

    Assignment3(int a)
    {
        this(2,3,4);
        System.out.println("1 Parametrized constructor");
    }
    Assignment3(int a, int b)
    {
        this();
        System.out.println("2 Parametrized constructor");
    }
    Assignment3(int a, int b, int c)
    {
        this(2,3);
        System.out.println("3 Parametrized constructor");
    }
    Assignment3(int a, int b, int c,int d)
    {
        System.out.println("4 Parametrized constructor");
    }

    public static void main(String[] args) {
        Assignment3 As =  new Assignment3(1);
    }
}
