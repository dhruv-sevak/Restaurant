import java.util.Scanner;

public class part6 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Employee[] employeeList = new Employee[100];
        Customer[] customerList = new Customer[100];

        // # of Employees?
        System.out.print("How many employees do you have?: ");
        int employees = scnr.nextInt();
        int employeeCnt = 1;
        scnr.nextLine();
        // Array Cell Increment
        for (int i = 0; i < employeeList.length; i++) {
            employeeList[i] = new Employee();
        }

        // Input Employee Loop
        System.out.println();
        for (int i = 0; i < employees; i++) {
            System.out.println("Enter information for employee " + employeeCnt + ": ");
            employeeCnt++;
            System.out.print("Full Name: ");
            String name = scnr.nextLine();
            // System.out.println("testing*********************** " + name);
            employeeList[i].setName(name);
            scnr.next(); // seperate lines
            System.out.print("Phone Number: ");
            String phone = scnr.nextLine();
            employeeList[i].setPhone(phone);
            scnr.next(); // seperate lines
            System.out.print("Year of Hiring: ");
            int yearOfHire = scnr.nextInt();
            employeeList[i].setYears(yearOfHire);
            System.out.print("Position (Manager/Kitchen Staff/Counter Help): ");
            String position = scnr.nextLine();
            employeeList[i].setPosition(position);
            scnr.next(); // seperate lines
            System.out.print("Wage Rate per hour: ");
            double wage = scnr.nextDouble();
            employeeList[i].setWage(wage);
            System.out.print("Weekly Hours: ");
            int hours = scnr.nextInt();
            employeeList[i].setWeeks(hours);
            System.out.println();
        }

        for (int i = 0; i < Employee.employeeCnt; i++) {
            employeeList[i].printEmployeeTable();
        }

        // # of Customer?
        System.out.print("How many customerss do you have?: ");
        int customers = scnr.nextInt();
        int customerCnt = 1;

        // Array Cell Increment
        for (int i = 0; i < customerList.length; i++) {
            customerList[i] = new Customer();
        }

        // Loop for arrays for Customers
        System.out.println();
        for (int i = 0; i < customers; i++) {
            System.out.println("Enter information for customer " + customerCnt + ": ");
            customerCnt++;
            System.out.println("Special Promotion: Buy 5 PTZZA, Get 1 pizza for FREE!");
            System.out.print("Full Name: ");
            String name = scnr.nextLine();
            customerList[i].setName(name);
            scnr.next(); // seperate lines
            System.out.print("Phone Number: ");
            String phoneNumber = scnr.nextLine();
            customerList[i].setPhone(phoneNumber);
            scnr.next(); // seperate lines
            System.out.print("Day/Time of the order (M/T/W/R/F/S/SD): ");
            String orderDay = scnr.nextLine();
            customerList[i].setDay(orderDay);
            scnr.next(); // seperate lines
            System.out.print("Order Type (Pick Up/Delivery): ");
            String orderType = scnr.nextLine();
            customerList[i].setPizzaType(orderType);
            scnr.next(); // seperate lines
            System.out.print("Online Order (Yes/No): ");
            String onlineOrder = scnr.nextLine();
            customerList[i].setOnline(onlineOrder);
            scnr.next(); // seperate lines
            System.out.print("Ticket Number: ");
            int ticketNumber = scnr.nextInt();
            customerList[i].setTicket(ticketNumber);
            System.out.print("Number of pizzas ordered: ");
            int numberOfPizzas = scnr.nextInt();
            customerList[i].setPizzas(numberOfPizzas);
            scnr.nextLine(); // consume newline left-over
            System.out.print("Pizza Type (Plain/Meat): ");
            String pizzaType = scnr.nextLine();
            customerList[i].setPizzaType(pizzaType);
            System.out.print("Pizza Size (Large/Small): ");
            String pizzaSize = scnr.nextLine();
            customerList[i].setSize(pizzaSize);
            System.out.print("Pizza Price in dollars: ");
            double pizzaPrice = scnr.nextDouble();
            customerList[i].setPizzaPrice(pizzaPrice);
            System.out.print("Cutting Style (Square/Regular): ");
            String cuttingStyle = scnr.nextLine();
            customerList[i].setStyle(cuttingStyle);
            scnr.nextLine();
            System.out.print("Drink(s) (3$ for each): ");
            double drinks = scnr.nextDouble();
            customerList[i].setDrinks(drinks);
            System.out.print("Tip (10%, 15%, 20%): ");
            double tip = scnr.nextDouble();
            customerList[i].setTip(tip);
            scnr.nextLine();
            System.out.print("Allergies (Yes/No): ");
            String allergies = scnr.nextLine();
            customerList[i].setAllergies(allergies);
            System.out.println();
        }
    }
}