import java.util.Scanner;

public class odd_number_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){                     //M1
            for(int j = 1; j<=i; j++){
                System.out.print(((j*2)-1)+"  ");
            }
            System.out.println();
        }
        // for(int i = 1; i<=n; i++){                  //M2
        //     int a = 1;
        //     for(int j = 1; j<=i; j++){
        //         System.out.print((a)+"  ");
        //         a+=2;
        //     }
        //     System.out.println();
        // }
    }
}
