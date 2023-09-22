package String;
import java.util.*;


public class lowercase_count {
    public static void main(String args[]){
        // String str="aBscde";

        Scanner sc = new Scanner (System.in);
        String str=sc.nextLine();

        int count=0;
        
        for(int i=0; i<str.length(); i++){
            int ch=str.charAt(i);

            if(ch>=97 && ch<=123){
                count++;

            }


        } 
        System.out.println(count);
    
    }
    
}
