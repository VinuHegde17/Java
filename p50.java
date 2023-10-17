import java.util.Scanner;

public class p50 {
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
        int index= binarySearch(ele,target);
        if(index!=-1){
            System.out.println("Element is found at "+index);
        }
        else
        {
           System.out.println("Element is not found ");
        }
    }
    public static int binarySearch(int[] element, int target) {
        int left=0;
        int right=element.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(element[mid]==target){
                return mid;
            }
            else if(element[mid]<target){
                left=mid+1;
            }
                else{  
                right=mid-1;
            }
        }
        return -1;
    } 
}
