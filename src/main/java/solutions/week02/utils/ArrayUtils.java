package solutions.week02.utils;

public class ArrayUtils {
    /**
     * Displays the contents of a supplied int array on the console.
     * Data is displayed vertically with index included.
     * @param nums the array to be displayed
     */
    public static void displayArray(int [] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.println(i + ": " + nums[i]);
        }
    }

    /**
     * Displays the contents of a supplied String array on the console.
     * Data is displayed vertically with index included.
     * @param nums the array to be displayed
     */
    public static void displayArray(String [] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.println(i + ": \"" + nums[i]+"\"");
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
}
