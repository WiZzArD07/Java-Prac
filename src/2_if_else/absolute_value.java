import java.util.Scanner;
public class absolute_value {
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        System.out.print("Enter your number:");
        int a = av.nextInt();
        if(a >= 0){
            System.out.println(a);
        }
        else{
            System.out.println(-a);
        }
    }
}
