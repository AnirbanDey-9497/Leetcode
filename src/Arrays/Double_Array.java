package src.Arrays;


import java.util.Scanner;

public class Double_Array {
    public static void main(String[] args) {
        int[] numbers=new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int index=0;
        for(int i:numbers)
        {
            numbers[index++]= sc.nextInt();
        }
        int index1=0;
        for(int i:numbers)
        {
            numbers[index1++]=2*i;
        }
        System.out.println("The numbers after doubling");
        int index2=0;
        for(int i:numbers)
        {
            System.out.println(numbers[index2++]);
        }
    }


}
