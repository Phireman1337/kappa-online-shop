package app;


import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration{


//    @Bean
//    public MongoClientFactoryBean mongoClientFactoryBean(){
//        MongoClientFactoryBean bean = new MongoClientFactoryBean();
//        bean.setHost("localhost");
//        return bean;
//    }

    @Override
    protected String getDatabaseName() {
        return "test";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient("127.0.0.1", 27017);
    }

    @Override
    protected Collection<String> getMappingBasePackages() {
        return Arrays.asList("domain");
    }
}
