package model.entity;

/**
 * Created by Alexandr on 08.08.2017.
 */
public class Phone {

    private String homePhone;
    private String mainPhone;
    private String additionalPhone;

    public Phone(String homePhone, String mainPhone, String additionalPhone) {
        this.homePhone = homePhone;
        this.mainPhone = mainPhone;
        this.additionalPhone = additionalPhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMainPhone() {
        return mainPhone;
    }

    public void setMainPhone(String mainPhone) {
        this.mainPhone = mainPhone;
    }

    public String getAdditionalPhone() {
        return additionalPhone;
    }

    public void setAdditionalPhone(String additionalPhone) {
        this.additionalPhone = additionalPhone;
    }
}
