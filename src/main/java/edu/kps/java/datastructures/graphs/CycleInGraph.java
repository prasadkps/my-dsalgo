package edu.kps.java.datastructures.graphs;

/**
 * Created with IntelliJ IDEA.
 * User: kp
 * Date: 11/26/13
 * Time: 7:37 PM
 */
public class CycleInGraph {
    private boolean[] marked;
    private boolean hasCycle;

    public CycleInGraph(Graph G) {
        marked = new boolean[G.V()];
        for(int s = 0; s < G.V(); s++) {
            if(!marked[s]) {
                dfs(G, s, s);
            }
        }
    }

    private void dfs(Graph G, int v, int u) {
        marked[v] = true;
        for(int w : G.adj(v)) {
            if(!marked[w]) {
                dfs(G, w, v);
            } else if(w != u) {
                hasCycle = true;
            }
        }
    }

    public boolean isHasCycle() {
        return hasCycle;
    }
}
