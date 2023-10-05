
public class Main {
    public static void main(String[] args) {
        // Инициализация объектов
        HotDrink tea = new HotDrink("Tea", 250);
        HotDrinkWithTemperature hotTea = new HotDrinkWithTemperature("Hot Tea", 250, 85);

        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();

        // Воспроизведение логики
        HotDrink product1 = vendingMachine.getProduct(1, 250);
        HotDrinkWithTemperature product2 = vendingMachine.getProduct(1, 250, 85);

        System.out.println("Received product: " + product1);
        System.out.println("Received product with temperature: " + product2);
    }
}
