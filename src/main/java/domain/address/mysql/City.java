package domain.address.mysql;



import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "City")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CityID")
    private int cityID;

    @Column(name = "CityName", nullable = false)
    private String cityName;

    @OneToMany(mappedBy = "city")
    private Set<ZipCode> zipCodes;

    protected City(){

    }

    public City(String cityName) {
        this.cityName = cityName;
    }

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Set<ZipCode> getZipCodes() {
        return zipCodes;
    }

    public void setZipCodes(Set<ZipCode> zipCodes) {
        this.zipCodes = zipCodes;
    }
}

