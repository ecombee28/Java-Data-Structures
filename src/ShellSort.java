public class ShellSort {

    /*
       @param gap = array.length/2
       @param i = gap

       compare array[gap] with array[i]. If array[gap] = array[i] swap. Divide gap on each loop
       Worse case:
       Average case: n*log(n)^2 or n^(3/2)
       Stable:no (the same item does not stay in the same place in the array after sort)
     */

    public void doShellSort(int[] arr){

        for(int gap = arr.length/2;gap > 0; gap/= 2){

            for(int i=gap;i<arr.length;i++){

                int newElement = arr[i];

                int j = i;

                while(j >= gap && arr[j-gap] > newElement){

                    arr[j] = arr[j-gap];
                    j -= gap;

                }

                arr[j] = newElement;
            }

        }

        for (int t : arr) {
           System.out.print(t + " ");
       }
    }
}
