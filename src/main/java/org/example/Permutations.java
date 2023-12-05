package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPermutation = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        generatePermutations(nums, used, currentPermutation, result);

        return result;
    }

    private void generatePermutations(int[] nums, boolean[] used, List<Integer> currentPermutation, List<List<Integer>> result) {
        if (currentPermutation.size() == nums.length) {
            result.add(new ArrayList<>(currentPermutation));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                currentPermutation.add(nums[i]);
                generatePermutations(nums, used, currentPermutation, result);
                currentPermutation.remove(currentPermutation.size() - 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array (1 <= length <= 6): ");
        int n = scanner.nextInt();

        if (n < 1 || n > 6) {
            System.err.println("Invalid input length. Length should be between 1 and 6.");
            return;
        }

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array (-10 <= element <= 10):");
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter element %d: ", i + 1);
            int num = scanner.nextInt();

            if (num < -10 || num > 10) {
                System.err.println("Invalid element. Element should be between -10 and 10.");
                return;
            }

            nums[i] = num;
        }

        Permutations permutationGenerator = new Permutations();
        List<List<Integer>> permutations = permutationGenerator.permute(nums);
        System.out.println("All possible permutations: " + permutations);
    }
}
