/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GfG;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Rahul
 */
class DFS extends Graph{

    public DFS(int v) {
        super(v);
    }
    
    static void DFS(int v){
        boolean visited[] = new boolean[V];
        DFSUtil(v,visited);
    }
    static void DFSUtil(int v, boolean visited []){
            visited[v]=true;
            System.out.print(v+" ");
            Iterator<Integer> i = adj[v].listIterator();
            while(i.hasNext()){
                int n =i.next();
                if (!visited[n]) {
                    DFSUtil(n, visited);
                }
            }
    }
    
    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println("Following is Depth First Traversal "+
                           "(starting from vertex 2)");
 
        DFS(2);
    }
}