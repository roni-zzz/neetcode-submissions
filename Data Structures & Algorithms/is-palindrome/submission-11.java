class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty() || (s.length() == 1))
        {
            return true;
        }
        s = s.toUpperCase();
        int mirror_index = s.length() - 1;
        for (int i = 0; i < s.length() / 2; i++) { 
            
            while (!Character.isLetterOrDigit(s.charAt(i)) && (i < s.length() - 1))
            {
                i++;
            }
            while (!Character.isLetterOrDigit(s.charAt(mirror_index)) && (mirror_index > 0)) {
                mirror_index--;
            }
            if (!Character.isLetterOrDigit(s.charAt(i)) && !Character.isLetterOrDigit(s.charAt(mirror_index))) {
                return true;
            }
            if (s.charAt(i) != s.charAt(mirror_index)) {
                return false;
            }
            mirror_index--;
        }
        return true;
    }
}
