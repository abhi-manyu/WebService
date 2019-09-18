<!DOCTYPE html>
<html>
<head>
<style>
  #last {
	text-align: center;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./rest/profiles/add" method="post">
     <table>
      <tr>
         <td colspan="2"><h2>Register urself as a Messenger</h2></td>
      </tr>
      <tr>
        <td>profileID : </td>
        <td><input type="number" name="pID" /></td>
      </tr>
      <tr>
         <td>enter ur firstName : </td>
         <td><input type="text" name="fnm"></td>
      </tr>
      <tr>
          <td>ur lastName : </td>
          <td><input type="text" name="lnm" /></td>
      </tr>
      <tr>
          <td>enter ur phone nomber :</td>
          <td><input type="text" name="phno" />
      </tr>
      <tr>
          <td>enter ur mail id :</td>
          <td><input type="email" name="mail" />
      </tr>
      <tr>
          <td>enter ur address : </td>
          <td><textarea style="width: 5cm; height: 2cm;" name="addre"></textarea>
      </tr>
      <tr id="last">
          <td><input type="reset" value="clear fields" /></td>
          <td><input type="submit" value="Add me" /></td>
      </tr>
   </table>
</form>
</body>
</html>