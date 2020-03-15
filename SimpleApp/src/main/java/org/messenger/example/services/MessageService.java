package org.messenger.example.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.messenger.example.beans.Message;
import org.messenger.example.resources.MessageResource;

@Path("/messages")
public class MessageService
{
	
	MessageResource mrs=new MessageResource();
	
      @GET
      @Produces(MediaType.APPLICATION_XML)
      public List<Message> getAllMessages()
      {
    	  return mrs.getAllMessages();
      }
}
