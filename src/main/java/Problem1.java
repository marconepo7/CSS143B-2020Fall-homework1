public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        // Add your solution
        if (data == null || data.length == 0) {
            return -1;
        }
        int right = data.length - 1;
        int left = 0;
        while (left <= right) {
            int mid = (right + left) / 2;

            if (target == data[mid]) {
                return mid;
            } else if (target > data[mid]) {
                left = mid + 1;
            } else
                right = mid - 1;
        }
        return -1; // Place holder
    }
}
// help from geekforgeeks (link in assignment page)
