import java.util.Scanner;
public class check_integer {
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double x = av.nextDouble();
        int y = (int)x;
        if(x-y == 0){
            System.out.println(x+ " is an integer");
        }
        else{
            System.out.println(x+ " is not an integer");
        }
    }
}
