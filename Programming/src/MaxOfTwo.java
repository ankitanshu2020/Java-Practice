//WAP TO FIND THE MAXIMUM OF THE TWO NUMBERS
import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Max is : " + maxNum(num1, num2));
    }

    public static int maxNum(int num1, int num2){
        int tempMax = Integer.MIN_VALUE;

        if(num1 > tempMax){
            tempMax = num1;
        }
        if(num2 > tempMax){
            tempMax = num2;
        }
        return tempMax;
    }
}
