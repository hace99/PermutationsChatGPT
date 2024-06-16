package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {

    @Test
    public void threeDifferentValues() {
        Permutations permutations = new Permutations();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = permutations.permute(nums);

        assertEquals(6, result.size());

        List<List<Integer>> expectedPermutations = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 3, 2),
                Arrays.asList(2, 3, 1),
                Arrays.asList(2, 1, 3),
                Arrays.asList(3, 1, 2),
                Arrays.asList(3, 2, 1)
        );

        for (List<Integer> expected : expectedPermutations) {
            assertTrue(result.contains(expected));
        }
    }

    @Test
    public void twoDifferentValues() {
        Permutations permutations = new Permutations();
        int[] nums = {0, 1};
        List<List<Integer>> result = permutations.permute(nums);

        assertEquals(2, result.size());

        List<List<Integer>> expectedPermutations = Arrays.asList(
                Arrays.asList(0,1),
                Arrays.asList(1, 0)
                );

        for (List<Integer> expected : expectedPermutations) {
            assertTrue(result.contains(expected));
        }
    }

    @Test
    public void twoEqualValues() {
        Permutations permutations = new Permutations();
        int[] nums = {1, 1};
        List<List<Integer>> result = permutations.permute(nums);

        assertEquals(2, result.size());

        List<List<Integer>> expectedPermutations = List.of(
                Arrays.asList(1, 1)
        );

        for (List<Integer> expected : expectedPermutations) {
            assertTrue(result.contains(expected));
        }
    }

    @Test
    public void oneValue() {
        Permutations permutations = new Permutations();
        int[] nums = {4};
        List<List<Integer>> result = permutations.permute(nums);

        assertEquals(1, result.size());

        List<List<Integer>> expectedPermutations = List.of(
                List.of(4)
        );

        for (List<Integer> expected : expectedPermutations) {
            assertTrue(result.contains(expected));
        }
    }

    @Test
    public void twoEqualsAndOneDifferentValue() {
        Permutations permutations = new Permutations();
        int[] nums = {1, 1, -2};
        List<List<Integer>> result = permutations.permute(nums);

        assertEquals(6, result.size());

        List<List<Integer>> expectedPermutations = Arrays.asList(
                Arrays.asList(1, -2, 1),
                Arrays.asList(1, 1, -2),
                Arrays.asList(-2, 1, 1)
        );

        for (List<Integer> expected : expectedPermutations) {
            assertTrue(result.contains(expected));
        }
    }
    @Test
    public void twoEqualsAndOneDifferentValue2() {
        Permutations permutations = new Permutations();
        int[] nums = {1, 1, -2};
        List<List<Integer>> result = permutations.permute(nums);

        assertEquals(6, result.size());

        List<List<Integer>> expectedPermutations = Arrays.asList(
                Arrays.asList(1, -2, 1),
                Arrays.asList(1, 1, -2),
                Arrays.asList(-2, 1, 1)
        );

        for (List<Integer> expected : expectedPermutations) {
            assertTrue(result.contains(expected));
        }
    }
}