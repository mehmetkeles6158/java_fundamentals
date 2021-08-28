package labs_examples.sorting_algorithms.examples;

import java.util.Arrays;

public class MyExample {

    public int[] bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] insertionSort(int nums[]) {

        for (int i = 1; i < nums.length; ++i) {

            int val = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > val) {

                nums[j + 1] = nums[j];

                j--;
            }
            nums[j + 1] = val;
        }
        return nums;
    }


    public static void main(String[] args) {
        int[] nums01 = {3, 5, 2, 1, 4};

//        MyExample obj1 = new MyExample();
//        System.out.println(Arrays.toString(obj1.bubbleSort(nums01)));

        System.out.println(Arrays.toString(insertionSort(nums01)));

    }

}
