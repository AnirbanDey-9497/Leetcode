package src.Recursion;

import java.util.Scanner;

public class Linearly_1_N {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        printLineralyFrom1toNTimes(1,n);
    }
    public static void printLineralyFrom1toNTimes(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        System.out.println(i);

        printLineralyFrom1toNTimes(i+1,n);

    }
}
