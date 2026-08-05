class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> chars = new HashMap<Character, Integer>();
        HashMap<Character, Integer> chart = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            chars.put(s.charAt(i), chars.getOrDefault(s.charAt(i), 0) + 1);
            chart.put(t.charAt(i), chart.getOrDefault(t.charAt(i), 0) + 1);
        }

        if (chars.equals(chart)) {
            return true;
        }
        else {
            return false;
        }
    }
}
