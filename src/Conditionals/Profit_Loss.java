package L3_Conditionals;

import java.util.Scanner;

public class Profit_Loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        double cp = sc.nextDouble();
        System.out.print("Enter Selling Price: ");
        double sp = sc.nextDouble();
        if(sp>cp){
            System.out.println("Profit of "+(sp-cp));
            System.out.println("Profit Percent: "+((sp-cp)/cp*100)+"%");
        }
        else if(cp>sp){
            System.out.println("Loss of "+(cp-sp));
            System.out.println("Loss Percent: "+((cp-sp)/cp*100)+"%");
        }
        else
            System.out.println("No Profit No Loss");


    }
}
