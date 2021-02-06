import java.util.Scanner;

public class Patt4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int rows, spaces, cols, colsmirr;
        for(rows=1; rows<=n; rows++)  {
            for(spaces=rows; spaces<n; spaces++) {
                System.out.print(" ");
            }
         for(cols=rows; cols<2*rows; cols++) {
             System.out.print(""+cols);
         }
         if(rows==2) {
             System.out.print("2");
         } else if(rows>2) {
             for(colsmirr = (2*rows-2); colsmirr>=rows; colsmirr--) {
                System.out.print(""+colsmirr);
             }
        }
           System.out.print("\n");
        }
    }
}

