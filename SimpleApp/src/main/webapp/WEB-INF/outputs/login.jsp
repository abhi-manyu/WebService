<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<style>
        #error{
               color: red;
        }
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       <form:form action="./login" modelAttribute="login">
                <table>
                        <tr>
                              <td>enter username : </td>
                              <td><form:input path="username"/></td>
                              <td><form:errors path="username" id="error" /></td>
                        </tr>
                        <tr>
                              <td>enter password : </td>
                              <td><form:password path="password"/></td>
                              <td><form:errors path="password"  id="error" /></td>
                        </tr>
                        <tr>
                               <td><input type="reset" value="reset" /></td>
                               <td><input type="submit" value="Login" /></td>
                        </tr>
                </table>
       </form:form>
</body>
</html>