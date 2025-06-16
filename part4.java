import java.util.Scanner;

public class Restuarant {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Arrays for Employees
        String[] name = new String[100];
        String[] phone = new String[100];
        String[] position = new String[100];
        int[] yearOfHire = new int[100];
        double[] wage = new double[100];
        int[] hours = new int[100];

        // # of Employees?
        System.out.print("How many employees do you have?: ");
        int employees = scnr.nextInt();
        int employeeCnt = 1;

        // Loop for arrays for Employees
        System.out.println();
        for (int i = 0; i < employees; i++) {
            System.out.println("Enter information for employee " + employeeCnt + ": ");
            employeeCnt++;
            System.out.print("Full Name: ");
            name[i] = scnr.nextLine();
            scnr.next(); // seperate lines
            System.out.print("Phone Number: ");
            phone[i] = scnr.nextLine();
            scnr.next(); // seperate lines
            System.out.print("Year of Hiring: ");
            yearOfHire[i] = scnr.nextInt();
            System.out.print("Position (Manager/Kitchen Staff/Counter Help): ");
            position[i] = scnr.nextLine();
            scnr.next(); // seperate lines
            System.out.print("Wage Rate per hour: ");
            wage[i] = scnr.nextDouble();
            System.out.print("Weekly Hours: ");
            hours[i] = scnr.nextInt();
            System.out.println();
        }

        // Arrays for Customers
        String[] customerName = new String[100];
        String[] customerPhone = new String[100];
        String[] orderDay = new String[100];
        String[] orderType = new String[100];
        String[] onlineOrder = new String[100];
        int[] ticketNumber = new int[100];
        int[] numberOfPizzas = new int[100];
        String[] pizzaType = new String[100];
        String[] pizzaSize = new String[100];
        double[] pizzaPrice = new double[100];
        String[] cuttingStyle = new String[100];
        double[] drinks = new double[100];
        double[] tip = new double[100];
        String[] allergies = new String[100];

        // # of Customers?
        System.out.print("How many customers do you have?: ");
        int customers = scnr.nextInt();
        int customerCnt = 1;

        // Loop for arrays for Customers
        System.out.println();
        for (int i = 0; i < customers; i++) {
            System.out.println("Enter information for customer " + customerCnt + ": ");
            customerCnt++;
            System.out.println("Special Promotion: Buy 5 PTZZA, Get 1 pizza for FREE!");
            System.out.print("Full Name: ");
            customerName[i] = scnr.nextLine();
            scnr.next(); // seperate lines
            System.out.print("Phone Number: ");
            customerPhone[i] = scnr.nextLine();
            scnr.next(); // seperate lines
            System.out.print("Day/Time of the order (M/T/W/R/F/S/SD): ");
            orderDay[i] = scnr.nextLine();
            scnr.next(); // seperate lines
            System.out.print("Order Type (Pick Up/Delivery): ");
            orderType[i] = scnr.nextLine();
            scnr.next(); // seperate lines
            System.out.print("Online Order (Yes/No): ");
            onlineOrder[i] = scnr.nextLine();
            scnr.next(); // seperate lines
            System.out.print("Ticket Number: ");
            ticketNumber[i] = scnr.nextInt();
            System.out.print("Number of pizzas ordered: ");
            numberOfPizzas[i] = scnr.nextInt();
            scnr.nextLine(); // consume newline left-over
            System.out.print("Pizza Type (Plain/Meat): ");
            pizzaType[i] = scnr.nextLine();
            System.out.print("Pizza Size (Large/Small): ");
            pizzaSize[i] = scnr.nextLine();
            System.out.print("Pizza Price in dollars: ");
            pizzaPrice[i] = scnr.nextDouble();
            System.out.print("Cutting Style (Square/Regular): ");
            cuttingStyle[i] = scnr.nextLine();
            scnr.nextLine();
            System.out.print("Drink(s) (3$ for each): ");
            drinks[i] = scnr.nextDouble();
            System.out.print("Tip (10%, 15%, 20%): ");
            tip[i] = scnr.nextDouble();
            scnr.nextLine();
            System.out.print("Allergies (Yes/No): ");
            allergies[i] = scnr.nextLine();
            System.out.println();
        }

        // Array for Staff Rating
        double[][] ratings = new double[100][100];

