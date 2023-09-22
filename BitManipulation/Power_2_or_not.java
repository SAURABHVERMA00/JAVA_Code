package BitManipulation;
import java.util.*;

/*
  property is = if 2kipower x ki value 16 hai to 15 and 16 ka (and)  hamesha zero hoga 
  like (n)&(n-1)=0;
 */

public class Power_2_or_not {
    public static boolean isPower(int n){
        return ( n & (n-1))==0;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(isPower(n));


    }
    
}
