//WAP TO PRINT FIZZ IF THE NUMBER IS DIVISIBLE BY 3, BUZZ IF THE NUMBER IS DIVISIBLE BY 5 AND
// FIZZBUZZ IF THE NUMBER IS DIVISIBLE BY 5 AND 3. AND NOFIZZBUZZ IF THE NUMBER IS NOT DIVISIBLE BY EITHER.
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = sc.nextInt();
        System.out.println(divCheck(num));
    }

    public static String divCheck(int num){
        if (num % 15 == 0){
            return "FIZZBUZZ";
        } else if(num % 3 == 0) {
           return "FIZZ";
       } else if (num % 5 == 0) {
         return "BUZZ";
       }else{
           return "NOFIZZBUZZ";
       }
    }
}