        // Loops for Ratings
        for (int i = 0; i < customers; i++) {
            for (int j = 0; j < employees; j++) {
                System.out.print("Customer #" + customerCnt + ", " + "Sever #" + employeeCnt + ": ");
                employeeCnt++;
                ratings[i][j] = scnr.nextDouble();
            }
            System.out.println();
            customerCnt = 2;
            employeeCnt = 1;
            for (int j = 0; j < employees; j++) {
                System.out.print("Customer #" + customerCnt + ", " + "Sever #" + employeeCnt + ": ");
                employeeCnt++;
                ratings[i][j] = scnr.nextDouble();
            }
            System.out.println();
            customerCnt = 3;
            employeeCnt = 1;
            for (int j = 0; j < employees; j++) {
                System.out.print("Customer #" + customerCnt + ", " + "Sever #" + employeeCnt + ": ");
                employeeCnt++;
                ratings[i][j] = scnr.nextDouble();
            }
            System.out.println();
            break;
        }

        // Employee Table
        System.out.println();
        System.out.println("Employee Information");
        System.out.println(
                "Employee # | Name        | Phone         | Year of Hiring | Position | Wage Rate/hr | Weekly Hours |");
        System.out.println(
                "--------------------------------------------------------------------------------------------------------");
        System.out.println("1          | " + firstName1 + " " + lastName1 + " | " + phoneNumber1 + "    | "
                + yearOfHiring1 + "           | " + position1 + "  | " + "$" + wageRatePerHour1
                + "         | "
                + weeklyHours1 + "           |");
        System.out.println("2          | " + firstName2 + " " + lastName2 + " | " + phoneNumber2 + "    | "
                + yearOfHiring2 + "           | " + position2 + "  | " + "$" + wageRatePerHour2
                + "         | "
                + weeklyHours2 + "           |");
        System.out.println("3          | " + firstName3 + " " + lastName3 + " | " + phoneNumber3 + "    | "
                + yearOfHiring3 + "           | " + position3 + "  | " + "$" + wageRatePerHour3
                + "         | "
                + weeklyHours3 + "           |");
        System.out.println(
                "--------------------------------------------------------------------------------------------------------");

        // Customer Table
        System.out.println();
        System.out.println("Coustomer Information");
        System.out.println(
                "Customer # | Name        | Phone         | Order Day + Time | Order Type | Online Order |");
        System.out.println(
                "--------------------------------------------------------------------------------------------------------");
        System.out.println(
                "1          | " + FIRSTNAME1 + " " + LASTNAME1 + " | " + digits1 + "    | " + orderDay1
                        + "           | " + orderType1 + "  | " + onlineOrder1 + "          |");
        System.out.println(
                "2          | " + FIRSTNAME2 + " " + LASTNAME2 + " | " + digits2 + "    | " + orderDay2
                        + "           | " + orderType2 + "  | " + onlineOrder2 + "          |");
        System.out.println(
                "3          | " + FIRSTNAME3 + " " + LASTNAME3 + " | " + digits3 + "    | " + orderDay3
                        + "           | " + orderType3 + "  | " + onlineOrder3 + "          |");
        System.out.println(
                "--------------------------------------------------------------------------------------------------------");

        System.out.println();
        System.out.println("Coustomer Order Details");
        System.out.println(
                "Customer # | Ticket #           | Number of Pizzas        | Pizza Type  | Pizza Size  | Pizza Price | Cutting Style | Drinks | Tip | Allergies |");
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("1          | " + ticketNumber1 + "                | " + numberOfPizzas1
                + "                       | " + pizzaType1 + "       | " + pizzaSize1 + "      | " + "$"
                + pizzaSize1
                + "      | " + cuttingStyle1 + "             | " + "$" + drinks1 + "     | " + tip1
                + "  | "
                + allergies1 + "        |");
        System.out.println("2          | " + ticketNumber2 + "                | " + numberOfPizzas2
                + "                       | " + pizzaType2 + "       | " + pizzaSize2 + "      | " + "$"
                + pizzaSize2
                + "      | " + cuttingStyle2 + "             | " + "$" + drinks2 + "     | " + tip2
                + "  | "
                + allergies2 + "        |");
        System.out.println("3          | " + ticketNumber3 + "                | " + numberOfPizzas3
                + "                       | " + pizzaType3 + "        | " + pizzaSize3 + "      | "
                + "$" + pizzaSize3
                + "      | " + cuttingStyle3 + "             | " + "$" + drinks3 + "     | " + tip3
                + "  | "
                + allergies3 + "        | ");
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------------------");

