package org.Chat.example.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.Chat.example.beans.Like;
import org.Chat.example.resource.LikeResource;

//@Path("/")
public class LikeService
{
   LikeResource lr=new LikeResource();
	
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@GET
	public List<Like> getAllLikes(@PathParam("id")int po_id)
	{
		return lr.getAllLikes(po_id);
	}
	
	@GET
	@Path("/{lid}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Like get_a_Like(@PathParam("id") int id, @PathParam("lid") int lid)
	{
		return lr.findLike(id, lid);
	}
	
	@POST
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Like> addLike(Like like,@PathParam("id")int po_id)
	{
		return lr.addLike(like, po_id);
	}
	
	@Path("/{l_Id}")
	@DELETE
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Like> delete_a_like(@PathParam("id") int po_id, @PathParam("l_Id") int lid)
	{
		System.out.println("recieved post id as : "+po_id+" like id as :"+lid);
		return lr.delete_a_Like(po_id, lid);
	}
	
}
