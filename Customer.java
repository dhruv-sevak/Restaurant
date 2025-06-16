// Customer Class
public class Customer extends Person {
    private String orderDay;
    private String orderType;
    private String onlineOrder;
    private int ticketNumber;
    private int numberOfPizzas;
    private String pizzaType;
    private String pizzaSize;
    private double pizzaPrice;
    private String cuttingStyle;
    private double drinks;
    private double tip;
    private String allergies;

    // Non-defualt Constructor For Customer
    public Customer(String name, String phoneNumber, String orderDay, String orderType, String onlineOrder,
            int ticketNumber, int numberOfPizzas, String pizzaType, String pizzaSize, double pizzaPrice,
            String cuttingStyle, double drinks, double tip, String allergies) {
        super(name, phoneNumber);
        this.orderDay = orderDay;
        this.orderType = orderType;
        this.onlineOrder = onlineOrder;
        this.ticketNumber = ticketNumber;
        this.numberOfPizzas = numberOfPizzas;
        this.pizzaType = pizzaType;
        this.pizzaSize = pizzaSize;
        this.pizzaPrice = pizzaPrice;
        this.cuttingStyle = cuttingStyle;
        this.drinks = drinks;
        this.tip = tip;
        this.allergies = allergies;
    }

    // Constructor For Customer
    public Customer() {
        super();
        this.orderDay = "";
        this.orderType = "";
        this.onlineOrder = "";
        this.ticketNumber = 0;
        this.numberOfPizzas = 0;
        this.pizzaType = "";
        this.pizzaSize = "";
        this.pizzaPrice = 0.0;
        this.cuttingStyle = "";
        this.drinks = 0.0;
        this.tip = 0.0;
        this.allergies = "";
    }

    // getters and setters...
    public void setDay(String orderDay) {
        this.orderDay = orderDay;
    }

    public String getDay() {
        return orderDay;
    }

    // getters and setters...
    public void setType(String ordertype) {
        this.onlineOrder = ordertype;
    }

    public String getType() {
        return orderType;
    }

    // getters and setters...
    public void setOnline(String onlineOrder) {
        this.onlineOrder = onlineOrder;
    }

    public String gatOnline() {
        return onlineOrder;
    }

    // getters and setters...
    public void setTicket(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public int getTicket() {
        return ticketNumber;
    }

    // getters and setters...
    public void setPizzas(int numberOfPizzas) {
        this.numberOfPizzas = numberOfPizzas;
    }

    public int getPizzas() {
        return numberOfPizzas;
    }

    // getters and setters...
    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    // getters and setters...
    public void setSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getSize() {
        return pizzaSize;
    }

    // getters and setters...
    public void setPizzaPrice(double pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }

    public double getPizzaPrice() {
        return pizzaPrice;
    }

    // getters and setters...
    public void setStyle(String cuttingStyle) {
        this.cuttingStyle = cuttingStyle;
    }

    public String getStyle() {
        return cuttingStyle;
    }

    // getters and setters...
    public void setDrinks(double drinks) {
        this.drinks = drinks;
    }

    public double getDrinks() {
        return drinks;
    }

    // getters and setters...
    public void setTip(double tip) {
        this.tip = tip;
    }

    public double getTip() {
        return tip;
    }

    // getters and setters...
    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getAllergies() {
        return allergies;
    }
}