import java.util.Scanner;
public class divisible_5 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sb.nextInt();
        if(n%5 == 0){
            System.out.println(n+ " is divsible by 5");
        }
        else{
            System.out.println(n+ " is not divisble by 5");
        }
    }
}
