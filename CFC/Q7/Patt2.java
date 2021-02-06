import java.util.Scanner;

public class Patt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i,j;
        for(i=1;i<=n;i++) {
         for(j=1;j<=i;j++) {
             System.out.print(" "+j);
         }
           System.out.print("\n");
        }
    }
}


