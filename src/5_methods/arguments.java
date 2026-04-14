public class arguments {
    public static void sum(int a, int b){//Parameter
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        max(5,8,2); //Arguments
    }
    public static void max(int a, int b, int c){
        if(a>b && a>c)System.out.println(a);
        else if(b>a && b>c)System.out.println(b);
        else System.out.println(c);
        }
    }

