import java.util.Scanner;

public class Patt3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int rows, spaces, cols, colsmirr;
        for(rows=1;rows<=n;rows++)  {
            for(spaces=rows;spaces<n;spaces++) {
                System.out.print(" ");
            }
         for(cols=1;cols<=rows;cols++) {
             System.out.print(""+cols);
         }
         if(rows==2) {
             System.out.print("1");
         } else if(rows>2) {
             for(colsmirr=rows-1;colsmirr>0;colsmirr--) {
                System.out.print(""+colsmirr);
             }
        }
           System.out.print("\n");
        }
    }
}


