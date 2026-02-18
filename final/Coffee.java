public class Coffee {
    private String name;      // название
    private String state;     // физическое состояние (зерно, молотый, растворимый и т.д.)
    private double price;     // цена за упаковку
    private double weight;    // вес (кг)
    private double volume;    // объем с упаковкой (л)
    private int quality;      // качество (1..10)

    public Coffee(String name, String state, double price,
                  double weight, double volume, int quality) {
        this.name = name;
        this.state = state;
        this.price = price;
        this.weight = weight;
        this.volume = volume;
        this.quality = quality;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public double getVolume() {
        return volume;
    }

    public int getQuality() {
        return quality;
    }

    // Соотношение цены и веса
    public double getPricePerKg() {
        if (weight == 0) {
            return Double.MAX_VALUE;
        }
        return price / weight;
    }

    @Override
    public String toString() {
        return "Кофе{" +
                "название='" + name + '\'' +
                ", состояние='" + state + '\'' +
                ", цена=" + price +
                ", вес=" + weight +
                ", объем=" + volume +
                ", качество=" + quality +
                ", цена/кг=" + String.format("%.2f", getPricePerKg()) +
                '}';
    }
}


