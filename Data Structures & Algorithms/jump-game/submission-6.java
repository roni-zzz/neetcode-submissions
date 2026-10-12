class Solution {
    public boolean canJump(int[] nums) {
        // backwards pass
        if (nums.length < 2) {
            return true;
        }
        int n = nums.length;
        int jump = 1;
        for (int i = n - 2; i > 0; i--) {
            
            if (nums[i] < jump) {
                jump++;
            }
            else if (nums[i] >= jump) {
                jump = 1;
            }
        }

        if (nums[n-2] == 0) {
            if (nums[0] == n - 1 || nums[0] > jump) {
                return true;
            }
        }

        else {
            if (nums[0] >= jump) {
                return true;
            }
        }            

        return false;




        
        // for (int i = 0; i < n; ) {
            
        //     int jump = nums[i];
            
        //     //System.out.println("SO now i have to jump to index : " + jump);
        //     i += jump;
        //     //System.out.println("Now i is: " + i);
        //     if (i < n - 1 && nums[i] == 0) {
        //         //System.out.println("Now we are in the if");
        //         return false;
                
        //     }
        //     if (i >= nums.length - 1) {
        //         return true;
        //     }
        

        // }
        // return true;
    }
}
