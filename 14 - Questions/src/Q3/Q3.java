package Q3;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {

    /*
    Write a Java method to return duplicate characters (occurrence >= 2) from an input string
    in the same order they are in the input.

    Each duplicate character must exist only once in the output string.

            Constraints:

            Input string is all lowercase and no whitespace
            Method should return string containing only duplicates
            Output string is all lowercase and no whitespace*/

    static String s;
    static ArrayList<String> list = new ArrayList<>();
    static ArrayList<String> controlList = new ArrayList<>();

    public static void main(String[] args) {

        giveMeString();

        stringToList();

        checkDuplicates();

        showDuplicates();
    }

    //take input from user
    static void giveMeString(){

        Scanner sc = new Scanner(System.in);
        System.out.println("give me a string with all lowercase and no whitespace");
        s = sc.nextLine();
        checkInputRules(s);

    }

    //check the input rules : no whitespaces and all lowercase
    static void checkInputRules(String s){

        char ch;

        for(int i=0;i < s.length();i++) {
            ch = s.charAt(i);
            if (Character.isUpperCase(ch) || Character.isSpaceChar(ch)) {
                System.err.println("wrong input!! write a new string");
                giveMeString();
            }
        }
    }

    // input from the user, is added to the list as char by char
    static void stringToList(){

        for (int i = 0; i < s.length(); i++){
            list.add(String.valueOf(s.charAt(i)));
        }

    }

    // the list is checked for duplicate chars.. and these duplicate chars are added to controlList
    //                                           and lastControl() method is called..
    static void checkDuplicates(){

        boolean durum = false;

        for (int i = 0; i < s.length(); i++){
            for (int j = i+1; j < s.length(); j++){
                if (list.get(i).equals(list.get(j))){
                    durum = true;
                    controlList.add(list.get(i));
                    break;
                }
            }
        }

        if(!durum){
            System.out.println("there is no duplicate chars..");
        }else{
            lastControl();
        }
    }

    // same dublicate chars are deleted from the controlList
    static void lastControl(){

        for (int i = 0; i < controlList.size(); i++){
            for(int j = i+1; j < controlList.size(); j++){
                if (controlList.get(i).equals(controlList.get(j))){
                    controlList.remove(j);
                    j--;
                }
            }
        }

    }

    // duplicate chars are written once on the console
    static void showDuplicates(){
        for (String s : controlList){
            System.out.print(s);
        }
    }

}


