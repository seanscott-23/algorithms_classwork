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

    public static void displayArrayHorizontal(int [] data){
        for (int i = 0; i < data.length-1; i++) {
            System.out.print(data[i] + ", ");
        }
        System.out.println(data[data.length-1]);
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

<<<<<<< HEAD
    public static int optimisedMaxFrequency(int [] data){
        data = Arrays.copyOf(data, data.length);
        Arrays.sort(data);

        int mostFreq = data[0];
        int maxCount = 0;
=======
    public static int sortedMaxFrequency(int [] data){
        if(data == null || data.length == 0){
            throw new IllegalArgumentException("Cannot find the max value in an empty/null array");
        }

        // Precondition the data to ensure it's sorted
        // Create a temp copy to do this so we don't cause a change to original data
        // This ensures that the algorithm remains a "pure" function
        int [] temp = Arrays.copyOf(data, data.length);
        Arrays.sort(temp);

        int maxCount = 1;
        int mostFreq = temp[0];

>>>>>>> bb00d83c59ba0636b15d4274fe4a3e1ba54032fd
        int count = 0;
        int runStart = 0;
        int runEnd = 0;

<<<<<<< HEAD
        for(int i = 0; i < data.length -1; i++){
            runEnd++;
            if(data[runStart] != data[runEnd]){
=======
        for(int i = 0; i < temp.length-1; i++){
            runEnd++;

            if(temp[runStart] != temp[runEnd]){
>>>>>>> bb00d83c59ba0636b15d4274fe4a3e1ba54032fd
                count = runEnd - runStart;

                if(count > maxCount){
                    maxCount = count;
<<<<<<< HEAD
                    mostFreq = data[runStart];
                }
                runStart = runEnd;
            }
        }
=======
                    mostFreq = temp[runStart];
                }

                runStart = runEnd;
            }
        }

        count = temp.length - runStart;
        if(count > maxCount){
            maxCount = count;
            mostFreq = temp[runStart];
        }
>>>>>>> bb00d83c59ba0636b15d4274fe4a3e1ba54032fd
        return mostFreq;
    }
}
