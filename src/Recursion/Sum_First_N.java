package src.Recursion;

import java.util.Scanner;

public class Sum_First_N {
    public static void main(String[] args) {
        System.out.println("Enter a no");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        int x=SumFirstN(n);
        System.out.println(x);
    }
    public static int SumFirstN(int n)
    {
        if(n==0)
        {

            return 0;
        }

        return n+SumFirstN(n-1);

    }
}
