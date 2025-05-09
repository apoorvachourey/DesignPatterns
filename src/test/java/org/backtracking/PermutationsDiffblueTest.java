package org.backtracking;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class PermutationsDiffblueTest {
    /**
     * Method under test: {@link Permutations#permute(int[])}
     */
    private final Permutations permutations;

    PermutationsDiffblueTest() {
        permutations = new Permutations();
    }

    @Test
    void testPermute1() {
        int[] nums = {1, 2, 3};

        List<List<Integer>> expectedList = new ArrayList<>();

        List<Integer> tempList = new ArrayList<>();
        tempList.add(1);
        tempList.add(2);
        tempList.add(3);
        expectedList.add(new ArrayList<>(tempList));

        tempList.clear();
        tempList.add(1);
        tempList.add(3);
        tempList.add(2);
        expectedList.add(new ArrayList<>(tempList));

        tempList.clear();
        tempList.add(2);
        tempList.add(1);
        tempList.add(3);
        expectedList.add(new ArrayList<>(tempList));

        tempList.clear();
        tempList.add(2);
        tempList.add(3);
        tempList.add(1);
        expectedList.add(new ArrayList<>(tempList));

        tempList.clear();
        tempList.add(3);
        tempList.add(1);
        tempList.add(2);
        expectedList.add(new ArrayList<>(tempList));

        tempList.clear();
        tempList.add(3);
        tempList.add(2);
        tempList.add(1);
        expectedList.add(new ArrayList<>(tempList));

        assertEquals(expectedList, permutations.permute(nums));
    }

    @Test
    void testPermute2() {
        int[] nums = {1, 0};

        List<List<Integer>> expectedList = new ArrayList<>();

        List<Integer> tempList = new ArrayList<>();
        tempList.add(1);
        tempList.add(0);
        expectedList.add(new ArrayList<>(tempList));

        tempList.clear();
        tempList.add(0);
        tempList.add(1);
        expectedList.add(new ArrayList<>(tempList));

        assertEquals(expectedList, permutations.permute(nums));
    }
}
