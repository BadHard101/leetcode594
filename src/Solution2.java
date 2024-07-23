import java.util.Arrays;

class Solution2 {
    public int findLHS(int[] nums) {
        int n = nums.length;
        //if (n == 0 || n == 1) return 0;
        Arrays.sort(nums);

        int ans = 0;
        int l = 0;
        int r = 1;
        while (r < n) {
            int dif = nums[r] - nums[l];
            if (dif == 1) {
                ans = Math.max(ans, r - l + 1);
            }
            if (dif > 1) l++;
            else r++;
        }
        return ans;
    }
}
