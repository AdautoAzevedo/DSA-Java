package algorithms;

public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int first = 0;
        int last = array.length -1;
        int mid;

        //This function will repeatedly split the search range in half, until it found the element
        while (first<=last) {
            mid = first+(last-first)/2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid]<target) {
                first = mid + 1; 
            } else {
                last = mid - 1;
            }
        }

        return -1;
    }
}
