import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Arm:");
double arm=sc.nextDouble();
double area=(Math.sqrt(3)/4)*arm*arm;
System.out.printf("Area=%.2f",area);
}
}
