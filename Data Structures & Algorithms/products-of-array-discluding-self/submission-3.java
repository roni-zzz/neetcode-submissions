class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int left = 1;
        int right = 1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            result[i] = left;
            left = left * nums[i];
        }        
        for (int i = n - 1; i > -1; i--) {
            result[i] *= right;
            right = right * nums[i];
        }
        return result;
    }
}  
