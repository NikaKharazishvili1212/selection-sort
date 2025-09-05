package src;

public class SelectionSort {
    
    // Selection Sort: repeatedly finds the smallest element in the unsorted part and moves it to the correct position at the start of the array
    public static void sort(int[] arr) {
        int arrLength = arr.length;
        
        for (int i = 0; i < arrLength - 1; i++) {
            int minIndex = i;

            // Find the smallest element in the unsorted portion of the array
            for (int j = i + 1; j < arrLength; j++)
                if (arr[minIndex] > arr[j])
                    minIndex = j;

            // Swap the found smallest element with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 29, 10, 14, 37, 13 };
        sort(nums);

        System.out.print("Sorted Array: ");
        for (int num : nums)
            System.out.print(num + " ");
    }
}