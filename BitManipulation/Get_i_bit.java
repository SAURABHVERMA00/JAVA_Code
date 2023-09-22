package BitManipulation;

public class Get_i_bit {

    /*
     000001111  if hame i=2 pe kaunsi bit ya number hai 
     left shift kar denge 1 ka i ke sath like 000000100
     then performe and operation 

     */
    public static void main(String args[]){
        int i=3;
        int n =10;
        int bitmask=1<<i;
        if((n&bitmask)==0){
            System.out.println("0");

        }
        else{
            System.out.println("1");
        }

    }
    
}
