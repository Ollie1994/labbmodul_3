import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            double total = -1;
            try {
                System.out.println("Hello user, please input the total of the tab! (if you want to exit the app please input 0))");
                total = sc.nextDouble();
                if (total == 0) {
                    break;
                } else if (total >= 50 && total <= 300) {
                    double tips15 = total * 0.15;
                    System.out.println("Total = " + (total + tips15) + "\nTip included in total: " + tips15);
                } else if (total > 300 && total <= 1000) {
                    double tips20 = total * 0.20;
                    System.out.println("Total = " + (total + tips20) + "\nTip included in total: " + tips20);
                } else if (total > 1000) {
                    double tips25 = total * 0.25;
                    System.out.println("Total = " + (total + tips25) + "\nTip included in total: " + tips25);
                } else if (total < 0) {
                    System.out.println("Total has to be bigger than 0");
                } else {
                    System.out.println("No tip required");
                }
            } catch (Exception e) {
                System.out.println("Invalid input, please try again!");
                sc.next();
            } finally {
            }
                if (total > 0) {
                    System.out.println("Do you want to exit this program press 0 or press 1 to restart the program");
                if (sc.nextInt() == 0) {
                break;
                }
                }

        }

        System.out.println("Thank for using our free app, have a nice day!");
    }
}

        /*
        ska välkommna och be om ett värde (double)
        input
        try catch loop
        när vi har rätt input
        uträkning
        skriver ut tot värde på notan och hur mycket dricks

         */

        /*
        inte negativt tal
        vi ska kunan avlsluta programet med att teryck  "0"
         while loop för fel entry
         ska skriva trevlig dag efter progtra avlsutas
         50-300 15%
         300-1000 20%
         1000+ 25%
         */

