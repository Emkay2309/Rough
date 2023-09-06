package Graph;

import java.util.ArrayList;

public class CycleDetection {
    static class edge {
        int source;
        int dest;
        public edge (int s , int d) {
            this.source = s;
            this.dest = d;
        }
    }

    public static boolean cycle(ArrayList<edge>[] graph ) {
        boolean [] visited = new boolean [graph.length];

        for(int i=0 ; i<graph.length ; i++) {
            if (!visited[i]) {
                if(DFScycle(graph , visited , i , -1))  {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean DFScycle(ArrayList<edge>[] graph ,boolean [] vis , int curr , int par) {
        vis[curr] = true;

        for(int i=0 ; i<graph[curr].size() ; i++) {
            edge e = graph[curr].get(i);

            //case 3 -->  if curr not visited
            if( !vis[e.dest]  &&  DFScycle(graph ,vis ,  e.dest , curr)) {
                return true;
            }
            //case 1 --> if curr visited and curr has a parent
            else if( vis[e.dest] && e.dest != par) {
                return true;
            }
            //case 2 --> do nothing --> continue
        }
        return false;
    }


    public static void main(String[] args) {
        int vertices = 5;
        ArrayList <edge> [] graph = new ArrayList[vertices];

        for(int i=0 ; i<vertices ; i++) {
            graph[i] = new ArrayList<>();
        }

        //0
        graph[0].add(new edge(0,1));
        graph[0].add(new edge(0,2));
        graph[0].add(new edge(0,3));

        //1
        graph[1].add(new edge(1,0));
        graph[1].add(new edge(1,2));

        //2
        graph[2].add(new edge(2,1));
        graph[2].add(new edge(2,0));
        graph[2].add(new edge(2,4));

        //3
        graph[3].add(new edge(3,0));
        graph[3].add(new edge(3,4));

        //4
        graph[4].add(new edge(4,2));

        //find neighbours
//        for(int i=0 ; i<graph[2].size() ; i++) {
//            edge e = graph[2].get(i);
//            System.out.print(e.dest + " ");
//        }

        System.out.println("Cycle Detected : " + cycle(graph)) ;


    }
}
