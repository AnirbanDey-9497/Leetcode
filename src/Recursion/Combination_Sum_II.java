package src.Recursion;

import java.util.*;

public class Combination_Sum_II {
    public static void main(String[] args) {
        int[] arr = new int[]{30, 40, 50, 10, 20, 5, 4, 3, 2, 1, 5};
        System.out.println("What is the sum for which you need the count?");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        List<List<Integer>> listOfList = combinationSum2(arr, x);
        System.out.println(listOfList);
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> whole = new ArrayList<>();
        List<Integer> individual = new ArrayList<>();
        Arrays.sort(candidates); // Sort to handle duplicates
        backtrack(0, candidates, target, individual, whole);
        return whole;
    }

    public static void backtrack(int index, int[] candidates, int target, List<Integer> list, List<List<Integer>> whole) {
        if (target == 0) {
            whole.add(new ArrayList<>(list)); // Add a copy to prevent modification issues
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            // Skip duplicates to avoid duplicate subsets
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            // Stop early if the current number is greater than the remaining target
            if (candidates[i] > target) {
                break;
            }

            list.add(candidates[i]);
            backtrack(i + 1, candidates, target - candidates[i], list, whole);
            list.remove(list.size() - 1); // Backtrack
        }
    }
}
