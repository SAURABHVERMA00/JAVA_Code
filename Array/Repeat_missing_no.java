package Array;

import java.util.ArrayList;

public class Repeat_missing_no {
    public static void main(String args[]){
        
        
        ArrayList<Integer> a=new ArrayList<>();
     
        a.add(4);
        a.add(3);
        a.add(6);
        a.add(2);
        a.add(1);
        a.add(1);


        long n= a.size();
        long SN=(n*(n+1))/2;
        long S2N=(n * (n+1) * (2*n+1) ) / 6;
        int S=0, S2=0;


        for(int i=0; i<n; i++){
            S+=a.get(i);
            S2+=(a.get(i)*a.get(i));

        }

        long val1 =S-SN; // X-Y
        long val2=S2-S2N; // Xsqr2-Ysqr2;

        val2=val2/val1; // X+Y=val2/X-Y;

        long X=(val1+val2)/2;
        long Y=X-val1;

        System.out.println("["+X+","+Y+"]");


         




    }
    
}
