package domain.address.mysql;


import domain.customer.mysql.Customer;
import domain.order.Order;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "Address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "AddressID")
    private int addressID;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "AddressStreet")
    private String street;

    @ManyToOne
    @JoinColumn(name = "ZipCode")
    private ZipCode zipCode;

    @ManyToOne
    @JoinColumn(name = "CustomerID")
    private Customer customer;

    @Column(name = "AddressType")
    private String addressType;

    @OneToMany(mappedBy = "billingAddress")
    private Set<Order> billingOrders;

    @OneToMany(mappedBy = "deliveryAddress")
    private Set<Order> deliveryOrders;

    protected Address(){

    }

    public Address(String firstName, String lastName, String street, ZipCode zipCode, Customer customer, String addressType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.zipCode = zipCode;
        this.customer = customer;
        this.addressType = addressType;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public ZipCode getZipCode() {
        return zipCode;
    }

    public void setZipCode(ZipCode zipCode) {
        this.zipCode = zipCode;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public Set<Order> getBillingOrders() {
        return billingOrders;
    }

    public void setBillingOrders(Set<Order> billingOrders) {
        this.billingOrders = billingOrders;
    }

    public Set<Order> getDeliveryOrders() {
        return deliveryOrders;
    }

    public void setDeliveryOrders(Set<Order> deliveryOrders) {
        this.deliveryOrders = deliveryOrders;
    }
}
