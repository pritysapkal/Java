import java.util.Arrays;

public class Merge {

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        // Initialize a result array with the size of the sum of the two arrays
        int[] result = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        // Traverse both arrays and fill the result array with the smallest elements
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        // If any elements are left in arr1, copy them over
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        // If any elements are left in arr2, copy them over
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        // Merge the arrays
        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        // Print the merged array
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
}
