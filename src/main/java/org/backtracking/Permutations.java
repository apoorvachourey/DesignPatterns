package org.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        System.out.println(p.permuteL(nums));

    }

    public List<List<Integer>> permuteL(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        findPermutation(nums,result,map,new ArrayList<>());
        return result;
    }

    public void findPermutation(int[] nums,  List<List<Integer>> result, Map<Integer,Integer> map,List<Integer> current){
        if(current.size()==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(i)){
                map.put(i,1);
                current.add(nums[i]);
                findPermutation(nums,result,map,current);
                map.remove(i);
                current.remove(current.size()-1);
            }
        }
    }

}
