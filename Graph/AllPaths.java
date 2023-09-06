package Graph;

import java.util.ArrayList;

public class AllPaths {
    static class edge {
        int src;
        int dest;
        public edge (int s , int d) {
            this.src = s;
            this.dest = d;
        }
    }
    public static void main(String[] args) {

        int vertices = 6;

        ArrayList <edge> [] graph = new ArrayList [vertices];

        for(int i=0 ; i<vertices ; i++) {
            graph[i] = new ArrayList<>();
        }


        //0 - vertex
        graph[0].add(new edge ( 0,3));

        //1 - vertex
        //This is destination

        //2 - vertex
        graph[2].add( new edge(2 , 3));

        //3 - vertex
        graph[3].add( new edge(3 , 1));

        //4 - vertex
        graph[4].add( new edge(4 , 1));
        graph[4].add( new edge(4 , 0));

        //5 - vertex
        graph[5].add( new edge(5 , 2));
        graph[5].add( new edge(5 , 0));

        String path = "Source Path ";
        DFS( graph , 5 , 1 , path);
    }

    public static void DFS ( ArrayList <edge> [] graph , int source , int target , String path) {
        if( source == target) {
            System.out.println(path + "-->" + target);
        }

        for(int i=0 ; i<graph[source].size() ; i++) {
            edge e = graph[source].get(i);
            DFS( graph ,e.dest , target , path + "-->" + source);
        }
    }
}
