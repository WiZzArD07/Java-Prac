import java.util.Scanner;
public class divisibility_5_or_3 {
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = av.nextInt();

        if(num%5 == 0 || num%3 == 0){
            System.out.println(num+" is divisible by 5 or 3");
        }
        else{
            System.out.println(num+" is not divisble by 5 or 3");
        }
    }
}
