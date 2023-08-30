package Array;
import java.util.*;
import java.util.spi.ToolProvider;

import javax.swing.plaf.multi.MultiScrollBarUI;
public class Arrays {

    public static int linear_search(int num[], int key){
        for (int i=0; i<num.length; i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;


    }
    


    public static int largest_number(int num[]){
        int largest = Integer.MIN_VALUE;
        for ( int i=0; i<num.length; i++){
            if(num[i]>largest){
                largest=num[i];

            }
        }
        return largest;
    }
     public static int binary_Search(int num[], int key){
        int start=0;
        int end=num.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            //  comparission
            if (num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                start=mid+1;

            }
            else{
                end=mid-1;
            }

        }
        return -1;




     }

    public static void reverse_Number(int num[]){
        int first=0;
        int last=num.length-1;
        while(first<last){
            int temp= num[first];
            num[first]=num[last];
            num[last]=temp;

            first++;
            last--;

        }
        

    }

    public static void print_pairs(int num[]){
        int total=0;
        for ( int i=0; i<num.length; i++){

                //  inner loop
                int curr=num[i];
                for (int j=i+1; j<num.length; j++){
                    System.out.print("(" + curr + "," + num[j] + ")");
                    total++;
                } 
               
                System.out.println(); 
                
        }
        System.out.println("Total pairs " + total);



        //  Time complexity is bigO of n square

    }

    public static void print_Subarray(int num[]){
        int total=0;
        for ( int i=1; i<num.length; i++){
            int start=i;
            for (int j=i; j<num.length; j++){
                int end=j;

                for(int k=start; k<=end; k++){
                    System.out.print( num[k]+ " ");
                    total++;
                }
                System.out.println();
            }
           
        } 
        System.out.println("Total Subarray : "+ total);


    }



    public static void maximum_subarray_sum(int num[]){
        int currSum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            int start=i;
            for(int j=i; j<num.length; j++){
                int end=j;
                currSum=0;
                for (int k=start; k<=end; k++){
                    currSum+=num[k];
                }
                // System.out.println("currsum : "+currSum);
                if(maxsum<currSum){
                    maxsum=currSum;
                }
                
            }


        }
        System.out.println("Maximum Sum :"+ maxsum);
    }




    public static void max_and_min_subarray_sum(int num[]){
        int currSum=0;
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;


        for(int i=0; i<num.length; i++){
            int start=i;
            for(int j=i; j<num.length; j++){
                int end=j;
                currSum=0;
                for (int k=start; k<=end; k++){
                    currSum+=num[k];
                }
                // System.out.println(currSum);
                if(maxsum<currSum){
                    maxsum=currSum;
                }
                if(currSum<minsum){
                    minsum=currSum;
                }
            }


        }
        System.out.println("Maximum Sum :"+ maxsum);
        System.out.println("Minimum Sum :"+ minsum);
    // Time Complexity is bigO of n cube
    }

    public static void optimized_max_sum(int num[]){
        int currSum=0;
        int maxsum= Integer.MIN_VALUE;
        int prefix[]= new int[num.length];
        prefix[0]=num[0];
        for (int i=1 ; i<prefix.length; i++){
            prefix[i]=prefix[i-1]+num[i];

        }
        for (int j=0; j<num.length; j++){
            int start=j;
        
            for(int k=j; k<num.length; k++){
                int end=k;
                
                currSum=start==0?prefix[end]:prefix[end]-prefix[start-1];


                if(currSum > maxsum){
                    maxsum =currSum;
            }



        }
    }
    System.out.println("Max sum =" + maxsum);

        
    }

    public static void max_subarray_sum_Kadanes(int num[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for ( int i=1; i<num.length; i++){
            currSum=currSum+num[i];
            if(currSum<0){
                currSum=0;


            }
            maxSum=Math.max(currSum, maxSum);
        }
        System.out.println(" Our MaxSubarray is : "+ maxSum);
    }
    public static void max_sum_negative_number(int num[]){
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for ( int i=0; i<num.length; i++){
            currsum=currsum+num[i];
            if(currsum>maxsum){
                maxsum=currsum;
            }
        
        maxsum=Math.max(currsum, maxsum);
        }
        System.out.println("MAxsum : " + maxsum);
    }

    public static int trapping_water(int num[]){
        //  Calculate Left Boundary 
        int leftMax[] = new int[num.length];
        leftMax[0]=num[0];
        for (int i=1; i<num.length ; i++){
            leftMax[i]= Math.max(num[i],leftMax[i-1]);


        }
        //  Calculate Right MAx
        int rightMax[] = new int[num.length];
        rightMax[num.length-1]=num[num.length-1];
        for (int i=num.length-2; i>=0; i--){
            rightMax[i]=Math.max(num[i],rightMax[i+1]);

        }
        int trappedWater=0;
        for(int i=0; i<num.length; i++){
            //  Water Level
            int waterLevel= Math.min(leftMax[i],rightMax[i]);
            //  trappedWater
            trappedWater+=waterLevel-num[i];
        }
        return trappedWater;


 }
    public static int stock(int price[]){
            int buyprice = Integer.MAX_VALUE;
            int maxprofit = 0;
            for (int i=0; i<price.length; i++){
                if (buyprice<price[i]){
                    int profit = price[i]-buyprice;
                    maxprofit = Math.max(maxprofit , profit);

                }
                else {
                    buyprice = price[i];

                }
            }
            return maxprofit;
        
        
    }


    public static void main(String args[]){
        int price[]={7,1,5,3,6,4};
        // int key=6;
         
          System.out.println(stock(price));

      



    }


   
}
