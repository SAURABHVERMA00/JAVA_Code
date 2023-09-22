package BitManipulation;
/*
 example is 1010-10
 count how many 1 is in ;
  
 1010 - check lsb so first lsb is 0 then count =0;
 then right shift karne sephle wali lsb hat jayegi new lsb a jaygi 
 if lsb is 1 then count increase is 1 

 odd even - if lsb is 0 then odd else even 
 (how to find number & 1 =if  0 then odd else even ) 


 Note - time complexity of  binary number is generally is O(logn);


 */

public class Count_Set_Bit_in_num {
    public static void main(String args[]){
        int n=16;
        int count=0;
        while(n>0){
            if((n&1)!=0){ // check lsb 
                count++;

            }
            n=n>>1;
        }
        System.out.println(count);
         
    }
    
}
