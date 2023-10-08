import java.util.Scanner;

public class p17 {
    public void marks(){
        System.out.println("Enter marks");
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
        if(m>35){
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }
    public static void main(String args[]){
        p17 p = new p17();
        p.marks();

    }
}
