package Graph;

import java.util.ArrayList;

public class DijkstrasAlgorithm {
    static class edge {
        int src;
        int dest;
        int wt;

        public edge (int s , int d , int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void main(String[] args) {
        int vertices = 6;
        ArrayList <edge> [] graph = new ArrayList[vertices];

        for(int i=0 ; i<graph.length ; i++) {
            graph[i] = new ArrayList<>();
        }

        //0 - vertex


    }
}
