package org.koushik.javabrains.messenger.service;

import java.util.ArrayList;
import java.util.Date;

import org.koushik.javabrains.messenger.model.Message;

public class MessageService {

	public ArrayList<Message> getAllMessages() {
		
		ArrayList<Message> list = new ArrayList<Message>();
		
		list.add(new Message(0, "Hello, World!", new Date(), "Koushik"));
		list.add(new Message(1, "Hello, Jersey!", new Date(), "Koushik"));
//		list.add(new Message(2, "Hello, World!", new Date(), "Koushik"));
		
		return list;
	}
}
