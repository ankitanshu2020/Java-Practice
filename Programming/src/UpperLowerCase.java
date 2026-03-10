//WAP TO CONVERT THE GIVEN CHARACTER TO UPPERCASE OR LOWERCASE
import java.util.Scanner;

public class UpperLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a character");
        char c = sc.next().charAt(0);

        System.out.println("Converted character is : " + upperLower(c));
    }

    public static char upperLower(char c){

        if(c >= 'A' && c <= 'Z'){
            return (char) (c + 32);
        }
        if(c >= 'a' && c <= 'z'){
            return (char) (c - 32);
        }

        return c;
    }
}
