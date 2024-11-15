/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input your first name: ");
        String fname = input.nextLine();

        System.out.print("Input your last name: ");
        String lname = input.nextLine();

        input.close();

        System.out.println("\nHello " + fname + " " + lname);
    }
}*/



/* 
public class chapter3 {
    public static void main(String[] args) {
        int result1 = -5 + 8 * 6;
        int result2 = (55 + 9) % 9;
        int result3 = 20 + -3 * 5 / 8;
        int result4 = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.println("Here are some calculations");
        System.out.println("\n" + "-5 + 8 * 6                              : " + result1);
        System.out.println("(55 + 9) % 9                            : " + result2);
        System.out.println("20 + -3 * 5 / 8                         : " + result3);
        System.out.println("5 + 15 / 3 * 2 - 8 % 3                  : " + result4);
    }
}*/

/*import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Converter available:");
        System.out.println("1. Currency (MYR - YEN)");
        System.out.println("2. Mass (kg - pound)");
        System.out.println("3. Distance (km - m)");

        System.out.print("Choose your converter: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Insert Amount (in MYR): RM ");
                double myr = input.nextDouble();
                double yen = myr * 33.65;  
                System.out.println("Converted Amount: ¥ " + yen);
                break;

            case 2:
                System.out.print("Insert Quantity (in kg): ");
                double kg = input.nextDouble();
                double pounds = kg * 2.20462;
                System.out.println("Converted Quantity: " + pounds + " lbs");
                break;

            case 3:
                System.out.print("Insert Distance (in km): ");
                double km = input.nextDouble();
                double meters = km * 1000;
                System.out.println("Converted Distance: " + meters + " m");
                break;

            default:
                System.out.println("Invalid choice! Please choose a valid converter.");
        }

        input.close();
    }
}*/
/* 
public class ForLoopDemo {
    public static void main(String[] args) {
        System.out.println("Printing Numbers from 1 to 10");
        int count = 1;
        while (count <= 10) {
            System.out.println(count);
            count++;  
        }
    }
}*/
/* 
public class BreakExample {
    public static void main(String[] args) {
        System.out.println("Numbers 1-10");
        for (int i = 1; i <= 10; i++) {
            if (i == 5)
                break;
            System.out.println(i + "\t"); 
        System.out.println("Broke out of loop at i = " + i); } 
    }
}
 */
    




