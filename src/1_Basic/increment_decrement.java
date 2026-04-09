
public class increment_decrement {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        x++;
        System.out.println(x);
        ++x;
        System.out.println(x);
        x--;
        System.out.println(x);
        --x;
        System.out.println(x);
        x += 6;
        System.out.println(x);
        x *= 4;
        System.out.println(x);
        x -= 10;
        System.out.println(x);


        x = 10;
        System.out.println(x++);
        System.out.println(x);

        x = 10;
        System.out.println(++x);
        System.out.println(x);


        int z = 10;
        int y = z++;
        System.out.println(z+" "+y);
    }
}
