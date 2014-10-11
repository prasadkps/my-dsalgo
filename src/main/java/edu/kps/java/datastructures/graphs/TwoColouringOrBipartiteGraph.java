package edu.kps.java.datastructures.graphs;

/**
 * Created with IntelliJ IDEA.
 * User: kp
 * Date: 11/26/13
 * Time: 7:38 PM
 */
public class TwoColouringOrBipartiteGraph {
    private boolean[] marked;
    private boolean [] coloured;
    private boolean isTwoColoured;

    public TwoColouringOrBipartiteGraph(Graph G) {
        marked = new boolean[G.V()];
        coloured = new boolean[G.V()];
        for(int i = 0; i < G.V(); i++ ) {
            if(!marked[i]) {
                dfs(G, i);
            }
        }
    }

    private void dfs(Graph G, int v) {
        marked[v] = true;
        for(int w: G.adj(v)) {
            if(!marked[w]) {
                coloured[w] = !coloured[v];
                dfs(G, w);
            }  else if (coloured[w] == coloured[v]) {
                isTwoColoured = false;
            }
        }
    }

    boolean isBipartite(){
        return isTwoColoured;
    }
}
