import java.util.Scanner;

public class swap_numbers {
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        int a = sc.nextInt();
        System.out.print("enter the number b: ");
        int b = sc.nextInt();
        System.out.println(a+" "+b);
        swap(a,b);
        
    }
}
