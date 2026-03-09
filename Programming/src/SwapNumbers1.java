//SWAP 2 NUMBERS WITH THE HELP OF A THIRD VARIABLE
import java.util.Scanner;

public class SwapNumbers1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Numbers before swapping : num1 = " + num1 + " num2 = " + num2);

        int num3 = num1;
        num1 = num2;
        num2 = num3;

        System.out.println("Numbers after swapping : num1 = " + num1 + " num2 = " + num2);
    }
}
