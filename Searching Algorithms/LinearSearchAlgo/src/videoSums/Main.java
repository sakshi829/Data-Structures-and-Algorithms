package src.videoSums;

public class Main {
    public static void main(String[] args) {

        int[] nums = { 23, 4, 18, 28, 10, -3, -7 };
        int target = 28;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;

    }
}
