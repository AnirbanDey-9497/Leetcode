package src.Recursion;

import java.util.Scanner;

public class Reverse_N_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        ReverseNto1(i,n);
    }
    public static void ReverseNto1(int i, int n)
    {
        if(i>n)return;
        ReverseNto1(i+1,n);
        System.out.println(i);
    }
}
