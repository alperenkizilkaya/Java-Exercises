package Q4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q4 {

    /*
    Implement a method to remove the last element from the given list, and return the new list.

            Example:
    Input: [1,7,2,6,7]
    Output: [1,7,2,6]
    Input list may be empty or None.
    Input list contains only integers if not empty.
    You must return the new list.*/

    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

        createList();

        showList();

        removeLastElement();

        showList();
    }

    static void createList(){

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("enter the index number of the list");
            int indexNumber = sc.nextInt();

            if (indexNumber == 0){
                System.out.println("this is an empty list... returning to the begining..");
                createList();
            }
            else if(indexNumber < 0) {
                System.err.println("index number of the list can be negative!!!");
                createList();
            }
            for (int i = 0; i < indexNumber; i++) {
                System.out.println("enter the index[" + i + "] : ");
                list.add(sc.nextInt());
            }
        }catch (Exception e){
            System.err.println("returning to the begining..  error : " + e );
            createList();
        }
    }

    static void showList(){
        for(int i : list){
            System.out.print(i +" ");
        }
        System.out.println();
    }

    static void removeLastElement(){
        System.out.println("removing the last element of the list");
        list.remove(list.size()-1);
    }

}


