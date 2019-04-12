<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form action="./rest/messages/delete" method="post">
      <table>
         <tr>
            <td>enter the msg ID : </td>
            <td><input type="number" name="delID" /></td>
         </tr>
         <tr>
              <td><input type="reset" value="clear" /></td>
              <td><input type="submit" value="delete" /></td>
         </tr>
      </table>
  </form>
</body>
</html>