package org.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(),nums);
        return result;
    }

    private void backtrack(List<List<Integer>> result, ArrayList<Integer> tempList, int[] nums) {
        //If we match the length it is a permutation

        if(tempList.size()==nums.length){
            result.add(new ArrayList<>(tempList));
            return;
        }

        for(int num:nums){
            if(tempList.contains(num)){
                continue;
            }

            tempList.add(num);
            backtrack(result,tempList,nums);
            tempList.remove(tempList.size()-1);
        }
    }

    public static void main(String[] args) {
        Permutations p = new Permutations();
        int[] nums = {1,2,3};
        p.permute(nums);

    }

}
