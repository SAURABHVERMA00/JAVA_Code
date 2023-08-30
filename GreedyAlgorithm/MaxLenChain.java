package GreedyAlgorithm;
import java.util.*;


public class MaxLenChain {
    public static void main (String args[]){
        int pairs[][]={{5,24},{39,60},{27,40},{50,90}};

        Arrays.sort(pairs,Comparator.comparingDouble(o ->o[1]));

        int chainlen=1;
        int chainend=pairs[0][1]; // last end selected pair
        for(int i=1; i<pairs.length; i++){
            if(pairs[i][0]>chainend){
                chainlen++;
                chainend=pairs[i][1];



            }
        }
        System.out.println("Max chain Length of code =  "+chainlen);


    

    }
    
}
