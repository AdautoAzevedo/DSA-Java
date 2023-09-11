package algorithms;

public class InsertionSort {
    public static int[] insertionSort(int[] array){

        //This algorithm works by taking one element from the unsorted portion of the array and inserts it into its correct position

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j>=0 && array[j] > key) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }

        return array;
    }
    public static void main(String[] args) {
        int[] array = {30,50,20,60,40,10};

        int[] sortedArray;

        sortedArray =insertionSort(array);

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(array[i] +" ");
        }
    }
}