        // Ratings Table
        System.out.println();
        System.out.println("Sever Ratings");
        System.out.println("Customer # | Server #1 | Server #2 | Server #3 |");
        System.out.println("--------------------------------------------------------");
        System.out.println(
                "1          | " + rating1 + " stars | " + rating2 + " stars | " + rating3 + " stars |");
        System.out.println(
                "2          | " + rating4 + " stars | " + rating5 + " stars | " + rating6 + " stars |");
        System.out.println(
                "3          | " + rating7 + " stars | " + rating8 + " stars | " + rating9 + " stars |");
        System.out.println("--------------------------------------------------------");

        // Employee 1 Experience
        int currentYear = 2024;
        int totalYears1 = currentYear - yearOfHiring1;
        System.out.println();
        System.out.println("Employee #1:");
        System.out.println("Experience: " + totalYears1);
        // Employee 1 Weekly Pay
        double weeklyPay1 = wageRatePerHour1 * weeklyHours1;
        System.out.print("Weekly Pay: ");
        System.out.printf("%.2f\n", weeklyPay1);
        // Employee 1 Annual Salary
        double annualSal1 = weeklyPay1 * 52;
        System.out.print("Annaul Salary: ");
        System.out.printf("%.2f\n", annualSal1);
        // Employee 1 Annual Tax
        double annualTax1 = 0.05 * annualSal1;
        System.out.print("Annaul Tax: ");
        System.out.printf("%.2f\n", annualTax1);
        // Employee 1 Net Income
        double netSal1 = annualSal1 - annualTax1;
        System.out.print("Net Salary: ");
        System.out.printf("%.2f\n", netSal1);

        // Employee 2 Experience
        int totalYears2 = currentYear - yearOfHiring2;
        System.out.println();
        System.out.println("Employee #2:");
        System.out.println("Experience: " + totalYears2);
        // Employee 2 Weekly Pay
        double weeklyPay2 = wageRatePerHour2 * weeklyHours2;
        System.out.print("Weekly Pay: ");
        System.out.printf("%.2f\n", weeklyPay2);
        // Employee 2 Annual Salary
        double annualSal2 = weeklyPay2 * 52;
        System.out.print("Annaul Salary: ");
        System.out.printf("%.2f\n", annualSal2);
        // Employee 2 Annual Tax
        double annualTax2 = 0.05 * annualSal2;
        System.out.print("Annaul Tax: ");
        System.out.printf("%.2f\n", annualTax2);
        // Employee 2 Net Income
        double netSal2 = annualSal2 - annualTax2;
        System.out.print("Net Salary: ");
        System.out.printf("%.2f\n", netSal2);

        // Employee 3 Experience
        int totalYears3 = currentYear - yearOfHiring3;
        System.out.println();
        System.out.println("Employee #3:");
        System.out.println("Experience: " + totalYears3);
        // Employee 3 Weekly Pay
        double weeklyPay3 = wageRatePerHour3 * weeklyHours3;
        System.out.print("Weekly Pay: ");
        System.out.printf("%.2f\n", weeklyPay3);
        // Employee 3 Annual Salary
        double annualSal3 = weeklyPay3 * 52;
        System.out.print("Annaul Salary: ");
        System.out.printf("%.2f\n", annualSal3);
        // Employee 3 Annual Tax
        double annualTax3 = 0.05 * annualSal3;
        System.out.print("Annaul Tax: ");
        System.out.printf("%.2f\n", annualTax3);
        // Employee 3 Net Income
        double netSal3 = annualSal3 - annualTax3;
        System.out.print("Net Salary: ");
        System.out.printf("%.2f\n", netSal3);

        // Average Ratings
        System.out.println();
        // Average Ratings for Employee 1
        double avgRating1 = (rating1 + rating2 + rating3) / 3;
        System.out.print("Average Ratings for Server #1: ");
        System.out.printf("%.2f\n", avgRating1);
        System.out.print(" stars\n");
        // Average Ratings for Employee 2
        double avgRating2 = (rating4 + rating5 + rating6) / 3;
        System.out.print("Average Ratings for Server #2: ");
        System.out.printf("%.2f\n", avgRating2);
        System.out.print(" stars\n");
        // Average Ratings for Employee 3
        double avgRating3 = (rating7 + rating8 + rating9) / 3;
        System.out.print("Average Ratings for Server #3: ");
        System.out.printf("%.2f\n", avgRating3);
        System.out.print(" stars\n");

