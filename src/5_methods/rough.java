import java.util.Scanner;

public class rough {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int r = sc.nextInt();
    //     System.out.println(num(3));
    // }
    // public static int num(int a){
    //     if(a>5)
    //         return 5;
    //     return 10;

        // int nfact =1;
        // for(int i=1; i<=n; i++){
        //     nfact*=i;
        // }

        // int rfact =1;
        // for(int i=1; i<=n; i++){
        //     rfact*=i;
        // }

        // int nrfact =1;
        // for(int i=1; i<=n; i++){
        //     nrfact*=i;
        // }

        // int nCr = nfact/(rfact*nrfact);
        // System.out.println(nCr);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        int a = sc.nextInt();
        System.out.print("enter the number b: ");
        int b = sc.nextInt();
        int temp = a;
        System.out.println(a+" "+b);
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }


    }


