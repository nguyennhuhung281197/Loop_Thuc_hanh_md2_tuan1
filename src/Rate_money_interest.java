import java.util.Scanner;

public class Rate_money_interest {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interest = 1.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a money :");
        money = input.nextDouble();

        System.out.println("Enter a month :");
        month = input.nextInt();

        System.out.println("Enter the interest :");
        interest = input.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interest / 100) / 12 * month;
        }
        System.out.println("TotalInterest = " + totalInterest);

    }
}
