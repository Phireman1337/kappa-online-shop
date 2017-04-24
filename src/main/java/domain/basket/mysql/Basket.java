package domain.basket.mysql;

import domain.customer.mysql.Customer;

import javax.persistence.*;


@Entity
@Table(name = "Basket")
public class Basket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BasketID")
    private int basketID;

    @OneToOne
    @JoinColumn(name = "CustomerID")
    private Customer customer;

    @Column(name = "SessionID")
    private String sessionID;

    protected Basket(){

    }

    public Basket(Customer customer, String sessionID) {
        this.customer = customer;
        this.sessionID = sessionID;
    }

    public int getBasketID() {
        return basketID;
    }

    public void setBasketID(int basketID) {
        this.basketID = basketID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

}
