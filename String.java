import java.util.Scanner;

public class Strings {
    public void reverseString(char[] s) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inp=sc.nextLine();
        char[] ch = inp.toCharArray();
        //String str= sc.nextLine();
        for (int i =ch.length-1;i>=0; i--){
            System.out.println(chh[i]);
        }
        System.out.println();
        
    }
    public static void main(String[] args){
        Strings sol= new String();
        sol.reverseString(null);
    }
}
/* 
import java.util.Scanner;

public class Solution {
    public void reverseString(char[] s) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char[] ch = input.toCharArray();

        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.reverseString(null); // You can pass a character array here if needed
    }
}/* */
