import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
       int rem, rev=0, temp=n;
       while(n > 0) {
           rem = n%10;
           n = n/10;
           rev = (rev*10+rem);
       }
       System.out.print("Reverse of the number "+temp+" is "+rev);
    }
}
