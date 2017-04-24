package domain.address.mysql;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ZipCode")
public class ZipCode {

    @Id
    @Column(name = "ZipCode", unique = true, nullable = false)
    private String zipCode;

    @ManyToOne
    @JoinColumn(name = "cityID")
    private City city;

    @ManyToOne
    @JoinColumn(name = "CountryCode")
    private Country country;

    @ManyToOne
    @JoinColumn(name = "StateOrProvinceID")
    private State state;

    @OneToMany(mappedBy = "ZipCode")
    private Set<Address> zipCodeSet;


    protected ZipCode(){

    }

    public ZipCode(String zipCode, City city, Country country, State state) {
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Set<Address> getZipCodeSet() {
        return zipCodeSet;
    }

    public void setZipCodeSet(Set<Address> zipCodeSet) {
        this.zipCodeSet = zipCodeSet;
    }
}
