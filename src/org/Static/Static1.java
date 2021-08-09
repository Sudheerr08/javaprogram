package org.Static;

public class Static1 {
    static
    {
        System.out.println("static block is invoked");
    }

    public static void main(String args[])
    {
        System.out.println("Hello main");
    }
}
