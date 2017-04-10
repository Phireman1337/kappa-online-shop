package product.mongo;


import com.mongodb.*;

import java.util.Arrays;

public class MongoRepository {

    private static final String HOST = "localhost";
    private static final int PORT = 27017;

    private static MongoClient client = new MongoClient(HOST, PORT);
    private DB db;
    private DBCollection productCollection;

    public MongoRepository(){
        this.db = client.getDB("test");
        this.productCollection = db.getCollection("collection1");
    }

    void insert(){

        DBObject product = new BasicDBObject()
                .append("sku", "b1c8f2")
                .append("title", "Phillips Electric Shaver")
                .append("category", "Drugs and self-care")
                .append("price", "59.99")
                .append("description", Arrays.asList("The very best in shaving", "Quit using second-grade care products",
                        "Step up your game shaving-wise", "From the creators of the spoon-fork knife"))
                .append("properties", new BasicDBObject()
                        .append("size", "15x10x5")
                        .append("battery-life", "4hrs"))
                .append("brand", "phillips");

        productCollection.insert(product);

    }

    void read(String productTitle){
        DBObject query = new BasicDBObject().append("title", productTitle);
        System.out.println(this.productCollection.findOne(query).get("sku"));
    }

    void update(String sku, DBObject updatedProduct){
        DBObject query = new BasicDBObject().append("sku", sku);
        this.productCollection.update(query, updatedProduct);
    }

    void delete(String sku){
        DBObject query = new BasicDBObject().append("sku", sku);
        this.productCollection.remove(query);
    }

    void destroy(){
        client.close();
    }


}
