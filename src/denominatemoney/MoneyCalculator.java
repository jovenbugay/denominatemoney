package denominatemoney;

/**
 *
 * @author Kyle Ching
 */
public class MoneyCalculator {
    
    public void demonitizeMoney(int moneyAmount) {
        
        //initialize variables for counting bills
        int oneThousand = 0;
        int fiveHundred = 0;
        int twoHundred = 0;
        int oneHundred = 0;
        int fifty = 0;
        int twenty = 0;
        int ten = 0;
        int five = 0;
        int one = 0;
        
        
        if (moneyAmount >= 1000) {
            oneThousand = moneyAmount / 1000;       //count how many thousand in moneyAmount
            moneyAmount -= (oneThousand * 1000);    //subtract result (# of thousand) from total moneyAmount
        }
        if (moneyAmount >= 500) {
            fiveHundred = moneyAmount / 500;
            moneyAmount -= (fiveHundred * 500);
        }
        if (twoHundred >= 200) {
            twoHundred = moneyAmount / 200;
            moneyAmount -= (twoHundred * 200);
        }
        if (moneyAmount >= 100) {
            oneHundred = moneyAmount / 100;
            moneyAmount -= (oneHundred * 100);
        }
        if (moneyAmount >= 50) {
            fifty = moneyAmount / 50;
            moneyAmount -= (fifty * 50);
        }
        if (moneyAmount >= 20) {
            twenty = moneyAmount / 20;
            moneyAmount -= (twenty * 20);
        }
        if (moneyAmount >= 10) {
            ten = moneyAmount / 10;
            moneyAmount -= (ten * 10);
        }
        if (moneyAmount >= 5) {
            five = moneyAmount / 5;
            moneyAmount -= (five * 5);
        }
        if (moneyAmount >= 1) {
            one = moneyAmount / 1;
            moneyAmount -= (one * 1);
        }
        
        String outputMessage = "1000:\t" + oneThousand + "\n" +
                               "500:\t" + fiveHundred + "\n" +
                               "200:\t" + twoHundred + "\n" +
                               "100:\t" + oneHundred + "\n" +
                               "50:\t" + fifty + "\n" +
                               "20:\t" + twenty + "\n" +
                               "10:\t" + ten + "\n" +
                               "5:\t" + five + "\n" +
                               "1:\t" + one;
        
        System.out.println(outputMessage);
        
    }
}
