class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty() || (s.length() == 1))
        {
            return true;
        }
        s = s.toUpperCase();
        String temp = "";
        for (int i = 0; i < s.length(); i++) { 
            if (((s.charAt(i) >= 65) && (s.charAt(i) <= 90)) || ((s.charAt(i) >= 48) && (s.charAt(i) <= 57)))
            {
                temp += s.charAt(i);
            }
        }
        if (temp.isEmpty())
        {
            return true;
        }
        for (int i = 0; i <= temp.length() / 2; i++) {
            if (temp.charAt(i) != temp.charAt(temp.length() - i - 1))
                return false;
        }
        return true;
    }
}
