import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Radius:");
double radius=sc.nextDouble();
 double area=Math.PI*radius*radius;
 System.out.printf("Area=%.2f",area);
    }
}
