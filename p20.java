import java.util.Scanner;

class p20{
    public void exam(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no of questions");
        int q= sc.nextInt();
        System.out.println("Enter the no of Page");
        int p=sc.nextInt();
        if(p>20){
            if(q>10){
                System.out.println("Pass");

            }
        }
        else{
                System.out.println("Fail");
            }
    }
    public static void main(String args[]){
        p20 p=new p20();
        p.exam();
    }
}