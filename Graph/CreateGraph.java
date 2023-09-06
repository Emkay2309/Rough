package Graph;
import java.util.*;

public class CreateGraph {
    public static void main(String[] args) {

        /*              5
                   (0)------(1)
                            / \
                        1  /   \  3
                          /     \
                        (2)-----(3)
                         |   1
                       2 |
                         |
                        (4)
         */

        int vertices = 5;
        //int [] arr = new int [vertices]
        ArrayList <edge> [] graph = new ArrayList [vertices];    // null --> empty arraylist

        for(int i=0 ; i<vertices ; i++) {
            graph[i] = new ArrayList<>();
        }

        //0 - vertex
        graph[0].add( new edge (0,1,5));

        //1 - vertex
        graph[1].add( new edge (1,0,5));
        graph[1].add( new edge (1,3,3));
        graph[1].add( new edge (1,2,1));

        //2 - vertex
        graph[2].add( new edge (2,1,1));
        graph[2].add( new edge (2,3,1));
        graph[2].add( new edge (2,4,2));

        //3 - vertex
        graph[3].add( new edge (3,1,3));
        graph[3].add( new edge (3,2,1));

        //4 - vertex
        graph[4].add( new edge (4,2,2));



        //neighbours of 2 (1,3,4)
        for(int i=0 ; i<graph[2].size() ; i++) {
            edge e = graph[2].get(i);   //src , dest , wt
            System.out.println("Neighbours : " + e.dest);
        }

    }
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
}
