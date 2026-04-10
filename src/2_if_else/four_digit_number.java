import java.util.Scanner;
public class four_digit_number {
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = av.nextInt();
        
        if(x > 999 && x < 10000){
            System.out.println(x+ " is a 4 digit number");
        }
        else{
            System.out.println(x+ " is not a four digit number");
        }
    }
}
