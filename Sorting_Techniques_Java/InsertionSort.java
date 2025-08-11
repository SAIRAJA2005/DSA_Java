/*
 * Insertion Sort Algorithm in Java
 * This code implements the insertion sort algorithm,
 * which sorts an array of integers in ascending order.
 * 
 * Algorithm:
 * 1. Start from the second element (index 1) of the array.
 * 2. Compare the current element (key) with the elements before it.
 * 3. Shift all elements that are greater than the key to one position ahead.
 * 4. Insert the key at its correct position.
 * 5. Repeat the process for all elements in the array.
 * 
 * * Time Complexity:
    * Best case: O(n) (already sorted)
    * Worst & Average case: O(n²)
 * * Space Complexity: O(1) as it sorts in place
 * 
 */

public class InsertionSort{

    static void display(int[] arr, int n){
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Function to perform insertion sort on the array
    static void insertionSort(int[] arr, int n){
        for(int i = 1 ; i < n ; i++){
            int key = arr[i];
            int j = i - 1;
            
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            
            arr[j + 1] = key;

            display(arr, n); // Display the array after each insertion
        }
    }
    public static void main(String[] args){
        int[] arr = {5, 3 , 8 ,1,2};
        int n = arr.length;

        System.out.println("Initial Array: ");
        display(arr, n);

        System.out.println("Performing Insertion Sort: ");
        insertionSort(arr,n);
        
        System.out.println("After Insertion Sort: ");
        
        display(arr, n);
    }
}   

