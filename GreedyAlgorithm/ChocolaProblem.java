package GreedyAlgorithm;

import java.util.*;
//SPOJ platform
 

public class ChocolaProblem {

    public static void main(String args[]){
        int n=4; int m=6;
        Integer costver[]={2,1,3,1,4};//m-1
        Integer costhor[]={4,1,2};//n-1

        Arrays.sort(costver, Collections.reverseOrder());
        Arrays.sort(costhor, Collections.reverseOrder());

        int h=0; 
        int v=0;
        int hp=1;
        int vp=1;
        int cost=0;


        //  all element of array for traverse 
        while(h<costhor.length && v<costver.length){
            //verticalcost<horizontalcost
            if(costver[v]<=costhor[h]){// horizontal cut
                
                cost+=(costhor[h]*vp);
                hp++;
                h++;


            }
            else{
                // vertical cut

                cost+=(costver[v]*hp);
                vp++;
                v++;
            }
        }
        while(h<costhor.length){
             cost+=(costhor[h]*vp);
                hp++;
                h++;
        }

        while(v<costver.length){
            cost+=(costver[v]*hp);
                vp++;
                v++;
        }

        System.out.println(" Minimum cost of the chocolate is = "+cost);

    }
    
}
