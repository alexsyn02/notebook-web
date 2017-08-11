package model.entity.builder;

import model.entity.*;

import java.util.Date;

/**
 * Created by Alexandr on 09.08.2017.
 */
public class RecordBuilder {

    private Fullname fullname;
    private String nickname;
    private String description;
    private Group group;
    private Phone phone;
    private String email;
    private String skype;
    private Address address;

    private Date dateOfEntryInNoteBook;
    private Date dateOfLastChanging;

    public RecordBuilder setFullname(String name, String surname, String patronymic, String truncatedName) {
        fullname = new Fullname(surname, name, patronymic, truncatedName);
        return this;
    }

    public RecordBuilder setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public RecordBuilder setDesription(String description) {
        this.description = description;
        return this;
    }

    public RecordBuilder setGroup(String group) {
        this.group = Group.valueOf(group.toUpperCase());
        return this;
    }

    public RecordBuilder setTelephone(String homePhone, String mainPhone, String additionalPhone) {
        this.phone = new Phone(homePhone, mainPhone, additionalPhone);
        return this;
    }

    public RecordBuilder setSkype(String skype) {
        this.skype = skype;
        return this;
    }

    public RecordBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public RecordBuilder setAddress(String index, String city, String street, String house,
                                    String apartment, String fullAddress) {
        this.address = new Address(index, city, street, house, apartment, fullAddress);
        return this;
    }

    public RecordBuilder setDateOfLastChanging(String dateOfLastChanging) {
        this.dateOfLastChanging = new Date(dateOfLastChanging);
        return this;
    }

    public Record build() {
        Record record = new Record();
        record.setFullname(fullname);
        record.setNickname(nickname);
        record.setDescription(description);
        record.setGroup(group);
        record.setPhone(phone);
        record.setEmail(email);
        record.setSkype(skype);
        record.setAddress(address);
        record.setDateOfLastChanging(dateOfLastChanging);

        return record;
    }
}
