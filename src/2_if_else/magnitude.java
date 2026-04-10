import java.util.Scanner;
public class magnitude {
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = av.nextInt();
        if(num > -69 && num < 69){
            System.out.println("magnitude of " +(num)+ " is smaller than 69");
        }
        else{
            System.out.println("magnitude of "+(num)+ " is greater than 69");
        }
    }
}
