package OOPS;
public class OOPS {
//     public static void main (String args[]){
//         Pen p1=new Pen();
//         p1.setcolor("Blue");
//         System.out.println(p1.getcolor());
//         p1.setTip(5);
//         System.out.println(p1.getTip());
//         p1.setcolor("Yellow");

//         System.out.println(p1.getcolor());



//     }


    
// }

// class Pen {
//     //  pro 
//     private String  color;
//     private int tip;

//     String getcolor(){
//         return this.color;
//     }
//     int getTip(){
//         return this.tip;
//     }

//     void setcolor(String newcolor){
//         this.color = newcolor;
//     }

//     void setTip(int newtip){
//         this.tip= newtip;
//     }

// }



// class BankAccount{
//     public String username;
//     private String password;
//     public void setPassword(String pwd){
//         password=pwd;
//     }

// }

// Copy Constructor  
public static void main (String args[]){

    Student s1=new Student();
    s1.name="saurabh";
    s1.roll=123;
    s1.password=1234;
    Student s2= new Student(s1);
    s2.password=12;


}
}



class Student {
    String name ;
    int roll;
    int password;
    int marks[];

    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
    }

    Student(){
        marks=new int[3];
        System.out.println("Constructor is called...");

    }

    Student(String name){
        marks=new int[3];
        this.name=name;

    }
    Student(int roll){
        marks=new int[3];
        this.roll=roll;
    }

}




