import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        List<Integer>[] g = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) g[i] = new ArrayList<>();
        for (int[] w : wires) { g[w[0]].add(w[1]); g[w[1]].add(w[0]); }

        int[] parent = new int[n + 1];
        int[] sub = new int[n + 1];
        dfs(1, 0, g, parent, sub);

        int ans = n;
        for (int[] w : wires) {
            int u = w[0], v = w[1];
            int childSize = (parent[v] == u) ? sub[v] : sub[u];
            ans = Math.min(ans, Math.abs(n - 2 * childSize));
        }
        return ans;
    }

    private void dfs(int cur, int p, List<Integer>[] g, int[] parent, int[] sub) {
        parent[cur] = p;
        sub[cur] = 1;
        for (int nxt : g[cur]) {
            if (nxt == p) continue;
            dfs(nxt, cur, g, parent, sub);
            sub[cur] += sub[nxt];
        }
    }
}