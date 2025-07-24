class Solution {
    private int clock;
    private int[] nums, xor, inTime, outTime;
    private List<Integer>[] graph;

    public int minimumScore(int[] nums, int[][] edges) {
        //initialization 
        int n = nums.length;
        int res = Integer.MAX_VALUE;
        this.clock = 1;
        this.nums = nums;
        this.xor = new int[n];
        this.inTime = new int[n];
        this.outTime = new int[n];
        this.graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        // buildGraph
        buildGraph(edges);
        // calculat xor value and record the time stamp during dfs
        dfs(0, -1);
        // compute XOR for nodes i and j, and use in/out timestamps to check parent-child relationship
         int x = 0, y = 0, z = 0;
        for(int i = 1; i < n; i ++){
            for(int j = i + 1; j < n; j ++){
                if(isParent(i, j)){
                    x = xor[0] ^ xor[i];
                    y = xor[i] ^ xor[j];
                    z = xor[j];
                }else if(isParent(j, i)){
                    x = xor[0] ^ xor[j];
                    y = xor[j] ^ xor[i];
                    z = xor[i];
                }else{
                    x = xor[0] ^ xor[i] ^ xor[j];
                    y = xor[i];
                    z = xor[j];
                }
                res = Math.min(res, Math.max(x, Math.max(y, z)) - Math.min(x, Math.min(y, z)));
            }
        }
        return res;
    }
    private boolean isParent(int x, int y) {
        return inTime[x] <= inTime[y] && outTime[x] >= outTime[y];
    }
    private void dfs(int curr, int parent) {
        inTime[curr] = clock;
        clock++;
        xor[curr] = nums[curr];
        for (int neighbor : graph[curr]) {
            if (neighbor != parent) {
                dfs(neighbor, curr);
                xor[curr] ^= xor[neighbor];
            }
        }
        outTime[curr] = clock;
    }
    private void buildGraph(int[][] edges) {
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            graph[a].add(b);
            graph[b].add(a);
        }
    }
}