package labs_examples.sorting_algorithms.examples;

import java.util.Arrays;

public class MyExample {

    public static int[] selectionSort(int nums[]){
        for(int i = 0; i < nums.length; i++){
            int minVal = i;

            for(int j  = i + 1; j < nums.length; j++){
                if(nums[j] < nums[minVal]) {
                    minVal =j;
                }
                int temp = nums[minVal];
                nums[minVal] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int [] nums = {23,17,16,12,1,5,37};

        System.out.println(Arrays.toString(selectionSort(nums)));
    }

}
