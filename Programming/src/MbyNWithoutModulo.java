//WAP TO PRINT REMAINDER WHEN M VALUE DIVIDED BY N VALUE WITHOUT USING MODULO OPERATOR
import java.util.Scanner;

public class MbyNWithoutModulo {
    public static int remainder(int m, int n){
        while (m >= n){
            m -= n;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter divisor and dividend");
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println("Remainder is : " + remainder(m, n));
    }
}
