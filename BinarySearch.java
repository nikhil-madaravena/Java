public class BinarySearch {
    // Method to perform binary search (iterative)
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate mid-point

            // Check if the key is present at mid
            if (arr[mid] == key) {
                return mid; // Key found, return its index
            }

            // If key is greater than mid, ignore left half
            if (arr[mid] < key) {
                left = mid + 1;
            } 
            // If key is smaller than mid, ignore right half
            else {
                right = mid - 1;
            }
        }

        return -1; // Key not found
    }

    public static void main(String[] args) {
        int[] sortedArray = {2, 3, 4, 10, 40};
        int key = 10;

        // Calling binarySearch method
        int result = binarySearch(sortedArray, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
