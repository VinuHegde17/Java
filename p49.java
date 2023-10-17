import java.util.Scanner;

public class p49 {
    public static void main(String args[]){
        System.out.println("Enter the array size");
        Scanner sc=new Scanner(System.in);
        int arr= sc.nextInt();
        int[] ele= new int[arr];
        System.out.println("Enter the elements to be inserted");
        for(int i=0;i<arr;i++){
        ele[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be search");
        int target=sc.nextInt();
        int index= linearSearch(ele,target);
        if(index!=-1){
            System.out.println("Element is found at "+index);
        }
        else
        {
           System.out.println("Element is not found ");
        }
    }

    public static int linearSearch(int[] element, int target) {
        for(int i=0;i<element.length;i++){      
            if(element[i]==target){
             return i;
            }
        }
        return -1;
    }
}
