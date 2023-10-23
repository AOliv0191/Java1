import java.util.Scanner;

public class classBC2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double amount = 0;
    String order = "";

    System.out.println("======CyberBurger menu======");
    System.out.println("(1) CyberBurger");
    System.out.println("(2) Double Meat CyberBurger");
    System.out.println("(3) Triple Meat CyberBurger");
    System.out.println("(4) Jalapeno and Cheese");
    System.out.println("(5) Bacon and Cheese");
    System.out.println("(6) Salad");
    System.out.println("============================");
    System.out.println("Enter the menu item you want:");

    int menu = input.nextInt();
    input.nextLine(); 

    switch (menu) {
      case 1:
        order = "CyberBurger";
        amount = 3.99;
        break;
      case 2:
        order = "Double Meat CyberBurger";
        amount = 4.99;
        break;
      case 3:
        order = "Triple Meat CyberBurger";
        amount = 5.99;
        break;
      case 4:
        order = "Jalapeno and Cheese";
        amount = 6.99;
        break;
      case 5:
        order = "Bacon and Cheese";
        amount = 7.99;
        break;
      case 6:
        order = "Salad";
        amount = 8.99;
        break;
      default:
        System.out.println("Invalid menu choice.");
    }

    if (menu >= 1 && menu <= 3) {
      System.out.println("Would you like some cheese with that? (yes/no)");
      String cheese = input.nextLine();
      if (cheese.equalsIgnoreCase("yes")) {
        order += " with Cheese";
        amount += 0.50;
      }
    }

    double tax = (8.25 * amount) / 100;
    amount += tax;

    System.out.printf("Your order is %s. Your total is $%.2f\n", order, amount);
    input.close();
  }
}
