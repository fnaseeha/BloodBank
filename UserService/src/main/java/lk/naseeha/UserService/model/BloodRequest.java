package lk.naseeha.UserService.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class BloodRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String name;
    String requestBloodType;
    String urgentMessage;
    String contactNo;
    String gender;

    @ManyToOne
    @JoinColumn
    User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRequestBloodType() {
        return requestBloodType;
    }

    public void setRequestBloodType(String requestBloodType) {
        this.requestBloodType = requestBloodType;
    }

    public String getUrgentMessage() {
        return urgentMessage;
    }

    public void setUrgentMessage(String urgentMessage) {
        this.urgentMessage = urgentMessage;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonIgnore
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
