package algorithms;

import java.util.Scanner;

public class Recursion {
    
    public static int recursiveFactorial(int num) {
        //A recursive function is a function that calls itself. It must have a base case, when the recursion ends, to prevent a infinite loop
        
        if (num == 0 ||num == 1) {  //This is the base case of this function
            return 1;
        } else {
            return num * recursiveFactorial(num - 1);   //The function calls itself here, reducing the problem
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please digit the number: ");
        int number = in.nextInt();

        int result = recursiveFactorial(number);
        System.out.println("The result is: " + result);
    }
}
