package domain.order;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "OrderStatus")
public class OrderStatus {

    @Id
    @Column(name = "OrderStatusCode", nullable = false, unique = true)
    private String orderStatusCode;

    @Column(name = "OrderStatusDescription", nullable = false)
    private String orderStatusDescription;

    @OneToMany(mappedBy = "orderStatus")
    private Set<Order> orders;

    protected OrderStatus(){

    }

    public OrderStatus(String orderStatusCode, String orderStatusDescription) {
        this.orderStatusCode = orderStatusCode;
        this.orderStatusDescription = orderStatusDescription;
    }

    public String getOrderStatusCode() {
        return orderStatusCode;
    }

    public void setOrderStatusCode(String orderStatusCode) {
        this.orderStatusCode = orderStatusCode;
    }

    public String getOrderStatusDescription() {
        return orderStatusDescription;
    }

    public void setOrderStatusDescription(String orderStatusDescription) {
        this.orderStatusDescription = orderStatusDescription;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
