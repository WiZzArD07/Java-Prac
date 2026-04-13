import java.util.Scanner;

public class rough {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the odd number: ");
        int n = sc.nextInt();
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1 ; j<=n+1-i; j++){
        //         if(n+1-i==j){
        //             System.out.print(" * ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        for(int i = 1; i<=n; i++){
            for(int j = 1 ; j<=n; j++){
                if(i+j>n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
