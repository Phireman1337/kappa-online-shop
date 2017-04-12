package domain.customer.mysql;


import app.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
@Transactional
public class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void test(){

        assert customerRepository != null;

        Customer sonmez = customerRepository.save(new Customer('M', "John", "Sonmez", new Date(System.currentTimeMillis()),
                "sonmez@simpleprogrammer.com", "PASSWORD"));
        assert sonmez != null;

        Customer customer = customerRepository.findOne(sonmez.getId());
        assert customer != null;

        customer = customerRepository.findByEmailAddress("sonmez@simpleprogrammer.com");
        assert customer != null;

        customerRepository.delete(customer);
        customer = customerRepository.findByEmailAddress("sonmez@simpleprogrammer.com");
        assert customer == null;

    }

}
