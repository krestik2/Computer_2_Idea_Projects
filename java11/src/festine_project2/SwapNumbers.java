package festine_project2;

import java.util.ArrayList;
import java.util.Collections;

public class SwapNumbers {
    //Swap two variable' values without using a third variable

    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 200;

        System.out.println(swap(num1,num2));
    }





public static String swap (int a, int b){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(a);
        list.add(b);

        Collections.swap(list, 0, 1);


      String result  = "" + list.get(0) + " " + list.get(1);

      return result;




    }
}
