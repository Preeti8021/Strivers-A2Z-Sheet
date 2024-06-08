//Logic: 
//Pick a pivot and place it in correct place (pivot can first,last,middle or random element consistent throughout algorithm)
//Smaller element on left, larger on right
//Time Complexity: O(nlogn)
//Space Complexity: O(1)

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {20, 81, 443, 98, 92, 28, 66};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int left = low ;
        int right = high;

        while (left <= right) {
            while (left <= right && arr[left] <= pivot) {
                left++;
            }
            while (left <= right && arr[right] > pivot) {
                right--;
            }
            if (left < right) {
                // Swap arr[left] and arr[right]
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        // Swap pivot with arr[right]
        int temp = arr[low];
        arr[low] = arr[right];
        arr[right] = temp;

        // Return the pivot index
        return right;
    }
}
