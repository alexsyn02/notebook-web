package model.entity;

/**
 * Created by Alexandr on 08.08.2017.
 */
public class Fullname {
    private String surname;
    private String name;
    private String patronymic;

    private String truncatedFullname;

    public Fullname(String surname, String name, String patronymic, String truncatedFullname) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.truncatedFullname = truncatedFullname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getTruncatedFullname() {
        return truncatedFullname;
    }

    public void setTruncatedFullname(String truncatedFullname) {
        this.truncatedFullname = truncatedFullname;
    }
}
