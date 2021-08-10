package Recurssion;

public class Factorial {
    static int factorial(int a )
    {static  int result=;
        if (a>1)
        {
            result = result*(a-1);
            a--;
            factorial(a);
            return result;
        }
           else
               return 0;
    }

    public static void main(String[] args) {

        factorial(5);
        System.out.println("Factorial of 5 is : "+factorial(5));
    }
}
