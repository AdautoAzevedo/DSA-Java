package algorithms;

public class SelectionSort {
    // This algorithm works by dividing the input list into a sorted and an unsorted regions of the array. 
    public static int[] selectionSort(int[] array) {
        int length = array.length;

        for (int i = 0; i < length - 1; i++) {
            int minimumIndex = i;   //We assume that the current element is the minimum
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[minimumIndex]) {
                    minimumIndex = j;   //Here we update the minimum index if a smaller number is found
                }
            }
            //Then we swap the current element with the minimum element
            int aux = array[i];
            array[i] = array[minimumIndex];
            array[minimumIndex] = aux; 
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {30,50,20,60,40,10};

        int[] sortedArray;

        sortedArray = selectionSort(array);

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(array[i] +" ");
        }
    }
}
