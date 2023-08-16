package src.videoSums;

public class maximumWealth {

    public static void main(String[] args) {
        int[][] arr = {
                { 2, 1, 3 },
                { 4, 6, 3 },
                { 9, 8, 6 }
        };
        System.out.println(findMax(arr));
    }

    static int findMax(int[][] arr) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < arr.length; person++) {
            int sum = 0;
            for (int account = 0; account < arr[person].length; account++) {
                sum += arr[person][account];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }

}
