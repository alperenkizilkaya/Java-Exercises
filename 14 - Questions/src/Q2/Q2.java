package Q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2 {

    /*
        Write a Java function that returns the largest (maximum) element in a list containing
     integers between 1 and 100.

        Each duplicate character must exist only once in the output string.

        Example:

        Input: [1, 3, 5, 12, 4, 21, 3, 2]
        Output: 21

        Input: [1]
        Output: 1

             */

    static List<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) {

     createList();

     showList();

     findMax();

    }

    public static void createList(){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of indexes of the list");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++){
            System.out.println("enter the index [" + i+"] :");
            int index = sc.nextInt();
            if(index >= 1 && index <= 100) {
                list.add(index);
            }else {
                System.out.println("the index range must be between 1 and 100");
                i--;
            }
        }
    }

    public static void showList(){
        System.out.println("list : ");
        for (int i : list){
            System.out.println(i);
        }
    }

    public static void findMax(){

        int max = 0;
        for(int i : list){
            if (i >= max)
                max = i;
        }
        System.out.println("max value of list : " + max);

    }
}
