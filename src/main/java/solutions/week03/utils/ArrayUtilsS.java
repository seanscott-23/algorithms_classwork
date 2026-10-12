package solutions.week03.utils;

import java.util.Arrays;

public class ArrayUtilsS {
    public static void displayArray(int [] data){
        for (int i = 0; i < data.length; i++) {
            System.out.println(i + ") " + data[i]);
        }
    }

    public static void displayArray(String [] data){
        for (int i = 0; i < data.length; i++) {
            System.out.println(i + ") " + data[i]);
        }
    }

    public static int indexOf(int [] data, int target){
        int [] nums = Arrays.copyOf(data, data.length);

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                return i;
            }else if(nums[i] > target){
                return -1;
            }
        }
        return -1;
    }

    public static int count(int [] data, int target){
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if(data[i] == target){
                count++;
            }
        }

        return count;
    }

    public static int maxFrequency(int [] data){
        int maxCount = 1;
        int mostFreq = data[0];

        for (int value : data) {
            int count = count(data, value);

            if(count > maxCount){
                maxCount = count;
                mostFreq = value;
            }
        }

        return mostFreq;
    }

    public static int optimisedMaxFrequency(int [] data){
        data = Arrays.copyOf(data, data.length);
        Arrays.sort(data);

        int mostFreq = data[0];
        int maxCount = 0;
        int count = 0;
        int runStart = 0;
        int runEnd = 0;

        for(int i = 0; i < data.length -1; i++){
            runEnd++;
            if(data[runStart] != data[runEnd]){
                count = runEnd - runStart;

                if(count > maxCount){
                    maxCount = count;
                    mostFreq = data[runStart];
                }
                runStart = runEnd;
            }
        }
        return mostFreq;
    }
}