package servlet.util;

/**
 * Created by Alexandr on 09.08.2017.
 */
public interface RegexConstants {
    String REGEX_GROUP = "all|friends|colleagues|family";
    String REGEX_NAME = "[A-Za-zА-Яа-я]{2,30}";
    String REGEX_NICKNAME = "[A-Za-z0-9]{6,30}";
    String REGEX_DESCRIPTION = "[A-Za-zА-Яа-я0-9~!@#$%^&*()-_=+/|. ]{1,300}";
    String REGEX_PHONE = "\\d{10}";
    String REGEX_EMAIL = "[a-zA-Z0-9\\-_.]+@[a-zA-Z0-9\\-_.]+\\.[a-zA-Z]{2,4}";
    String REGEX_SKYPE = "[a-zA-Z][a-zA-z0-9\\.,\\-_]{5,30}";
    String REGEX_INDEX = "[0-9]{5}";
    String REGEX_CITY_AND_STREET = "[a-zA-ZА-Яа-я]{2,30}";
    String REGEX_AND_APARTMENT = "[0-9]{1,3}";
}
