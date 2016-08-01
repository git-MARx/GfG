package GfG;

import java.util.*;
import java.lang.*;
import java.io.*;
 
class ShortestPath
{
    static final int V=9;
    void dijkstra(int graph[][], int src){
        int dist[] = new int[V];
        boolean dset[] =new boolean[V];
        for (int i = 0; i < V; i++) {
            dist[i]=Integer.MAX_VALUE;
            dset[i]=false;
        }
        dist[src]=0;
        for (int i = 0; i < V-1; i++) {
            int u =mindistance(dist,dset);
            dset[u]=true;
            for (int j = 0; j < V; j++) {
                if (!dset[j] && graph[u][j] !=0 && dist[u]+graph[u][j] < dist[j]&& dist[u]!=Integer.MAX_VALUE) {
                    dist[j]=dist[u]+graph[u][j];
                }
            }
            
        }
        printSolution( dist,  V);
    }
    int mindistance(int[] dist, boolean[] dset) {
        int min = Integer.MAX_VALUE, min_idx =-1;
        for (int i = 0; i < V; i++) {
            if (dset[i]==false && dist[i]<= min) {
                min=dist[i];
                min_idx=i;
            }
        }
        return min_idx;
    }
    void printSolution(int dist[], int n)
    {
        System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i+" \t\t "+dist[i]);
    }
    public static void main (String[] args)
    {
        /* Let us create the example graph discussed above */
       int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                                  {4, 0, 8, 0, 0, 0, 0, 11, 0},
                                  {0, 8, 0, 7, 0, 4, 0, 0, 2},
                                  {0, 0, 7, 0, 9, 14, 0, 0, 0},
                                  {0, 0, 0, 9, 0, 10, 0, 0, 0},
                                  {0, 0, 4, 0, 10, 0, 2, 0, 0},
                                  {0, 0, 0, 14, 0, 2, 0, 1, 6},
                                  {8, 11, 0, 0, 0, 0, 1, 0, 7},
                                  {0, 0, 2, 0, 0, 0, 6, 7, 0}
                                 };
        ShortestPath t = new ShortestPath();
        t.dijkstra(graph, 0);
    }

    
}
