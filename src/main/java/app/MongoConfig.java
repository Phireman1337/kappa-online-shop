package app;


import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.Collection;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration{

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


    @Bean
    @ConfigurationProperties("app.datasource")
    public DataSource getDataSource(){
        return DataSourceBuilder.create().build();
    }

}
