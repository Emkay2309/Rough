package Graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the number of edges :");
        int e = sc.nextInt();

        System.out.println("Enter number of vertices : ");
        int v = sc.nextInt();

        int [][] mat = new int [v][v];
        for(int i=0 ; i<v ; i++) {
            System.out.println("Enter starting node : ");
            int sv = sc.nextInt();
            System.out.println("enter ending node : ");
            int ev = sc.nextInt();

            mat[sv][ev] = 1;
            mat[ev][sv] = 1;
        }

        boolean [] visited = new boolean [v];
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0 ; i<v ; i++) {
            if(!visited[i]) {
                dfs(mat , i , visited , ans );
            }
        }

        System.out.println(ans);
    }
    public static  void dfs(int [][] mat , int curr , boolean [] vis , ArrayList<Integer> ans)  {
        vis[curr] = true;

        for(int j=0 ; j<mat.length ; j++)  {
            if(mat[curr][j] == 1  &&  vis[j] == false) {

            }
        }
    }
}
