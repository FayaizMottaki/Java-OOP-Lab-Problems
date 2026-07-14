import java.util.Scanner;
public class Problem1contd2 {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.printf("Enter the number: ");
    double number=sc.nextDouble();
    if(number==0){
        System.out.println("It is a unique number");
    }
    else if(number%2==0){
        System.out.println("It is an even number");
    }
    else{
        System.out.println("It is odd");
    }}
}
