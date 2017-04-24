package domain.customer.mysql;


import domain.basket.mysql.Basket;
import domain.order.Order;
import domain.review.mysql.Review;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CustomerID")
    private int id;

    @Column(name = "Gender", nullable = false)
    private char gender;

    @Column(name = "FirstName", nullable = false)
    private String firstName;

    @Column(name = "LastName", nullable = false)
    private String lastName;

    @Column(name = "BirthDate", nullable = false)
    private Date birthDate;

    @Column(name = "EmailAddress", nullable = false)
    private String emailAddress;

    @Column(name = "Password")
    private String password;

    @OneToOne(mappedBy = "CustomerID")
    private Basket basket;

    @OneToMany(mappedBy = "Reviewer")
    private Set<Review> reviews;

    @OneToMany(mappedBy = "CustomerID")
    private Set<Order> orders;

    protected Customer(){

    }

    public Customer(char gender, String firstName, String lastName, Date birthDate, String emailAddress, String password) {
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Set<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
