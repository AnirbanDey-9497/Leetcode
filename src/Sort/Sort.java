package src.Sort;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int [] arr= new int[]{10,8,90,6,56};
        Arrays.stream(arr).sorted().forEach(System.out::println);
    }
}
