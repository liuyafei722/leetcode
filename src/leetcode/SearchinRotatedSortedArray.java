package leetcode;
/**
 * @Author: LiuYafei
 * @Date: 2017/10/31
 * @Time: 16:30
 * @Description:
 */
public class SearchinRotatedSortedArray {
    public static int search(int[] nums, int target) {
        if(nums.length == 0 || nums == null){
            return -1;
        }
        if(nums.length == 1) {
            if(nums[0] == target) {
                return 0;
            }else {
                return -1;
            }
        }


        int a = 0;
        int b = nums.length-1;
        while (a<b) {
            int mid = (a + b) / 2;
            if(nums[mid] > nums[b]) {
                a = mid + 1;
            }
            else {
                b = mid;
            }
        }
        int max = a;//a = b就是最小的数的下标
        a = 0;
        b = nums.length - 1;
        while (a <= b) {
            int mid = (a + b) / 2;
            int realmid = (mid + max) % nums.length;
            if(nums[realmid] == target)
                return realmid;
            if(nums[realmid] < target) {
                a = mid + 1;
            }
            else {
                b = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String [] args) {
        int[] nums = {1,3};
        int target = 3;
        System.out.println(SearchinRotatedSortedArray.search(nums, target));
    }
}
