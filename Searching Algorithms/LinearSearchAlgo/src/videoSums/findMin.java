package src.videoSums;

public class findMin {
    public static void main(String[] args) {
        int[] arr = { 18, 33, 4, 2, -2, -5, 9, 10 };
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;

    }
}
