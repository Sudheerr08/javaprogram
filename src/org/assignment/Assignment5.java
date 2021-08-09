package org.assignment;

public class Assignment5 {
    int a, b;
    String Name ;
    Assignment5(int a, int b, String N)
    {
        this.a = a;
        this.b=b;
        this.Name = N;
    }

    public static void main(String[] args) {
        Assignment5 as= new Assignment5(2,3,"suhir");
        System.out.println(" "+as.Name);

    }
}
