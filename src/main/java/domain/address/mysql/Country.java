package domain.address.mysql;



import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Country")
public class Country {

    @Id
    @Column(name = "CountryCode", unique = true, nullable = false)
    private String countryCode;

    @Column(name = "CountryName", nullable = false)
    private String countryName;

    @OneToMany(mappedBy = "country")
    private Set<ZipCode> zipCodes;

    protected Country(){

    }

    public Country(String countryCode, String countryName) {
        this.countryCode = countryCode;
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Set<ZipCode> getZipCodes() {
        return zipCodes;
    }

    public void setZipCodes(Set<ZipCode> zipCodes) {
        this.zipCodes = zipCodes;
    }
}
