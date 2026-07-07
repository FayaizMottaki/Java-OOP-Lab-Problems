import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Radius:");
        double radius=sc.nextDouble();

double volume=4/3*Math.PI*radius*radius*radius;
System.out.printf("Volume=%.2f\n",volume);
       
    }
}
