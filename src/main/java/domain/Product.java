package domain;

import com.mongodb.DBObject;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection = "collection1")
public class Product {

    private String sku;

    @Indexed
    private String title;

    private String description;

    private String type;

    private List<String> subtypes;

    private Shipping shipping;

    private Pricing pricing;

    private DBObject details;

    public Product(String sku, String title, String description, String type, List<String> subtypes, Shipping shipping, Pricing pricing, DBObject details) {
        this.sku = sku;
        this.title = title;
        this.description = description;
        this.type = type;
        this.subtypes = subtypes;
        this.shipping = shipping;
        this.pricing = pricing;
        this.details = details;
    }


    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getSubtypes() {
        return subtypes;
    }

    public void setSubtypes(List<String> subtypes) {
        this.subtypes = subtypes;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public Pricing getPricing() {
        return pricing;
    }

    public void setPricing(Pricing pricing) {
        this.pricing = pricing;
    }

    public DBObject getDetails() {
        return details;
    }

    public void setDetails(DBObject details) {
        this.details = details;
    }
}
