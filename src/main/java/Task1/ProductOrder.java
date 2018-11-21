package Task1;
public class ProductOrder {
    int id;
    double price;
    int size;
    ProductType productType;

       public ProductOrder(int id, double price, int size, ProductType productType) {
        this.id = id;
        this.price = price;
        this.size = size;
        this.productType = productType;
    }
    public String toString () {
           return
"{" + id + "-" + price + "-" + size + "-" + productType + "}";
    }
}

