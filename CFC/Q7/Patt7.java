import java.util.Scanner;

public class Patt7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++) {
            for(j=1;j<=i;j++) {
                System.out.print("*");
            }
            for(k=1;k<=2*(5-i);k++) {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<n;i++) {
            for(j=i;j<n;j++) {
                System.out.print("*");
            }
            for(k=1;k<(2*i+1);k++) {
                System.out.print(" ");
            }
            for(j=i;j<n;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
