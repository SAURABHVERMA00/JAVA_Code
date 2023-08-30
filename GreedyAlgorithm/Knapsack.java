package GreedyAlgorithm;

import java.util.*;


public class Knapsack{


public static void main(String args[]) {
    int val[]= {60,100,120};
    int weight[]={10,20,30};
    int w=50;

    double ratio[][]= new double[val.length]
    [2];
    //  0th column per index 
    //  1st column item ki ratio 

    for (int i= 0 ; i <val.length; i++){
        ratio[i][0]=i;
        ratio[i][1]=val[i]/(double )weight[i];


    }
    //  ascending order

    Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
    int capapcity=w;
    int finalval=0;
    for (int i=ratio.length-1; i>=0; i--){
        int idx= (int)ratio[i][0];// index ka original index store tha 


        if(capapcity>=weight[idx]){ //include full item
            finalval+=val[idx];
            capapcity-=weight[idx];
        }
        else{
            // include fractional item 
            finalval+= (ratio[i][1] * capapcity);
            capapcity=0;
            break;
        }
    }

    System.out.println("final value = "+finalval);




    
}
}