package org.formparam.examle;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/customers")
public class FormParamExample
{
   @Path("/addcustomers")
   @POST
   @Produces("text/html")
   public Response getDataByFormParam(@FormParam("nam")String name,
		          @FormParam("ag")int age)
   {
	   String output="customer added as name : "+name+"and age is : "+age;
	   return Response.status(200).entity(output).build();
   }
}
