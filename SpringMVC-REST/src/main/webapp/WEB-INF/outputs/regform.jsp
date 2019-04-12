<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <form:form action="./register" modelAttribute="reg">
       <table>
          <tr>
             <td>enter roll no : </td>
             <td><form:input path="rollno"/></td>
             <td><form:errors path="rollno" /></td>
          </tr>
          <tr>
             <td>enter Name : </td>
             <td><form:input path="name"/></td>
             <td><form:errors path="name" /></td>
          </tr>
          <tr>
             <td>enter address : </td>
             <td><form:input path="address"/></td>
             <td><form:errors path="address" /></td>
          </tr>
          <tr>
             <td>enter phno : </td>
             <td><form:input path="phno"/></td>
             <td><form:errors path="phno" /></td>
          </tr>
          <tr>
             <td>enter username : </td>
             <td><form:input path="username"/></td>
             <td><form:errors path="username" /></td>
          </tr>
          <tr>
             <td>enter password : </td>
             <td><form:input path="password"/></td>
             <td><form:errors path="password" /></td>
          </tr>
          <tr>
             <td></td>
             <td><input type="reset" value="clear" /></td>
             <td><input type="submit" value="register" /></td>
          </tr>
       </table>
    </form:form>
</body>
</html>