package Question;

public class decimal_binary {
    public static void main(String args[]){
        int decnum=0;
        int pow=0;
        int binnum=0;

        while(decnum>0){
            int rem=decnum%2;
            binnum= binnum+(rem*(int)Math.pow(10,pow));
            pow++;
            decnum=decnum/2;
        }

        System.out.println("Binary number is ;"+binnum);
         
         
    }
}
