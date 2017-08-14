package org.manh.com.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.manh.com.messenger.model.Message;
import org.manh.com.messenger.model.Profile;

public class DatabaseClass {
	
	
	private static Map<Long ,Message> messages = new HashMap<>();
	private static Map<Long ,Profile> profiels = new HashMap<>();
	
	
	public static Map<Long, Message> getMessage(){
		return messages;
	}
	
	public static Map<Long, Profile> getProfile(){
		return profiels;
	}
	
}
