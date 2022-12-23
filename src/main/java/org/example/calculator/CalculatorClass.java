package org.example.calculator;
import java.util.Scanner;

public class CalculatorClass {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = sc.nextInt();

        System.out.println("Enter the operation");
        char operation = sc.next().charAt(0);

        System.out.println("Enter the second number");
        int b = sc.nextInt();

        int result = 0;

        switch (operation){
            case '+': result = a+b;
                break;
            case '-': result = a-b;
                break;
            case '*': result = a * b;
                break;
            case '/': if( b == 0){
                            System.out.println("division by 0 is not available");
                        }
                        else{
                            result = a/b;
                        }
                        break;
            case '%' : if( b == 0){
                            System.out.println("division by 0 is not available");
                        }
                        else {
                            result = a%b;
                        }
                        break;
            default:break;
        }
        System.out.println("result  : "+ result);
    }
}
