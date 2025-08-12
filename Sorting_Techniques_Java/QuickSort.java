/*
* Algorithm:
*Choose a pivot element (commonly the last element or random element).

* Partition the array so that:
    * Elements smaller than pivot go to the left.

    * Elements greater than pivot go to the right.

* Recursively apply Quick Sort to the left and right subarrays.
*/





public class QuickSort{
    

    static void displayArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    static void swap(int[] arr, int fistNum, int secondNum){
        int temp = arr[fistNum];
        arr[fistNum] = arr[secondNum];
        arr[secondNum] = temp;
    }

    // 
    static int findPivotIndex(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low ; j < high ; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, arr[i], arr[j]);
            }
        }

        swap(arr , arr[i + 1] , arr[high]);
        return i + 1;
    }

    // 
    static void quickSort(int[] arr, int low, int high){
        if(low < high){

            int pi = findPivotIndex(arr, low, high);

            quickSort(arr, pi - 1, high);
            quickSort(arr, pi + 1, high);

        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};
        System.out.println("Orginal array:");
        displayArray(arr);

        System.out.println("Sorting array using Quick Sort");
        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        displayArray(arr);
    
    }
}