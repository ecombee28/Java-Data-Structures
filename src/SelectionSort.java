public class SelectionSort {
    
   /*
      @parm lastUnsortedIndex = array.length -1. traverse the array from end to start
      @parm i = 0. traverse the array from front to end
      Compare array[lastUnsortedIndex] to array[i]. If array[lastUnsortedIndex] > array[i], swap.
      Worst case: 0(n^2)
      Average case: 0(n^2)
      Stable:no (the same item does not stay in the same place in the array after sort)
    */
    public void doSelectionSort(int[] arr){
        
        for(int lastUnsortedIndex = arr.length-1;lastUnsortedIndex > 0;lastUnsortedIndex--){
            
            int largest = 0;
            
            for(int i=0;i <= lastUnsortedIndex;i++){
                if(arr[i] > arr[largest]){
                    largest = i;
                }
            }
            
            swap(arr,largest,lastUnsortedIndex);
        }

        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private void swap(int[] arr, int i, int j) {

        if(i == j){
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