        // Customer 1 Total Order Before Tax
        System.out.println();
        double totalPizzaPrice1 = pizzaPrice1 * numberOfPizzas1;
        double totalPriceWithDrinks1 = totalPizzaPrice1 + drinks1;
        System.out.print("Total of thr Order Before Tax: $");
        System.out.printf("%.2f\n", totalPriceWithDrinks1);
        // Customer 1 Total Tax
        double totalTax1 = totalPriceWithDrinks1 * 0.0625;
        System.out.print("Total Tax (6.25% of the Meal's Sales Price): $");
        System.out.printf("%.2f", totalTax1);
        // Tip Given
        double totalTip1 = (totalPriceWithDrinks1 * tip1 / 100);
        System.out.print("Tip (Based on the Given Tip Percentage): $");
        System.out.printf("%.2f", totalTip1);
        // Total Order With Tax and Tip
        double totalWithTaxandTip1 = totalPriceWithDrinks1 + totalTax1 + totalTip1;
        System.out.print("Total of the Order Including Tax and Tip: $");
        System.out.printf("%.2f\n", totalWithTaxandTip1);
        // Customer 2 Total Order Before Tax
        System.out.println();
        double totalPizzaPrice2 = pizzaPrice2 * numberOfPizzas2;
        double totalPriceWithDrinks2 = totalPizzaPrice2 + drinks2;
        System.out.println("Total of thr Order Before Tax: $");
        System.out.printf("%.2f\n", totalPriceWithDrinks2);
        // Customer 2 Total Tax
        double totalTax2 = totalPriceWithDrinks2 * 0.0625;
        System.out.print("Total Tax (6.25% of the Meal's Sales Price): $");
        System.out.printf("%.2f", totalTax2);
        // Tip Given
        double totalTip2 = (totalPriceWithDrinks2 * tip2 / 100);
        System.out.print("Tip (Based on the Given Tip Percentage): $");
        System.out.printf("%.2f", totalTip2);
        // Total Order With Tax and Tip
        double totalWithTaxandTip2 = totalPriceWithDrinks2 + totalTax2 + totalTip2;
        System.out.print("Total of the Order Including Tax and Tip: $");
        System.out.printf("%.2f\n", totalWithTaxandTip2);
        // Customer 3 Total Order Before Tax
        System.out.println();
        double totalPizzaPrice3 = pizzaPrice3 * numberOfPizzas3;
        double totalPriceWithDrinks3 = totalPizzaPrice3 + drinks3;
        System.out.println("Total of thr Order Before Tax: $");
        System.out.printf("%.2f\n", totalPriceWithDrinks3);
        // Customer 3 Total Tax
        double totalTax3 = totalPriceWithDrinks3 * 0.0625;
        System.out.print("Total Tax (6.25% of the Meal's Sales Price): $");
        System.out.printf("%.2f", totalTax3);
        // Tip Given
        double totalTip3 = (totalPriceWithDrinks3 * tip3 / 100);
        System.out.print("Tip (Based on the Given Tip Percentage): $");
        System.out.printf("%.2f", totalTip3);
        // Total Order With Tax and Tip
        double totalWithTaxandTip3 = totalPriceWithDrinks3 + totalTax3 + totalTip3;
        System.out.print("Total of the Order Including Tax and Tip: $");
        System.out.printf("%.2f\n", totalWithTaxandTip3);

        // Total Annual Salary of Employees
        double totalSalofAllemployees = annualSal1 + annualSal2 + annualSal3;
        System.out.println();
        System.out.print("Total Annual Salary of Employees: $");
        System.out.printf("%.1f\n", totalSalofAllemployees);

        // Average Order Value
        System.out.println();
        double avgOrderValue = (totalWithTaxandTip1 + totalWithTaxandTip2 + totalWithTaxandTip3) / 3;
        System.out.print("Average Order Value: $");
        System.out.printf("%.2f\n", avgOrderValue);

        // Average Tips
        System.out.println();
        double avgTips = (totalTip1 + totalTip2 + totalTip3) / 3;
        System.out.print("Average Tips: $");
        System.out.printf("%.2f\n", avgTips);

