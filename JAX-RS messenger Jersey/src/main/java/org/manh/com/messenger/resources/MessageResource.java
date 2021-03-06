package org.manh.com.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.manh.com.messenger.model.Message;
import org.manh.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public  List<Message> getMessages() {
		
		return messageService.getAllMessaages();
	}
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.TEXT_PLAIN)
	public Message test(@PathParam("messageId") long messageID) {
		
		return messageService.getMessage(messageID);
	}
	
	
	

}
