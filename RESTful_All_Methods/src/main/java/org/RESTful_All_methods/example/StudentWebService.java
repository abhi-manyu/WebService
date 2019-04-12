package org.RESTful_All_methods.example;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/student")
public class StudentWebService
{
   @Path("/addingStudent")
   @Produces("text/plain")
   @POST
   public Response addStudent(@FormParam("rollno")int roll,
		   @FormParam("name")String name,@FormParam("mark")double marks,
		   @FormParam("addr")String address)
   {
	     String output="data saved successfully to database as following \n"
	     		+ "roll no : "+roll+"\n name : "+name+"\n "
	     				+ "marks : "+marks+"\n address : "+address;
	    return Response.status(200).entity(output).build();
   }
   
   
   
   @Path("/deleteStudent")
   @Produces("text/plain")
   @POST
   public Response deleteService(@FormParam("rn")int roll_no)
   {
	   String output="student bearing roll no : "+roll_no+" is deleted successfully";
	   return Response.status(200).entity(output).build();
   }
   
   
   @Path("/showStudentDetails")
   @Produces("text/html")
   @POST
   public Response showStudentDetails(@FormParam("rn")String stuName)
   {
	   String output="<html><body><h2>Record fetched successfully from database</h2><hr>"
			 +"<p>roll no :<mark>5646</mark><br>"
	   		+ "name :<mark>"+stuName+"</mark><br>"
			 +"marks : <mark>56.86</mark> <br>"
	   		+"address :<mark>Bhubaneswar</mark>"
	   		+ "</p></body></html>";
	   return Response.status(200).entity(output).build();
   }
}
