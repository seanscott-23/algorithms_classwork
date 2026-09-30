package solutions.week02.utils;

public class ArrayUtils {
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

    /**
     * Calculates the average of the elements in the supplied int array.
     * @param nums the array of numbers
     * @return the average of the numbers in the array
     */
    public static double average(int [] nums){  
        double sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum / nums.length;
    }

    /**
     * Finds the maximum value in the supplied int array.
     * @param nums the array of numbers
     * @return the maximum value in the array
     */
    public static int findMax(int [] nums){
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }

    /**
     * Finds the maximum value in the supplied String array.
     * @param names the array of strings
     * @return the maximum value in the array
     */
    public static String findMax(String [] names){
        String max = names[0];
        for(int i = 0; i < names.length; i++){
            if(names[i].compareTo(max) > 0){
                max = names[i];
            }
        }
        return max;
    }

    /**
     * Finds the minimum value in the supplied int array.
     * @param nums the array of numbers
     * @return the minimum value in the array
     */
    public static int findMin(int [] nums){
        int min = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }

    /**
     * Finds the minimum value in the supplied String array.
     * @param names the array of strings
     * @return the minimum value in the array
     */
    public static String findMin(String [] names){
        String min = names[0];
        for(int i = 0; i < names.length; i++){
            if(names[i].compareTo(min) < 0){
                min = names[i];
            }
        }
        return min;
    }

    /**
     * Counts the number of occurrences of a number in the supplied int array.
     * @param num the number to count
     * @param nums the array of numbers
     * @return the number of occurrences of num in nums
     */
    public static int count(int num, int [] nums){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == num){
                count++;
            }
        }
        return count;
    }

    /**
     * Gets the most frequent value in the supplied int array.
     * @param nums the array of numbers
     * @return the most frequent value in the array
     */
    public static int getMostFrequent(int [] nums){
        int mostFrequent = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(count(nums[i], nums) > count(mostFrequent, nums)){
                mostFrequent = nums[i];
            }
        }
        return mostFrequent;
    }

    /**
     * Counts the amount of ints in the list greater than the provided int value
     * @param nums the array of numbers
     * @param num the number to compare against
     * @return the count of numbers in the array greater than num
     */
    public static int countGreater(int [] nums, int num){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > count){
                count += 1;
            }
        }
        return count;
    }

    /**
     * Counts the amount of values in the array greater than the average
     * @param nums the array of numbers
     * @return the count of numbers in the array greater than the average
     */
    public static int countGreaterThanAverage(int [] nums){
        int count = 0;
        double average = average(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > average){
                count += 1;
            }
        }
        return count;

    }
}

