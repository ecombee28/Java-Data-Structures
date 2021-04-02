import org.w3c.dom.ls.LSOutput;

import java.io.OutputStream;
import java.util.Arrays;

public class MergeMain {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        mergeSort(intArray, 0, intArray.length);

        System.out.print(Arrays.toString(intArray)+"\n");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]+" ");
       }
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;


        mergeSort(input, start, mid); //left side
        mergeSort(input, mid, end); // right side
        merge(input, start, mid, end);  // merge the two sides together

    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
                   //condition ? if true : if false
                   // if input[i] <= input[j] then input[i++] else input[j++]
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];

        }


        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);




    }

}