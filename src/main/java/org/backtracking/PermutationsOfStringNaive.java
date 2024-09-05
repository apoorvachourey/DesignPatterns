package org.backtracking;

public class PermutationsOfStringNaive {

    static void stringPermutation(String input, String res){
        // If String is Empty
        if(input.length()==0){
            System.out.println(res);
            return;
        }
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            String rest = input.substring(0,i)+input.substring(i+1);
            //recursive call
            stringPermutation(rest,res+ch);

        }


    }

    public static void main(String[] args) {
        String inputStr ="abc";
        stringPermutation(inputStr,"");

    }
}
