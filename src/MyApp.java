import java.util.Scanner;
public class MyApp {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();
        Calc calc=new Calc(num1,num2);
        System.out.println("Addition result: " + calc.add());
        System.out.println("Multiplication result: " + calc.multiply());
        if(num2==0)
            System.out.println("Division result: ERROR!" );
        else
        System.out.println("Division result: " + calc.division());
    }
}
