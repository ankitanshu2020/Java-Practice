//WAP TO CHECK WHETHER A GIVEN NUMBER IS EVEN OR ODD
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = sc.nextInt();

        if(evenOdd(num)){
            System.out.println(num + " is an even number.");
        }else{
            System.out.println(num + " is an odd number.");
        }
    }

    public static boolean evenOdd(int num){
        return num % 2 == 0;
    }
}
