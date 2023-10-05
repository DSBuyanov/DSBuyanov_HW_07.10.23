public class HotDrinkVendingMachine implements VendingMachine {
    @Override
    public HotDrink getProduct(int name, int volume) {
        // Логика для получения продукта по имени и объёму
        return new HotDrink("Tea", volume);
    }

    // Перегруженный метод getProduct
    public HotDrinkWithTemperature getProduct(int name, int volume, int temperature) {
        // Логика для получения продукта по имени, объёму и температуре
        return new HotDrinkWithTemperature("Tea", volume, temperature);
    }
}