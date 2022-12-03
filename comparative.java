package test;
import java.util.Scanner;
public class comparative {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int number1;
        int number2;
        System.out.println("number 1 :\n");
        number1 = input.nextInt();
        System.out.println("number 2 :\n");
        number2 = input.nextInt();
        if(number1>number2)
        {
            System.out.println("number1 is greater than number2")
        }
        if(number1 == number2)
        {
            System.out.println("number1 is equal to number 2");
        }
        else
        {
            System.out.println("number2 is greater than number1");
        }
    }
    
}
