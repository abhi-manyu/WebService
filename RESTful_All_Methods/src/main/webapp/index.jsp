<html>
<head>
   <style>
      th {
	background-color: olive;
}
  tr {
	text-align: center;
}
   </style>
</head>
<body>
<h2>Example of all the web services methods</h2>
  <form action="./rest/student/addingStudent" method="post">
       <table>
          <tr>
             <th>roll no </th>
             <th>Name</th>
             <th>Marks</th>
             <th>Address</th>
          </tr>
          <tr>
             <td><input type="number" name="rollno" /></td>
             <td><input type="text" name="name" /></td>
             <td><input type="text" name="mark" /></td>
             <td><input type="text" name="addr" /></td>
          </tr>
          <tr>
              <td colspan="2"><input type="submit" value="save to database" /></td>
              <td colspan="2"><input type="reset" value="clear all the data fields" /></td>
          </tr>
          <tr>
               <td colspan="4"><a href=deletefile.jsp>delete a student here</a></td>
          </tr>
          <tr>
               <td colspan="4"><a href=showdetails.jsp>find details of the student</a></td>
          </tr>
       </table>
  </form>
</body>
</html>
