package partition;

import java.util.Arrays;

import static partition.PartitionExercises.*;

public class Main {

    public static void main(String[] args) {

        int[] arr1 = {0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1};
        System.out.println("Before sort01: ");
        System.out.println(Arrays.toString(arr1));
        sort01(arr1);
        System.out.println("After sort01: ");
        System.out.println(Arrays.toString(arr1));

        System.out.println();
        System.out.println("Testing partitionArray");
        int[] arr2 = {5, 9, 0, 1, 12, 6, 20, 4, 10, 3, 45};
        System.out.println("Before partitioning by " + arr2[(arr2.length - 1)/2]);
        System.out.println(Arrays.toString(arr2));
        partitionArray(arr2); // 6 is the pivot in this example
        System.out.println("After partitioning by " + arr2[arr2.length / 2] + ": ");
        System.out.println(Arrays.toString(arr2));

        // Uncomment to test partitionSubarray
        int[] arr3 = {5, 9, 0, 1, 12, 6, 20, 4, 10, 3, 45};
        System.out.println();
        System.out.println("Testing partitionSubArray");
        System.out.println("Before partitioning from [2, 10] using pivot " + arr3[6]);
        System.out.println(Arrays.toString(arr3));
        partitionSubarray(arr3, 2, arr3.length - 1);
        System.out.println("After partitioning from [2, 10]");
        System.out.println(Arrays.toString(arr3));
        // TODO: test with different low, high

    }
}
