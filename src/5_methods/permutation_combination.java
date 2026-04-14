import java.util.Scanner;

public class permutation_combination {
    public static int fact(int x){
        int fact = 1;
        for(int i=1; i<=x; i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        System.out.print("Enter the r: ");
        int r = sc.nextInt();
        
        int nCr = fact(n)/(fact(r)*fact(n-r));
        int nPr = fact(n)/fact(n-r);
        System.out.println(nCr+ " "+nPr);
    }
}