        // Weekly Income Variables
        double pay1;
        double pay2;
        double pay3;
        // Weekly Pay
        pay1 = wageRatePerHour1 * weeklyHours1;
        pay2 = wageRatePerHour2 * weeklyHours2;
        pay3 = wageRatePerHour3 * weeklyHours3;
        // Overtime Calculation
        if (weeklyHours1 <= 40) {
            pay1 = wageRatePerHour1 * weeklyHours1;
        }
        if (weeklyHours2 <= 40) {
            pay2 = wageRatePerHour2 * weeklyHours2;
        }
        if (weeklyHours3 <= 40) {
            pay3 = wageRatePerHour3 * weeklyHours3;
        } else if (weeklyHours1 > 40) {
            pay1 = wageRatePerHour1 * 40 + 1.5 * wageRatePerHour1 * (weeklyHours1 - 40);
        } else if (weeklyHours2 > 40) {
            pay2 = wageRatePerHour2 * 40 + 1.5 * wageRatePerHour2 * (weeklyHours2 - 40);
        } else if (weeklyHours3 > 40) {
            pay3 = wageRatePerHour3 * 40 + 1.5 * wageRatePerHour3 * (weeklyHours3 - 40);
        }
        // Print Statments for Weekly Incomes
        System.out.println();
        System.out.print("Weekly Income for " + firstName1 + " " + lastName1 + ": $");
        System.out.printf("%.2f\n", pay1);
        System.out.print("Weekly Income for " + firstName2 + " " + lastName2 + ": $");
        System.out.printf("%.2f\n", pay2);
        System.out.print("Weekly Income for " + firstName3 + " " + lastName3 + ": $");
        System.out.printf("%.2f\n", pay3);

        // Manager Increment
        int managerCnt = 1;

        System.out.println();
        System.out.println("List of Managers:");

        // If Statments for Managers
        if (position1.equals("manager")) {
            System.out.println("Manager #" + managerCnt + ": " + firstName1 + " " + lastName1);
            managerCnt++;
        }
        if (position2.equals("manager")) {
            System.out.println("Manager #" + managerCnt + ": " + firstName2 + " " + lastName2);
            managerCnt++;
        }
        if (position3.equals("manager")) {
            System.out.println("Manager #" + managerCnt + ": " + firstName3 + " " + lastName3);
            managerCnt++;
        }

        // Promotion
        System.out.println();
        if (numberOfPizzas1 == 5) {
            System.out.println("You earned a Free Pizza now.");
        } else {
            System.out.println("You need to order 5 Pizzas for this Promotion.");
        }

        if (numberOfPizzas2 == 5) {
            System.out.println("You earned a Free Pizza now.");
        } else {
            System.out.println("You need to order 5 Pizzas for this Promotion.");
        }

        if (numberOfPizzas3 == 5) {
            System.out.println("You earned a Free Pizza now.");
        } else {
            System.out.println("You need to order 5 Pizzas for this Promotion.");
        }

        // Price Before Dicount, Dicounted Price, Price after Dicount, and Total with
        // Tip, Tax, and Dicount
        // Customer 1 Discount (Before Discount)
        System.out.println();
        System.out.print("Order Total for (Before Tax): $");
        System.out.printf("%.2f\n", totalPriceWithDrinks1);
        // Discount Table
        double discount1;
        if (totalPriceWithDrinks1 >= 100) {
            System.out.println("Dicount Status: 20% dicount");
            discount1 = totalPriceWithDrinks1 * 0.20;
        } else if (totalPriceWithDrinks1 >= 75) {
            System.out.println("Dicount Status: 15% dicount");
            discount1 = totalPriceWithDrinks1 * 0.15;
        } else if (totalPriceWithDrinks1 >= 50) {
            System.out.println("Dicount Status: 10% dicount");
            discount1 = totalPriceWithDrinks1 * 0.10;
        } else {
            System.out.println("Dicount Status: 5% dicount");
            discount1 = totalPriceWithDrinks1 * 0.05;
        }
        // Customer 1 Discount (After Discount)
        double discountedPrice1 = totalPriceWithDrinks1 - discount1;
        System.out.print("Total for Customer #1's Order after Discount (Before Tax): $");
        System.out.printf("%.2f\n", discountedPrice1);
        // Total Price with Tip, Tax, and Discount
        System.out.println();
        double totalDiscount1 = discountedPrice1 + totalTip1 + totalTax1;
        System.out.print("The total including the tip, tax and the applied discount wil be: $");
        System.out.printf("%.3f\n", totalDiscount1);

