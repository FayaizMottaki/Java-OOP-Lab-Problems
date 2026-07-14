import java.util.Scanner;

public class Problem1contd3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter your score: ");
        int marks=sc.nextInt();
        switch(marks/10){
case 10:
    case 9:
        System.out.println("A+");
        break;
        case 8:
             System.out.println("A");
        break;
        case 7:
             System.out.println("A-");
        break;
        case 6:
             System.out.println("B");
        break;
        case 5:
        case 4:
             System.out.println("C+");
        break;
     
        default:
            System.out.println("F");
        break;
    
        }
    }
}
