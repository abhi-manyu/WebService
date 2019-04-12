<!DOCTYPE html>
<html>
<head>
<style>
   tr {
	text-align: center;
}
body {
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./rest/messages/add" method="post">
   <table>
      <tr>
         <td colspan="2"><h2>write ur new Post here</h2></td>
      </tr>
      <tr>
        <td>MessageID : </td>
        <td><input type="number" name="mID" /></td>
      </tr>
      <tr>
         <td>enter the actual message : </td>
         <td><textarea style="width: 7cm;height: 2cm;" name="msg"></textarea> </td>
      </tr>
      <tr>
          <td>ur name : </td>
          <td><input type="text" name="nam" /></td>
      </tr>
      <tr>
          <td><input type="reset" value="clear fields" /></td>
          <td><input type="submit" value="Post to Wall"/></td>
      </tr>
   </table>
</form>
</body>
</html>