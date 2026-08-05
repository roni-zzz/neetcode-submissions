class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> num = new HashMap<Integer, Integer>();
        int[] result = new int[] {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (num.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = num.get(target - nums[i]);
            }
            num.put(nums[i], i);
        }
        return result;
    }
}
