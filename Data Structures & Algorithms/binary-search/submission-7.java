class Solution {
    public int search(int[] nums, int target) {
        int a = 0;
        int b = nums.length;
        int index = (a + b) / 2;
        for (int i = 0; i < nums.length; i++) {
            //System.out.println(index);
            if (nums[index] == target) {
                return index;
            }
            else if (nums[index] < target) {
                a = index;
                index = (a + b) / 2;
                //System.out.println("Index <: " + index);
            }
            else {
                //System.out.println("Index >: " + index);
                b = index;
                index = (a + b) / 2;
            }
        }
        return -1;
    }
}
