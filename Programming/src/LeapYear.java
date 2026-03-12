//WAP TO FIND THE GIVEN YEAR IS A LEAP YEAR OR NOT
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a year");
        int year = sc.nextInt();
        System.out.println(year + " is a " + leapOrNot(year) + " year.");
    }
    public static String leapOrNot(int year){
        if(year % 100 == 0){
          if(year % 400 == 0){
              return "leap";
          }
        }else if (year % 4 == 0){
            return "leap";
        }else {
            return "not a leap";
        }
        return "not a leap";
    }
}
