package src.Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a no");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int x=FactN(n);
        System.out.println(x);
    }
    public static int FactN(int n)
    {
        if(n==0)
        {

            return 1;
        }

        return n*FactN(n-1);

    }
}
