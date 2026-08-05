class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty() || (s.length() == 1))
        {
            return true;
        }
        String ss = s.toUpperCase();
        String temp = "";
        for (int i = 0; i < s.length(); i++) { 
            if (((ss.charAt(i) >= 65) && (ss.charAt(i) <= 90)) || ((ss.charAt(i) >= 48) && (ss.charAt(i) <= 57)))
            {
                temp += ss.charAt(i);
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
