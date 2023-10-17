import java.util.Scanner;

public class p46 {
  public static void main(String args[]){
    System.out.println("Enter the no of elements ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr= new int[n];
    System.out.println("Enter the values ");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();  
    }
    for(int i=0;i<n;i++){
 System.out.println("Values are "+arr[i]);    }
  }  
}
