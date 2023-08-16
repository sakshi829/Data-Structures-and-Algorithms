import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = { 5, -5, 67, 100, -10 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int arr[]) {
        // run for n-1 times
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step ,max item will come at last resp index
            for (int j = 1; j < arr.length - i; j++) {
                // swap items if
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            // if the array is sorted asc already then there is no need to check for i=
            // value 2 onwards so loop should break
            if (!swapped) { // !false = true ,swapped=false
                break;
            }
        }
    }
}