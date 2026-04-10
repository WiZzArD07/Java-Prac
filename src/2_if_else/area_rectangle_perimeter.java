import java.util.Scanner;
public class area_rectangle_perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int b = sc.nextInt();
        int area = l*b;
        int perimeter = 2*(l+b);

        if(l == b){
            System.out.println("Invalid l and b");
        }
        else if(area > perimeter){
            System.out.println("Area is grater than perimeter");
        }
        else{
            System.out.println("Perimeter is greater than area");
        }
    }
}
