//we need to convert 3 sum into 2 sum, basically a + b + c = 0, so b + c = -a
// fix a as nums[i] and then compare nums[left] + nums[right] = -nums[a] and then basic two sum

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while (left < right) { 
                int sum = nums[left] + nums[right];
                if (sum == -nums[i]) {
                    res.add(Arrays.asList(nums[left], nums[i], nums[right])); 
                    while (nums[left] == nums[left + 1] && left + 1 < nums.length - 1) {
                        left++;
                    }  
                    while (nums[right] == nums[right - 1] && right - 1 > 0) {
                        right--;
                    }   
                    left++;
                    right--; 
                }
                else if (sum < -nums[i]) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return res;
    }
}
