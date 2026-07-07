import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter A:");
double a=sc.nextDouble();
System.out.println("Enter B:");
double b=sc.nextDouble();
System.out.println("Enter C:");
double c=sc.nextDouble();
double s=(a+b+c)/2;
double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.printf("Area=%.2f",area);
}
}

