import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = myScanner.nextInt();
        if (num <= 0) {
            System.out.println("That is not a positive number!");
        } else {
            if ((num % 2) == 1) {
                if (((num % 5) == 0) && ((num % 7) == 0)) {
                    System.out.println(num + " is divisible by 5");
                    System.out.println(num + " is divisible by 7");
                } else if ((num % 5) == 0) {
                    System.out.println(num + " is divisible by 5");
                } else if ((num % 7) == 0) {
                    System.out.println(num + " is divisible by 7");
                } else {
                    System.out.println(num + " is not divisible by both 5 and 7");
                }
            } else {
                if (num > 1000) {
                    System.out.println("Big even number!");
                } else if (num > 100) {
                    System.out.println("Medium even number!");
                } else {
                    System.out.println("Small even number!");
                }
            }
        }
    }
}
