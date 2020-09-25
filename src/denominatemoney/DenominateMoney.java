package denominatemoney;

import java.util.Scanner;

/**
 *
 * @author Christian Kyle Ching
 */
public class DenominateMoney {

    
    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);
        int moneyAmount;
        MoneyCalculator mc = new MoneyCalculator();
        System.out.println("Enter amount that you want to demonitize (whole number only): ");
        moneyAmount = Input.nextInt();
        mc.demonitizeMoney(moneyAmount);
        
    }
    
}
