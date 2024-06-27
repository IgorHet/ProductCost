package app;

public class CalcCostDelivery extends CalcCostBase {

    // Вартість доставки
    private final static double deliveryPrice = 7.0; // Приклад вартості доставки, можна змінити відповідно до потреб

    // Розрахунок вартості товару з урахуванням доставки
    @Override
    public double calcCost(Product product) {
        double baseCost = super.calcCost(product); // Викликаємо метод базового класу для отримання базової вартості
        return baseCost + deliveryPrice;
    }
}