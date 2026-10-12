class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length - 1;
        int maxWater = 0;

        while (start < end) {
            int minWater = Math.min(heights[start], heights[end]);
            //System.out.println("Min water " + minWater);
            int length = Math.abs(start - end);
            //System.out.println("Length " + length);
            maxWater = Math.max(maxWater, minWater * length);
            //System.out.println("Max value: " + maxWater);

            if (heights[start] > heights[end]) {
                end--;
            }
            else {
                start++;
            }
        }
        return maxWater;
    }
}
