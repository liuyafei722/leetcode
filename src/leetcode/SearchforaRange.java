package leetcode;

/**
 * @Author: LiuYafei
 * @Date: 2017/10/31
 * @Time: 18:20
 * @Description:
 */
public class SearchforaRange {
    public static int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }
        if(nums.length == 1) {
            if(target != nums[0]) {
                return new int[]{-1,-1};
            }
            else
                return new int[]{0,0};
        }
        int lo = 0;
        int hi = nums.length - 1;
        int[] res = new int[2];
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if(nums[mid] < target ) {
                lo = mid + 1;
            }
            else {
                hi = mid;
            }
            if(hi == lo && nums[lo] != target)
                return new int[]{-1, -1};
        }
        res[0] = lo;
        lo = 0;
        hi = nums.length - 1;
        while (lo < hi) {
            int mid = (lo + hi + 1) / 2;
            if(nums[mid] > target ) {
                hi = mid - 1;
            }
            else {
                lo = mid;
            }
            if(hi == lo && nums[lo] != target)
                return new int[]{-1, -1};
        }
        res[1] = hi;
        return res;
    }
    public static void main(String [] args) {
        SearchforaRange.searchRange(new int[]{5,7,7,8,8,10},8 );
    }
}
