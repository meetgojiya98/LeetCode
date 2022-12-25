class Solution2 {
    public int[] topKFrequent(int[] numbers, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int number : numbers) map.put(
            number,
            map.getOrDefault(number, 0) + 1
        );

        int size = map.size();
        int[] keys = new int[size];
        int i = 0;
        for (int key : map.keySet()) keys[i++] = key;

        select(keys, map, 0, size - 1, size - k);
        return Arrays.copyOfRange(keys, size - k, size);
    }
