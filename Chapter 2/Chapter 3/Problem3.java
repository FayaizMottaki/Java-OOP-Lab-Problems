import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 int[] arr={1, 2, 3, 4};
 int max=arr[0];
 for(int i=0;i<arr.length;i++){
    if(arr[i]>arr[0]){
        max=arr[i];
    }
 }
 System.out.println(max);
    }
}
