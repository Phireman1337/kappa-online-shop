package domain.address.mysql;


import app.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
@Transactional
public class ZipCodeTest {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private StateRepository stateRepository;

    @Autowired
    private ZipCodeRepository zipCodeRepository;

    @Test
    public void crudTest(){

        City city = cityRepository.save(new City("Washington D.C"));
        assert city != null;

        Country country = countryRepository.save(new Country("US", "United States"));
        assert country != null;

        State state = stateRepository.save(new State("WG", "Washington"));
        assert state != null;

        ZipCode zipCode = zipCodeRepository.save(new ZipCode("1337", city, country, state));
        assert zipCode != null && zipCode.getZipCode().equals("1337");

        zipCode.setZipCode("1338");
        zipCode = zipCodeRepository.save(zipCode);
        assert zipCode.getZipCode().equals("1338");

        zipCode = zipCodeRepository.findOne("1338");

        System.out.println("CODES:");
        for(ZipCode code : zipCodeRepository.findAll()){
            System.out.println(code.getZipCode() + " ");
        }
        assert zipCode != null;

        zipCodeRepository.delete("1338");
        assert zipCodeRepository.findOne("1338") == null;

    }


}
