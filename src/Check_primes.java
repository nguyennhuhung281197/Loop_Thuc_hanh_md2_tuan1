import java.util.Scanner;

public class Check_primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the prime");
        int num = sc.nextInt();
        if (check(num)) {
            System.out.println("is a prime");
        }else {
            System.out.println("is not a prime");
        }

    }
    public static boolean check(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;

            }
        }
        return true;
    }
}
