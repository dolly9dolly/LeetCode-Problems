class Solution {
    public int maxOperations(int[] nums, int k) {

        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            int need = k - num;

            if (map.containsKey(need) && map.get(need) > 0) {
                count++;

                map.put(need, map.get(need) - 1);
            } 
            else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        return count;
    }
}