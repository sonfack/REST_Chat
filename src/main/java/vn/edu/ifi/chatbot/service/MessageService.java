package vn.edu.ifi.chatbot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import vn.edu.ifi.chatbot.database.DatabaseClass;
import vn.edu.ifi.chatbot.model.Message;



public class MessageService {
	
	public  Map<Long, Message> messages = DatabaseClass.getMassages(); 
	
	public MessageService() {
		Message msg1 = new Message(1L, "Bot", "etd1");  
		Message msg2 = new Message(2L, "ChatBot", "etd2");
		messages.put(1L, msg1); 
		messages.put(2L, msg2); 
	}
	
	public List<Message> getAllMessages(){
		/*Message msg1 = new Message(1L, "Bot", "etd1"); 
		Message msg2 = new Message(2L, "ChatBot", "etd2"); 
		List<Message> list = new ArrayList<>(); 
		list.add(msg1); 
		list.add(msg2); 
		return list ; */
		return new ArrayList<Message>(messages.values()); 
	}
	
	public Message getMessage(Long idmessage) {
		return messages.get(idmessage); 
	}
	public Message addMessage(Message message) {
		Random rand = new Random(5);
		message.setId(rand.nextLong());
		messages.put(message.getId(), message); 
		return message; 
	}
	
	
}
