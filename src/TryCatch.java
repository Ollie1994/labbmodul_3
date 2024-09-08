import java.util.Scanner;

public class TryCatch {

    public int tryCatch1 () {
        int input = 0;
        while (input <= 0|| input > 4) {
            try {
            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();
            if (input <= 0 || input > 4) {
                System.out.println("Wrong input!!!");
            }

            } catch (Exception e) {
                System.out.println("Wrong input!");
            } finally {

            }
        }
        return input;
    }
    public int tryCatch2 (int size) {
        int input = -1;
        while (input <= 0 || input > size) {
            try {
                Scanner sc = new Scanner(System.in);
                input = sc.nextInt();
                if (input <= 0 || input > size) {
                    System.out.println("Wrong input!!!");
                }
            } catch (Exception e) {
                System.out.println("Wrong input!");
            } finally {

            }
        }
        return input -1;
    }
}
