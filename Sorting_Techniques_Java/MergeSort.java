public class MergeSort{

    // display function to print the array
    static void display(int[] arr, int n){
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    

    // merge function to merge two sorted subarrays
    static void merge(int[] A, int low, int mid, int high, int n){
        int i = low;
        int j = mid + 1;
        
        int[] B = new int[n];
        
        int k = 0;
        
        while(i <= mid && j <= high){
            if(A[i] <= A[j]){
                B[k] = A[i];
                k++;
                i++;
            }
            else{
                B[k] = A[j];
                k++;
                j++;
            }
        }
        
        while(i <= mid){
            B[k++] = A[i++];
        }
        while(j <= high){
            B[k++] = A[j++];
        }
        
        for(i = 0 ; i < high - low + 1 ; i++){
            A[i + low] = B[i];
        }
    }


    // From here, the merge sort function is implemented
    // Divide the array into two halves and sort them recursively
    static void mergeSort(int[] arr, int low, int high){
        if(low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        
        merge(arr, low, mid, high, arr.length);
    }
    
    public static void main(String[] args){
        int[] arr = {5, 3 , 8 ,1,2};
        int n = arr.length;
        System.out.println("Initial Array: ");
        display(arr, n);
        
        mergeSort(arr,0, n-1);
        System.out.println("After Insertion Sort: ");
        display(arr, n);
    }

}
