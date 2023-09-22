package String;

// import java.util.*;
//stringbuilder change to string use sb.toString();but only object like integer not int and character not char


public class String_Builder {

// tc- O(26)

    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<='z'; ch++){
            sb.append(ch);
            
        }
        System.out.println(sb);
        
        



    }

   
}
