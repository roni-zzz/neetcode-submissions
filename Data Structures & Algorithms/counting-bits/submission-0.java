class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];

        for (int i = 0; i < result.length; i++) {
            // 1 * 2^2 + 0* 2^1 + 0 * 2^0
            int count = 0;
            int number = i;
            //System.out.println("Number: "+number);
            while (number > 0) {
                //System.out.println("Number inside while: "+ number);
                if (number % 2 == 1) {
                    count++;
                }
                number = number / 2;
            }
            result[i] = count;
        }
        return result;
        
    }
}
