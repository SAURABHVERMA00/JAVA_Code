package Array;
import java.util.*;


public class Max_sum_kdanes {
    public static int kdanes(int arr[]){
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;


        for(int i=0; i<arr.length; i++){
            curr_sum=curr_sum+arr[i];
            if(curr_sum<0){
                curr_sum=0;
            }
                max_sum=Math.max(max_sum, curr_sum);

            

        }
        return max_sum;
    }

    public static void main(String args[]){
        int arr[]={ -2,-3,4,-1,-2,1,5,-3};
        System.out.println(kdanes(arr));


    }
    
    
}
