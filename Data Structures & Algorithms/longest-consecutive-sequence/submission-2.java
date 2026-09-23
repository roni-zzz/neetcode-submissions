class Solution {
    public int longestConsecutive(int[] nums) {
        int length = 0;
        int maxLength = 0;
        Set<Integer> set = new TreeSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int temp = 0;
        int count = 0;
        
        for (int num : set){
            System.out.println(num);
            if (count == 0) {
                temp = num;
                length++;
            }
            else {
                if (num - temp == 1) {
                    temp = num;
                    length++;
                }
                else {
                    maxLength = Math.max(maxLength, length);
                    temp = num;
                    length = 1;
                }
            }
            count++; 
        }
        maxLength = Math.max(maxLength, length);
        return maxLength;
    }
}
