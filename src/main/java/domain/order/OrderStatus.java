package domain.order;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OrderStatus")
public class OrderStatus {

    @Id
    @Column(name = "OrderStatusCode", nullable = false, unique = true)
    private String orderStatusCode;

    @Column(name = "OrderStatusDescription")
    private String orderStatusDescription;

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

}
