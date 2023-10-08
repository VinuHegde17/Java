import java.util.Scanner;

class p18{
    void marks(){
        System.out.println("Enter marks");
        Scanner sc=new Scanner(System.in);
        int m =sc.nextInt();
        if(m>=35 && m<50){
            System.out.println("Pass");
        }
        else if(m>=50 && m<60){
            System.out.println("Second Class");
        }
         else if(m>=60 && m<80){
            System.out.println("First Class");
        }
         else if(m>=80 && m<=100){
            System.out.println("Distinction");
        }
        else{
            System.out.println("Fail");
        }
    }
    public static void main(String args[]){
        p18 p=new p18();
        p.marks();
    }
}