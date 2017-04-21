package domain.review.mysql;


import domain.customer.mysql.Customer;
import domain.product.mysql.Product;

import javax.persistence.*;

@Entity
@Table(name = "Review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ReviewID", unique = true, nullable = false)
    private int reviewID;

    @Column(name = "ReviewRating", nullable = false)
    private int reviewRating;

    @Column(name = "ReviewText", nullable = false)
    private String reviewText;

    @ManyToOne
    @JoinColumn(name = "Reviewer", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "ProductID", nullable = false)
    private Product product;

    public Review(int reviewRating, String reviewText, Customer customer, Product product) {
        this.reviewRating = reviewRating;
        this.reviewText = reviewText;
        this.customer = customer;
        this.product = product;
    }

    public int getReviewID() {
        return reviewID;
    }

    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
    }

    public int getReviewRating() {
        return reviewRating;
    }

    public void setReviewRating(int reviewRating) {
        this.reviewRating = reviewRating;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
