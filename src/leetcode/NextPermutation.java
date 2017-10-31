package leetcode;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        if(nums == null || nums.length <= 1) {
            return;
        }
        int temp = nums[nums.length-1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] >= temp) {
                temp = nums[i];
            }
            else if(nums[i] < temp) {
                //交换第一个比下标为i的元素大的元素
                for(int j = nums.length-1; ;j--) {
                    if(nums[j] > nums[i]) {
                        int t = nums[i];
                        nums[i] = nums[j];
                        nums[j] = t;
                        break;
                    }
                }
                //将大于i的倒序
                for(int k = 0; k < (nums.length - 1 - i) / 2; k++) {
                    int t = nums[i + k + 1];
                    nums[i + k+ 1] = nums[nums.length - 1 -k];
                    nums[nums.length - 1 - k] = t;
                }
                return;
            }
        }
        for(int k = 0; k < nums.length / 2; k++) {
            int t = nums[k];
            nums[k] = nums[nums.length - 1 -k];
            nums[nums.length - 1 - k] = t;
        }
        return;

    }
}
