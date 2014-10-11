package edu.kps.java.datastructures.graphs;

/**
 * //TODO: Write class javadoc
 *
 * @author <a href="mailto:shivkris@yahoo-inc.com">Krishnaprasad Shivdasan</a><br/>
 * Date: 11/11/13
 * Time: 9:09 AM
 */
public class DepthFirstSearch
{
    private boolean[] marked;
    private int count;

    private DepthFirstSearch(Graph G, int s) {
        marked = new boolean[G.V()];
        dfs(G,s);
    }

    public void dfs(Graph G, int v) {

        marked[v] = true;
        count++;
        for(int w : G.adj(v)) {
            if(!marked[w]) {
                dfs(G, w);
            }
        }
    }

    public boolean marked(int w) {
        return marked[w];
    }
    public int count() {
        return count;
    }
}
