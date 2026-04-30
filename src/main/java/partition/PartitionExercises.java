package partition;

import java.util.Arrays;

public class PartitionExercises {

    /**
     * Sort an array of 0s and 1s in one pass and in linear time
     * using the algorithm discussed during the lecture
     * @param arr input array of 0s and 1s
     */
    public static void sort01(int[] arr) {
        int i = 0; // starts at the beginning
        int j = arr.length - 1; // starts at the end
        // FILL IN CODE:


    }

    /**
     * Pick the middle element of the array as the pivot.
     * Partition the input array (in linear time, in one pass) so that elements on the left of the pivot are smaller than the pivot,
     * and elements on the right side of the pivot are >= pivot
     * @param arr input array
     * @return index of the pivot (after the partition)
     */
    public static int partitionArray(int[] arr) {
        int n = arr.length;
        int midIndex = n / 2;
        int pivotElement = arr[midIndex];
        int i = 0;
        int j = n - 2;
       // FILL IN CODE:


        return i; // should return the index of the pivot
    }

    /** Partition a subarray from index low to index high (inclusive)
     *
     * @param arr input array
     * @param low starting index of the subarray
     * @param high end index of the subarray
     * @return index of the pivot after the partition
     */
    public static int partitionSubarray(int arr[], int low, int high) {
        int pivot;
        int mid = (low + high) / 2;
        int pivotElement = arr[mid];
        System.out.println("Pivot = " + pivotElement);

        int i = low;
        int j = high - 1;
        // swap the pivot out of the way (store it at index high)

        // While loop: Move i and j as discussed in class, until i > j

        // swap the pivot into index i;

        return i; // returning the index of the pivotElement
    }


}

