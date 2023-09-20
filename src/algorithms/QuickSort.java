package algorithms;

public class QuickSort {
    public static void quickSort(int[] array, int min, int max) {
        if (min < max) {
            //Here we ivide the array into two sub-arrays and sort the the sub-arrays recursively
            int pivotIndex = partition(array, min, max);
            quickSort(array, min, pivotIndex-1); 
            quickSort(array, pivotIndex+1, max); 
        }
    }

    public static int partition(int[] array, int min, int max) {
        // Get the rightmost element and the index of the smaller element
        int pivot = array[max];
        int i = min - 1;

        //Iterate over the array checking if the current element is smaller than or equal to the pivot
        for (int j = min; j < max; j++) {
            if (array[j] < pivot) {
                //Of is true, we swap it
                i++;

                int aux = array[i];
                array[i] = array[j];
                array[j] = aux;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[max];
        array[max] = temp;

        return i + 1;
    }


    public static void main(String[] args) {
        int[] array = {30,50,20,60,40,10};
        int length = array.length;

        quickSort(array, 0, length-1);

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] +" ");
        }
    }
}
