import java.util.Scanner;

public class Credits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int credits = input.nextInt();

        if( credits>=7500) {
            System.out.print("Tera leader");
        } else if(credits>=6000 && credits<7500) {
             System.out.print("Gega leader");
        } else if(credits>=4500 && credits<6000) {
            System.out.print("Mega leader");
        } else if(credits<4500) {
            System.out.print("Rising star");
        }
    }
}