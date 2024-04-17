package HW17;

public class Main {
    public static void main(String[] args) {
        HW17.Product laptop = new HW17.Product("Laptop", 1000, 5);
        HW17.Product smartphone = new HW17.Product("Smartphone", 500, 10);

        int totalQuantity = HW17.Product.getTotalQuantity();
        System.out.println("Загальна кількість товарів на складі: " + totalQuantity);
    }
}
