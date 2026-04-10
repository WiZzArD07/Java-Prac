import java.util.Scanner;
public class quadrant {
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        System.out.print("Enter the x axis: ");
        double x = av.nextInt();
        System.out.print("Enter the y axis: ");
        double y = av.nextInt();

        if(x == 0 && y == 0){
            System.out.println("Origin");
        }
        else if(x > 0 && y > 0){
            System.out.println("Quadrant 1");
        }
        else if(x < 0 && y > 0){
            System.out.println("Quadrant 2");
        }
        else if(x < 0 && y < 0){
            System.out.println("Quadrant 3");
        }
        else if(x > 0 && y < 0){
            System.out.println("Quadrant 4");
        }
    }
}
