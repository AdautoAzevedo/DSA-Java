import java.util.Scanner;

import algorithms.BinarySearch;
import algorithms.LinearSearch;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int[] array = {10, 20, 30, 40, 50, 60};
        int target;
        int resultLinear;
        int resultBinary;

        System.out.println("Please enter the value to be found: ");
        target = in.nextInt();

        resultLinear = LinearSearch.linearSearch(array, target);

        if (resultLinear != -1) {
            System.out.println("The value was found in Linear search at index: "+ resultLinear);
        } else {
            System.out.println("The value was not found");
        }

        resultBinary = BinarySearch.binarySearch(array, target);
        
        if (resultBinary != -1) {
            System.out.println("The value was found in Binary search at index: "+ resultBinary);
        } else {
            System.out.println("The value was not found");
        }
    }
}
