/*import java.util.Scanner;

public class InputExp {
    public static void main(String[] args) {
        String name;
        int age;
        String Hobby;
        String FavoriteFood;
        Scanner input = new Scanner(System.in);

        // Reads a single line from the console
        // and stores into name variable
        System.out.println("masukkan nama ayam gepuk anda");
        name = input.nextLine();
        

        // Reads an integer from the console
        // and stores into age variable
        System.out.println("masukkan umur ayam gepuk anda");
        age = input.nextInt();
        //kene tambah input.nextline(); sbb nnti dia skip hobby
        input.nextLine();

        System.out.println("masukkan Hobby ayam gepuk anda");
        Hobby = input.nextLine();

        System.out.println("masukkan FavoriteFood ayam gepuk anda");
        FavoriteFood = input.nextLine();
        input.close();

        //Prints name and age to the console
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hobby: " + Hobby);
        System.out.println("FavoriteFood " + FavoriteFood);
    }
}*/

/*import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException{
        edReaBufferder stdin = new BufferedReader(
                  new InputStreamReader(System.in));
        int mark;

        System.out.print("Enter Mark: ");
        mark = Integer.parseInt(stdin.readLine());
    }}*/
    
    /*import javax.swing.JOptionPane;
    public class Addition {
       public static void main(String[] args) {
           String firstNumber;
           String secondNumber;
           int num1, num2, sum;
           
           firstNumber = JOptionPane.showInputDialog("Enter 				first integer");
           secondNumber = JOptionPane.showInputDialog("Enter 				second integer");
           num1 = Integer.parseInt(firstNumber);
           num2 = Integer.parseInt(secondNumber);
           sum = num1 + num2;
          
           JOptionPane.showMessageDialog(null, "The sum is "+sum, "Results",     JOptionPane.PLAIN_MESSAGE);
           System.exit(0);
        }   }*/
        
        //Task 1
        /*import java.util.Scanner;

        public class ArithmeticProg {
            public static void main(String[] args) {
                Scanner bilanganayamgepuk = new Scanner(System.in);
        
                System.out.print("APAKAH TAHUN LATEST? ");
                int TAHUNLATESTGUYS = bilanganayamgepuk.nextInt();
        
                System.out.print("APAKAH TAHUN LAHIR AYAM GEPUK ");
                int TARIKHLAHIRGUYS = bilanganayamgepuk.nextInt();
        
                // Perform arithmetic operations
                int UMURSEBENAR = TAHUNLATESTGUYS - TARIKHLAHIRGUYS;
        
                // Display results
                System.out.println("SO UMUR ANDA ADALAH :" + UMURSEBENAR);

        
                bilanganayamgepuk.close();
            }
        }*/
        /*import java.util.Scanner;

public class ADADISCOUNTGERPUKCalculator {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Masukkan Nama Barang Broski: ");
        String itemName = Input.nextLine();
        System.out.print("Masukkan Harga Broski: ");
        double price = Input.nextDouble();
        System.out.print("Masukkan Quantiti Broski: ");
        int quantity = Input.nextInt();
        System.out.print("Masukkan Discount brp percent broski: ");
        double discountRate = Input.nextDouble();
        double totalPrice = price * quantity;
        double discountAmount = (totalPrice * discountRate) / 100;
        double priceAfterDiscount = totalPrice - discountAmount;

        // Display the result
        System.out.println("KEDETAILAN BARANG:");
        System.out.println("NAMA BARANG: " + itemName);
        System.out.println("HARGA: RM" + price);
        System.out.println("QUANTITI : " + quantity);
        System.out.println("JUMLAH AHRGA: RM" + totalPrice);
        System.out.println("DISCOUNT: " + discountRate + "%");
        System.out.println("HARGA AFTER DISCOUNT: RM" + priceAfterDiscount);

        Input.close();
    }
}*/

/*import java.util.Scanner;

public class GMICalculator {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.print("Masukkan berat sigma awak broski in (kg): ");
        double weight = Input.nextDouble();

        System.out.print("Masukkan tinggi anda broski in (m): ");
        double height = Input.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("Your BMI is: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Category: lemah");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Category: standar");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Category: banyak sangat makan ni");
        } else {
            System.out.println("Category: anda adalah CaSeoh Skibidi Sigma Overweight");
        }

        Input.close();
    }
}*/

/*public class CompoundProg {
    public static void main(String[] args) {
        // Define a variable
        int number = 5;
        
        // Display the initial value
        System.out.println("Permulaan value of number: " + number);

        // Postfix increment
        System.out.println("POSTFIX INCREMENT (WHICH MEAN DELAYED A BIT)");
        System.out.println("value before increment: " + number);
        System.out.println("value after increment: " + number++);
        System.out.println("Value after postfix increment applied: " + number);

        // Reset the value
        number = 5;

        System.out.println("\nPREFIX INCREMENT (WHICH MEAN TAMBAH DULU):");
        System.out.println("Value before increment: " + number);
        System.out.println("Value after increment: " + ++number);
        System.out.println("Value after prefix increment applied: " + number);

        number = 5;

        System.out.println("\nPostfix decrement:");
        System.out.println("Value before decrement: " + number);
        System.out.println("Value after decrement: " + number--);
        System.out.println("Value after postfix decrement applied: " + number);

        number = 5;

        System.out.println("\nPrefix decrement:");
        System.out.println("Value before decrement: " + number);
        System.out.println("Value after decrement: " + --number);
        System.out.println("Value after prefix decrement applied: " + number);
    }
}*/

