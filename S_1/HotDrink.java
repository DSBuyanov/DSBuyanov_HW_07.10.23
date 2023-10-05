
// Базовый класс "ГорячийНапиток"

public class HotDrink {
    private String name;
    private int volume;

    public HotDrink(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
               "name='" + name + ''' +
               ", volume=" + volume +
               '}';
    }
}


// Наследник класса "ГорячийНапиток" с дополнительным полем "температура"

public class HotDrinkWithTemperature extends HotDrink {
    private int temperature;

    public HotDrinkWithTemperature(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrinkWithTemperature{" +
               "name='" + getName() + ''' +
               ", volume=" + getVolume() +
               ", temperature=" + temperature +
               '}';
    }
}


// Интерфейс "ТорговыйАвтомат" и класс "ГорячихНапитковАвтомат"

// Интерфейс ТорговыйАвтомат
public interface VendingMachine {
    HotDrink getProduct(int name, int volume);
}

// Класс ГорячихНапитковАвтомат реализует интерфейс ТорговыйАвтомат
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


// Метод main для инициализации объектов и воспроизведения логики

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
