package domain.address.mysql;


import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "StateOrProvince")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    private int stateOrProvinceID;

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "state")
    private Set<ZipCode> zipCodes;

    protected State(){

    }

    public State(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getStateOrProvinceID() {
        return stateOrProvinceID;
    }

    public void setStateOrProvinceID(int stateOrProvinceID) {
        this.stateOrProvinceID = stateOrProvinceID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<ZipCode> getZipCodes() {
        return zipCodes;
    }

    public void setZipCodes(Set<ZipCode> zipCodes) {
        this.zipCodes = zipCodes;
    }
}

