package BitManipulation;

public class Question {
    public static void main(String args[]){
        int x=4;
        int y=3;
        // int s=x^x;
        // System.out.print(s);


        // Swap number without using third variable 

        // x=x^y;
        // System.out.print(x+" ");// 7

        // y=x^y;
        // System.out.print(y+" ");//4

        // x=x^y;
        // System.out.print(x+" ");//3

        // int s=-(~x);
        // System.out.print(s);


        // upper to lower case using bit 
        for(char  i='A'; i<='Z'; i++){
            System.out.print((char)(i | ' '));
        }

    
    }
}
