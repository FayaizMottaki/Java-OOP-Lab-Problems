import java.util.Scanner;
public class Problem1contd {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
System.out.printf("Enter the number:");
double number=sc.nextDouble();
if(number==0){
    System.out.println("It is zero");
}
else if(number>0){
    System.out.println("It is Positive");
}
else{
    System.out.println("It is negative");
}

    }}
