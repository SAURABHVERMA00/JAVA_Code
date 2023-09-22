package Question;

public class Binary_decimal {
    public static void main(String args[]){
        int binNUm=101;
        int pow=0;
        int decnum=0;
        while(binNUm>0){
            int last=binNUm%10;
            decnum=decnum+(last*(int )Math.pow(2,pow));
            pow++;
            binNUm=binNUm/10;

        }

        System.out.println("Decimal number "+decnum);

    }
    
}
