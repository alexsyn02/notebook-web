<%@ page import="servlet.util.BundleConstants" %>
<%@ page import="java.util.ResourceBundle" %>
<%@ page import="java.util.Hashtable" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <%
        ResourceBundle bundle = (ResourceBundle) session.getAttribute("bundle");
    %>
    <title><%=bundle.getString(BundleConstants.RETRY)%></title>
</head>
<body>
    <section class="container">
        <div class="registration">
            <%
                Hashtable errors = (Hashtable) session.getAttribute("errors");
            %>
            <%! public String getError(String s) {
                return (s == null) ? "" : s;
                }
            %>
            <h1><%=bundle.getString(BundleConstants.RE_INPUT)%></h1>
            <form method="post" action="registration">
                <%=bundle.getString(BundleConstants.NAME)%>
                <p class="error"><%=getError((String) errors.get("name"))%></p>
                <label>
                    <input type="text" name="name" value="<%=request.getParameter("name")%>">
                </label>
                <%=bundle.getString(BundleConstants.SURNAME)%>
                <p class="error"><%=getError((String) errors.get("surname"))%></p>
                <label>
                    <input type="text" name="surname" value="<%=request.getParameter("surname")%>">
                </label>
                <%=bundle.getString(BundleConstants.PATRONYMIC)%>
                <p class="error"><%=getError((String) errors.get("patronymic"))%></p>
                <label>
                    <input type="text" name="patronymic" value="<%=request.getParameter("patronymic")%>">
                </label>
                <%=bundle.getString(BundleConstants.NICKNAME)%>
                <p class="error"><%=getError((String) errors.get("nickname"))%></p>
                <label>
                    <input type="text" name="nickname" value="<%=request.getParameter("nickname")%>">
                </label>
                <%=bundle.getString(BundleConstants.DESCRIPTION)%>
                <p class="error"><%=getError((String) errors.get("description"))%></p>
                <label>
                    <input type="text" name="description" value="<%=request.getParameter("description")%>">
                </label>
                <%=bundle.getString(BundleConstants.GROUP)%>
                <p class="error"><%=getError((String) errors.get("group"))%></p>
                <label>
                    <input type="text" name="group" value="<%=request.getParameter("group")%>">
                </label>
                <%=bundle.getString(BundleConstants.MAIN_PHONE)%>
                <p class="error"><%=getError((String) errors.get("mainPhone"))%></p>
                <label>
                    <input type="text" name="mainPhone" value="<%=request.getParameter("mainPhone")%>">
                </label>
                <%=bundle.getString(BundleConstants.ADDITIONAL_PHONE)%>
                <p class="error"><%=getError((String) errors.get("additionalPhone"))%></p>
                <label>
                    <input type="text" name="additionalPhone" value="<%=request.getParameter("additionalPhone")%>">
                </label>
                <%=bundle.getString(BundleConstants.EMAIL)%>
                <p class="error"><%=getError((String) errors.get("email"))%></p>
                <label>
                    <input type="text" name="email" value="<%=request.getParameter("email")%>">
                </label>
                <%=bundle.getString(BundleConstants.SKYPE)%>
                <p class="error"><%=getError((String) errors.get("skype"))%></p>
                <label>
                    <input type="text" name="skype" value="<%=request.getParameter("skype")%>">
                </label>
                <%=bundle.getString(BundleConstants.INDEX)%>
                <p class="error"><%=getError((String) errors.get("index"))%></p>
                <label>
                    <input type="text" name="index" value="<%=request.getParameter("index")%>">
                </label>
                <%=bundle.getString(BundleConstants.CITY)%>
                <p class="error"><%=getError((String) errors.get("city"))%></p>
                <label>
                    <input type="text" name="city" value="<%=request.getParameter("city")%>">
                </label>
                <%=bundle.getString(BundleConstants.STREET)%>
                <p class="error"><%=getError((String) errors.get("street"))%></p>
                <label>
                    <input type="text" name="street" value="<%=request.getParameter("street")%>">
                </label>
                <%=bundle.getString(BundleConstants.HOUSE)%>
                <p class="error"><%=getError((String) errors.get("house"))%></p>
                <label>
                    <input type="text" name="houseNumber" value="<%=request.getParameter("house")%>">
                </label>
                <%=bundle.getString(BundleConstants.APARTMENT)%>
                <p class="error"><%=getError((String) errors.get("apartment"))%></p>
                <label>
                    <input type="text" name="apartment" value="<%=request.getParameter("apartment")%>">
                </label>
                <p class="submit">
                    <button name="commit"><%=bundle.getString(BundleConstants.SEND)%></button>
                </p>
            </form>
        </div>
    </section>
</body>
</html>