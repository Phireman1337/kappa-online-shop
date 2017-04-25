package mongo;

import com.mongodb.DBObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection = "products")
public class Product {

//    private String sku; // disabled until we have a service to generate these

    @Id
    private String id;

    @Indexed
    private String title;

    private String description;

    private String type;

    private List<String> subtypes;

    private List<String> photoUrls;

    private ShippingDetail shipping;

    private PricingDetail pricing;

    private DBObject details;

    public Product(String title, String description, String type, List<String> subtypes, List<String> photoUrls, ShippingDetail shipping, PricingDetail pricing, DBObject details) {
        this.title = title;
        this.description = description;
        this.type = type;
        this.subtypes = subtypes;
        this.photoUrls = photoUrls;
        this.shipping = shipping;
        this.pricing = pricing;
        this.details = details;
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

    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public ShippingDetail getShipping() {
        return shipping;
    }

    public void setShipping(ShippingDetail shipping) {
        this.shipping = shipping;
    }

    public PricingDetail getPricing() {
        return pricing;
    }

    public void setPricing(PricingDetail pricing) {
        this.pricing = pricing;
    }

    public DBObject getDetails() {
        return details;
    }

    public void setDetails(DBObject details) {
        this.details = details;
    }

    public String getId(){
        return this.id;
    }
}
