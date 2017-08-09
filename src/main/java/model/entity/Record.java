package model.entity;

import java.util.Date;

/**
 * Created by Alexandr on 08.08.2017.
 */
public class Record {

    private Fullname fullname;
    private String nickname;
    private String description;
    private Group group;
    private Phone phone;
    private String email;
    private String skype;
    private Address address;

    private Date dateOfEntryInNotebook;
    private Date dateOfLastChanging;

    public Fullname getFullname() {
        return fullname;
    }

    public void setFullname(Fullname fullname) {
        this.fullname = fullname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getDateOfEntryInNotebook() {
        return dateOfEntryInNotebook;
    }

    public void setDateOfEntryInNotebook(Date dateOfEntryInNotebook) {
        this.dateOfEntryInNotebook = dateOfEntryInNotebook;
    }

    public Date getDateOfLastChanging() {
        return dateOfLastChanging;
    }

    public void setDateOfLastChanging(Date dateOfLastChanging) {
        this.dateOfLastChanging = dateOfLastChanging;
    }
}
