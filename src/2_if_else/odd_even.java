import java.util.Scanner;
public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        if(x%2 == 0){
            System.out.println(x+ " is an even number");
        }
        else{
            System.out.println(x+ " is a odd number");
        }

    }
}
