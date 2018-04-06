package vn.edu.ifi.chatbot.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import vn.edu.ifi.chatbot.model.Message;
import vn.edu.ifi.chatbot.service.MessageService;

@Path("/messages")
public class MassageResource {
	
	MessageService messageService = new MessageService(); 
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		return messageService.getAllMessages(); 
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Message addMessages(Message msg) {
		 return messageService.addMessage(msg); 
		
	}
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_XML)
	public Message getMessages(@PathParam("messageId") Long id) {
		return messageService.getMessage(id); 
		
	}
}
