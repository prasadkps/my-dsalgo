package edu.kps.java.datastructures.graphs;


import edu.kps.java.datastructures.Bag;

import java.io.InputStream;

/**
 * //TODO: Write class javadoc
 *
 * @author <a href="mailto:shivkris@yahoo-inc.com">Krishnaprasad Shivdasan</a><br/>
 * Date: 11/11/13
 * Time: 8:50 AM
 */
public class Graph
{
    private int E;      // No. of Edges in the graph
    private int V;      // No. of Vertices in the graph

    private Bag<Integer>[] adj;      // Adjacency List


    public Graph(int V) {
        this.V = V;
        this.E = 0;
        adj = (Bag<Integer>[])new Bag[V];
        for(int i = 0; i < V; i++) {
            adj[i] = new Bag<>();
        }
    }
//    public Graph(In in) {
//        this(in.readInt());     // Read V and construct the Graph
//        int E = in.readInt();   // Read E
//        for(int i = 0; i < E i++) {
//            int v = in.readInt();
//            int w = in.readInt();
//            addEdge(v,w);
//        }
//    }
    public int V() {
        return V;
    }
    public int E() {
        return E;
    }
    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }
    public Iterable<Integer> adj(int v) {
        return adj[v];
    }
}
