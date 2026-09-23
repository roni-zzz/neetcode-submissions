class Solution {

    public String encode(List<String> strs) {
        String result = "";
        for (String s : strs) {
            char[] word = s.toCharArray();
            for (int i = 0; i < word.length; i++) {
                char w = (char) (word[i] + ' ');
                result += w;  
            }
            result += " ";
        }
        return result;

    }

    public List<String> decode(String str) {
        ArrayList<String> result = new ArrayList<>();
        char[] enc = str.toCharArray();
        String word = "";
        for (char c : enc) {
            if (c != ' '){
                char w = (char) (c - ' ');
                word += w;
            }
            else {
                result.add(word);
                word = "";
            }
        }
        return result;

    }
}
