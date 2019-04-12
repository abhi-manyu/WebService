<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>

body{
  background-image: url("");
}
   #error
   {
      color: red;
   }
   td {
	text-align: center;
}
#login{
   background-color: olive;
   width: 50%;
   margin: 2cm;
}

table {
	text-align: center;
	margin: 1cm;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    ${warning}
   <font style="color: green;"> ${out} </font>
  <div id="login">  
    <form:form action="./login" modelAttribute="sign">
        <table>
           <tr style="text-align: center;">
             <td colspan="3"style="background-color: gray;color: white;">
                   if u r the admin , then log in here
             </td>
           </tr>
           <tr>
              <td>enter ur username : </td>
              <td><form:input path="username"/></td>
              <td><form:errors path="username" id="error" /></td>
           </tr>
           <tr>
              <td>enter ur password : </td>
              <td><form:input path="password"/></td>
              <td><form:errors path="password" id="error" /></td>
           </tr>
           <tr>
               <td><input type="reset" value="clear" /></td>
               <td><input type="submit" value="Login" /></td>
           </tr>
        </table>
    </form:form>
  </div>
</body>
</html>