        // Customer 2 Discount (Before Discount)
        System.out.println();
        System.out.print("Order Total for (Before Tax): $");
        System.out.printf("%.2f\n", totalPriceWithDrinks2);
        // Discount Table
        double discount2;
        if (totalPriceWithDrinks2 >= 100) {
            System.out.println("Dicount Status: 20% dicount");
            discount2 = totalPriceWithDrinks2 * 0.20;
        } else if (totalPriceWithDrinks2 >= 75) {
            System.out.println("Dicount Status: 15% dicount");
            discount2 = totalPriceWithDrinks2 * 0.15;
        } else if (totalPriceWithDrinks2 >= 50) {
            System.out.println("Dicount Status: 10% dicount");
            discount2 = totalPriceWithDrinks2 * 0.10;
        } else {
            System.out.println("Dicount Status: 5% dicount");
            discount2 = totalPriceWithDrinks2 * 0.05;
        }
        // Customer 2 Discount (After Discount)
        double discountedPrice2 = totalPriceWithDrinks2 - discount2;
        System.out.print("Total for Customer #2's Order after Discount (Before Tax): $");
        System.out.printf("%.2f\n", discountedPrice2);
        // Total Price with Tip, Tax, and Discount
        System.out.println();
        double totalDiscount2 = discountedPrice2 + totalTip2 + totalTax2;
        System.out.print("The total including the tip, tax and the applied discount wil be: $");
        System.out.printf("%.3f\n", totalDiscount2);

        // Customer 3 Discount (Before Discount)
        System.out.println();
        System.out.print("Order Total for (Before Tax): $");
        System.out.printf("%.2f\n", totalPriceWithDrinks3);
        // Discount Table
        double discount3;
        if (totalPriceWithDrinks3 >= 100) {
            System.out.println("Dicount Status: 20% dicount");
            discount3 = totalPriceWithDrinks3 * 0.20;
        } else if (totalPriceWithDrinks3 >= 75) {
            System.out.println("Dicount Status: 15% dicount");
            discount3 = totalPriceWithDrinks3 * 0.15;
        } else if (totalPriceWithDrinks3 >= 50) {
            System.out.println("Dicount Status: 10% dicount");
            discount3 = totalPriceWithDrinks3 * 0.10;
        } else {
            System.out.println("Dicount Status: 5% dicount");
            discount3 = totalPriceWithDrinks3 * 0.05;
        }
        // Customer 3 Discount (After Discount)
        double discountedPrice3 = totalPriceWithDrinks3 - discount3;
        System.out.print("Total for Customer #3's Order after Discount (Before Tax): $");
        System.out.printf("%.2f\n", discountedPrice3);
        // Total Price with Tip, Tax, and Discount
        System.out.println();
        double totalDiscount3 = discountedPrice3 + totalTip3 + totalTax3;
        System.out.print("The total including the tip, tax and the applied discount wil be: $");
        System.out.printf("%.3f\n", totalDiscount3);

        // Highest and Lowest Orders
        System.out.println();
        // Find Highest Order
        if ((totalDiscount1 > totalDiscount2) && (totalDiscount1 > totalDiscount3)) {
            System.out.print("Highest Order Amount: $");
            System.out.printf("%.2f\n", totalDiscount1);
        } else if ((totalDiscount2 > totalDiscount1) && (totalDiscount2 > totalDiscount3)) {
            System.out.print("Highest Order Amount: $");
            System.out.printf("%.2f\n", totalDiscount2);
        } else if ((totalDiscount3 > totalDiscount2) && (totalDiscount3 > totalDiscount1)) {
            System.out.print("Highest Order Amount: $");
            System.out.printf("%.2f\n", totalDiscount3);
        }
        // Find Lowest Order
        if ((totalDiscount1 < totalDiscount2) && (totalDiscount1 < totalDiscount3)) {
            System.out.print("Lowest Order Amount: $");
            System.out.printf("%.2f\n", totalDiscount1);
        } else if ((totalDiscount2 < totalDiscount1) && (totalDiscount2 < totalDiscount3)) {
            System.out.print("Lowest Order Amount: $");
            System.out.printf("%.2f\n", totalDiscount2);
        } else if ((totalDiscount3 < totalDiscount2) && (totalDiscount3 < totalDiscount1)) {
            System.out.print("Lowest Order Amount: $");
            System.out.printf("%.2f\n", totalDiscount3);
        }

