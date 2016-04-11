package edu.olivet.se200;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jerrysun on 4/10/16.
 */
public class SolutionTestb {
    @Test
    public void isAnagram() throws Exception {
        String a = "car";
        String b = "rac";
        String c = "rat";

        Assert.assertTrue(Solution.isAnagram(a,b));
        Assert.assertFalse(Solution.isAnagram(a,c));


    }

    @Test
    public void containsDuplicate() throws Exception {
        int[] intArray = new int[] {4,5,6,6,7,8};
        int[] intArrayNoDup = new int[] {4,5,6,7,8};

        Assert.assertTrue(Solution.containsDuplicate(intArray));
        Assert.assertFalse(Solution.containsDuplicate(intArrayNoDup));

    }

}