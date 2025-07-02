//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean[] map = new boolean[26];
    public static String newstr ="";

    public static void main(String[] args) throws Exception {
        // recursion practice
        String str = "abbccdda";
        delDup(str,0);

    }
    public static void delDup(String str,int idx){

        //base case
       if(idx == str.length()){
           System.out.println(newstr);
           return;
       }
       if(map[str.charAt(idx) - 'a'] == false){
           newstr +=str.charAt(idx);
           map[str.charAt(idx) - 'a'] = true;
       }
       delDup(str,idx+1);

    }

}
