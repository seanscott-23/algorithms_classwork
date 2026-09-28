package solutions.week02.app;

import solutions.week02.utils.ArrayUtils;

public class TestDisplayArrays {
    static void main(String[] args) {
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }

        nums[3] = 2;
        nums[5] = 2;

        ArrayUtils.displayArray(nums);
        int freq = ArrayUtils.getMostFrequent(nums);
        System.out.println("Most frequent:" + freq);

        System.out.println("------------------");

        String [] text = new String[10];

        for (int i = 0; i < text.length; i++) {
            text[i] = ""+i;
        }

        ArrayUtils.displayArray(text);
    }
}
