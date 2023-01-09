package com.masai;

import org.springframework.stereotype.Component;

@Component
public class MessageProcessorImpl implements MessageProcessor {
	
	public MessageProcessorImpl(MessageService service){
		this.msgService = service;
	}
	MessageService msgService;
	 
	@Override
	public void processMessage(String message) {
		// TODO Auto-generated method stub
		msgService.sendMessage(message);
	}

}
