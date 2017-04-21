package domain.order;


import domain.address.mysql.Address;
import domain.customer.mysql.Customer;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "OrderID")
    private int orderID;

    @ManyToOne
    @JoinColumn(name = "CustomerID")
    private Customer customer;

    @Column(name = "BillingName")
    private String billingName;

    @Column(name = "DeliveryName")
    private String deliveryName;

    @Column(name = "EmailAddress")
    private String emailAddress;

    @Column(name = "PurchaseDate")
    private Date purchaseDate;

    @ManyToOne
    @JoinColumn(name = "OrderStatusCode")
    private OrderStatus orderStatus;

    @ManyToOne
    @JoinColumn(name = "BillingAddressID")
    private Address billingAddress;

    @ManyToOne
    @JoinColumn(name = "DeliveryAddressID")
    private Address deliveryAddress;

    public Order(Customer customer, String billingName, String deliveryName, String emailAddress, Date purchaseDate, OrderStatus orderStatus, Address billingAddress, Address deliveryAddress) {
        this.customer = customer;
        this.billingName = billingName;
        this.deliveryName = deliveryName;
        this.emailAddress = emailAddress;
        this.purchaseDate = purchaseDate;
        this.orderStatus = orderStatus;
        this.billingAddress = billingAddress;
        this.deliveryAddress = deliveryAddress;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getBillingName() {
        return billingName;
    }

    public void setBillingName(String billingName) {
        this.billingName = billingName;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
