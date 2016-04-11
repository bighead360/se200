package edu.olivet.se200;

import java.util.Arrays;
import java.util.HashSet;


/**
 * Created by jerrysun on 4/6/16.
 */
public class Solution {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] a= s.toCharArray();
        char[] b= t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);

    }

    public static boolean containsDuplicate(int[] nums) {
        if(nums==null || nums.length==0)
            return false;

        HashSet<Integer> set = new HashSet<Integer>();
        for(int item: nums){
            if(!set.add(item)){
                return true;
            }
        }

        return false;
    }



}