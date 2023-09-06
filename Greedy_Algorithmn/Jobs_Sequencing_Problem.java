package Greedy_Algorithmn;

import java.util.*;
public class Jobs_Sequencing_Problem {

    public static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int i, int d , int p) {
            id= i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {
        int [] [] A = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList <Job> jobs = new ArrayList<>();

        for(int i=0 ; i<A.length ; i++) {
            jobs.add(new Job (i, A[i][0] , A[i][1])) ;
        }
        Collections.sort(jobs , (a,b)-> b.profit - a.profit); //descending order of profit

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;

        for(int i=0 ; i<jobs.size() ; i++) {
            Job curr = jobs.get(i);
            if(curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }
        int index = seq.size();
        int [] ans = new int [index];
        for(int i=0 ; i<index ; i++) {
            ans[i] = seq.get(i);
        }

        System.out.println(Arrays.toString(ans));

    }

}
