package domain.product.mysql;

import domain.basket.mysql.BasketProducts;
import domain.review.mysql.Review;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ProductID", nullable = false, unique = true)
    private int productID;

    @OneToMany(mappedBy = "product")
    private Set<Review> reviewSet;

    @OneToMany(mappedBy = "product")
    private Set<BasketProducts> basketProductsSet;

    protected Product(){

    }

    public Product(int productID){
        this.productID = productID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public Set<Review> getReviewSet() {
        return reviewSet;
    }

    public void setReviewSet(Set<Review> reviewSet) {
        this.reviewSet = reviewSet;
    }

    public Set<BasketProducts> getBasketProductsSet() {
        return basketProductsSet;
    }

    public void setBasketProductsSet(Set<BasketProducts> basketProductsSet) {
        this.basketProductsSet = basketProductsSet;
    }
}
