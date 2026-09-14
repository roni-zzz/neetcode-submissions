// I need to map the same string to the same key if they have the same sorted characters

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();
        String key = "";

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            key = new String(chars);

            List<String> group = map.get(key);
            if (group == null) {
                group = new ArrayList<>();
                map.put(key, group);
            }
            group.add(s);
        }

        for (List<String> s : map.values()) {
            result.add(s);
        }
        
        return result;        
    }
}
