package lk.naseeha.UserService.model;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String nic;
    String name;

    @OneToOne(cascade = CascadeType.ALL)
    Address address;

    String bloodGroup;
    String dateOfBirth;
    String email;
    String password;
    String userType; //Donor ,user, Admin

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    List<telephone> telephoneList;

    /*@OneToMany(mappedBy = "User", cascade = CascadeType.ALL)
    List<BloodRequest> bloodRequestList;*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<telephone> getTelephoneList() {
        return telephoneList;
    }

    public void setTelephoneList(List<telephone> telephoneList) {
        this.telephoneList = telephoneList;
    }

    /*public List<BloodRequest> getBloodRequestList() {
        return bloodRequestList;
    }

    public void setBloodRequestList(List<BloodRequest> bloodRequestList) {
        this.bloodRequestList = bloodRequestList;
    }
*/
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
