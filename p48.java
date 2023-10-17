import java.util.Scanner;

public class p48 {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the row size ");
    int m=sc.nextInt();
    System.out.println("Enter the column size ");
    int n=sc.nextInt();
    String[][] arr=new String[m][n];
    System.out.println("Enter the values for the matrix");
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            arr[i][j]=sc.next();
        }
    }
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
        System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
} 
}
