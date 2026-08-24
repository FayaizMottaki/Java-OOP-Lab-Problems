import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
          int[] arr={1, 2, 3, 4};
          double sum=0;
          for(int i=0;i<arr.length;i++){
                sum+=arr[i];
          }
          double avg=(double)sum/arr.length;
            System.out.println(avg);
    }
  
}
