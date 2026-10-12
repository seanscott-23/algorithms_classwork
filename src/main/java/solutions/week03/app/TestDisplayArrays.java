package solutions.week03.app;

import solutions.week03.utils.ArrayUtilsS;

import java.util.Random;

public class TestDisplayArrays {
    static void main(String[] args) {
        Random rg = new Random();
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rg.nextInt(100);
        }

        nums[2] = 75;
        nums[7] = 75;
        ArrayUtilsS.displayArray(nums);

        System.out.println("------------------");
        int target = 70;
        int index = ArrayUtilsS.indexOf(nums, target);
        if(index != -1) {
            System.out.println(target + " found at index " + index);
        }else{
            System.out.println(target + " not found.");
        }
        System.out.println("------------------");
        int mostFreq = ArrayUtilsS.optimisedMaxFrequency(nums);
        System.out.println("Most frequent number: " + mostFreq);
    }
}
