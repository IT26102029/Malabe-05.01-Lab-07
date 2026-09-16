import java.util.Scanner;

public class IT26102029Lab7Q3 {
public static void main(String[] args) {


    Scanner input = new Scanner(System.in);

    for (int customer = 1; customer <= 5; customer++) {

        System.out.print("Enter total bill amount for customer " + customer + ": ");
        double bill = input.nextDouble();

        System.out.print("Enter payment mode (C/c or O/o): ");
        char payment = input.next().charAt(0);

        double discount = 0;
        double amountToPay;

        if (payment == 'C' || payment == 'c') {

            discount = bill * 0.05;
            amountToPay = bill - discount;

            System.out.println("Discount = " + discount);
            System.out.println("Amount to Pay = " + amountToPay);

        }
        else if (payment == 'O' || payment == 'o') {

            amountToPay = bill;

            System.out.println("Discount = 0");
            System.out.println("Amount to Pay = " + amountToPay);

        }
        else {

            System.out.println("Payment Mode is Not Valid");
        }

        System.out.println();
    }
}


}
