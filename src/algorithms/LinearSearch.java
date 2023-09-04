package algorithms;

public class LinearSearch {
    public static int linearSearch(int[] array, int target) {
        //This function will iterate through every item in the array and will check if the value is equal to the target value
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;   //We return the index of the found item
            }
        }
        return -1;  //return -1 because the function must return a intenger
    }
}