/* 
import java.util.Scanner;

public class pengiramarkah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your mark: ");
        int markah = input.nextInt();
        
        char grade;

        if (markah >= 80) {
            grade = 'A';
        } else if (markah >= 70) {
            grade = 'B';
        } else if (markah >= 60) {
            grade = 'C';
        } else if (markah >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        System.out.println("Your grade is: " + grade);

        input.close();
    }
}*/
/* 
import java.util.Scanner;

public class pengiramarkah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("1st Number: ");
        double num1 = input.nextDouble();
        
        System.out.print("2nd Number: ");
        double num2 = input.nextDouble();
        
        System.out.println("Choose an arithmetic operation:");
        System.out.println("1.(+)");
        System.out.println("2.(-)");
        System.out.println("3.(*)");
        System.out.println("4.(/)");
        System.out.print("Enter your choice (1-4): ");
        int choice = input.nextInt();
        
        double result = 0;
        boolean validChoice = true;
        
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validChoice = false;
                }
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 4.");
                validChoice = false;
                break;
        }
        
        if (validChoice) {
            System.out.println("The result of the operation is: " + result);
        }
        
        input.close();
    }
}*/

/* 
import java.util.Scanner;

public class pengiramarkah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter item details
        System.out.print("Enter the item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter the price per item: ");
        double pricePerItem = input.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        // Display the discount menu
        System.out.println("Choose a discount rate based on the color code:");
        System.out.println("1. Red (10%)");
        System.out.println("2. Blue (20%)");
        System.out.println("3. Green (30%)");
        System.out.print("Enter your choice (1-3): ");
        int choice = input.nextInt();

        // Initialize the discount rate
        double discountRate = 0.0;
        switch (choice) {
            case 1:
                discountRate = 0.10;
                break;
            case 2:
                discountRate = 0.20;
                break;
            case 3:
                discountRate = 0.30;
                break;
            default:
                System.out.println("Invalid choice! No discount will be applied.");
                break;
        }

        // Calculate total price, discount amount, and final price
        double totalPrice = pricePerItem * quantity;
        double discountAmount = totalPrice * discountRate;
        double finalPrice = totalPrice - discountAmount;

        // Display the results
        System.out.println("\nItem Details:");
        System.out.println("Item Name: " + itemName);
        System.out.println("Price Per Item: $" + pricePerItem);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Discount Rate: " + (discountRate * 100) + "%");
        System.out.println("Price After Discount: $" + finalPrice);

        // Close the scanner
        input.close();
    }
}*/
/* 
import java.util.Scanner;

public class pengiramarkah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter item details
        System.out.print("Enter the item name: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        // Display the discount menu
        System.out.println("Choose a discount rate based on the color code:");
        System.out.println("1. Red (10%)");
        System.out.println("2. Blue (20%)");
        System.out.println("3. Green (30%)");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        // Initialize the discount rate
        double discountRate = 0.0;
        switch (choice) {
            case 1:
                discountRate = 0.10;
                break;
            case 2:
                discountRate = 0.20;
                break;
            case 3:
                discountRate = 0.30;
                break;
            default:
                System.out.println("Invalid choice! No discount will be applied.");
                break;
        }

        // Calculate total price, discount amount, and final price
        double totalPrice = pricePerItem * quantity;
        double discountAmount = totalPrice * discountRate;
        double finalPrice = totalPrice - discountAmount;

        // Display the order details
        System.out.println("\nOrder Details:");
        System.out.println("Item Name: " + itemName);
        System.out.println("Price Per Item: $" + pricePerItem);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Discount Rate: " + (discountRate * 100) + "%");
        System.out.println("Discount Amount: $" + discountAmount);
        System.out.println("Final Price After Discount: $" + finalPrice);

        // Close the scanner
        scanner.close();
    }
}*/
/*
import java.util.Scanner;

public class pengiramarkah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input your first name: ");
        String fName = input.nextLine();

        System.out.print("Input your last name: "); 
        String lName = input.nextLine();

        System.out.println( "\n" +"Hello");
        System.out.print(fName + " " + lName);

        input.close();
    }}*/
/* 
    public class pengiramarkah {
        public static void main(String[] args) {
            System.out.print("Here are some Calculations");
            System.out.print("-5 + 8 * 6" + "\t" + ": 43");
            System.out.print("(55 + 9) % 9" + "\t" + ": 1");
            System.out.print("20 + -3 * 5 / 8" + "\t" + ": 19");
            System.out.print("5 + 15 / 3 * 2 - 8 % 3 " + ": 14");

        }}
 */



        
    



