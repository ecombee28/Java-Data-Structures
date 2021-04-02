import java.util.Arrays;

/*
  Divide and conquer algorithm
  Split array in half. Using recursion continue to split the left array until it is all
  1 element arrays. Then sort and merge them. Do the same thing for the right array. Then
  sort and merge them together.
  Worse case: n*log(n)
  Average case: n*log(n)
   Stable:Yes (the same item do stay in the same place in the array after sort)

 */

public class MergeSort {

    /* Divide and conquer algorithm */
    public int[] input;

    public void doMergeSort(int[] input){

        this.input = input;
        mergeSort(input, 0,input.length);

        System.out.println(Arrays.toString(input));

    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }



        int mid = (start + end) / 2;

        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);

    }

  
    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];

        }


        System.arraycopy(input, i, input, start + tempIndex, mid - i);

        System.arraycopy(temp, 0, input, start, tempIndex);


    }

}
