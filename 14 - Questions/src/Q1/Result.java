package Q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result {

    /*
     * Complete the 'commonSubstring' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY a
     *  2. STRING_ARRAY b
     *
     * input examples1-> string_array a = 2(size), [hello, world]
     *                   string_array b = 2(size), [test,  test1]
     *if  a.get(i) and b.get(i) has any same letter print YES. if doesn't have print NO
     *
     * output for example1 -> YES
     *                        NO
     */

    public static void commonSubstring(List<String> a, List<String> b) {


        for(int i = 0; i < a.size(); i++){

            char[] list = new char[b.get(i).length()];
            String s = (b.get(i));

            for(int j = 0; j< list.length; j++){
                list[j] = s.charAt(j);
                String control = String.valueOf(list[j]);
                if(a.get(i).contains(control)){
                    System.out.println("YES");
                    break;
                }else if (j+1 == list.length ){
                    System.out.println("NO");
                }
            }
        }

    }

}