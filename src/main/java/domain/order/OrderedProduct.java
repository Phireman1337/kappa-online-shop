package domain.order;

import domain.product.mysql.Product;

import javax.persistence.*;

@Entity
@Table(name = "OrderedProduct")
public class OrderedProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int ID;

    @ManyToOne
    @JoinColumn(name = "ProductID")
    private Product product;

    @Column(name = "ProductName")
    private String productName;

    @Column(name = "ProductPrice")
    private float productPrice;

    @Column(name = "ProductTax")
    private float productTax;

    @Column(name = "Quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "OrderID")
    private Order order;

    protected OrderedProduct(){

    }

    public OrderedProduct(Product product, String productName, float productPrice, float productTax, int quantity, Order order) {
        this.product = product;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productTax = productTax;
        this.quantity = quantity;
        this.order = order;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public float getProductTax() {
        return productTax;
    }

    public void setProductTax(float productTax) {
        this.productTax = productTax;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
