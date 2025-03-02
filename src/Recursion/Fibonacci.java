package src.Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter a no");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int x=fibonnaci(n);
        System.out.println(x);
    }
    public static int fibonnaci(int n)
    {
        if(n==0)return 0;
        if(n==1)return 1;
        return fibonnaci(n-1)+fibonnaci(n-2);
    }
}
