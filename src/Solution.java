import java.util.Arrays;

class Solution {
    // [1,3,2,2,5,2,3,7]
    // [1,2,2,2,3,3,5,7]
    //  - - - -
    //    - - - - -
    //              -
    //                -

    


    //                  r
    // [1,2,2,2,3,3,3,3] ans = 7
    //    l

    //          r
    // [1,1,5,5] ans = 0
    //      l

    //      r
    // [1,2] ans = 2
    //  l

    //      r
    // [1,3] ans = 0;
    //    l

    //                  r
    // [1,2,2,2,3,3,5,7] 5
    //                l

    //                  r
    // [1,2,2,5,6,6,8,9] 3
    //              l

    //          r
    // [1,1,1,1] 0
    //  l
    public int findLHS(int[] nums) {
        if (nums.length == 1) return 0;
        Arrays.sort(nums);
        int ans = 0;
        int r = 0;
        int l = 0;
        while (r < nums.length) {
            while (r < nums.length && nums[r] == nums[l]) {
                r++;
            }
            while (r < nums.length && nums[r] - nums[l] == 1) {
                r++;
            }
            if (nums[r-1] - nums[l] == 1) {
                ans = Math.max(ans, r-l);
            }
            if (r == nums.length) break;
            while (l < r && nums[r]-nums[l] != 1) {
                l++;
            }
        }
        return ans;
    }
}