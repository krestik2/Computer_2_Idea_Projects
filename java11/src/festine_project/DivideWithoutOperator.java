package festine_project;

import java.util.Scanner;

public class DivideWithoutOperator {
    // create a method that will divide 2 numbers without / operator

    public static double divide(double num1, double num2){
        double result= num1/num2;
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter 2 number you want to divide ");
        double num1 = input.nextInt();
        double num2 = input.nextInt();
        System.out.println("The result of the division: " + divide(num1,num2));

    }
}
