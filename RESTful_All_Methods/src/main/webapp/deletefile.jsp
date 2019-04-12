<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
   tr {
	text-align: center;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form action="./rest/student/deleteStudent" method="post">
      <table>
           <tr>
              <td>enter the rollNo of the student u want to delete</td>
              <td><input type="number" name="rn" /></td>
           </tr>
           <tr>
               <td colspan="2"><input type="submit" value="delete here" /></td>
           </tr>
      </table>
  </form>
</body>
</html>