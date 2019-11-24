package com.suifengyunnuo.twoSum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution;

    private TestCase testCase1;

    @Before
    public void setUp() {
        solution = new Solution();
        {
            int [] nums = new int[] {2, 7, 11, 15};
            int target = 9;
            testCase1 = new TestCase();
            testCase1.setNums(nums);
            testCase1.setTarget(target);
        }
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(new int[] {0, 1}, solution.towSum(testCase1.getNums(), testCase1.getTarget()));
    }

    private static class TestCase {
        private int[] nums;
        private int target;

        public int[] getNums() {
            return nums;
        }

        public void setNums(int[] nums) {
            this.nums = nums;
        }

        public int getTarget() {
            return target;
        }

        public void setTarget(int target) {
            this.target = target;
        }
    }



}