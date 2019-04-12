<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <form action="./login" method="post">
       <table>
          <tr>
             <td>enter ur user name : </td>
             <td><input type="text" name="unm"/></td>
          </tr>
          <tr>
             <td>enter ur password : </td>
             <td><input type="password" name="pas"/></td>
          </tr>
          <tr>
              <td><input type="reset" value="clear" /></td>
              <td><input type="submit" value="log in" /></td>
          </tr>
       </table>
    </form>
</body>
</html>