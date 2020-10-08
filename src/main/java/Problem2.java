public class Problem2 {

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {
        // Add your solution
int length = data.length;
for (int i = 0; i<length-1; i++){
    for (int j = 0; j < length-i-1; j++) {
        if (data[j] >data[j+1]) {
            swap(data, j);
        }
    }
}
    }
    public static void swap(int[] data, int j) {
        int temp = data[j];
        data[j] = data[j +1];
        data[j +1] = temp;
    }
}
// help from geekforgeeks (site in assignment)
