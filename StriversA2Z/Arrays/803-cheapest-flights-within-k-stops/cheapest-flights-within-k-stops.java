class Solution {
    static HashMap<Integer, List<int[]>> adj = new HashMap<>();
    static Integer[][] memo;

    static int dst;

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        adj.clear();

        for (int[] flight : flights) {
            int from = flight[0];
            int to = flight[1];
            int price = flight[2];
            adj.putIfAbsent(from, new ArrayList<>());
            adj.get(from).add(new int[]{to, price}); 
        }

        this.dst = dst;

        memo = new Integer[n][k + 2];
        int result = dfs(src, k + 1);

        return (result == Integer.MAX_VALUE) ? -1 : result;
    }

    private int dfs(int src, int k) {
        if (src == dst) return 0;
        if (k == 0) return Integer.MAX_VALUE;

        if (memo[src][k] != null) return memo[src][k ];

        int min = Integer.MAX_VALUE;

        List<int[]> neighbors = adj.getOrDefault(src, new ArrayList<>());
        for (int[] nx : neighbors) {
            int to = nx[0];
            int price = nx[1];
            int res = dfs(to, k - 1);
            if (res == Integer.MAX_VALUE) continue;

            if (res + price < min) {
                min = res + price;
            }
        }

        memo[src][k] = min;
        return min;
    }
}
