import java.util.Scanner;
public class nested_loop {
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = av.nextInt();
        System.out.print("Enter the second number: ");
        int b = av.nextInt();
        System.out.print("Enter the third number: ");
        int c = av.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }
        }
        else{
            if(b>c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }
    }
}
