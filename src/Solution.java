class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length < 2) return;

        int l = 0, r = 0;
        while (r < nums.length) {
            while (l < nums.length && nums[l] != 0) {
                l++;
            }
            if (l >= nums.length) return;
            if (r <= l) r = l + 1;
            while (r < nums.length && nums[r] == 0) {
                r++;
            }
            if (r < nums.length) {
                nums[l] = nums[r];
                nums[r] = 0;
            }
        }
    }
}