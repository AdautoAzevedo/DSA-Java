package algorithms;

public class MergeSort {
    //This algorithm works by dividing the unsorted array into smaller arrays, then sorting each of them and merging them back together

    public static void mergeSort(int[] array){
        int length = array.length;
        
        if (array == null) {
            return;
        }

        if (array.length>1) {
            //Here we find the middle of the array
            int mid = length/2;

            //Create temporary arrays for each sublist
            int[] left = new int[mid];
            int[] right = new int[length - mid];

            //Copy data to each sublist
            for (int i = 0; i < mid; i++) {
                left[i] = array[i];
            }

            for (int i = mid; i < length; i++) {
                right[i-mid] = array[i];
            }

            //Then we call the function recursively to sort the left and right halves
            mergeSort(left);
            mergeSort(right);

            merge(array, left, right);
        }
    }

    public static void merge(int[] array, int[] left, int[] right) {
        int i=0, j=0, k=0;

        //Here we merge the two sublists back into the original array, in the right order
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Here we copy the remaining elements of each array
        while (i<left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
    
    public static void main(String[] args) {
        int[] array = {30,50,20,60,40,10};
  
        mergeSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }

    }

}
