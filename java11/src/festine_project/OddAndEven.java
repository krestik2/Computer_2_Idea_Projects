package festine_project;

import java.util.Scanner;

public class OddAndEven {
    // write a method that can identify given number as odd or even
   // identify(5)--> odd
    // identify(6)--> even

    public static String identify( int num){
        if(num%2==0){
            return  "even";
        }else{
            return "odd";
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter any whole number");
        int num = input.nextInt();
        System.out.println("identify(" + num + ") --> " + identify(num));


    }
}
