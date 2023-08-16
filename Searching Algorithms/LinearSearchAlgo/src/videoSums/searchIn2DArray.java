package src.videoSums;

public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 12, 4, 15 },
                { 17, 10, 98, 3, 8 },
                { 67, 45, 65, 76 }
        };
        // int target = 98;
        // int[] ans = search(arr, target);
        int maxAns = max(arr);
        System.out.println(maxAns);
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }

        return max;
    }
}
