import java.util.Arrays;

/*
   Divide and conquer   Recursion

  Randomly pick a pivot point (prefer middle) arrange array so
  that all elements left of the pivot is < then pivot and
  everything to the right of pivot is >. Continue this until array
  is sorted.
  Worst case: n^2
  Average case: n*log(n)
 */
public class QuickSort {

 public int[] input;
    public void doQuickSort(int[] input){

        this.input = input;
        quickSort(input, 0, input.length-1);

        System.out.println(Arrays.toString(this.input));


    }

    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;

        if (low >= high)
            return;

        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j)
            quickSort(arr, low, j);
        if (high > i)
            quickSort(arr, i, high);


    }

}

