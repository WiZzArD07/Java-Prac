import java.util.Scanner;
public class composite_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        boolean flag = true;

        for (int i=2;i<=n-1;i++){
            if(n%i == 0){
              flag = false;
              break;
            } 
        }
        if(n==1 || n==0)
            System.out.println("Neither Prime Nor Composite");
        else if (flag == false)
            System.out.println("Composite Number");
        else 
            System.out.println("Prime Number");

    }
}
