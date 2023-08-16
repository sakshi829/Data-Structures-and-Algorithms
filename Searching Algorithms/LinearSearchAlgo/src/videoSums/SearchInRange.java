package src.videoSums;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = { 28, 13, -8, 29, 20, 37 };
        int target = 29;
        int ans = Search(nums, target, 1, 4);
        System.out.println(ans);
    }

    static int Search(int[] nums, int target, int start, int end) {
        if (nums.length == 0) {
            return -1;
        }
        for (int index = start; index < end; index++) {
            int element = nums[index];
            if (target == element) {
                return index;
            }
        }
        return -1;
    }
}
