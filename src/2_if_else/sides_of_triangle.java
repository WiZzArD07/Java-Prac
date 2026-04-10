import java.util.Scanner;
public class sides_of_triangle {
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        System.out.print("Enter the side a: ");
        int a = av.nextInt();
        System.out.print("Enter the side b: ");
        int b = av.nextInt();
        System.out.print("Enter the side c: ");
        int c = av.nextInt();

        if(a+b > c && b+a > c && c+a > b){
            System.out.println("Sides are valid for Triangle");
        }
        else{
            System.out.println("Sides are not valid for Triangle");
        }
    }
}
