import java.util.Scanner;

public class part1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Employee 1 Output and Input
        System.out.println("Enter information for employee 1:");
        System.out.print("First name: ");
        String firstName1 = scnr.nextLine();

        System.out.print("Last name: ");
        String lastName1 = scnr.nextLine();

        System.out.print("Phone Number: ");
        String phoneNumber1 = scnr.nextLine();

        System.out.print("Year of Hiring: ");
        int yearOfHiring1 = scnr.nextInt();
        scnr.nextLine(); // consume newline left-over

        System.out.print("Position (Manager/Kitchen Staff/Counter Help): ");
        String position1 = scnr.nextLine();

        System.out.print("Wage Rate per hour: ");
        double wageRatePerHour1 = scnr.nextDouble();

        System.out.print("Weekly Hours: ");
        int weeklyHours1 = scnr.nextInt();
        scnr.nextLine(); // consume newline left-over

        // Employee 2 Output and Input
        System.out.println();
        System.out.println("Enter information for employee 2:");
        System.out.print("First name: ");
        String firstName2 = scnr.nextLine();

        System.out.print("Last name: ");
        String lastName2 = scnr.nextLine();

        System.out.print("Phone Number: ");
        String phoneNumber2 = scnr.nextLine();

        System.out.print("Year of Hiring: ");
        int yearOfHiring2 = scnr.nextInt();
        scnr.nextLine(); // consume newline left-over

        System.out.print("Position (Manager/Kitchen Staff/Counter Help): ");
        String position2 = scnr.nextLine();

        System.out.print("Wage Rate per hour: ");
        double wageRatePerHour2 = scnr.nextDouble();

        System.out.print("Weekly Hours: ");
        int weeklyHours2 = scnr.nextInt();
        scnr.nextLine(); // consume newline left-over

        // Employee 3 Output and Input
        System.out.println();
        System.out.println("Enter information for employee 3:");
        System.out.print("First name: ");
        String firstName3 = scnr.nextLine();

        System.out.print("Last name: ");
        String lastName3 = scnr.nextLine();

        System.out.print("Phone Number: ");
        String phoneNumber3 = scnr.nextLine();

        System.out.print("Year of Hiring: ");
        int yearOfHiring3 = scnr.nextInt();
        scnr.nextLine(); // consume newline left-over

        System.out.print("Position (Manager/Kitchen Staff/Counter Help): ");
        String position3 = scnr.nextLine();

        System.out.print("Wage Rate per hour: ");
        double wageRatePerHour3 = scnr.nextDouble();

        System.out.print("Weekly Hours: ");
        int weeklyHours3 = scnr.nextInt();
        scnr.nextLine(); // consume newline left-over

        // Customer 1 Output and Input
        System.out.println();
        System.out.println("Enter information for customer 1:");
        System.out.print("First name: ");
        String FIRSTNAME1 = scnr.nextLine();

        System.out.print("Last name: ");
        String LASTNAME1 = scnr.nextLine();

        System.out.print("Day/Time of the order (M/T/W/R/F/S/SD): ");
        String orderDay1 = scnr.nextLine();

        System.out.print("Phone Number (xxx) xxx-xxxx Format: ");
        String digits1 = scnr.nextLine();

        System.out.print("Order Type (Pick Up/Delivery): ");
        String orderType1 = scnr.nextLine();

        System.out.print("Online Order (Yes/No): ");
        String onlineOrder1 = scnr.nextLine();

        System.out.print("Ticket Number: ");
        int ticketNumber1 = scnr.nextInt();

        System.out.print("Number of pizzas ordered: ");
        int numberOfPizzas1 = scnr.nextInt();
        scnr.nextLine(); // consume newline left-over

        System.out.print("Pizza Type (Plain/Meat): ");
        String pizzaType1 = scnr.nextLine();

        System.out.print("Pizza Size (Large/Small): ");
        String pizzaSize1 = scnr.nextLine();

        System.out.print("Pizza Price in dollars: ");
        double pizzaPrice1 = scnr.nextDouble();

        System.out.print("Cutting Style (Square/Regular): ");
        String cuttingStyle1 = scnr.nextLine();
        scnr.nextLine();

        System.out.print("Drink(s) (3$ for each): ");
        double drinks1 = scnr.nextDouble();

        System.out.print("Tip (10%, 15%, 20%): ");
        double tip1 = scnr.nextDouble();
        scnr.nextLine();

        System.out.print("Allergies (Yes/No): ");
        String allergies1 = scnr.nextLine();

        // Customer 2 Output and Input
        System.out.println();
        System.out.println("Enter information for customer 2:");
        System.out.print("First name: ");
        String FIRSTNAME2 = scnr.nextLine();

        System.out.print("Last name: ");
        String LASTNAME2 = scnr.nextLine();

        System.out.print("Day/Time of the order (M/T/W/R/F/S/SD): ");
        String orderDay2 = scnr.nextLine();

        System.out.print("Phone Number: ");
        String digits2 = scnr.nextLine();

        System.out.print("Order Type (Pick Up/Delivery): ");
        String orderType2 = scnr.nextLine();

        System.out.print("Online Order (Yes/No): ");
        String onlineOrder2 = scnr.nextLine();

        System.out.print("Ticket Number: ");
        int ticketNumber2 = scnr.nextInt();

        System.out.print("Number of pizzas ordered: ");
        int numberOfPizzas2 = scnr.nextInt();
        scnr.nextLine(); // consume newline left-over

        System.out.print("Pizza Type (Plain/Meat): ");
        String pizzaType2 = scnr.nextLine();

        System.out.print("Pizza Size (Large/Small): ");
        String pizzaSize2 = scnr.nextLine();

        System.out.print("Pizza Price in dollars: ");
        double pizzaPrice2 = scnr.nextDouble();

        System.out.print("Cutting Style (Square/Regular): ");
        String cuttingStyle2 = scnr.nextLine();
        scnr.nextLine();

        System.out.print("Drink(s) (3$ for each): ");
        double drinks2 = scnr.nextDouble();

        System.out.print("Tip (10%, 15%, 20%): ");
        double tip2 = scnr.nextDouble();
        scnr.nextLine();

        System.out.print("Allergies (Yes/No): ");
        String allergies2 = scnr.nextLine();

        // Customer 3 Output and Input
        System.out.println();
        System.out.println("Enter information for customer 3:");
        System.out.print("First name: ");
        String FIRSTNAME3 = scnr.nextLine();

        System.out.print("Last name: ");
        String LASTNAME3 = scnr.nextLine();

        System.out.print("Day/Time of the order (M/T/W/R/F/S/SD): ");
        String orderDay3 = scnr.nextLine();

        System.out.print("Phone Number: ");
        String digits3 = scnr.nextLine();

        System.out.print("Order Type (Pick Up/Delivery): ");
        String orderType3 = scnr.nextLine();

        System.out.print("Online Order (Yes/No): ");
        String onlineOrder3 = scnr.nextLine();

        System.out.print("Ticket Number: ");
        int ticketNumber3 = scnr.nextInt();

        System.out.print("Number of pizzas ordered: ");
        int numberOfPizzas3 = scnr.nextInt();
        scnr.nextLine(); // consume newline left-over

        System.out.print("Pizza Type (Plain/Meat): ");
        String pizzaType3 = scnr.nextLine();

        System.out.print("Pizza Size (Large/Small): ");
        String pizzaSize3 = scnr.nextLine();

        System.out.print("Pizza Price in dollars: ");
        double pizzaPrice3 = scnr.nextDouble();

        System.out.print("Cutting Style (Square/Regular): ");
        String cuttingStyle3 = scnr.nextLine();
        scnr.nextLine();

        System.out.print("Drink(s) (3$ for each): ");
        double drinks3 = scnr.nextDouble();

        System.out.print("Tip (10%, 15%, 20%): ");
        double tip3 = scnr.nextDouble();
        scnr.nextLine();

        System.out.print("Allergies (Yes/No): ");
        String allergies3 = scnr.nextLine();

        // Ratings
        System.out.println();
        System.out.print("Customer #1, Server #1: ");
        double rating1 = scnr.nextDouble();

        System.out.print("Customer #1, Server #2: ");
        double rating2 = scnr.nextDouble();

        System.out.print("Customer #1, Server #3: ");
        double rating3 = scnr.nextDouble();

        System.out.print("Customer #2, Server #1: ");
        double rating4 = scnr.nextDouble();

        System.out.print("Customer #2, Server #2: ");
        double rating5 = scnr.nextDouble();

        System.out.print("Customer #2, Server #3: ");
        double rating6 = scnr.nextDouble();

        System.out.print("Customer #3, Server #1: ");
        double rating7 = scnr.nextDouble();

        System.out.print("Customer #3, Server #2: ");
        double rating8 = scnr.nextDouble();

        System.out.print("Customer #3, Server #3: ");
        double rating9 = scnr.nextDouble();

        // Employee Table
        System.out.println();
        System.out.println("Employee Information");
        System.out.println(
                "Employee # | Name        | Phone         | Year of Hiring | Position | Wage Rate/hr | Weekly Hours |");
        System.out.println(
                "--------------------------------------------------------------------------------------------------------");
        System.out.println("1          | " + firstName1 + " " + lastName1 + " | " + phoneNumber1 + "    | "
                + yearOfHiring1 + "           | " + position1 + "  | " + wageRatePerHour1 + "         | " + weeklyHours1
                + "           |");
        System.out.println("2          | " + firstName2 + " " + lastName2 + " | " + phoneNumber2 + "    | "
                + yearOfHiring2 + "           | " + position2 + "  | " + wageRatePerHour2 + "         | " + weeklyHours2
                + "           |");
        System.out.println("3          | " + firstName3 + " " + lastName3 + " | " + phoneNumber3 + "    | "
                + yearOfHiring3 + "           | " + position3 + "  | " + wageRatePerHour3 + "         | " + weeklyHours3
                + "           |");
        System.out.println(
                "--------------------------------------------------------------------------------------------------------");

        // Customer Table
        System.out.println();
        System.out.println("Coustomer Information");
        System.out.println("Customer # | Name        | Phone         | Order Day + Time | Order Type | Online Order |");
        System.out.println(
                "--------------------------------------------------------------------------------------------------------");
        System.out.println("1          | " + FIRSTNAME1 + " " + LASTNAME1 + " | " + digits1 + "    | " + orderDay1
                + "           | " + orderType1 + "  | " + onlineOrder1 + "          |");
        System.out.println("2          | " + FIRSTNAME2 + " " + LASTNAME2 + " | " + digits2 + "    | " + orderDay2
                + "           | " + orderType2 + "  | " + onlineOrder2 + "          |");
        System.out.println("3          | " + FIRSTNAME3 + " " + LASTNAME3 + " | " + digits3 + "    | " + orderDay3
                + "           | " + orderType3 + "  | " + onlineOrder3 + "          |");
        System.out.println(
                "--------------------------------------------------------------------------------------------------------");

        System.out.println();
        System.out.println("Coustomer Order Details");
        System.out.println(
                "Customer # | Ticket #           | Number of Pizzas        | Pizza Type  | Pizza Size  | Cutting Style | Drinks | Tip | Allergies |");
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("1          | " + ticketNumber1 + "                | " + numberOfPizzas1
                + "                       | " + pizzaType1 + "       | " + pizzaSize1 + "      | " + cuttingStyle1
                + "             | " + drinks1 + "     | " + tip1 + "  | " + allergies1 + "        |");
        System.out.println("2          | " + ticketNumber2 + "                | " + numberOfPizzas2
                + "                       | " + pizzaType2 + "       | " + pizzaSize2 + "      | " + cuttingStyle2
                + "             | " + drinks2 + "     | " + tip2 + "  | " + allergies2 + "        |");
        System.out.println("3          | " + ticketNumber3 + "                | " + numberOfPizzas3
                + "                       | " + pizzaType3 + "        | " + pizzaSize3 + "      | " + cuttingStyle3
                + "             | " + drinks3 + "     | " + tip3 + "  | " + allergies3 + "        | ");
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------------------");

        // Ratings Table
        System.out.println();
        System.out.println("Sever Ratings");
        System.out.println("Customer # | Server #1 | Server #2 | Server #3 |");
        System.out.println("--------------------------------------------------------");
        System.out.println("1          | " + rating1 + " stars | " + rating2 + " stars | " + rating3 + " stars |");
        System.out.println("2          | " + rating4 + " stars | " + rating5 + " stars | " + rating6 + " stars |");
        System.out.println("3          | " + rating7 + " stars | " + rating8 + " stars | " + rating9 + " stars |");
        System.out.println("--------------------------------------------------------");
    }
}