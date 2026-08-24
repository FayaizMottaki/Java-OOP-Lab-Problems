import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={1, 2, 3, 4};
        int counto=0;
        int counte=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]%2==0){
            counte++;
           
           } 
           else if(arr[i]%2!=0){
            counto++;
           
           }
        }
         System.out.println("Even Counter: "+counte);
          System.out.println("Odd Counter: "+counto);
    }
}
