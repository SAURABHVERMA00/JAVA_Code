package BitManipulation;

public class Check_odd_even {

    /*
     first of all we see that 
     0-000
     1-001
     2-010
     3-011
     4-100
     5-101
     we clearly see that lsb of odd number is 1 then we calculate the lsb d=of number 

     if we n&1 then if lsb is 1 then lsb is remain 1 if lsb 0 1&0 is 0 .
     like one exmple  3 -101 
                  101
                  001
                  001 answer  means 1 means odd
 

     */
    public static void main(String args[]){
        int n=4;

        int bitmask=1;
        if((n & bitmask)==0){
            //even number 
            System.out.println("Even No ");

        }
        else {
            //odd number 
            System.out.println("Odd No ");

        }



    }
    
}
