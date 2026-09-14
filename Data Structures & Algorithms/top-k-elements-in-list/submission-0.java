// What do i need to do? 
// HashSet for the unique elements and then create a list for the key values, then 


class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.get(num) == null) {
                map.put(num, 1);
            }
            else {
                map.put(num, map.get(num) + 1);
            }
        }

        List<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort((a,b) -> Integer.compare(map.get(b), map.get(a)));

        System.out.print(map);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = keys.get(i);
        }
        return result;
    }
}
