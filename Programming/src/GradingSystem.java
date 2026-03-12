//WAP TO CALCULATE GRADE OF A STUDENT BASED ON HIS 5 SUBJECTS MARKS
import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your 5 subjects obtained marks");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();

        System.out.println("Your Grade is : " + getMyGrade(num1, num2, num3, num4, num5));
    }

    public static String getMyGrade(int num1, int num2, int num3, int num4,int num5){
        int avg = (num1 + num2 + num3 + num4 + num5) / 5;


            if(avg > 90) {
                return "O";
            }else if(avg > 80){
                return "A";
            }else if(avg > 70) {
                return "B";
            }else if(avg > 60){
                return "C";
            }else if(avg > 50) {
                return "D";
            }else{
                return "E";
            }
    }
}
