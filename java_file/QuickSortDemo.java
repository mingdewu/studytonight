import java.util.Arrays;

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] arr1 = { 7, 9, 1, 2, 10, 15, 6 };
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] arr3 = { 1 };
        int[] arr4 = { -5, 2, -1, 0, 11, 20, -20 };

        quickSort(arr1, 0, arr1.length - 1);
        quickSort(arr2, 0, arr2.length - 1);
        quickSort(arr3, 0, arr3.length - 1);
        quickSort(arr4, 0, arr4.length - 1);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
    }

    public static void quickSort(int[] arrToSort, int leftIdx, int rightIdx) {
        if (leftIdx >= rightIdx)// array contains less than 2 elements
            return;

        int partitionIdx = partition(arrToSort, leftIdx, rightIdx);// getting the index of the pivot

        quickSort(arrToSort, leftIdx, partitionIdx - 1);// sorting the array to the left of pivot
        quickSort(arrToSort, partitionIdx + 1, rightIdx);// sorting the array to the right of pivot
    }

    public static int partition(int[] arrToSort, int leftIdx, int rightIdx) {
        int i = leftIdx - 1;
        int pivot = arrToSort[rightIdx];// the rightmost element is chosen as the pivot

        for (int j = leftIdx; j < rightIdx; j++) {
            // if current element is smaller than pivot then add it to the left half
            if (arrToSort[j] < pivot) {
                i += 1;
                int temp = arrToSort[j];
                arrToSort[j] = arrToSort[i];
                arrToSort[i] = temp;
            }
        }

        // add pivot element at its correct position
        int temp = arrToSort[i + 1];
        arrToSort[i + 1] = pivot;
        arrToSort[rightIdx] = temp;

        // return the sorted position of the pivot element
        return i + 1;
    }
}
