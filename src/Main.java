
import java.time.ZonedDateTime;
import java.util.Arrays;

public class Main{

    public static void main(String[] args) {

        int[] arr = generateRandomArray(1000);
        int[] arr1 = generateRandomArray(1000);
        int[] arr2 = generateRandomArray(1000);
        int[] arr3 = generateRandomArray(5000);
        int[] arr4 = generateRandomArray(5000);
        int[] arr5 = generateRandomArray(5000);
        int[] arr6 = {2,3,3,4,5,6,7,8,9,10,15,11,20,34,40,44};
        int start, stop;


        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();
        ShellSort shellSort  = new ShellSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();
        BinarySearch binarySearch = new BinarySearch();

        start = (int)ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.print("Bubble sort before:  ");
        System.out.print(Arrays.toString(arr));
        System.out.print("\nBubble sort after:  ");
        bubbleSort.doBubbleSort(arr);
        stop = (int)ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.println("\nDuration: "+(stop - start)+" milliseconds");
        System.out.println("");

        start = (int)ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.print("\nSelection Sort before:  ");
        System.out.print(Arrays.toString(arr1));
        System.out.print("\nSelection Sort after:  ");
        selectionSort.doSelectionSort(arr1);
        stop = (int)ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.println("\nDuration: "+(stop - start)+" milliseconds");
        System.out.println("");

        start = (int)ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.print("\nInsertion Sort before:  ");
        System.out.print(Arrays.toString(arr2));
        System.out.print("\nInsertion Sort after:  ");
        insertionSort.doInsertionSort(arr2);
        stop = (int)ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.println("\nDuration: "+(stop - start)+" milliseconds");
        System.out.println("");

        start = (int)ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.print("\nShell Sort before:  ");
        System.out.print(Arrays.toString(arr3));
        System.out.print("\nShell Sort after:  ");
        shellSort.doShellSort(arr3);
        stop = (int)ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.println("\nDuration: "+(stop - start)+" milliseconds");
        System.out.println("");

        start = (int)ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.print("\nMerge Sort before:  ");
        System.out.print(Arrays.toString(arr4));
        System.out.print("\nMerge Sort after:  ");
        mergeSort.doMergeSort(arr4);
        stop = (int)ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.println("Duration: "+(stop - start)+" milliseconds");

        start = (int)ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.print("\nQuick Sort before:  ");
        System.out.print(Arrays.toString(arr5));
        System.out.print("\nQuick Sort after:  ");
        quickSort.doQuickSort(arr5);
        stop = (int)ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.println("Duration: "+(stop - start)+" milliseconds");
        
        start = (int)ZonedDateTime.now().toInstant().toEpochMilli();
        bubbleSort(arr6);
        System.out.print("\nBinary Search before:  ");
        System.out.println(Arrays.toString(arr6));
        
        int n = arr6.length;
        int findIndex = 11;
        int result = BinarySearch.binarySearch(arr6, 0, n - 1, findIndex);
        if (result == -1) {
            System.out.println("Element not present");
        }else {
            System.out.println("Element found at index " + result);
        }
        
        
        stop = (int)ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.println("Duration: "+(stop - start)+" milliseconds");

    }

    public static int[] generateRandomArray(int size){
        int[] arr = new int[size];

        for(int i=0;i< size;i++){
            int random = (int) (Math.random()*10) + 1;
            arr[i] = random;
        }

        return arr;
    }
    
    public static int[] bubbleSort(int[] arr){
        int temp;
        int n  = arr.length;

        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }

            }
        }
       
		return arr;

    }
}
