import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Celsius:");
double celsius=sc.nextDouble();
double Fahrenheit=(9*(celsius/5))+32;
 System.out.printf("Fahrenheit=%.2f",Fahrenheit);

    }
}
