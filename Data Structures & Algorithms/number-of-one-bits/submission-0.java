class Solution {
    public int hammingWeight(int n) {
        int result = 0;
        String binary = Integer.toBinaryString(n);
        for (int i = 0; i < binary.length(); i++) {
            char c = binary.charAt(i);
            if (c == '1') {
                result++;
            }
        }
        return result;
    }
}
