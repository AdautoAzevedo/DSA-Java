package algorithms;

public class BubbleSort {
    public static int[] bubbleSort(int[] array){
        int n = array.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i-1]>array[i]) {
                    int temp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n--;
            } while (swapped);        
            return array;
        }

    public static void main(String[] args) {
        int[] array = {30, 20, 10, 40, 50};

        int[] sortedArray;

        sortedArray = BubbleSort.bubbleSort(array);

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] +" ");
        }
    }
}

