<%@page import="servlet.util.BundleConstants" %>
<%@page import="java.util.ResourceBundle" %>
<%@ page import="java.util.Locale" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="utf-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <%
        ResourceBundle bundle = (ResourceBundle) session.getAttribute("bundle");
        if(bundle == null) {
            bundle = ResourceBundle.getBundle("input_en", new Locale("en", "US"));
        }
    %>
    <title><%=bundle.getString(BundleConstants.REGISTRATION_FORM)%></title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <section class="container">
        <div class="registration">
            <h1><%=bundle.getString(BundleConstants.REGISTRATION)%></h1>
            <form method="post" action="registration">
                <label>
                    <p>
                        <input type="text" name="name" value="" placeholder="<%=bundle.getString(BundleConstants.NAME)%>">
                    </p>
                </label>
                <label>
                    <p>
                        <input type="text" name="surname" value="" placeholder="<%=bundle.getString(BundleConstants.SURNAME)%>">
                    </p>
                </label>
                <label>
                    <p>
                        <input type="text" name="nickname" value="" placeholder="<%=bundle.getString(BundleConstants.NICKNAME)%>">
                    </p>
                </label>
                <label>
                    <p>
                        <input type="text" name="description" value="" placeholder="<%=bundle.getString(BundleConstants.DESCRIPTION)%>">
                    </p>
                </label>
                <label>
                    <p>
                        <input type="text" name="group" value="" placeholder="<%=bundle.getString(BundleConstants.GROUP)%>">
                    </p>
                </label>
                <label>
                    <p>
                        <input type="text" name="homePhone" value="" placeholder="<%=bundle.getString(BundleConstants.HOME_PHONE)%>">
                    </p>
                </label>
                <label>
                    <p>
                        <input type="text" name="mainPhone" value="" placeholder="<%=bundle.getString(BundleConstants.MAIN_PHONE)%>">
                    </p>
                </label>
                <label>
                    <p>
                        <input type="text" name="additionalPhone" value="" placeholder="<%=bundle.getString(BundleConstants.ADDITIONAL_PHONE)%>">
                    </p>
                </label>
                <label>
                    <p>
                        <input type="text" name="email" value="" placeholder="<%=bundle.getString(BundleConstants.EMAIL)%>">
                    </p>
                </label>
                <label>
                    <p>
                        <input type="text" name="skype" value="" placeholder="<%=bundle.getString(BundleConstants.SKYPE)%>">
                    </p>
                </label>
                <label>
                    <p>
                        <input type="text" name="index" value="" placeholder="<%=bundle.getString(BundleConstants.INDEX)%>">
                    </p>
                </label>
                <label>
                    <p>
                        <input type="text" name="city" value="" placeholder="<%=bundle.getString(BundleConstants.CITY)%>">
                    </p>
                </label>
                <label>
                    <p>
                        <input type="text" name="street" value="" placeholder="<%=bundle.getString(BundleConstants.STREET)%>">
                    </p>
                </label>
                <label>
                    <p>
                        <input type="text" name="house" value="" placeholder="<%=bundle.getString(BundleConstants.HOUSE)%>">
                    </p>
                </label>
                <label>
                    <p>
                        <input type="text" name="apartment" value="" placeholder="<%=bundle.getString(BundleConstants.APARTMENT)%>">
                    </p>
                </label>

                <button name="commit"><%=bundle.getString(BundleConstants.SEND)%></button>
            </form>
        </div>
    </section>
</body>
</html>