import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n1 = input.nextInt();
      int n2 = input.nextInt();
    int  i, gcd=1;

    for(i=1; i <= n1 && i <= n2; ++i)
    {
        
        if(n1%i==0 && n2%i==0)
            gcd = i;
    }

    System.out.print("G.C.D of "+n1+" and "+n2+" is "+gcd);


    }
}
