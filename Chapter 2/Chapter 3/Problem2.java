import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        boolean completed=true;
        System.out.print("Your grade: ");
        double grade=sc.nextDouble();
        if(completed){
            completed=true;
            if(grade>=3.5&&grade<=4){
                System.out.println("You got a medal");
            }
        }

    }
}
