package servlet;

import model.entity.NotebookSingleton;
import model.entity.builder.RecordBuilder;
import model.exception.NicknameAlreadyExistsException;
import servlet.util.RegexConstants;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Hashtable;

/**
 * Created by Alexandr on 08.08.2017.
 */
@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private HttpSession session;

    private static NotebookSingleton noteBook = NotebookSingleton.getInstance();

    // Record data
    private String surname;
    private String name;
    private String patronymic;

    private String nickname;

    private String description;

    private String group;

    private String homePhone;
    private String mainPhone;
    private String additionalPhone;

    private String email;

    private String skype;

    private String index;
    private String city;
    private String street;
    private String house;
    private String apartment;

    // Validation data
    private Hashtable<String, String> errors;
    private boolean validation;

    private void redirect(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher;

        if (validation) {
            try {
                noteBook.add(new RecordBuilder()
                        .setFullname(surname, name, patronymic, truncateName(surname, name))
                        .setNickname(nickname)
                        .setDesription(description)
                        .setGroup(group)
                        .setTelephone(homePhone, mainPhone, additionalPhone)
                        .setEmail(email)
                        .setSkype(skype)
                        .setAddress(index, city, street, house, apartment,
                                createFullAddress(index, city, street, house, apartment))
                        .build());

                dispatcher = this.getServletContext().getRequestDispatcher("/success.jsp");
            } catch (NicknameAlreadyExistsException e) {
                errors.put("nickname", RegexConstants.REGEX_NICKNAME);
                session.setAttribute("errors", errors);

                dispatcher = this.getServletContext().getRequestDispatcher("/retry.jsp");
            }
        } else {
            session.setAttribute("errors", errors);

            dispatcher = this.getServletContext().getRequestDispatcher("/retry.jsp");
        }

        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        setValidation();

        setAll(request);
        checkAll();

        session = request.getSession();

        redirect(request, response);
    }

    private void setValidation() {
        validation = true;
        errors = new Hashtable<>();
    }

    private void checkAll() {
        // TODO: Separate on methods
        checkWithRegex("name", name, RegexConstants.REGEX_NAME);
        checkWithRegex("surname", surname, RegexConstants.REGEX_NAME);
        checkWithRegex("patronymic", patronymic, RegexConstants.REGEX_NAME);
        checkWithRegex("nickname", nickname, RegexConstants.REGEX_NICKNAME);
        checkWithRegex("description", description, RegexConstants.REGEX_DESCRIPTION);
        checkWithRegex("group", group, RegexConstants.REGEX_GROUP);
        checkWithRegex("mainPhone", mainPhone, RegexConstants.REGEX_PHONE);
        checkWithRegex("additionalPhone", additionalPhone, RegexConstants.REGEX_PHONE);
        checkWithRegex("email", email, RegexConstants.REGEX_EMAIL);
        checkWithRegex("skype", skype, RegexConstants.REGEX_SKYPE);
        checkWithRegex("index", index, RegexConstants.REGEX_INDEX);
        checkWithRegex("city", city, RegexConstants.REGEX_CITY_AND_STREET);
        checkWithRegex("street", street, RegexConstants.REGEX_CITY_AND_STREET);
        checkWithRegex("house", house, RegexConstants.REGEX_AND_APARTMENT);
        checkWithRegex("apartment", apartment, RegexConstants.REGEX_AND_APARTMENT);
    }

    public void checkWithRegex(String parameterName, String input, String regex) {
        if (input == null || !input.matches(regex)) {
            errors.put(parameterName, regex);
            validation = false;
        }
    }

    private void setAll(HttpServletRequest request) {
        setFullname(request);
        setNickname(request);
        setDescription(request);
        setGroup(request);
        setPhone(request);
        setEmail(request);
        setSkype(request);
        setAddress(request);
    }

    private void setFullname(HttpServletRequest request) {
        name = request.getParameter("name");
        surname = request.getParameter("surname");
        patronymic = request.getParameter("patronymic");
    }

    private void setNickname(HttpServletRequest request) {
        nickname = request.getParameter("nickname");
    }

    private void setDescription(HttpServletRequest request) {
        description = request.getParameter("description");
    }

    private void setGroup(HttpServletRequest request) {
        group = request.getParameter("group");
    }

    private void setPhone(HttpServletRequest request) {
        mainPhone = request.getParameter("mainPhone");
        additionalPhone = request.getParameter("additionalPhone");
    }

    private void setEmail(HttpServletRequest request) {
        email = request.getParameter("email");
    }

    private void setSkype(HttpServletRequest request) {
        skype = request.getParameter("skype");
    }

    private void setAddress(HttpServletRequest request) {
        index = request.getParameter("index");
        city = request.getParameter("city");
        street = request.getParameter("street");
        house = request.getParameter("house");
        apartment = request.getParameter("apartment");
    }

    private String truncateName(String surname, String name) {
        String space = new String(" ");
        String point = new String(".");

        return new StringBuilder()
                .append(surname)
                .append(space)
                .append(name.charAt(0))
                .append(point)
                .toString();
    }

    private String createFullAddress(String index, String city, String street, String house,
                                     String apartment) {
        String comma = new String(", ");

        return new StringBuilder()
                .append(index)
                .append(comma)
                .append(city)
                .append(comma)
                .append(street)
                .append(comma)
                .append("house: ")
                .append(house)
                .append(comma)
                .append("apartment: ")
                .append(apartment)
                .toString();
    }
}
