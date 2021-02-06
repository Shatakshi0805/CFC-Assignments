import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values for amount, rate and time: ");
        int amount = input.nextInt();
        int rate = input.nextInt();
        int time = input.nextInt();

        double si = (amount*rate*time)/100.0;

        System.out.println(si);
    }
}
