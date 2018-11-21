package Task1;

public class App {
    public static void main(String[] args) {
        ProductOrder po1 = new ProductOrder(13, 65.50, 3, ProductType.FOOD);
        ProductOrder po2 = new ProductOrder(14, 150.35, 1, ProductType.DRINK);
        ProductOrder po3 = new ProductOrder(15, 1250.00, 1, ProductType.ELECTRONICS);
        System.out.println(po1);
        System.out.println(po2);
        System.out.println(po3);
    }
}
