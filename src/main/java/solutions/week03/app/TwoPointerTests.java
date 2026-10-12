package solutions.week03.app;

import solutions.week03.utils.TwoPointerExercises;
import java.util.Arrays;
import java.util.Random;

public class TwoPointerTests {
    static void main(){
        int[] nums = new int[10];

        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 4;
        nums[3] = 3;
        nums[4] = 4;
        nums[5] = 8;
        nums[6] = 8;
        nums[7] = 2;
        nums[8] = 1;
        nums[9] = 11;

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
        System.out.println("Positions: " + Arrays.toString(TwoPointerExercises.twoSum(nums, 10)));
    }
}
