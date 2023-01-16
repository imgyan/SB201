package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MessageProcessorImpl implements MessageProcessor {
	@Autowired
	@Qualifier("twitterService")
	MessageService messageService;
	 
	@Override
	public void processMessage(String message) {
		// TODO Auto-generated method stub
		//MessageService msgService = new TwitterService();
		messageService.sendMessage(message);
	}

}
