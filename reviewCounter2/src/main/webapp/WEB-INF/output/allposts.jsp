<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
#lbut,dbut{
   margin: 10px;
}
#react
{
   margin-left: 10cm;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     ${posts}
</body>
<script>
    var counter=0;
    function count()
    {
        counter++;
		document.getElementById("count1").innerHTML=counter+" times liked";
	}
</script>
</html>