import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter base: ");
        double base= sc.nextDouble();
         System.out.println("Enter height: ");
        double height= sc.nextDouble();
        double area=0.5*height*base;
        System.out.printf("Area=%.2f\n",area);
    }
}
