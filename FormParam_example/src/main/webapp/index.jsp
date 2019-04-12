<html>
<body>
<h2>Hello World!</h2>
<h2>example of the FormParam annotation</h2>
<form action="./rest/customers/addcustomers" method="post">
      <table>
         <tr>
            <th>attribute</th>
            <th>value</th>
         </tr>
         <tr>
            <td>name : </td>
            <td><input type="text" name="nam" /></td>
         </tr> 
         <tr>
            <td>age : </td>
            <td><input type="number" name="ag" /></td>
         </tr>
         <tr>
            <td><input type="submit" value="save" /></td>
            <td><input type="reset" value="clear" /></td>
         </tr>
      </table>

</form>
</body>
</html>
