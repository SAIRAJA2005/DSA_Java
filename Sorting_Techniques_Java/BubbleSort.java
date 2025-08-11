/*
 * Bubble Sort Algorithm Implementation in Java
 * This program sorts an array of integers using the Bubble Sort algorithm.
 * It includes methods to display the array, swap elements, and perform the sorting.
 * It also prints the state of the array after each iteration.
 * 
 * Algorithm:
 * 1. Iterate through the array multiple times.
 * 2. For each iteration, compare adjacent elements.
 * 3. If the current element is greater than the next, swap them.
 * 4. If no swaps occur during an iteration, the array is sorted.
 * 5. Print the state of the array after each iteration.
 * Best case: O(n) (if already sorted — with optimization)
 * Worst & Average case: O(n²)
 * Space Complexity: O(1) as it sorts in place.
 */

public class BubbleSort {
    static void displayArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            boolean swapped = false;
            for(int j = 0; j < n - i - 1 ; j++){
                if(arr[j] > arr[j + 1]){
                    swap(arr, j , j + 1);
                    swapped = true;
                }
            }
            if(!swapped){
                System.out.println("Array is sorted, no swaps needed in iteration " + (i + 1));
                break;
            }
            else{
                System.out.println("After iteration " + (i + 1) + ":");
                displayArray(arr);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};
        System.out.println("Orginal array:");
        displayArray(arr);

        System.out.println("Sorting array using Bubble Sort");
        bubbleSort(arr);

        System.out.println("Sorted array:");
        displayArray(arr);
    }
}
