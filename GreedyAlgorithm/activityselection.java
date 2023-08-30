package GreedyAlgorithm;

import java.util.*;

public class activityselection{
    public static void main (String args[]){
        int start[]={0,1,3,5,5,8};
        int end[]={6,2,4,7,9,9};

       
        // phle se sort function ke liye 
        //  end time basis sorted
        // int maxAct=0;
        // ArrayList<Integer> ans= new ArrayList<>();

        // //  1st activity
        // maxAct=1;
        // ans.add(0);

        // int lastend= end[0];

        // for(int i=1; i<end.length; i++){
        //     if(start[i]>=lastend){
        //         //  activity selected
        //         maxAct++;
        //         ans.add(i);
        //         lastend=end[i];


        //     }


        // }
        // System.out.println("Max activity ="+maxAct);
        // for(int i=0; i<ans.size(); i++){
        //     System.out.println("A"+ans.get(i));
        // }



        //  without sorting ke liye 
         //  Sorting on the basis of end ;
        int activity[][]= new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activity[i][0]=i;
            activity[i][1]=start[i];
            activity[i][2]=end[i];


            
        }

        //  Lamda function  -> shortform  
        Arrays.sort(activity,Comparator.comparingDouble(o -> o[2]));

        int maxAct=0;
        ArrayList<Integer> ans= new ArrayList<>();

        //  1st activity
        maxAct=1;
        ans.add(activity[0][0]);


        int lastend= activity[0][2];

        for(int i=1; i<end.length; i++){
            if(activity[i][1]>=lastend){
                //  activity selected
                maxAct++;
                ans.add(activity[i][0]);
                lastend=activity[i][2];



            }


        } 
        System.out.println("Max activity ="+maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.println("A"+ans.get(i));
        }



    }
}