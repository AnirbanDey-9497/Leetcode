package src.Recursion;

import java.util.Scanner;

public class Name_N_Times {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        printNameNTimes(n);
    }
    public static void printNameNTimes(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println("Name is Dey! Anirban Dey");

        printNameNTimes(n-1);

    }
}
