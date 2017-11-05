package leetcode;

/**
 * @Author: LiuYafei
 * @Date: 2017/10/31
 * @Time: 19:26
 * @Description:
 */
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return nums[0] >= target ? 0 : 1;
        }
        int lo = 0;
        int hi = nums.length - 1;

        while(lo < hi) {
            int mid = (lo + hi) /2;

            if(nums[mid] < target) {
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
            if (nums[mid] == target) {
                return mid;
            }
        }
        return nums[lo] >= target ? lo : lo +1;
    }
    public static void main(String[] args) {
        System.out.println(SearchInsertPosition.searchInsert(new int[]{1,4,5}, 1));
    }
}
