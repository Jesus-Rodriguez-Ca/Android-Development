// Jesus Rodriguez
// 05-24-2020
// ITC 155 Spring2020
// Mid Term 

/*Problem 3
* Write a void method selectionSortDescendTrace() that takes an integer array, and sorts the array into descending order. 
* The method should use nested loops and output the array after each iteration of the outer loop, thus outputting the array
* N-1 times (where N is the size). Complete main() to read in a list of up to 10 positive integers (ending in -1) and then 
* call the selectionSortDescendTrace() method.

* If the input is:

* 20 10 30 40 -1
* then the output is:

* 40 10 30 20 
* 40 30 10 20 
* 40 30 20 10  
 */


package mid;

import java.util.Scanner;


public class DescendingOrder {
    public static void selectionSortDescendTrace(int[] numbers, int numElements) {
        for (int i = 0; i < numElements - 1; ++i) {
            int largest = i;
            for (int j = i; j < numElements; ++j) {
                if (numbers[j] > numbers[largest]) {
                    largest = j;
                }
            }
            
            int swap = numbers[i];
            numbers[i] = numbers[largest];
            numbers[largest] = swap;
            for (int j = 0; j < numElements; j++) {
                System.out.print(numbers[j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] numbers = new int[10];
        int numElements = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scnr.nextInt();
            if (numbers[i] == -1) 
                break;
            numElements++;
        }
        selectionSortDescendTrace(numbers, numElements);
    }
}

