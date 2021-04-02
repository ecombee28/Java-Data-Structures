public class BubbleSort {

    /*
       Compare array[n] to array[n+1]. If array[n] > array[n+1} swap.
       Decrease length of array as sorting continues.
       Worst case: O(n^2)
       Average case:0(n^2)
       Stable:Yes (the same item do stay in the same place in the array after sort)
     */
    public void doBubbleSort(int[] arr){
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
        for(int r =0;r<arr.length;r++){
            System.out.print(arr[r] + " ");
        }

    }
}
