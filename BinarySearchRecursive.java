public class BinarySearchRecursive {
    // Method to perform binary search (recursive)
    public static int binarySearch(int[] arr, int left, int right, int key) {
        if (right >= left) {
            int mid = left + (right - left) / 2; // Calculate mid-point

            // Check if the key is present at mid
            if (arr[mid] == key) {
                return mid; // Key found, return its index
            }

            // If key is greater than mid, ignore left half
            if (arr[mid] < key) {
                return binarySearch(arr, mid + 1, right, key);
            } 
            // If key is smaller than mid, ignore right half
            else {
                return binarySearch(arr, left, mid - 1, key);
            }
        }

        return -1; // Key not found
    }

    public static void main(String[] args) {
        int[] sortedArray = {2, 3, 4, 10, 40};
        int key = 10;

        // Calling binarySearch method
        int result = binarySearch(sortedArray, 0, sortedArray.length - 1, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
