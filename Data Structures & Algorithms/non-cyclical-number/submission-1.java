class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> sqrs = new HashSet<>();
        int sumSqrs = n;
        
        while (sumSqrs != 1) {
            String num = Integer.toString(sumSqrs);
            sumSqrs = 0;
            for (int i = 0; i < num.length(); i++) {
                char c = num.charAt(i);
                int digit = c - '0'; 
                sumSqrs += digit * digit;

            }
            if (!sqrs.contains(sumSqrs)) {
                sqrs.add(sumSqrs);
            }
            else
                return false;
        }
        return true;
    }
}
