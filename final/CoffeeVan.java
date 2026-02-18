import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CoffeeVan {
    private double maxVolume;    // максимальный объем фургона (л)
    private double maxMoney;     // максимальная сумма денег
    private double usedVolume;   // уже занятый объем
    private double spentMoney;   // уже потраченная сумма
    private List<Coffee> load;   // список загруженного кофе

    public CoffeeVan(double maxVolume, double maxMoney) {
        this.maxVolume = maxVolume;
        this.maxMoney = maxMoney;
        this.usedVolume = 0.0;
        this.spentMoney = 0.0;
        this.load = new ArrayList<>();
    }

    // Попробовать добавить кофе во фургон
    public boolean addCoffee(Coffee coffee) {
        if (usedVolume + coffee.getVolume() <= maxVolume &&
                spentMoney + coffee.getPrice() <= maxMoney) {
            load.add(coffee);
            usedVolume += coffee.getVolume();
            spentMoney += coffee.getPrice();
            return true;
        }
        return false;
    }

    public List<Coffee> getLoad() {
        return load;
    }

    // Сортировка по соотношению цена/вес
    public void sortByPricePerKg() {
        Collections.sort(load, new Comparator<Coffee>() {
            @Override
            public int compare(Coffee c1, Coffee c2) {
                return Double.compare(c1.getPricePerKg(), c2.getPricePerKg());
            }
        });
    }

    // Поиск по диапазону качества
    public List<Coffee> findByQualityRange(int minQuality, int maxQuality) {
        List<Coffee> result = new ArrayList<>();
        for (Coffee c : load) {
            if (c.getQuality() >= minQuality && c.getQuality() <= maxQuality) {
                result.add(c);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Фургон{" +
                "макс.объем=" + maxVolume +
                ", макс.сумма=" + maxMoney +
                ", занято объема=" + usedVolume +
                ", потрачено денег=" + spentMoney +
                ", товаров=" + load.size() +
                '}';
    }
}


