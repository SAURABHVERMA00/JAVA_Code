package BitManipulation;

public class Clear_i_bit {
    /*
     if we want to clear a i bit then first of all ~(1<<i) & number 
     like example  - 1<<i - 0010
      10 1 0
    & 11 0 1
      10 0 0


     */

    public static void main(String args[]){
        int i=1;
        int n =10;
        int bitmask=~(1<<i);
        
            System.out.println(n&bitmask);

      

    } 
    
}
