import java.util.Scanner;

public class NumberOfDig {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int r, temp, count = 0;
        temp = number;
        while(number > 0) {
            r = number % 10;
            number = number/10;
            count++;
        }
        System.out.println("Number of digits of the number "+temp+" are "+count);
    }
}
