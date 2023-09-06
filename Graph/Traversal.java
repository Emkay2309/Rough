package Graph;
import java.util.*;

public class Traversal {
    static class edge {
        int src;
        int dest;
        int wt;

        public edge(int s , int d , int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void main(String[] args) {

        /*              5
                   (1)------(3)
                  /          | \
                 (0)         |  (5)-----(6)
                   \         |  /
                   (2)------(4)

         */

        int vertices = 7;
        //int [] arr = new int [vertices]
        ArrayList <edge> [] graph = new ArrayList [vertices];    // null --> empty arraylist
        creategraph(graph);

        BFS(graph);
        System.out.println();
        DFS(graph , 0 , new boolean [vertices]);
        System.out.println();
        System.out.println(hasPath(graph , 0 , 5 , new boolean [vertices]));
    }

    public static void BFS (ArrayList <edge> [] graph) {
        Queue<Integer> q = new LinkedList<>();
        boolean [] visited = new boolean [graph.length];

        q.add(0); //source = 0

        while( !q.isEmpty() ) {
            int curr = q.remove();

            if( !visited[curr] ) {
                System.out.print(curr + " ");
                visited[curr]= true;
                for(int i=0 ; i<graph[curr].size() ; i++) {
                    edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }

    }

    public static void DFS ( ArrayList <edge> [] graph , int curr , boolean [] vis ) {
        //visit
        System.out.print(curr+" ");
        vis[curr] =true;

        for(int i=0 ; i<graph[curr].size() ; i++) {
            edge e = graph[curr].get(i);
            if( !vis[e.dest]) {
                DFS ( graph , e.dest , vis);
            }
        }

    }

    public static boolean hasPath( ArrayList <edge> [] graph , int s , int d , boolean [] vis) {
        if( s == d) return true;
        vis[s] = true;

        for(int i=0 ; i<graph[s].size() ; i++) {
            edge e = graph[s].get(i);
            if( !vis[e.dest] && hasPath(graph , e.dest , d , vis)) {
                return true;
            }
        }
        return false;
    }

    static void creategraph(ArrayList <edge> graph []) {

        for(int i=0 ; i<graph.length ; i++) {
            graph[i] = new ArrayList<>();
        }

        //0 - vertex
        graph[0].add( new edge(0,1,1));
        graph[0].add( new edge(0,2,1));

        //1 - vertex
        graph[1].add( new edge(1,3,1));
        graph[1].add( new edge(1,0,1));

        //2 - vertex
        graph[2].add( new edge(2,0,1));
        graph[2].add( new edge(2,4,1));

        //3 - vertex
        graph[3].add( new edge(3,1,1));
        graph[3].add( new edge(3,4,1));
        graph[3].add( new edge(3,5,1));

        //4 - vertex
        graph[4].add( new edge(4,2,1));
        graph[4].add( new edge(4,3,1));
        graph[4].add( new edge(4,5,1));

        //5 - vertex
        graph[5].add( new edge(5,4,1));
        graph[5].add( new edge(5,3,1));
        graph[5].add( new edge(5,6,1));

        //6 - vertex
        graph[6].add( new edge(6,5,1));




    }
}