        // Restuarant Open or Closed
        System.out.println();
        // Customer 1 Order Day and Time
        System.out.println("For the order placed:");
        // Monday
        if (orderDay1.equals("M 10AM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("M 11AM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("M 12PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("M 1PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("M 2PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("M 3PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("M 4PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("M 5PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("M 6PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("M 7PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("M 8PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("M 9PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("M 10PM")) {
            System.out.println("Restuarant is Open");
        }
        // Tuesday
        if (orderDay1.equals("T 10AM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("T 11AM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("T 12PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("T 1PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("T 2PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("T 3PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("T 4PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("T 5PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("T 6PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("T 7PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("T 8PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("T 9PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("T 10PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        }
        // Wednesday
        if (orderDay1.equals("W 10AM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("W 11AM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("W 12PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("W 1PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("W 2PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("W 3PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("W 4PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("W 5PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("W 6PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("W 7PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("W 8PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("W 9PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("W 10PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        }
        // Thursday
        if (orderDay1.equals("R 9AM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("R 10AM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("R 11AM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("R 12PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("R 1PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("R 2PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("R 3PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("R 4PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("R 5PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("R 6PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("R 7PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("R 8PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("R 9PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("R 10PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("R 11PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        }
        // Friday
        if (orderDay1.equals("F 9AM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("F 10AM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("F 11AM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("F 12PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("F 1PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("F 2PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("F 3PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("F 4PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("F 5PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("F 6PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("F 7PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("F 8PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("F 9PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("F 10PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("F 11PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        }
        // Saturday
        if (orderDay1.equals("S 9AM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("S 10AM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("S 11AM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("S 12PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("S 1PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("S 2PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("S 3PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("S 4PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("S 5PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("S 6PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("S 7PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("S 8PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("S 9PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("S 10PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("S 11PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        }
        if (orderDay1.equals("SD 12PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("SD 1PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("SD 2PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("SD 3PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("SD 4PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("SD 5PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("SD 6PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("SD 7PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("SD 8PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        } else if (orderDay1.equals("SD 9PM")) {
            System.out.println("Order 1 - Restuarant is Open");
        }

        // Customer 2 Day and Time
        // Monday
        if (orderDay2.equals("M 10AM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("M 11AM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("M 12PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("M 1PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("M 2PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("M 3PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("M 4PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("M 5PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("M 6PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("M 7PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("M 8PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("M 9PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("M 10PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        }
        // Tuesday
        if (orderDay2.equals("T 10AM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("T 11AM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("T 12PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("T 1PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("T 2PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("T 3PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("T 4PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("T 5PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("T 6PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("T 7PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("T 8PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("T 9PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("T 10PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        }
        // Wednesday
        if (orderDay2.equals("W 10AM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("W 11AM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("W 12PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("W 1PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("W 2PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("W 3PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("W 4PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("W 5PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("W 6PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("W 7PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("W 8PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("W 9PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("W 10PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        }
        // Thursday
        if (orderDay2.equals("R 9AM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("R 10AM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("R 11AM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("R 12PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("R 1PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("R 2PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("R 3PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("R 4PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("R 5PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("R 6PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("R 7PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("R 8PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("R 9PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("R 10PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("R 11PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        }
        // Friday
        if (orderDay2.equals("F 9AM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("F 10AM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("F 11AM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("F 12PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("F 1PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("F 2PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("F 3PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("F 4PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("F 5PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("F 6PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("F 7PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("F 8PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("F 9PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("F 10PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("F 11PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        }
        // Saturday
        if (orderDay2.equals("S 9AM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("S 10AM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("S 11AM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("S 12PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("S 1PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("S 2PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("S 3PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("S 4PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("S 5PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("S 6PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("S 7PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("S 8PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("S 9PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("S 10PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("S 11PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        }
        // Sunday
        if (orderDay2.equals("SD 12PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("SD 1PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("SD 2PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("SD 3PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("SD 4PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("SD 5PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("SD 6PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("SD 7PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("SD 8PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        } else if (orderDay2.equals("SD 9PM")) {
            System.out.println("Order 2 - Restuarant is Open");
        }

        // Customer 3 Order Day and Time
        // Monday
        if (orderDay3.equals("M 10AM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("M 11AM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("M 12PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("M 1PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("M 2PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("M 3PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("M 4PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("M 5PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("M 6PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("M 7PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("M 8PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("M 9PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("M 10PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        }
        // Tuesday
        if (orderDay3.equals("T 10AM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("T 11AM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("T 12PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("T 1PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("T 2PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("T 3PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("T 4PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("T 5PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("T 6PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("T 7PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("T 8PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("T 9PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("T 10PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        }
        // Wednesday
        if (orderDay3.equals("W 10AM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("W 11AM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("W 12PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("W 1PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("W 2PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("W 3PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("W 4PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("W 5PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("W 6PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("W 7PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("W 8PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("W 9PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("W 10PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        }
        // Thursday
        if (orderDay3.equals("R 9AM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("R 10AM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("R 11AM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("R 12PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("R 1PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("R 2PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("R 3PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("R 4PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("R 5PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("R 6PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("R 7PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("R 8PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("R 9PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("R 10PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("R 11PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        }
        // Friday
        if (orderDay3.equals("F 9AM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("F 10AM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("F 11AM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("F 12PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("F 1PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("F 2PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("F 3PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("F 4PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("F 5PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("F 6PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("F 7PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("F 8PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("F 9PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("F 10PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("F 11PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        }
        // Saturday
        if (orderDay3.equals("S 9AM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("S 10AM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("S 11AM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("S 12PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("S 1PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("S 2PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("S 3PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("S 4PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("S 5PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("S 6PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("S 7PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("S 8PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("S 9PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("S 10PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("S 11PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        }
        // Sunday
        if (orderDay3.equals("SD 12PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("SD 1PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("SD 2PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("SD 3PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("SD 4PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("SD 5PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("SD 6PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("SD 7PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("SD 8PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        } else if (orderDay3.equals("SD 9PM")) {
            System.out.println("Order 3 - Restuarant is Open");
        }

        // Rating Table
        System.out.println();
        // Server 1
        System.out.println("Evaluating Service Quality:");
        if (avgRating1 == 5.0) {
            System.out.println("Server #1 provided excellent service.");
        } else if ((avgRating1 <= 4.0) || (avgRating1 >= 3.0)) {
            System.out.println("Server #1 provided good service.");
        } else if ((avgRating1 <= 2.0) || (avgRating1 >= 0.0)) {
            System.out.println("Server #1 provided bad service.");
        }
        // Server 2
        if (avgRating2 == 5.0) {
            System.out.println("Server #2 provided excellent service.");
        } else if ((avgRating2 <= 4.0) || (avgRating2 >= 3.0)) {
            System.out.println("Server #2 provided good service.");
        } else if ((avgRating2 <= 2.0) || (avgRating2 >= 0.0)) {
            System.out.println("Server #2 provided bad service.");
        }
        // Server 3
        if (avgRating3 == 5.0) {
            System.out.println("Server #3 provided excellent service.");
        } else if ((avgRating3 <= 4.0) || (avgRating2 >= 3.0)) {
            System.out.println("Server #3 provided good service.");
        } else if ((avgRating3 <= 2.0) || (avgRating2 >= 0.0)) {
            System.out.println("Server #3 provided bad service.");
        }

        // Server Promotion
        System.out.println();
        // Server 1
        System.out.println("Evaluating Promotion Eligibility:");
        if (avgRating1 == 5.0) {
            System.out.println("There is a promotion for Server #1");
        } else if ((avgRating1 <= 4.0) || (avgRating1 >= 3.0)) {
            System.out.println("There is no promotion for Server #1 at this time.");
        } else if ((avgRating1 <= 2.0) || (avgRating1 >= 0.0)) {
            System.out.println("There is no promotion for Server #1 at this time.");
        }
        // Server 2
        if (avgRating2 == 5.0) {
            System.out.println("There is a promotion for Server #2");
        } else if ((avgRating2 <= 4.0) || (avgRating2 >= 3.0)) {
            System.out.println("There is no promotion for Server #2 at this time.");
        } else if ((avgRating2 <= 2.0) || (avgRating2 >= 0.0)) {
            System.out.println("There is no promotion for Server #2 at this time.");
        }
        // Server 3
        if (avgRating3 == 5.0) {
            System.out.println("There is a promotion for Server #3");
        } else if ((avgRating3 <= 4.0) || (avgRating2 >= 3.0)) {
            System.out.println("There is no promotion for Server #3 at this time.");
        } else if ((avgRating3 <= 2.0) || (avgRating2 >= 0.0)) {
            System.out.println("There is no promotion for Server #3 at this time.");
        }
    }
}