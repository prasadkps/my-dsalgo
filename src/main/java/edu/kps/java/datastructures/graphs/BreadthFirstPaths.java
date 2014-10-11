package edu.kps.java.datastructures.graphs;



import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * //TODO: Write class javadoc
 *
 * @author <a href="mailto:shivkris@yahoo-inc.com">Krishnaprasad Shivdasan</a><br/>
 * Date: 11/11/13
 * Time: 9:10 AM
 */
public class BreadthFirstPaths
{
    private boolean marked[];   // Is a shortest path to this vertex known
    private int[] edgeTo;       // last vertex on known path to this vertex.
    private final int s;        // source

    BreadthFirstPaths(Graph G, int s) {
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        this.s = s;
        bfs(G, s);
    }

    private void bfs(Graph G, int s) {
        Queue<Integer> queue = new ArrayDeque<Integer>();
        marked[s] = true;
        queue.add(s);
        while(!queue.isEmpty()) {
            int v = queue.remove();
            for(int w : G.adj(v) ) {
                edgeTo[w] = v;
                marked[w] = true;
                queue.add(w);
            }
        }
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public Iterable<Integer> pathTo(int v) {
        if(!hasPathTo(v)) {
            return null;
        }
        Stack<Integer> path = new Stack<Integer>();
        for( int x = v; x != s; x = edgeTo[x]) {
            path.push(x);
        }
        path.push(s);
        return path;
    }


}
