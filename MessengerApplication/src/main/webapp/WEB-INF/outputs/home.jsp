
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style>
 
 body{
    background-color: black;
 }
 
 ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
  font-family: cursive;
}

#danger{
    float: right;
    margin-right: 10px;
    
}

li {
  float: left;
}

li a, .dropbtn {
  display: inline-block;
  color: yellow;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  border: 1px solid black;
}

ul:danger{
   text-align: left;
}


li a:hover, .dropdown:hover .dropbtn {
  background-color: #993300;
  border-radius: 15px;
}

li.dropdown {
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: #ff6666;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: center;
}

.dropdown-content a:hover {background-color: #80dfff;}

.dropdown:hover .dropdown-content {
  display: block;
}
 
 
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<ul>
     <li><a class="fa fa-home" style="font-size: 22px;"></a></li>
     <li class="dropdown">
         <a href="javascript:void(0)" class="dropbtn">
             <span class="fa fa-users" style="font-size: 22px;"></span>
         </a>
              <div class="dropdown-content">
                 <a href="addProfile.jsp">add urself as a messenger |
                       <span class="fa fa-user-plus" style="color:#0033cc"></span></a>
                 <a href="./rest/profiles">get all messengers |
                     <span class="fa fa-list" style="color:blue;"></span>
                 </a>
                 <a href="getmessenger.jsp">get a messengers |
                    <span class="fa fa-user" style="color:blue;"></span>
                 </a>
                <a href="delemessenger.jsp">delete a messengers |
                     <span class="fa fa-trash" style="color:blue;"></span> </a>
              </div>
     </li>
     <li class="dropdown">
         <a href="javascript:void(0)" class="dropbtn">
             <span class="fa fa-envelope" style="font-size: 22px;"></span>
         </a>
              <div class="dropdown-content">
                 <a href="addmessage.jsp">Write a new message |
                    <span class="fa fa-pencil-square-o" style="color:blue;"></span>
                 </a>
                 <a href="./rest/messages">get all lists of messages |
                    <span class="fa fa-list" style="color:blue;"></span>
                 </a>
                 <a href="getmsg.jsp">get a single Message |
                     <span class="fa fa-comment" style="color: blue;"></span>
                 </a>
                 <a href="delmessage.jsp">delete a message |
                    <span class="fa fa-trash" style="color:blue;"></span>
                 </a>
              </div>
     </li>
     <li class="dropdown">
         <a href="javascript:void(0)" class="dropbtn">services</a>
         <div class="dropdown-content">
              <a href="#what we provide">What we provide</a>
              <a href="#global sollutions">Global solutions</a>
         </div>
     </li>
     <li class="dropdown">
         <a href="javascript:void(0)" class="dropbtn">contacts</a>
         <div class="dropdown-content">
              <a href="#what we provide">Important connections</a>
         </div>
     </li>
     <li class="dropdown">
         <a href="javascript:void(0)" class="dropbtn">Help</a>
         <div class="dropdown-content">
              <a href="#what we provide">how can i help u</a>
              <a href="#what we provide">retriving password</a>
              <a href="#what we provide">registering a complaint</a>
         </div>
         
     </li>
     
     
     <li class="dropdown" id="danger" onclick=" return myFunction();" 
         title="Log out" >
         <a href="./logout" class="dropbtn" >
            <span class='fa fa-power-off' style="font-size:22px;"></span>
            
         </a>
         
     </li>
     
     
     
</ul>

    <script> 
        /* function myalert() { 
            alert(" U will be logged out of the application \n " + 
                "are u sure u want to quit ?"); 
        } */ 
        
        function myFunction() {
        	  var r = confirm("Are u sure u want to quit the application!");
        	  if (r == true) {
        	    return true;
        	  } else {
        	    return false;
        	  } 
        	}
    </script> 

</body>

</html>