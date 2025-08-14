
/*
 * Selection Sort Algorithm Implementation in Java
 * This program sorts an array of integers using the Selection Sort algorithm.
 * It includes methods for displaying the array, swapping elements, and performing the selection sort.
 * The main method initializes an array, displays it, sorts it using Selection Sort, and then displays the sorted array.
 *
 * Algorithm Implementation : 
 * 1. Iterate through the array, assuming the first element is the minimum.
 * 2. For each element, compare it with the rest of the elements to find the minimum.  
 * 3. Swap the found minimum element with the first element of the unsorted part of the array.
 * 4. Repeat the process for the next elements until the entire array is sorted.
 * * Time Complexity: O(n^2) in the worst and average cases, O(n) in the best case (when the array is already sorted).
 * * Space Complexity: O(1) as it sorts the array in place without using any additional data structures.

 */


public class SelectionSort{

    static void display(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Print a new line after displaying the array
    }

    static void swapping(int[]arr, int i, int j){
        int temp = arr[i]; // Store the value at index i in a temporary variable
        arr[i] = arr[j];    // Assign the value at index j to index i
        arr[j] = temp;      // Assign the value stored in the temporary variable to index j
    }
    static void Selection_Sort(int[] arr, int start, int end){
        for(int i = start; i < end - 1; i++){
            int minIndex = i; // Assume the first element is the minimum
            for(int j = i + 1; j < end; j++){
                if(arr[j] < arr[minIndex]){ // Corrected condition
                    minIndex = j; // Update the index of the minimum element
                }
            }
            swapping(arr, i, minIndex); // Swap the found minimum element with the first element
            display(arr); // Display the array after each swap
        }
    }
    public static void main(String[] args){
        int[] arr = {5, 3, 8, 1, 2};
        int n = arr.length;

        System.out.println("Initial array: ");
        display(arr); // Using the existing display method to print the initial array

        System.out.println("Sorting the array using Selection Sort: ");
        Selection_Sort(arr, 0, n);

        System.out.println("Final Sorted array after selection after: ");
        display(arr); // Using the existing display method to print the sorted array
    }

}
