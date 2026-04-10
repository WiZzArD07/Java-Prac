import java.util.Scanner;
public class profit_loss {
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        System.out.print("Enter the cost price: ");
        double cp = av.nextDouble();
        System.out.print("Enter the selling price: ");
        double sp = av.nextDouble();
        if(sp > cp){
            double profit = (sp-cp);
            System.out.println("Profit of " +(profit));
            System.out.println("Profit percentage is "+((profit/cp)*100));
        }
        else if(sp < cp){
            double loss = (cp-sp);
            System.out.println("Loss of " +(loss));
            System.out.println("Loss percentage is "+((loss/cp)*100));
        }
        else{
            System.out.println("No Profit No Loss");
        }
    }
}
