import java.util.Scanner;
public class divisibility {
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = av.nextInt();

        if(num%5 == 0 && num%3 == 0){
            System.out.println("Divisble by 5 and 3");
        }
        else if(num%3 == 0){
            System.out.println("Divisible by 3");
        }
        else if(num%5 == 0){
            System.out.println("divisible by 5");
        }
        else{
            System.out.println("Not divisble by 3 or 5");
        }
    }
}
