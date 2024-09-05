package org.backtracking;

import java.util.HashSet;

public class StringPermutation {

    static void permute(String str,int l, int r,HashSet<String> set){

        if (l == r) {
            if (!set.contains(str)) {
                set.add(str);
                System.out.println(str);
            }
        }
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r,set);
                str = swap(str, l, i);
            }
        }
    }

    static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    public static void main(String[] args) {
        String str = "AAC";
        int n = str.length();
       // Permutation permutation = new Permutation();
        HashSet<String> set = new HashSet<>();
        permute(str, 0, n - 1,set);
    }
}
