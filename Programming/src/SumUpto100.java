//WAP TO FIND THE SUM OF NUMBERS FROM 1 TO 100

public class SumUpto100 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while(i <= 100){
            sum += i;
            i++;
        }
        System.out.println("Sum from 1 to 100 = " + sum);
    }
}
