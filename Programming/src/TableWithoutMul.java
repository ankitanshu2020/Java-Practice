//WAP TO PRINT TABLE OF A NUMBER WITHOUT USING MULTIPLICATION OPERATOR
import java.util.Scanner;
public class TableWithoutMul {
    public static String tableWithoutMul(int num){
        int sum = 0;
        StringBuilder result = new StringBuilder();
        for(int i = 1; i <= 10; i++){
            sum += num;
           result.append(num).append(" x ").append(i).append(" = ").append(sum).append("\n");
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number to get table");
        int num = sc.nextInt();
        System.out.println(tableWithoutMul(num));
    }
}
