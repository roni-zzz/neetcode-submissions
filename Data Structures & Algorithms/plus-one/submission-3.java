class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        int[] result = new int[digits.length];
        boolean increase = false;
        for (int i = 0; i < digits.length; i++) {
            if (digits.length == 1 && digits[0] == 9) {
                increase = true;
            }
            else if (digits[0] == 9 && digits [1] == 9) { 
                increase = true;
            }
        }

        System.out.println(increase);

        if (increase) {
            result = new int[digits.length + 1];
        }
        boolean added = false;
        
        for (int i = 0; i < digits.length; i++) {
            if (!added) { 
                if (digits[n - i] == 9) {
                    result[n - i] = 0;
                }
                else {
                    result[n-i] = digits[n-i] + 1;
                    added = true;
                }
            }
            else {
                result[n-i] = digits[n-i];
            }

        }
        if (increase) {
            result[0] += 1;
        }
        return result;
    }
}
