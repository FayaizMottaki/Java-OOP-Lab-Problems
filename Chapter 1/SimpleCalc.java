import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
    System.out.printf("Input1: ");
        double a=sc.nextDouble();
       System.out.printf("Input2: ");
        double b=sc.nextDouble();
        System.out.printf("Enter any operator(+,-,*,/): ");
        char ch=sc.next().charAt(0);
        switch(ch){
            case '+':
                System.out.println("Result: "+(a+b));
                break;
                 case '-':
                System.out.println("Result: "+(a-b));
                break;
                 case '*':
                System.out.println("Result: "+(a*b));
                break;
                 case '/':
                    if(b!=0){
                System.out.println("Result: "+(a/b));}
                else{
                    System.out.println("Invalid Operator");
                }
                break;
        }

    }
}
