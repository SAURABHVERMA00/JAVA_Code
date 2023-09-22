package GreedyAlgorithm;

import java.util.*;

public class IndianCoins {
    
      public static void main (String args[]){
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        int Value=590;

        Arrays.sort(coins,Comparator.reverseOrder());

        int Number_coins=0;
        ArrayList<Integer> ans= new ArrayList<>();

        

        
        for(int i=0; i<coins.length; i++){
            if(coins[i]<=Value){
                while(coins[i]<=Value){
                Number_coins++;
                ans.add(coins[i]);
                Value-=coins[i];
            }
                
            }
           
        }
        System.out.println("Number of coins ="+Number_coins);
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        
      }
}
