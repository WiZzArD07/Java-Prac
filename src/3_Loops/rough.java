import java.util.Scanner;
public class rough {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number: ");
         int n = sc.nextInt();
         int a = n;

        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(n+ "*" +i+ "=" +n*i);
        // }
        // for (int i = 17; i <=170; i=i+17){
        //     System.out.println(i+" ");
        // }
        // for (int i = 2; i <= 3*n-1; i+=3) {
        //     System.out.print(i+" ");
        // }
        // int a = 2;
        // int d = 3;
        // for (int i = 1; i <=n; i++) {
        //     System.out.println(a+" ");
        //     a = a+d;
        // }
        // int a = 99;
        // int d = 4;
        // for (int i = 1; i <=n; i++) {
        //     if(a<=0){
        //         break;
        //     }
        //     System.out.println(a + " ");
        //     a -= d;
        // }

        // for(int i = 99; i > 0; i -= 4){
        //     System.out.println(i);
        // }

        // for (int i = 1; i <= n/2; i++) {
        //     System.out.println(i);
        //     System.out.println(n-i+1);
        // }
        // if(n%2!=0){
        //     System.out.println(n/2+1); // for odd numbers

        // }
        

        // for (int i=1;i<=Math.sqrt(n);i++){
        //     if(n%i == 0){
        //       System.out.println(i);
        //       if(n/i!=i){
        //         System.out.println(n/i);
        //       }
        //     } 
        // }
        int rev = 0;
        while(n!=0){
            rev*=10;
            rev+=n%10;
            n/=10;
        }
        System.out.println(rev);
        System.out.println(rev+a);

        }
    }


