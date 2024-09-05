package org.backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubsequensesRec {
    public static void main(String[] args) {
        SubsequensesRec ob = new SubsequensesRec();
        int [] nums = {3,1,2};
        System.out.println(ob.subsequence(nums));

    }

    private List<List<Integer>> subsequence(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
         findSubsequenes(0,result,new ArrayList<>(),nums);
       return result;
    }

    private void findSubsequenes(int start,List<List<Integer>> result ,List<Integer> tempList,int[] nums){
        if(start==nums.length){
            result.add(new ArrayList<>(tempList));
            return;
        }

        tempList.add(nums[start]);
        findSubsequenes(start+1,result,tempList,nums);
        tempList.remove(tempList.size()-1);
        findSubsequenes(start+1,result,tempList,nums);
    }
}
