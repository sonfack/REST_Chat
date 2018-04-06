package vn.edu.ifi.chatbot.database;

import java.util.HashMap;
import java.util.Map;

import vn.edu.ifi.chatbot.model.Message;
import vn.edu.ifi.chatbot.model.Profile;

public class DatabaseClass {

	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();
	
	public static Map<Long, Message> getMassages(){
		return messages ; 
	}
	
	public static Map<Long, Profile> getProfile(){
		return profiles ; 
	}
	
}
