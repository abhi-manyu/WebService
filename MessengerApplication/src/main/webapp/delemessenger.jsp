<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form action="./rest/profiles/delete" method="post">
      enter ur id of the profile u want to delete : <input type="number" name="delproid" /><br>
      <input type="reset" value="clear" />
      <input type="submit" value="delete me" />
  </form>
</body>
</html>