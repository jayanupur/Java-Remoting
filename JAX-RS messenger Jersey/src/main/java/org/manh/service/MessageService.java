package org.manh.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.manh.com.messenger.database.DatabaseClass;
import org.manh.com.messenger.model.Message;

public class MessageService {
	
	
	private Map<Long, Message> messages = DatabaseClass.getMessage();
	
	
	public MessageService() {
		messages.put(1L, new Message(1,"hello World", "koushik"));
		messages.put(2L, new Message(2,"hello Jersy", "Jaya"));
	}

	public List<Message> getAllMessaages() {
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id){
		return messages.get(id);
		
	}

	public Message addMessage(Message msg){
		msg.setId((long) (messages.size() + 1) );
		messages.put(msg.getId(), msg);
		return msg;
			
		}
	public Message updateMessage(Message m){
		if(m.getId() <=0) {
			return null;
		}
		messages.put(m.getId(), m);
		return m;
		
	}
	
	public Message removeMessage(long id){
		return messages.remove(id);
		
	}
	
}
