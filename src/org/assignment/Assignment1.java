package org.assignment;

public class Assignment1 {

        int age,roll_no;
        String stud_name;

        void display1(int n)
        {
            System.out.println("Welcome to all of you");
            System.out.println("age of Student is :  "+n);
        }

        void display2(String Name)
        {
            System.out.println("automation is very easy");
            System.out.println(" "+Name);
        }

    public static void main(String[] args) {
        Assignment1 As= new Assignment1();
        As.age = 23;
        As.roll_no = 4;
        As.stud_name = "Pooja";
        As.display1(As.age);

        As.display2(As.stud_name);
    }
}
