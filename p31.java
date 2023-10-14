import java.util.Scanner;

public class p31{
public static void main(String args[]){
    int sum =0;
System.out.println("Enter the no ");
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
if(n%2==0){
for(int i=2;i<=n;i+=2){
System.out.println("Value is "+i);
sum+=i;
}
}
else
{
for(int i=1;i<=n;i+=2){
System.out.println("Value is "+i);
sum+=i;  
}
}
System.out.println("---------------------------------");
System.out.println("Sum is "+sum);
}
}